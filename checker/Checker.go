package checker

import (
	parser "Proyecto_Compiladores/parser"
	"github.com/antlr4-go/antlr/v4"
)

//var _ parser.MiniGoParserVisitor = &Checker{}

// Checker realiza el análisis contextual utilizando una tabla de símbolos
type Checker struct {
	parser.BaseMiniGoParserVisitor
	SymbolTable *TablaSimbolos // Tabla de símbolos utilizada para el análisis contextual
	errorList   []string       // Lista de errores encontrados durante el análisis
}

func (c *Checker) Visit(tree antlr.ParseTree) interface{} {

	return tree.Accept(c)
}

func (c *Checker) VisitChildren(node antlr.RuleNode) interface{} {

	var results []interface{}
	children := node.GetChildren()
	for _, child := range children {
		childResult := child.(antlr.ParseTree).Accept(c)
		results = append(results, childResult)
	}
	return results
}

func (c *Checker) VisitTerminal(node antlr.TerminalNode) interface{} {

	//Complete
	return nil
}

func (c *Checker) VisitErrorNode(node antlr.ErrorNode) interface{} {

	//Complete
	return nil
}

func (c *Checker) VisitRootAST(ctx *parser.RootASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTopDeclarationListAST(ctx *parser.TopDeclarationListASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclAST(ctx *parser.VariableDeclASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclBlockAST(ctx *parser.VariableDeclBlockASTContext) interface{} {

	//TODO
	//Maybe complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclEmptyAST(ctx *parser.VariableDeclEmptyASTContext) interface{} {

	//TODO
	//Maybe complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitInnerVarDeclsAST(ctx *parser.InnerVarDeclsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclAST(ctx *parser.SingleVarDeclASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclAssignAST(ctx *parser.SingleVarDeclAssignASTContext) interface{} {

	//TODO
	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclNoExpsAST(ctx *parser.SingleVarDeclNoExpsASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclNoExpsDeclTypeAST(ctx *parser.SingleVarDeclNoExpsDeclTypeASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclAST(ctx *parser.TypeDeclASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclBlockAST(ctx *parser.TypeDeclBlockASTContext) interface{} {

	//TODO
	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclEmptyAST(ctx *parser.TypeDeclEmptyASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitInnerTypeDeclsAST(ctx *parser.InnerTypeDeclsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleTypeDeclAST(ctx *parser.SingleTypeDeclASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncDeclAST(ctx *parser.FuncDeclASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncFrontDeclAST(ctx *parser.FuncFrontDeclASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncArgDeclsAST(ctx *parser.FuncArgDeclsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeParenAST(ctx *parser.DeclTypeParenASTContext) interface{} {

	//TODO
	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeIdentifierAST(ctx *parser.DeclTypeIdentifierASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeSliceAST(ctx *parser.DeclTypeSliceASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeArrayAST(ctx *parser.DeclTypeArrayASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeStructAST(ctx *parser.DeclTypeStructASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSliceDeclTypeAST(ctx *parser.SliceDeclTypeASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArrayDeclTypeAST(ctx *parser.ArrayDeclTypeASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStructDeclTypeAST(ctx *parser.StructDeclTypeASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStructMemDeclsAST(ctx *parser.StructMemDeclsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIdentifierListAST(ctx *parser.IdentifierListASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionNotUnaryAST(ctx *parser.ExpressionNotUnaryASTContext) interface{} {

	//TODO
	//Maybe complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMultiplyAST(ctx *parser.ExpressionMultiplyASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPlusAST(ctx *parser.ExpressionPlusASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionModuloAST(ctx *parser.ExpressionModuloASTContext) interface{} {

	//TODO
	//Maybe complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionAndAST(ctx *parser.ExpressionAndASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseXorAST(ctx *parser.ExpressionBitwiseXorASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMinusAST(ctx *parser.ExpressionMinusASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseXorUnaryAST(ctx *parser.ExpressionBitwiseXorUnaryASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionEqualAST(ctx *parser.ExpressionEqualASTContext) interface{} {

	//TODO
	//Maybe complete

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMinusUnaryAST(ctx *parser.ExpressionMinusUnaryASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseClearAST(ctx *parser.ExpressionBitwiseClearASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionGreaterEqualAST(ctx *parser.ExpressionGreaterEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionLessEqualAST(ctx *parser.ExpressionLessEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionNotEqualAST(ctx *parser.ExpressionNotEqualASTContext) interface{} {

	//TODO
	//Maybe complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPrimaryAST(ctx *parser.ExpressionPrimaryASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseAndAST(ctx *parser.ExpressionBitwiseAndASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionGreaterAST(ctx *parser.ExpressionGreaterASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionDivideAST(ctx *parser.ExpressionDivideASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionOrAST(ctx *parser.ExpressionOrASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPlusUnaryAST(ctx *parser.ExpressionPlusUnaryASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseOrAST(ctx *parser.ExpressionBitwiseOrASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionLessAST(ctx *parser.ExpressionLessASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionShiftRightAST(ctx *parser.ExpressionShiftRightASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionShiftLeftAST(ctx *parser.ExpressionShiftLeftASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionListAST(ctx *parser.ExpressionListASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionLengthAST(ctx *parser.PrimaryExpressionLengthASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionOperandAST(ctx *parser.PrimaryExpressionOperandASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionIndexAST(ctx *parser.PrimaryExpressionIndexASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionAppendAST(ctx *parser.PrimaryExpressionAppendASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionArgumentsAST(ctx *parser.PrimaryExpressionArgumentsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionCapAST(ctx *parser.PrimaryExpressionCapASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionSelectorAST(ctx *parser.PrimaryExpressionSelectorASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandLiteralAST(ctx *parser.OperandLiteralASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandIdentifierAST(ctx *parser.OperandIdentifierASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandParenAST(ctx *parser.OperandParenASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralIntAST(ctx *parser.LiteralIntASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralFloatAST(ctx *parser.LiteralFloatASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralRuneAST(ctx *parser.LiteralRuneASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralRawStringAST(ctx *parser.LiteralRawStringASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralInterpretedStringAST(ctx *parser.LiteralInterpretedStringASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIndexAST(ctx *parser.IndexASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArgumentsAST(ctx *parser.ArgumentsASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArgumentsEmptyAST(ctx *parser.ArgumentsEmptyASTContext) interface{} {

	//TODO
	//Maybe Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSelectorAST(ctx *parser.SelectorASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAppendExpressionAST(ctx *parser.AppendExpressionASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLengthExpressionAST(ctx *parser.LengthExpressionASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitCapExpressionAST(ctx *parser.CapExpressionASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementListAST(ctx *parser.StatementListASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitBlockAST(ctx *parser.BlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementPrintAST(ctx *parser.StatementPrintASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementPrintlnAST(ctx *parser.StatementPrintlnASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementReturnAST(ctx *parser.StatementReturnASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementBreakAST(ctx *parser.StatementBreakASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementContinueAST(ctx *parser.StatementContinueASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementSimpleAST(ctx *parser.StatementSimpleASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementBlockAST(ctx *parser.StatementBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementSwitchAST(ctx *parser.StatementSwitchASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementIfAST(ctx *parser.StatementIfASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementLoopAST(ctx *parser.StatementLoopASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementTypeDeclAST(ctx *parser.StatementTypeDeclASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementVariableDeclAST(ctx *parser.StatementVariableDeclASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementEmptyAST(ctx *parser.SimpleStatementEmptyASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementExpressionAST(ctx *parser.SimpleStatementExpressionASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementAssignmentAST(ctx *parser.SimpleStatementAssignmentASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementExpressionListAssignAST(ctx *parser.SimpleStatementExpressionListAssignASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementAST(ctx *parser.AssignmentStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementPlusEqualAST(ctx *parser.AssignmentStatementPlusEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementMinusEqualAST(ctx *parser.AssignmentStatementMinusEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseAndEqualAST(ctx *parser.AssignmentStatementBitwiseAndEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseOrEqualAST(ctx *parser.AssignmentStatementBitwiseOrEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementMultiplyEqualAST(ctx *parser.AssignmentStatementMultiplyEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseXorEqualAST(ctx *parser.AssignmentStatementBitwiseXorEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementShiftLeftEqualAST(ctx *parser.AssignmentStatementShiftLeftEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementShiftRightEqualAST(ctx *parser.AssignmentStatementShiftRightEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseClearEqualAST(ctx *parser.AssignmentStatementBitwiseClearEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementModuloEqualAST(ctx *parser.AssignmentStatementModuloEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementDivideEqualAST(ctx *parser.AssignmentStatementDivideEqualASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfStatementAST(ctx *parser.IfStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfElseIfStatementAST(ctx *parser.IfElseIfStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfElseStatementAST(ctx *parser.IfElseStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleStatementAST(ctx *parser.IfSimpleStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleElseIfStatementAST(ctx *parser.IfSimpleElseIfStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleElseStatementAST(ctx *parser.IfSimpleElseStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopBlockAST(ctx *parser.LoopBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopExpressionBlockAST(ctx *parser.LoopExpressionBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopSimpleStatementExpressionSimpleStatementBlockAST(ctx *parser.LoopSimpleStatementExpressionSimpleStatementBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopSimpleStatementSimpleStatementBlockAST(ctx *parser.LoopSimpleStatementSimpleStatementBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtSimpleStatementAST(ctx *parser.SwitchStmtSimpleStatementASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtExpressionAST(ctx *parser.SwitchStmtExpressionASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtSimpleStatementBlockAST(ctx *parser.SwitchStmtSimpleStatementBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtBlockAST(ctx *parser.SwitchStmtBlockASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseListEmptyAST(ctx *parser.ExpressionCaseClauseListEmptyASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseListAST(ctx *parser.ExpressionCaseClauseListASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseAST(ctx *parser.ExpressionCaseClauseASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionSwitchCaseAST(ctx *parser.ExpressionSwitchCaseASTContext) interface{} {

	//TODO
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionSwitchDefaultAST(ctx *parser.ExpressionSwitchDefaultASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitEpsilonAST(ctx *parser.EpsilonASTContext) interface{} {

	//Complete
	return c.VisitChildren(ctx)
}
func (v *Checker) VisitMultipleReturnTypesAST(ctx *parser.MultipleReturnTypesASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *Checker) VisitReturnTypeListAST(ctx *parser.ReturnTypeListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *Checker) VisitSingleReturnTypeAST(ctx *parser.SingleReturnTypeContext) interface{} {
	return v.VisitChildren(ctx)
}
