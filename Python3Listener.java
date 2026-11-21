// Generated from Python3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Python3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Python3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(Python3Parser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(Python3Parser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(Python3Parser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(Python3Parser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#unindented_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnindented_statement(Python3Parser.Unindented_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#unindented_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnindented_statement(Python3Parser.Unindented_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment(Python3Parser.Var_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment(Python3Parser.Var_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#var_operation}.
	 * @param ctx the parse tree
	 */
	void enterVar_operation(Python3Parser.Var_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#var_operation}.
	 * @param ctx the parse tree
	 */
	void exitVar_operation(Python3Parser.Var_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(Python3Parser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(Python3Parser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(Python3Parser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(Python3Parser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#indented_statement}.
	 * @param ctx the parse tree
	 */
	void enterIndented_statement(Python3Parser.Indented_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#indented_statement}.
	 * @param ctx the parse tree
	 */
	void exitIndented_statement(Python3Parser.Indented_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Python3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Python3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(Python3Parser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(Python3Parser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(Python3Parser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(Python3Parser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Python3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Python3Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(Python3Parser.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(Python3Parser.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(Python3Parser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(Python3Parser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Python3Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Python3Parser.ListContext ctx);
}