package compiler;

import grammar.ORABaseVisitor;

public class CanOptimizeVisitor extends ORABaseVisitor<Integer> {
   /* @Override
    public Integer visitInt_tok(oraParser.Int_tokContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPars(firstParser.ParsContext ctx) {
        return visit(ctx.expr());
    }*/

/*
    @Override
    public Integer visitBinOp(firstParser.BinOpContext ctx) {
        Integer result=0;
        switch (ctx.op.getType()) {
            case firstLexer.ADD:
                result = visit(ctx.expr(0)) + visit(ctx.expr(1));
                break;
            case firstLexer.SUB:
                result = visit(ctx.expr(0)) - visit(ctx.expr(1));
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
    }
*/

}
