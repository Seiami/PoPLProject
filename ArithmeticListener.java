// Generated from Arithmetic.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ArithmeticParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ArithmeticParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(ArithmeticParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(ArithmeticParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(ArithmeticParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(ArithmeticParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#unindented_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnindented_statement(ArithmeticParser.Unindented_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#unindented_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnindented_statement(ArithmeticParser.Unindented_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment(ArithmeticParser.Var_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#var_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment(ArithmeticParser.Var_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#var_operation}.
	 * @param ctx the parse tree
	 */
	void enterVar_operation(ArithmeticParser.Var_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#var_operation}.
	 * @param ctx the parse tree
	 */
	void exitVar_operation(ArithmeticParser.Var_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ArithmeticParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ArithmeticParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(ArithmeticParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(ArithmeticParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(ArithmeticParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(ArithmeticParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#indented_statement}.
	 * @param ctx the parse tree
	 */
	void enterIndented_statement(ArithmeticParser.Indented_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#indented_statement}.
	 * @param ctx the parse tree
	 */
	void exitIndented_statement(ArithmeticParser.Indented_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ArithmeticParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ArithmeticParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(ArithmeticParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(ArithmeticParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ArithmeticParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ArithmeticParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(ArithmeticParser.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(ArithmeticParser.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(ArithmeticParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(ArithmeticParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ArithmeticParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ArithmeticParser.ListContext ctx);
}