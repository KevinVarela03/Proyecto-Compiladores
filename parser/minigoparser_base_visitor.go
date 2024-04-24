// Code generated from C:/Users/noni4/Desktop/Proyecto-Compiladores/MiniGoParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parser // MiniGoParser

import "github.com/antlr4-go/antlr/v4"

type BaseMiniGoParserVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseMiniGoParserVisitor) VisitRootAST(ctx *RootASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitTopDeclarationListAST(ctx *TopDeclarationListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitVariableDeclAST(ctx *VariableDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitVariableDeclBlockAST(ctx *VariableDeclBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitVariableDeclEmptyAST(ctx *VariableDeclEmptyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitInnerVarDeclsAST(ctx *InnerVarDeclsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSingleVarDeclAST(ctx *SingleVarDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSingleVarDeclAssignAST(ctx *SingleVarDeclAssignASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSingleVarDeclNoExpsAST(ctx *SingleVarDeclNoExpsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSingleVarDeclNoExpsDeclTypeAST(ctx *SingleVarDeclNoExpsDeclTypeASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitTypeDeclAST(ctx *TypeDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitTypeDeclBlockAST(ctx *TypeDeclBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitTypeDeclEmptyAST(ctx *TypeDeclEmptyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitInnerTypeDeclsAST(ctx *InnerTypeDeclsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSingleTypeDeclAST(ctx *SingleTypeDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitFuncDeclAST(ctx *FuncDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitFuncFrontDeclAST(ctx *FuncFrontDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitFuncArgDeclsAST(ctx *FuncArgDeclsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitDeclTypeParenAST(ctx *DeclTypeParenASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitDeclTypeIdentifierAST(ctx *DeclTypeIdentifierASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitDeclTypeSliceAST(ctx *DeclTypeSliceASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitDeclTypeArrayAST(ctx *DeclTypeArrayASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitDeclTypeStructAST(ctx *DeclTypeStructASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSliceDeclTypeAST(ctx *SliceDeclTypeASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitArrayDeclTypeAST(ctx *ArrayDeclTypeASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStructDeclTypeAST(ctx *StructDeclTypeASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStructMemDeclsAST(ctx *StructMemDeclsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIdentifierListAST(ctx *IdentifierListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionNotUnaryAST(ctx *ExpressionNotUnaryASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionMultiplyAST(ctx *ExpressionMultiplyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionPlusAST(ctx *ExpressionPlusASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionModuloAST(ctx *ExpressionModuloASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionAndAST(ctx *ExpressionAndASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionBitwiseXorAST(ctx *ExpressionBitwiseXorASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionMinusAST(ctx *ExpressionMinusASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionBitwiseXorUnaryAST(ctx *ExpressionBitwiseXorUnaryASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionEqualAST(ctx *ExpressionEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionMinusUnaryAST(ctx *ExpressionMinusUnaryASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionBitwiseClearAST(ctx *ExpressionBitwiseClearASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionGreaterEqualAST(ctx *ExpressionGreaterEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionLessEqualAST(ctx *ExpressionLessEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionNotEqualAST(ctx *ExpressionNotEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionPrimaryAST(ctx *ExpressionPrimaryASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionBitwiseAndAST(ctx *ExpressionBitwiseAndASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionGreaterAST(ctx *ExpressionGreaterASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionDivideAST(ctx *ExpressionDivideASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionOrAST(ctx *ExpressionOrASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionPlusUnaryAST(ctx *ExpressionPlusUnaryASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionBitwiseOrAST(ctx *ExpressionBitwiseOrASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionLessAST(ctx *ExpressionLessASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionShiftRightAST(ctx *ExpressionShiftRightASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionShiftLeftAST(ctx *ExpressionShiftLeftASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionListAST(ctx *ExpressionListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionLengthAST(ctx *PrimaryExpressionLengthASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionOperandAST(ctx *PrimaryExpressionOperandASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionIndexAST(ctx *PrimaryExpressionIndexASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionAppendAST(ctx *PrimaryExpressionAppendASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionArgumentsAST(ctx *PrimaryExpressionArgumentsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionCapAST(ctx *PrimaryExpressionCapASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitPrimaryExpressionSelectorAST(ctx *PrimaryExpressionSelectorASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitOperandLiteralAST(ctx *OperandLiteralASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitOperandIdentifierAST(ctx *OperandIdentifierASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitOperandParenAST(ctx *OperandParenASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLiteralIntAST(ctx *LiteralIntASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLiteralFloatAST(ctx *LiteralFloatASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLiteralRuneAST(ctx *LiteralRuneASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLiteralRawStringAST(ctx *LiteralRawStringASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLiteralInterpretedStringAST(ctx *LiteralInterpretedStringASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIndexAST(ctx *IndexASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitArgumentsAST(ctx *ArgumentsASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitArgumentsEmptyAST(ctx *ArgumentsEmptyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSelectorAST(ctx *SelectorASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAppendExpressionAST(ctx *AppendExpressionASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLengthExpressionAST(ctx *LengthExpressionASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitCapExpressionAST(ctx *CapExpressionASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementListAST(ctx *StatementListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitBlockAST(ctx *BlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementPrintAST(ctx *StatementPrintASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementPrintlnAST(ctx *StatementPrintlnASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementReturnAST(ctx *StatementReturnASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementBreakAST(ctx *StatementBreakASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementContinueAST(ctx *StatementContinueASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementSimpleAST(ctx *StatementSimpleASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementBlockAST(ctx *StatementBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementSwitchAST(ctx *StatementSwitchASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementIfAST(ctx *StatementIfASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementLoopAST(ctx *StatementLoopASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementTypeDeclAST(ctx *StatementTypeDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitStatementVariableDeclAST(ctx *StatementVariableDeclASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSimpleStatementEmptyAST(ctx *SimpleStatementEmptyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSimpleStatementExpressionAST(ctx *SimpleStatementExpressionASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSimpleStatementAssignmentAST(ctx *SimpleStatementAssignmentASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSimpleStatementExpressionListAssignAST(ctx *SimpleStatementExpressionListAssignASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementAST(ctx *AssignmentStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementPlusEqualAST(ctx *AssignmentStatementPlusEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementMinusEqualAST(ctx *AssignmentStatementMinusEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementBitwiseAndEqualAST(ctx *AssignmentStatementBitwiseAndEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementBitwiseOrEqualAST(ctx *AssignmentStatementBitwiseOrEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementMultiplyEqualAST(ctx *AssignmentStatementMultiplyEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementBitwiseXorEqualAST(ctx *AssignmentStatementBitwiseXorEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementShiftLeftEqualAST(ctx *AssignmentStatementShiftLeftEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementShiftRightEqualAST(ctx *AssignmentStatementShiftRightEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementBitwiseClearEqualAST(ctx *AssignmentStatementBitwiseClearEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementModuloEqualAST(ctx *AssignmentStatementModuloEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitAssignmentStatementDivideEqualAST(ctx *AssignmentStatementDivideEqualASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfStatementAST(ctx *IfStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfElseIfStatementAST(ctx *IfElseIfStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfElseStatementAST(ctx *IfElseStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfSimpleStatementAST(ctx *IfSimpleStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfSimpleElseIfStatementAST(ctx *IfSimpleElseIfStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitIfSimpleElseStatementAST(ctx *IfSimpleElseStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLoopBlockAST(ctx *LoopBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLoopExpressionBlockAST(ctx *LoopExpressionBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLoopSimpleStatementExpressionSimpleStatementBlockAST(ctx *LoopSimpleStatementExpressionSimpleStatementBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitLoopSimpleStatementSimpleStatementBlockAST(ctx *LoopSimpleStatementSimpleStatementBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSwitchStmtSimpleStatementAST(ctx *SwitchStmtSimpleStatementASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSwitchStmtExpressionAST(ctx *SwitchStmtExpressionASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSwitchStmtSimpleStatementBlockAST(ctx *SwitchStmtSimpleStatementBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitSwitchStmtBlockAST(ctx *SwitchStmtBlockASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionCaseClauseListEmptyAST(ctx *ExpressionCaseClauseListEmptyASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionCaseClauseListAST(ctx *ExpressionCaseClauseListASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionCaseClauseAST(ctx *ExpressionCaseClauseASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionSwitchCaseAST(ctx *ExpressionSwitchCaseASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitExpressionSwitchDefaultAST(ctx *ExpressionSwitchDefaultASTContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMiniGoParserVisitor) VisitEpsilonAST(ctx *EpsilonASTContext) interface{} {
	return v.VisitChildren(ctx)
}
