package interpreter;

import grammar.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.HashMap;
import java.util.Map;

public class CalculateVisitor extends firstBaseVisitor<Integer> {
    private TokenStream tokStream = null;
    private CharStream input=null;
    Map<String, Integer> memory = new HashMap<String, Integer>();
    public CalculateVisitor(CharStream inp) {
        super();
        this.input = inp;
    }

    public CalculateVisitor(TokenStream tok) {
        super();
        this.tokStream = tok;
    }
    public CalculateVisitor(CharStream inp, TokenStream tok) {
        super();
        this.input = inp;
        this.tokStream = tok;
    }

    @Override
    public Integer visitAssign(firstParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
//        System.out.println("Debug");
//        System.out.println(value);
        return  value;
    }
    /** INT */
/*    @Override
    public Integer visitInt_tok(firstParser.Int_tokContext ctx){
        return Integer.valueOf(ctx.INT().getText());
    }*/
    @Override
    public Integer visitId(firstParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return  memory.get(id);
        System.out.println("Undefined variable");
        return 0;
    }


    private String getText(ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        if(input==null) throw new RuntimeException("Input stream undefined");
        return input.getText(new Interval(a,b));
    }
    @Override
    public Integer visitIf_stat(firstParser.If_statContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)!=0) {
            result = visit(ctx.then);
        }
        else {
            if(ctx.else_ != null)
                result = visit(ctx.else_);
        }
        return result;
    }

    @Override
    public Integer visitPrint_stat(firstParser.Print_statContext ctx) {
        var st = ctx.expr();
        var result = visit(st);
        //System.out.printf("|%s=%d|\n", st.getText(), result); //nie drukuje ukrytych ani pominiętych spacji
        System.out.printf("|%s=%d|\n", getText(st),  result); //drukuje wszystkie spacje
        //System.out.printf("|%s=%d|\n", tokStream.getText(st),  result); //drukuje spacje z ukrytego kanału, ale nie ->skip
        return result;
    }

    @Override
    public Integer visitInt_tok(firstParser.Int_tokContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPars(firstParser.ParsContext ctx) {
        return visit(ctx.expr());
    }

    /*@Override
    public Integer visitBinOp(firstParser.BinOpContext ctx) {
        Integer result=0;
        switch (ctx.op.getType()) {
            case firstLexer.ADD:
                result = visit(ctx.l) + visit(ctx.r);
                break;
            case firstLexer.SUB:
                result = visit(ctx.l) - visit(ctx.r);
                break;
            case firstLexer.MUL:
                result = visit(ctx.l) * visit(ctx.r);
                break;
            case firstLexer.DIV:
                try {
                    result = visit(ctx.l) / visit(ctx.r);
                } catch (Exception e) {
                    System.err.println("Div by zero");
                    throw new ArithmeticException();
                }
        }
        return result;
    }*/
    @Override
    public Integer visitMulDiv(firstParser.MulDivContext ctx) {
        Integer left = visit(ctx.l);
        Integer right = visit(ctx.r);
        switch (ctx.op.getType()){
            case firstLexer.MUL -> {
                return left * right;
            }
            case firstLexer.DIV -> {
                return left / right;
            }
            default -> {
                return 0;
            }
        }

    }

    @Override
    public Integer visitAddSub(firstParser.AddSubContext ctx) {
        Integer left = visit(ctx.l);
        Integer right = visit(ctx.r);
        switch (ctx.op.getType()){
            case firstLexer.ADD -> {
                return left + right;
            }
            case firstLexer.SUB -> {
                return left - right;
            }
            default -> {
                return 0;
            }
        }
    }

    @Override
    public Integer visitOrExpr(firstParser.OrExprContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        return left>0 || right>0 ? 1: 0;
    }

    @Override
    public Integer visitAndExpr(firstParser.AndExprContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        return left>0 || right>0 ? 1: 0;
    }

    @Override
    public Integer visitCompExpr(firstParser.CompExprContext ctx) {
        Integer left = visit(ctx.left);
        Integer right = visit(ctx.right);
        switch (ctx.op.getType()){
            case firstParser.GT -> {
                return left.intValue() > right.intValue() ? 1 : 0;
            }
            case firstParser.LT -> {
                return left.intValue() < right.intValue() ? 1 : 0;
            }
            case firstParser.ISEQ -> {
                return  left.intValue() == right.intValue()? 1 : 0;
            }
            default -> {
                return 0;
            }
        }
    }

}
