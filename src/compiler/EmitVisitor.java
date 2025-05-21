package compiler;

import grammar.ORABaseVisitor;
import grammar.ORAParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.*;

import java.util.*;

public class EmitVisitor extends ORABaseVisitor<String> {

    private final STGroup group;

    public EmitVisitor() {
        group = new STGroupFile("src/compiler/sql.stg");
    }

    @Override
    public String visitQuery(ORAParser.QueryContext ctx) {
        ORAParser.ExpressionContext exprCtx = ctx.expression();

        if (exprCtx instanceof ORAParser.PickContext) {
            return visit(((ORAParser.PickContext) exprCtx).pickExpression());
        }
        if (exprCtx instanceof ORAParser.AddContext) {
            return visit(((ORAParser.AddContext) exprCtx).addExpression());
        }
        if (exprCtx instanceof ORAParser.UpdateContext) {
            return visit(((ORAParser.UpdateContext) exprCtx).updateExpression());
        }
        if (exprCtx instanceof ORAParser.RemoveContext) {
            return visit(((ORAParser.RemoveContext) exprCtx).removeExpression());
        }

        return null;
    }


    @Override
    public String visitPickExpression(ORAParser.PickExpressionContext ctx) {

        ST st = group.getInstanceOf("select");

        ORAParser.PickParamsContext listOfParams = ctx.pickParams();


        for (ORAParser.PickParamContext p : listOfParams.pickParam()) {
            if (p instanceof ORAParser.FieldsContext) {
                List<String> fields = new ArrayList<>();
                for (TerminalNode id : ((ORAParser.FieldsContext) p).array().ID()) {
                    fields.add(id.getText());
                }
                st.add("fields", fields);
                st.add("table", ctx.ID().getText());
            } else if (p instanceof ORAParser.IfContext) {
                String condition = visit(((ORAParser.IfContext) p).condition());
                st.add("where", condition);
            } else if (p instanceof ORAParser.SortContext) {
                String order = visit(((ORAParser.SortContext) p).sortParam());
                st.add("order", order);
            } else if (p instanceof ORAParser.MaxRecordsContext) {
                String limit = ((ORAParser.MaxRecordsContext) p).INT().getText();
                st.add("limit", limit);
            }
        }

        return st.render();
    }

    @Override
    public String visitFields(ORAParser.FieldsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCondition(ORAParser.ConditionContext ctx) {
        StringBuilder condition = new StringBuilder();
        List<ORAParser.ExpressionAtomContext> atoms = ctx.expressionAtom();

        for (int i = 0; i < atoms.size(); i++) {
            ORAParser.ExpressionAtomContext atom = atoms.get(i);

            String left = atom.getChild(0).getText();
            String operator = atom.getChild(1).getText();
            String right = atom.getChild(2).getText();

            if (operator.equals("==")) operator = "=";
            else if (operator.equals("!=")) operator = "<>";

            if (right.startsWith("\"") && right.endsWith("\"")) {
                right = "'" + right.substring(1, right.length() - 1) + "'";
            }

            condition.append(left).append(" ").append(operator).append(" ").append(right);

            if (i < atoms.size() - 1) {
                String logicalOperator = ctx.getChild(i * 2 + 1).getText();
                condition.append(" ").append(logicalOperator).append(" ");
            }
        }

        return condition.toString();
    }


    @Override
    public String visitSortParam(ORAParser.SortParamContext ctx) {
        String sortParam = ctx.ID().getText();
        if(ctx.getChild(2).getText().equals("upward")){
            sortParam += " ASC";
        } else if(ctx.getChild(2).getText().equals("downward")){
            sortParam += " DESC";
        }
        return sortParam;
    }

    @Override
    public String visitMaxRecords(ORAParser.MaxRecordsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAddExpr(ORAParser.AddExprContext ctx) {
        String table = ctx.ID().getText();
        String assignments = ctx.assignmentList().getText();
        //System.out.println(assignments);
        ST st = group.getInstanceOf("insert");

        st.add("table", table);
        ORAParser.AssignmentListContext list = ctx.assignmentList();
        int counter = 0;
        for (ORAParser.AssignmentContext value : list.assignment()) {
            if (counter == 0) {
                String valueInput = value.getChild(2).getText();
                if (valueInput.charAt(0) == '"') {
                    valueInput = "'" + valueInput.substring(1, valueInput.length() - 1) + "'";
                }
                st.add("cols", value.getChild(0).getText());
                st.add("vals", valueInput);
            } else {
                String valueInput = value.getChild(2).getText();
                if (valueInput.charAt(0) == '"') {
                    valueInput = "'" + valueInput.substring(1, valueInput.length() - 1) + "'";
                }
                st.add("cols", ", " + value.getChild(0).getText());
                st.add("vals", ", " + valueInput);
            }
            counter++;
        }

        return st.render();
    }


    @Override
    public String visitUpdateExpression(ORAParser.UpdateExpressionContext ctx) {
        String table = ctx.ID().getText();

        ST st = group.getInstanceOf("update");
        st.add("table", table);

        ORAParser.SetListContext list = ctx.setList();
        int counter = 0;
        for (ORAParser.AssignmentContext value : list.assignment()) {
            if (counter == 0) {
                String valueInput = value.getChild(2).getText();
                if (valueInput.charAt(0) == '"') {
                    valueInput = "'" + valueInput.substring(1, valueInput.length() - 1) + "'";
                }
                st.add("set", value.getChild(0).getText());
                st.add("set", value.getChild(1).getText());
                st.add("set", valueInput);

            } else {
                String valueInput = value.getChild(2).getText();
                if (valueInput.charAt(0) == '"') {
                    valueInput = "'" + valueInput.substring(1, valueInput.length() - 1) + "'";
                }
                st.add("set", ", ");
                st.add("set", value.getChild(0).getText());
                st.add("set", value.getChild(1).getText());
                st.add("set", valueInput);

            }
            counter++;
        }

        String condition = visit(ctx.condition());
        st.add("where", condition);

        return st.render();

    }

    @Override
    public String visitRemoveExpr(ORAParser.RemoveExprContext ctx) {
        String table = ctx.ID().getText();

        ST st = group.getInstanceOf("delete");
        st.add("table", table);

        String condition = visit(ctx.condition());
        st.add("where", condition);

        return st.render();
    }


}
