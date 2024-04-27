package checker

import (
	parser "Proyecto_Compiladores/parser"
	"github.com/antlr4-go/antlr/v4"
)

var _ parser.MiniGoParserVisitor = &Checker{}

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

	return nil
}

func (c *Checker) VisitErrorNode(node antlr.ErrorNode) interface{} {

	return nil
}

func (c *Checker) VisitRootAST(ctx *parser.RootASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTopDeclarationListAST(ctx *parser.TopDeclarationListASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclAST(ctx *parser.VariableDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclBlockAST(ctx *parser.VariableDeclBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitVariableDeclEmptyAST(ctx *parser.VariableDeclEmptyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitInnerVarDeclsAST(ctx *parser.InnerVarDeclsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclAST(ctx *parser.SingleVarDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclAssignAST(ctx *parser.SingleVarDeclAssignASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclNoExpsAST(ctx *parser.SingleVarDeclNoExpsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleVarDeclNoExpsDeclTypeAST(ctx *parser.SingleVarDeclNoExpsDeclTypeASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclAST(ctx *parser.TypeDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclBlockAST(ctx *parser.TypeDeclBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitTypeDeclEmptyAST(ctx *parser.TypeDeclEmptyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitInnerTypeDeclsAST(ctx *parser.InnerTypeDeclsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSingleTypeDeclAST(ctx *parser.SingleTypeDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncDeclAST(ctx *parser.FuncDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncFrontDeclAST(ctx *parser.FuncFrontDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitFuncArgDeclsAST(ctx *parser.FuncArgDeclsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeParenAST(ctx *parser.DeclTypeParenASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeIdentifierAST(ctx *parser.DeclTypeIdentifierASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeSliceAST(ctx *parser.DeclTypeSliceASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeArrayAST(ctx *parser.DeclTypeArrayASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitDeclTypeStructAST(ctx *parser.DeclTypeStructASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSliceDeclTypeAST(ctx *parser.SliceDeclTypeASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArrayDeclTypeAST(ctx *parser.ArrayDeclTypeASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStructDeclTypeAST(ctx *parser.StructDeclTypeASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStructMemDeclsAST(ctx *parser.StructMemDeclsASTContext) interface{} {
	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIdentifierListAST(ctx *parser.IdentifierListASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionNotUnaryAST(ctx *parser.ExpressionNotUnaryASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMultiplyAST(ctx *parser.ExpressionMultiplyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPlusAST(ctx *parser.ExpressionPlusASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionModuloAST(ctx *parser.ExpressionModuloASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionAndAST(ctx *parser.ExpressionAndASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseXorAST(ctx *parser.ExpressionBitwiseXorASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMinusAST(ctx *parser.ExpressionMinusASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseXorUnaryAST(ctx *parser.ExpressionBitwiseXorUnaryASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionEqualAST(ctx *parser.ExpressionEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionMinusUnaryAST(ctx *parser.ExpressionMinusUnaryASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseClearAST(ctx *parser.ExpressionBitwiseClearASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionGreaterEqualAST(ctx *parser.ExpressionGreaterEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionLessEqualAST(ctx *parser.ExpressionLessEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionNotEqualAST(ctx *parser.ExpressionNotEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPrimaryAST(ctx *parser.ExpressionPrimaryASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseAndAST(ctx *parser.ExpressionBitwiseAndASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionGreaterAST(ctx *parser.ExpressionGreaterASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionDivideAST(ctx *parser.ExpressionDivideASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionOrAST(ctx *parser.ExpressionOrASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionPlusUnaryAST(ctx *parser.ExpressionPlusUnaryASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionBitwiseOrAST(ctx *parser.ExpressionBitwiseOrASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionLessAST(ctx *parser.ExpressionLessASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionShiftRightAST(ctx *parser.ExpressionShiftRightASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionShiftLeftAST(ctx *parser.ExpressionShiftLeftASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionListAST(ctx *parser.ExpressionListASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionLengthAST(ctx *parser.PrimaryExpressionLengthASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionOperandAST(ctx *parser.PrimaryExpressionOperandASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionIndexAST(ctx *parser.PrimaryExpressionIndexASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionAppendAST(ctx *parser.PrimaryExpressionAppendASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionArgumentsAST(ctx *parser.PrimaryExpressionArgumentsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionCapAST(ctx *parser.PrimaryExpressionCapASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitPrimaryExpressionSelectorAST(ctx *parser.PrimaryExpressionSelectorASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandLiteralAST(ctx *parser.OperandLiteralASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandIdentifierAST(ctx *parser.OperandIdentifierASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitOperandParenAST(ctx *parser.OperandParenASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralIntAST(ctx *parser.LiteralIntASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralFloatAST(ctx *parser.LiteralFloatASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralRuneAST(ctx *parser.LiteralRuneASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralRawStringAST(ctx *parser.LiteralRawStringASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLiteralInterpretedStringAST(ctx *parser.LiteralInterpretedStringASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIndexAST(ctx *parser.IndexASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArgumentsAST(ctx *parser.ArgumentsASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitArgumentsEmptyAST(ctx *parser.ArgumentsEmptyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSelectorAST(ctx *parser.SelectorASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAppendExpressionAST(ctx *parser.AppendExpressionASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLengthExpressionAST(ctx *parser.LengthExpressionASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitCapExpressionAST(ctx *parser.CapExpressionASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementListAST(ctx *parser.StatementListASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitBlockAST(ctx *parser.BlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementPrintAST(ctx *parser.StatementPrintASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementPrintlnAST(ctx *parser.StatementPrintlnASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementReturnAST(ctx *parser.StatementReturnASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementBreakAST(ctx *parser.StatementBreakASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementContinueAST(ctx *parser.StatementContinueASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementSimpleAST(ctx *parser.StatementSimpleASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementBlockAST(ctx *parser.StatementBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementSwitchAST(ctx *parser.StatementSwitchASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementIfAST(ctx *parser.StatementIfASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementLoopAST(ctx *parser.StatementLoopASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementTypeDeclAST(ctx *parser.StatementTypeDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitStatementVariableDeclAST(ctx *parser.StatementVariableDeclASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementEmptyAST(ctx *parser.SimpleStatementEmptyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementExpressionAST(ctx *parser.SimpleStatementExpressionASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementAssignmentAST(ctx *parser.SimpleStatementAssignmentASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSimpleStatementExpressionListAssignAST(ctx *parser.SimpleStatementExpressionListAssignASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementAST(ctx *parser.AssignmentStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementPlusEqualAST(ctx *parser.AssignmentStatementPlusEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementMinusEqualAST(ctx *parser.AssignmentStatementMinusEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseAndEqualAST(ctx *parser.AssignmentStatementBitwiseAndEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseOrEqualAST(ctx *parser.AssignmentStatementBitwiseOrEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementMultiplyEqualAST(ctx *parser.AssignmentStatementMultiplyEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseXorEqualAST(ctx *parser.AssignmentStatementBitwiseXorEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementShiftLeftEqualAST(ctx *parser.AssignmentStatementShiftLeftEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementShiftRightEqualAST(ctx *parser.AssignmentStatementShiftRightEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementBitwiseClearEqualAST(ctx *parser.AssignmentStatementBitwiseClearEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementModuloEqualAST(ctx *parser.AssignmentStatementModuloEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitAssignmentStatementDivideEqualAST(ctx *parser.AssignmentStatementDivideEqualASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfStatementAST(ctx *parser.IfStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfElseIfStatementAST(ctx *parser.IfElseIfStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfElseStatementAST(ctx *parser.IfElseStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleStatementAST(ctx *parser.IfSimpleStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleElseIfStatementAST(ctx *parser.IfSimpleElseIfStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitIfSimpleElseStatementAST(ctx *parser.IfSimpleElseStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopBlockAST(ctx *parser.LoopBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopExpressionBlockAST(ctx *parser.LoopExpressionBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopSimpleStatementExpressionSimpleStatementBlockAST(ctx *parser.LoopSimpleStatementExpressionSimpleStatementBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitLoopSimpleStatementSimpleStatementBlockAST(ctx *parser.LoopSimpleStatementSimpleStatementBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtSimpleStatementAST(ctx *parser.SwitchStmtSimpleStatementASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtExpressionAST(ctx *parser.SwitchStmtExpressionASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtSimpleStatementBlockAST(ctx *parser.SwitchStmtSimpleStatementBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitSwitchStmtBlockAST(ctx *parser.SwitchStmtBlockASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseListEmptyAST(ctx *parser.ExpressionCaseClauseListEmptyASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseListAST(ctx *parser.ExpressionCaseClauseListASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionCaseClauseAST(ctx *parser.ExpressionCaseClauseASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionSwitchCaseAST(ctx *parser.ExpressionSwitchCaseASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitExpressionSwitchDefaultAST(ctx *parser.ExpressionSwitchDefaultASTContext) interface{} {

	return c.VisitChildren(ctx)
}

func (c *Checker) VisitEpsilonAST(ctx *parser.EpsilonASTContext) interface{} {

	return c.VisitChildren(ctx)
}
