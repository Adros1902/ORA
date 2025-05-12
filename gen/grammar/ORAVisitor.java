// Generated from /Users/jocho/Desktop/ORA/src/grammar/ORA.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ORAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ORAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ORAParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ORAParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pick}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPick(ORAParser.PickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ORAParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code update}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(ORAParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code remove}
	 * labeled alternative in {@link ORAParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(ORAParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#pickExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickExpression(ORAParser.PickExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#pickParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickParams(ORAParser.PickParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fields}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(ORAParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ORAParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(ORAParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxRecords}
	 * labeled alternative in {@link ORAParser#pickParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxRecords(ORAParser.MaxRecordsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ORAParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ORAParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#updateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateExpression(ORAParser.UpdateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code removeExpr}
	 * labeled alternative in {@link ORAParser#removeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveExpr(ORAParser.RemoveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ORAParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionsAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsAtom(ORAParser.ExpressionsAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpressionAtom}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpressionAtom(ORAParser.NotExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesizedCondition}
	 * labeled alternative in {@link ORAParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesizedCondition(ORAParser.ParanthesizedConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#sortParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortParam(ORAParser.SortParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(ORAParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#setList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetList(ORAParser.SetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ORAParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ORAParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ORAParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ORAParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ORAParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ORAParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ORAParser.FloatContext ctx);
}