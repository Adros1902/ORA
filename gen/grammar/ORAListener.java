// Generated from /Users/jocho/Desktop/ORA/src/grammar/ORA.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ORAParser}.
 */
public interface ORAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ORAParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ORAParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ORAParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pick}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPick(ORAParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pick}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPick(ORAParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ORAParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ORAParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code update}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ORAParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code update}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ORAParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remove}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRemove(ORAParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remove}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRemove(ORAParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#pickExpression}.
	 * @param ctx the parse tree
	 */
	void enterPickExpression(ORAParser.PickExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#pickExpression}.
	 * @param ctx the parse tree
	 */
	void exitPickExpression(ORAParser.PickExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#pickParams}.
	 * @param ctx the parse tree
	 */
	void enterPickParams(ORAParser.PickParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#pickParams}.
	 * @param ctx the parse tree
	 */
	void exitPickParams(ORAParser.PickParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fields}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void enterFields(ORAParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fields}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void exitFields(ORAParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void enterIf(ORAParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void exitIf(ORAParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void enterSort(ORAParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void exitSort(ORAParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxRecords}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void enterMaxRecords(ORAParser.MaxRecordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxRecords}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 */
	void exitMaxRecords(ORAParser.MaxRecordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ORAParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ORAParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ORAParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ORAParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#updateExpression}.
	 * @param ctx the parse tree
	 */
	void enterUpdateExpression(ORAParser.UpdateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#updateExpression}.
	 * @param ctx the parse tree
	 */
	void exitUpdateExpression(ORAParser.UpdateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code removeExpr}
	 * labeled alternative in {@link ORAParser#removeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRemoveExpr(ORAParser.RemoveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code removeExpr}
	 * labeled alternative in {@link ORAParser#removeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRemoveExpr(ORAParser.RemoveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ORAParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ORAParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionsAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsAtom(ORAParser.ExpressionsAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionsAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsAtom(ORAParser.ExpressionsAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpressionAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNotExpressionAtom(ORAParser.NotExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpressionAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNotExpressionAtom(ORAParser.NotExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesizedCondition}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterParanthesizedCondition(ORAParser.ParanthesizedConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesizedCondition}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitParanthesizedCondition(ORAParser.ParanthesizedConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#sortParam}.
	 * @param ctx the parse tree
	 */
	void enterSortParam(ORAParser.SortParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#sortParam}.
	 * @param ctx the parse tree
	 */
	void exitSortParam(ORAParser.SortParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(ORAParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(ORAParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#setList}.
	 * @param ctx the parse tree
	 */
	void enterSetList(ORAParser.SetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#setList}.
	 * @param ctx the parse tree
	 */
	void exitSetList(ORAParser.SetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ORAParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ORAParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ORAParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ORAParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ORAParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ORAParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(ORAParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(ORAParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInt(ORAParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInt(ORAParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ORAParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ORAParser.FloatContext ctx);
}