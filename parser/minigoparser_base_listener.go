// Code generated from E:/Universidad/2024/I Semestre/Compiladores e Interpretes/Proyecto #2/Proyecto Compiladores/MiniGoParser.g4 by ANTLR 4.13.1. DO NOT EDIT.

package parser // MiniGoParser
import "github.com/antlr4-go/antlr/v4"

// BaseMiniGoParserListener is a complete listener for a parse tree produced by MiniGoParser.
type BaseMiniGoParserListener struct{}

var _ MiniGoParserListener = &BaseMiniGoParserListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseMiniGoParserListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseMiniGoParserListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseMiniGoParserListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseMiniGoParserListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterRootAST is called when production rootAST is entered.
func (s *BaseMiniGoParserListener) EnterRootAST(ctx *RootASTContext) {}

// ExitRootAST is called when production rootAST is exited.
func (s *BaseMiniGoParserListener) ExitRootAST(ctx *RootASTContext) {}

// EnterTopDeclarationListAST is called when production topDeclarationListAST is entered.
func (s *BaseMiniGoParserListener) EnterTopDeclarationListAST(ctx *TopDeclarationListASTContext) {}

// ExitTopDeclarationListAST is called when production topDeclarationListAST is exited.
func (s *BaseMiniGoParserListener) ExitTopDeclarationListAST(ctx *TopDeclarationListASTContext) {}

// EnterVariableDeclAST is called when production variableDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterVariableDeclAST(ctx *VariableDeclASTContext) {}

// ExitVariableDeclAST is called when production variableDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitVariableDeclAST(ctx *VariableDeclASTContext) {}

// EnterVariableDeclBlockAST is called when production variableDeclBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterVariableDeclBlockAST(ctx *VariableDeclBlockASTContext) {}

// ExitVariableDeclBlockAST is called when production variableDeclBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitVariableDeclBlockAST(ctx *VariableDeclBlockASTContext) {}

// EnterVariableDeclEmptyAST is called when production variableDeclEmptyAST is entered.
func (s *BaseMiniGoParserListener) EnterVariableDeclEmptyAST(ctx *VariableDeclEmptyASTContext) {}

// ExitVariableDeclEmptyAST is called when production variableDeclEmptyAST is exited.
func (s *BaseMiniGoParserListener) ExitVariableDeclEmptyAST(ctx *VariableDeclEmptyASTContext) {}

// EnterInnerVarDeclsAST is called when production innerVarDeclsAST is entered.
func (s *BaseMiniGoParserListener) EnterInnerVarDeclsAST(ctx *InnerVarDeclsASTContext) {}

// ExitInnerVarDeclsAST is called when production innerVarDeclsAST is exited.
func (s *BaseMiniGoParserListener) ExitInnerVarDeclsAST(ctx *InnerVarDeclsASTContext) {}

// EnterSingleVarDeclAST is called when production singleVarDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterSingleVarDeclAST(ctx *SingleVarDeclASTContext) {}

// ExitSingleVarDeclAST is called when production singleVarDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitSingleVarDeclAST(ctx *SingleVarDeclASTContext) {}

// EnterSingleVarDeclAssignAST is called when production singleVarDeclAssignAST is entered.
func (s *BaseMiniGoParserListener) EnterSingleVarDeclAssignAST(ctx *SingleVarDeclAssignASTContext) {}

// ExitSingleVarDeclAssignAST is called when production singleVarDeclAssignAST is exited.
func (s *BaseMiniGoParserListener) ExitSingleVarDeclAssignAST(ctx *SingleVarDeclAssignASTContext) {}

// EnterSingleVarDeclNoExpsAST is called when production singleVarDeclNoExpsAST is entered.
func (s *BaseMiniGoParserListener) EnterSingleVarDeclNoExpsAST(ctx *SingleVarDeclNoExpsASTContext) {}

// ExitSingleVarDeclNoExpsAST is called when production singleVarDeclNoExpsAST is exited.
func (s *BaseMiniGoParserListener) ExitSingleVarDeclNoExpsAST(ctx *SingleVarDeclNoExpsASTContext) {}

// EnterSingleVarDeclNoExpsDeclTypeAST is called when production singleVarDeclNoExpsDeclTypeAST is entered.
func (s *BaseMiniGoParserListener) EnterSingleVarDeclNoExpsDeclTypeAST(ctx *SingleVarDeclNoExpsDeclTypeASTContext) {}

// ExitSingleVarDeclNoExpsDeclTypeAST is called when production singleVarDeclNoExpsDeclTypeAST is exited.
func (s *BaseMiniGoParserListener) ExitSingleVarDeclNoExpsDeclTypeAST(ctx *SingleVarDeclNoExpsDeclTypeASTContext) {}

// EnterTypeDeclAST is called when production typeDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterTypeDeclAST(ctx *TypeDeclASTContext) {}

// ExitTypeDeclAST is called when production typeDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitTypeDeclAST(ctx *TypeDeclASTContext) {}

// EnterTypeDeclBlockAST is called when production typeDeclBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterTypeDeclBlockAST(ctx *TypeDeclBlockASTContext) {}

// ExitTypeDeclBlockAST is called when production typeDeclBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitTypeDeclBlockAST(ctx *TypeDeclBlockASTContext) {}

// EnterTypeDeclEmptyAST is called when production typeDeclEmptyAST is entered.
func (s *BaseMiniGoParserListener) EnterTypeDeclEmptyAST(ctx *TypeDeclEmptyASTContext) {}

// ExitTypeDeclEmptyAST is called when production typeDeclEmptyAST is exited.
func (s *BaseMiniGoParserListener) ExitTypeDeclEmptyAST(ctx *TypeDeclEmptyASTContext) {}

// EnterInnerTypeDeclsAST is called when production innerTypeDeclsAST is entered.
func (s *BaseMiniGoParserListener) EnterInnerTypeDeclsAST(ctx *InnerTypeDeclsASTContext) {}

// ExitInnerTypeDeclsAST is called when production innerTypeDeclsAST is exited.
func (s *BaseMiniGoParserListener) ExitInnerTypeDeclsAST(ctx *InnerTypeDeclsASTContext) {}

// EnterSingleTypeDeclAST is called when production singleTypeDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterSingleTypeDeclAST(ctx *SingleTypeDeclASTContext) {}

// ExitSingleTypeDeclAST is called when production singleTypeDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitSingleTypeDeclAST(ctx *SingleTypeDeclASTContext) {}

// EnterFuncDeclAST is called when production funcDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterFuncDeclAST(ctx *FuncDeclASTContext) {}

// ExitFuncDeclAST is called when production funcDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitFuncDeclAST(ctx *FuncDeclASTContext) {}

// EnterFuncFrontDeclAST is called when production funcFrontDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterFuncFrontDeclAST(ctx *FuncFrontDeclASTContext) {}

// ExitFuncFrontDeclAST is called when production funcFrontDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitFuncFrontDeclAST(ctx *FuncFrontDeclASTContext) {}

// EnterFuncArgDeclsAST is called when production funcArgDeclsAST is entered.
func (s *BaseMiniGoParserListener) EnterFuncArgDeclsAST(ctx *FuncArgDeclsASTContext) {}

// ExitFuncArgDeclsAST is called when production funcArgDeclsAST is exited.
func (s *BaseMiniGoParserListener) ExitFuncArgDeclsAST(ctx *FuncArgDeclsASTContext) {}

// EnterDeclTypeParenAST is called when production declTypeParenAST is entered.
func (s *BaseMiniGoParserListener) EnterDeclTypeParenAST(ctx *DeclTypeParenASTContext) {}

// ExitDeclTypeParenAST is called when production declTypeParenAST is exited.
func (s *BaseMiniGoParserListener) ExitDeclTypeParenAST(ctx *DeclTypeParenASTContext) {}

// EnterDeclTypeIdentifierAST is called when production declTypeIdentifierAST is entered.
func (s *BaseMiniGoParserListener) EnterDeclTypeIdentifierAST(ctx *DeclTypeIdentifierASTContext) {}

// ExitDeclTypeIdentifierAST is called when production declTypeIdentifierAST is exited.
func (s *BaseMiniGoParserListener) ExitDeclTypeIdentifierAST(ctx *DeclTypeIdentifierASTContext) {}

// EnterDeclTypeSliceAST is called when production declTypeSliceAST is entered.
func (s *BaseMiniGoParserListener) EnterDeclTypeSliceAST(ctx *DeclTypeSliceASTContext) {}

// ExitDeclTypeSliceAST is called when production declTypeSliceAST is exited.
func (s *BaseMiniGoParserListener) ExitDeclTypeSliceAST(ctx *DeclTypeSliceASTContext) {}

// EnterDeclTypeArrayAST is called when production declTypeArrayAST is entered.
func (s *BaseMiniGoParserListener) EnterDeclTypeArrayAST(ctx *DeclTypeArrayASTContext) {}

// ExitDeclTypeArrayAST is called when production declTypeArrayAST is exited.
func (s *BaseMiniGoParserListener) ExitDeclTypeArrayAST(ctx *DeclTypeArrayASTContext) {}

// EnterDeclTypeStructAST is called when production declTypeStructAST is entered.
func (s *BaseMiniGoParserListener) EnterDeclTypeStructAST(ctx *DeclTypeStructASTContext) {}

// ExitDeclTypeStructAST is called when production declTypeStructAST is exited.
func (s *BaseMiniGoParserListener) ExitDeclTypeStructAST(ctx *DeclTypeStructASTContext) {}

// EnterSliceDeclTypeAST is called when production sliceDeclTypeAST is entered.
func (s *BaseMiniGoParserListener) EnterSliceDeclTypeAST(ctx *SliceDeclTypeASTContext) {}

// ExitSliceDeclTypeAST is called when production sliceDeclTypeAST is exited.
func (s *BaseMiniGoParserListener) ExitSliceDeclTypeAST(ctx *SliceDeclTypeASTContext) {}

// EnterArrayDeclTypeAST is called when production arrayDeclTypeAST is entered.
func (s *BaseMiniGoParserListener) EnterArrayDeclTypeAST(ctx *ArrayDeclTypeASTContext) {}

// ExitArrayDeclTypeAST is called when production arrayDeclTypeAST is exited.
func (s *BaseMiniGoParserListener) ExitArrayDeclTypeAST(ctx *ArrayDeclTypeASTContext) {}

// EnterStructDeclTypeAST is called when production structDeclTypeAST is entered.
func (s *BaseMiniGoParserListener) EnterStructDeclTypeAST(ctx *StructDeclTypeASTContext) {}

// ExitStructDeclTypeAST is called when production structDeclTypeAST is exited.
func (s *BaseMiniGoParserListener) ExitStructDeclTypeAST(ctx *StructDeclTypeASTContext) {}

// EnterStructMemDeclsAST is called when production structMemDeclsAST is entered.
func (s *BaseMiniGoParserListener) EnterStructMemDeclsAST(ctx *StructMemDeclsASTContext) {}

// ExitStructMemDeclsAST is called when production structMemDeclsAST is exited.
func (s *BaseMiniGoParserListener) ExitStructMemDeclsAST(ctx *StructMemDeclsASTContext) {}

// EnterIdentifierListAST is called when production identifierListAST is entered.
func (s *BaseMiniGoParserListener) EnterIdentifierListAST(ctx *IdentifierListASTContext) {}

// ExitIdentifierListAST is called when production identifierListAST is exited.
func (s *BaseMiniGoParserListener) ExitIdentifierListAST(ctx *IdentifierListASTContext) {}

// EnterExpressionNotUnaryAST is called when production expressionNotUnaryAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionNotUnaryAST(ctx *ExpressionNotUnaryASTContext) {}

// ExitExpressionNotUnaryAST is called when production expressionNotUnaryAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionNotUnaryAST(ctx *ExpressionNotUnaryASTContext) {}

// EnterExpressionMultiplyAST is called when production expressionMultiplyAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionMultiplyAST(ctx *ExpressionMultiplyASTContext) {}

// ExitExpressionMultiplyAST is called when production expressionMultiplyAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionMultiplyAST(ctx *ExpressionMultiplyASTContext) {}

// EnterExpressionPlusAST is called when production expressionPlusAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionPlusAST(ctx *ExpressionPlusASTContext) {}

// ExitExpressionPlusAST is called when production expressionPlusAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionPlusAST(ctx *ExpressionPlusASTContext) {}

// EnterExpressionModuloAST is called when production expressionModuloAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionModuloAST(ctx *ExpressionModuloASTContext) {}

// ExitExpressionModuloAST is called when production expressionModuloAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionModuloAST(ctx *ExpressionModuloASTContext) {}

// EnterExpressionAndAST is called when production expressionAndAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionAndAST(ctx *ExpressionAndASTContext) {}

// ExitExpressionAndAST is called when production expressionAndAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionAndAST(ctx *ExpressionAndASTContext) {}

// EnterExpressionBitwiseXorAST is called when production expressionBitwiseXorAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionBitwiseXorAST(ctx *ExpressionBitwiseXorASTContext) {}

// ExitExpressionBitwiseXorAST is called when production expressionBitwiseXorAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionBitwiseXorAST(ctx *ExpressionBitwiseXorASTContext) {}

// EnterExpressionMinusAST is called when production expressionMinusAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionMinusAST(ctx *ExpressionMinusASTContext) {}

// ExitExpressionMinusAST is called when production expressionMinusAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionMinusAST(ctx *ExpressionMinusASTContext) {}

// EnterExpressionBitwiseXorUnaryAST is called when production expressionBitwiseXorUnaryAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionBitwiseXorUnaryAST(ctx *ExpressionBitwiseXorUnaryASTContext) {}

// ExitExpressionBitwiseXorUnaryAST is called when production expressionBitwiseXorUnaryAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionBitwiseXorUnaryAST(ctx *ExpressionBitwiseXorUnaryASTContext) {}

// EnterExpressionEqualAST is called when production expressionEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionEqualAST(ctx *ExpressionEqualASTContext) {}

// ExitExpressionEqualAST is called when production expressionEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionEqualAST(ctx *ExpressionEqualASTContext) {}

// EnterExpressionMinusUnaryAST is called when production expressionMinusUnaryAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionMinusUnaryAST(ctx *ExpressionMinusUnaryASTContext) {}

// ExitExpressionMinusUnaryAST is called when production expressionMinusUnaryAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionMinusUnaryAST(ctx *ExpressionMinusUnaryASTContext) {}

// EnterExpressionBitwiseClearAST is called when production expressionBitwiseClearAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionBitwiseClearAST(ctx *ExpressionBitwiseClearASTContext) {}

// ExitExpressionBitwiseClearAST is called when production expressionBitwiseClearAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionBitwiseClearAST(ctx *ExpressionBitwiseClearASTContext) {}

// EnterExpressionGreaterEqualAST is called when production expressionGreaterEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionGreaterEqualAST(ctx *ExpressionGreaterEqualASTContext) {}

// ExitExpressionGreaterEqualAST is called when production expressionGreaterEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionGreaterEqualAST(ctx *ExpressionGreaterEqualASTContext) {}

// EnterExpressionLessEqualAST is called when production expressionLessEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionLessEqualAST(ctx *ExpressionLessEqualASTContext) {}

// ExitExpressionLessEqualAST is called when production expressionLessEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionLessEqualAST(ctx *ExpressionLessEqualASTContext) {}

// EnterExpressionNotEqualAST is called when production expressionNotEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionNotEqualAST(ctx *ExpressionNotEqualASTContext) {}

// ExitExpressionNotEqualAST is called when production expressionNotEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionNotEqualAST(ctx *ExpressionNotEqualASTContext) {}

// EnterExpressionPrimaryAST is called when production expressionPrimaryAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionPrimaryAST(ctx *ExpressionPrimaryASTContext) {}

// ExitExpressionPrimaryAST is called when production expressionPrimaryAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionPrimaryAST(ctx *ExpressionPrimaryASTContext) {}

// EnterExpressionBitwiseAndAST is called when production expressionBitwiseAndAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionBitwiseAndAST(ctx *ExpressionBitwiseAndASTContext) {}

// ExitExpressionBitwiseAndAST is called when production expressionBitwiseAndAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionBitwiseAndAST(ctx *ExpressionBitwiseAndASTContext) {}

// EnterExpressionGreaterAST is called when production expressionGreaterAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionGreaterAST(ctx *ExpressionGreaterASTContext) {}

// ExitExpressionGreaterAST is called when production expressionGreaterAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionGreaterAST(ctx *ExpressionGreaterASTContext) {}

// EnterExpressionDivideAST is called when production expressionDivideAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionDivideAST(ctx *ExpressionDivideASTContext) {}

// ExitExpressionDivideAST is called when production expressionDivideAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionDivideAST(ctx *ExpressionDivideASTContext) {}

// EnterExpressionOrAST is called when production expressionOrAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionOrAST(ctx *ExpressionOrASTContext) {}

// ExitExpressionOrAST is called when production expressionOrAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionOrAST(ctx *ExpressionOrASTContext) {}

// EnterExpressionPlusUnaryAST is called when production expressionPlusUnaryAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionPlusUnaryAST(ctx *ExpressionPlusUnaryASTContext) {}

// ExitExpressionPlusUnaryAST is called when production expressionPlusUnaryAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionPlusUnaryAST(ctx *ExpressionPlusUnaryASTContext) {}

// EnterExpressionBitwiseOrAST is called when production expressionBitwiseOrAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionBitwiseOrAST(ctx *ExpressionBitwiseOrASTContext) {}

// ExitExpressionBitwiseOrAST is called when production expressionBitwiseOrAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionBitwiseOrAST(ctx *ExpressionBitwiseOrASTContext) {}

// EnterExpressionLessAST is called when production expressionLessAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionLessAST(ctx *ExpressionLessASTContext) {}

// ExitExpressionLessAST is called when production expressionLessAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionLessAST(ctx *ExpressionLessASTContext) {}

// EnterExpressionShiftRightAST is called when production expressionShiftRightAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionShiftRightAST(ctx *ExpressionShiftRightASTContext) {}

// ExitExpressionShiftRightAST is called when production expressionShiftRightAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionShiftRightAST(ctx *ExpressionShiftRightASTContext) {}

// EnterExpressionShiftLeftAST is called when production expressionShiftLeftAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionShiftLeftAST(ctx *ExpressionShiftLeftASTContext) {}

// ExitExpressionShiftLeftAST is called when production expressionShiftLeftAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionShiftLeftAST(ctx *ExpressionShiftLeftASTContext) {}

// EnterExpressionListAST is called when production expressionListAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionListAST(ctx *ExpressionListASTContext) {}

// ExitExpressionListAST is called when production expressionListAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionListAST(ctx *ExpressionListASTContext) {}

// EnterPrimaryExpressionLengthAST is called when production primaryExpressionLengthAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionLengthAST(ctx *PrimaryExpressionLengthASTContext) {}

// ExitPrimaryExpressionLengthAST is called when production primaryExpressionLengthAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionLengthAST(ctx *PrimaryExpressionLengthASTContext) {}

// EnterPrimaryExpressionOperandAST is called when production primaryExpressionOperandAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionOperandAST(ctx *PrimaryExpressionOperandASTContext) {}

// ExitPrimaryExpressionOperandAST is called when production primaryExpressionOperandAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionOperandAST(ctx *PrimaryExpressionOperandASTContext) {}

// EnterPrimaryExpressionIndexAST is called when production primaryExpressionIndexAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionIndexAST(ctx *PrimaryExpressionIndexASTContext) {}

// ExitPrimaryExpressionIndexAST is called when production primaryExpressionIndexAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionIndexAST(ctx *PrimaryExpressionIndexASTContext) {}

// EnterPrimaryExpressionAppendAST is called when production primaryExpressionAppendAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionAppendAST(ctx *PrimaryExpressionAppendASTContext) {}

// ExitPrimaryExpressionAppendAST is called when production primaryExpressionAppendAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionAppendAST(ctx *PrimaryExpressionAppendASTContext) {}

// EnterPrimaryExpressionArgumentsAST is called when production primaryExpressionArgumentsAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionArgumentsAST(ctx *PrimaryExpressionArgumentsASTContext) {}

// ExitPrimaryExpressionArgumentsAST is called when production primaryExpressionArgumentsAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionArgumentsAST(ctx *PrimaryExpressionArgumentsASTContext) {}

// EnterPrimaryExpressionCapAST is called when production primaryExpressionCapAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionCapAST(ctx *PrimaryExpressionCapASTContext) {}

// ExitPrimaryExpressionCapAST is called when production primaryExpressionCapAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionCapAST(ctx *PrimaryExpressionCapASTContext) {}

// EnterPrimaryExpressionSelectorAST is called when production primaryExpressionSelectorAST is entered.
func (s *BaseMiniGoParserListener) EnterPrimaryExpressionSelectorAST(ctx *PrimaryExpressionSelectorASTContext) {}

// ExitPrimaryExpressionSelectorAST is called when production primaryExpressionSelectorAST is exited.
func (s *BaseMiniGoParserListener) ExitPrimaryExpressionSelectorAST(ctx *PrimaryExpressionSelectorASTContext) {}

// EnterOperandLiteralAST is called when production operandLiteralAST is entered.
func (s *BaseMiniGoParserListener) EnterOperandLiteralAST(ctx *OperandLiteralASTContext) {}

// ExitOperandLiteralAST is called when production operandLiteralAST is exited.
func (s *BaseMiniGoParserListener) ExitOperandLiteralAST(ctx *OperandLiteralASTContext) {}

// EnterOperandIdentifierAST is called when production operandIdentifierAST is entered.
func (s *BaseMiniGoParserListener) EnterOperandIdentifierAST(ctx *OperandIdentifierASTContext) {}

// ExitOperandIdentifierAST is called when production operandIdentifierAST is exited.
func (s *BaseMiniGoParserListener) ExitOperandIdentifierAST(ctx *OperandIdentifierASTContext) {}

// EnterOperandParenAST is called when production operandParenAST is entered.
func (s *BaseMiniGoParserListener) EnterOperandParenAST(ctx *OperandParenASTContext) {}

// ExitOperandParenAST is called when production operandParenAST is exited.
func (s *BaseMiniGoParserListener) ExitOperandParenAST(ctx *OperandParenASTContext) {}

// EnterLiteralIntAST is called when production literalIntAST is entered.
func (s *BaseMiniGoParserListener) EnterLiteralIntAST(ctx *LiteralIntASTContext) {}

// ExitLiteralIntAST is called when production literalIntAST is exited.
func (s *BaseMiniGoParserListener) ExitLiteralIntAST(ctx *LiteralIntASTContext) {}

// EnterLiteralFloatAST is called when production literalFloatAST is entered.
func (s *BaseMiniGoParserListener) EnterLiteralFloatAST(ctx *LiteralFloatASTContext) {}

// ExitLiteralFloatAST is called when production literalFloatAST is exited.
func (s *BaseMiniGoParserListener) ExitLiteralFloatAST(ctx *LiteralFloatASTContext) {}

// EnterLiteralRuneAST is called when production literalRuneAST is entered.
func (s *BaseMiniGoParserListener) EnterLiteralRuneAST(ctx *LiteralRuneASTContext) {}

// ExitLiteralRuneAST is called when production literalRuneAST is exited.
func (s *BaseMiniGoParserListener) ExitLiteralRuneAST(ctx *LiteralRuneASTContext) {}

// EnterLiteralRawStringAST is called when production literalRawStringAST is entered.
func (s *BaseMiniGoParserListener) EnterLiteralRawStringAST(ctx *LiteralRawStringASTContext) {}

// ExitLiteralRawStringAST is called when production literalRawStringAST is exited.
func (s *BaseMiniGoParserListener) ExitLiteralRawStringAST(ctx *LiteralRawStringASTContext) {}

// EnterLiteralInterpretedStringAST is called when production literalInterpretedStringAST is entered.
func (s *BaseMiniGoParserListener) EnterLiteralInterpretedStringAST(ctx *LiteralInterpretedStringASTContext) {}

// ExitLiteralInterpretedStringAST is called when production literalInterpretedStringAST is exited.
func (s *BaseMiniGoParserListener) ExitLiteralInterpretedStringAST(ctx *LiteralInterpretedStringASTContext) {}

// EnterIndexAST is called when production indexAST is entered.
func (s *BaseMiniGoParserListener) EnterIndexAST(ctx *IndexASTContext) {}

// ExitIndexAST is called when production indexAST is exited.
func (s *BaseMiniGoParserListener) ExitIndexAST(ctx *IndexASTContext) {}

// EnterArgumentsAST is called when production argumentsAST is entered.
func (s *BaseMiniGoParserListener) EnterArgumentsAST(ctx *ArgumentsASTContext) {}

// ExitArgumentsAST is called when production argumentsAST is exited.
func (s *BaseMiniGoParserListener) ExitArgumentsAST(ctx *ArgumentsASTContext) {}

// EnterArgumentsEmptyAST is called when production argumentsEmptyAST is entered.
func (s *BaseMiniGoParserListener) EnterArgumentsEmptyAST(ctx *ArgumentsEmptyASTContext) {}

// ExitArgumentsEmptyAST is called when production argumentsEmptyAST is exited.
func (s *BaseMiniGoParserListener) ExitArgumentsEmptyAST(ctx *ArgumentsEmptyASTContext) {}

// EnterSelectorAST is called when production selectorAST is entered.
func (s *BaseMiniGoParserListener) EnterSelectorAST(ctx *SelectorASTContext) {}

// ExitSelectorAST is called when production selectorAST is exited.
func (s *BaseMiniGoParserListener) ExitSelectorAST(ctx *SelectorASTContext) {}

// EnterAppendExpressionAST is called when production appendExpressionAST is entered.
func (s *BaseMiniGoParserListener) EnterAppendExpressionAST(ctx *AppendExpressionASTContext) {}

// ExitAppendExpressionAST is called when production appendExpressionAST is exited.
func (s *BaseMiniGoParserListener) ExitAppendExpressionAST(ctx *AppendExpressionASTContext) {}

// EnterLengthExpressionAST is called when production lengthExpressionAST is entered.
func (s *BaseMiniGoParserListener) EnterLengthExpressionAST(ctx *LengthExpressionASTContext) {}

// ExitLengthExpressionAST is called when production lengthExpressionAST is exited.
func (s *BaseMiniGoParserListener) ExitLengthExpressionAST(ctx *LengthExpressionASTContext) {}

// EnterCapExpressionAST is called when production capExpressionAST is entered.
func (s *BaseMiniGoParserListener) EnterCapExpressionAST(ctx *CapExpressionASTContext) {}

// ExitCapExpressionAST is called when production capExpressionAST is exited.
func (s *BaseMiniGoParserListener) ExitCapExpressionAST(ctx *CapExpressionASTContext) {}

// EnterStatementListAST is called when production statementListAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementListAST(ctx *StatementListASTContext) {}

// ExitStatementListAST is called when production statementListAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementListAST(ctx *StatementListASTContext) {}

// EnterBlockAST is called when production blockAST is entered.
func (s *BaseMiniGoParserListener) EnterBlockAST(ctx *BlockASTContext) {}

// ExitBlockAST is called when production blockAST is exited.
func (s *BaseMiniGoParserListener) ExitBlockAST(ctx *BlockASTContext) {}

// EnterStatementPrintAST is called when production statementPrintAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementPrintAST(ctx *StatementPrintASTContext) {}

// ExitStatementPrintAST is called when production statementPrintAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementPrintAST(ctx *StatementPrintASTContext) {}

// EnterStatementPrintlnAST is called when production statementPrintlnAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementPrintlnAST(ctx *StatementPrintlnASTContext) {}

// ExitStatementPrintlnAST is called when production statementPrintlnAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementPrintlnAST(ctx *StatementPrintlnASTContext) {}

// EnterStatementReturnAST is called when production statementReturnAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementReturnAST(ctx *StatementReturnASTContext) {}

// ExitStatementReturnAST is called when production statementReturnAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementReturnAST(ctx *StatementReturnASTContext) {}

// EnterStatementBreakAST is called when production statementBreakAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementBreakAST(ctx *StatementBreakASTContext) {}

// ExitStatementBreakAST is called when production statementBreakAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementBreakAST(ctx *StatementBreakASTContext) {}

// EnterStatementContinueAST is called when production statementContinueAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementContinueAST(ctx *StatementContinueASTContext) {}

// ExitStatementContinueAST is called when production statementContinueAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementContinueAST(ctx *StatementContinueASTContext) {}

// EnterStatementSimpleAST is called when production statementSimpleAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementSimpleAST(ctx *StatementSimpleASTContext) {}

// ExitStatementSimpleAST is called when production statementSimpleAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementSimpleAST(ctx *StatementSimpleASTContext) {}

// EnterStatementBlockAST is called when production statementBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementBlockAST(ctx *StatementBlockASTContext) {}

// ExitStatementBlockAST is called when production statementBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementBlockAST(ctx *StatementBlockASTContext) {}

// EnterStatementSwitchAST is called when production statementSwitchAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementSwitchAST(ctx *StatementSwitchASTContext) {}

// ExitStatementSwitchAST is called when production statementSwitchAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementSwitchAST(ctx *StatementSwitchASTContext) {}

// EnterStatementIfAST is called when production statementIfAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementIfAST(ctx *StatementIfASTContext) {}

// ExitStatementIfAST is called when production statementIfAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementIfAST(ctx *StatementIfASTContext) {}

// EnterStatementLoopAST is called when production statementLoopAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementLoopAST(ctx *StatementLoopASTContext) {}

// ExitStatementLoopAST is called when production statementLoopAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementLoopAST(ctx *StatementLoopASTContext) {}

// EnterStatementTypeDeclAST is called when production statementTypeDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementTypeDeclAST(ctx *StatementTypeDeclASTContext) {}

// ExitStatementTypeDeclAST is called when production statementTypeDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementTypeDeclAST(ctx *StatementTypeDeclASTContext) {}

// EnterStatementVariableDeclAST is called when production statementVariableDeclAST is entered.
func (s *BaseMiniGoParserListener) EnterStatementVariableDeclAST(ctx *StatementVariableDeclASTContext) {}

// ExitStatementVariableDeclAST is called when production statementVariableDeclAST is exited.
func (s *BaseMiniGoParserListener) ExitStatementVariableDeclAST(ctx *StatementVariableDeclASTContext) {}

// EnterSimpleStatementEmptyAST is called when production simpleStatementEmptyAST is entered.
func (s *BaseMiniGoParserListener) EnterSimpleStatementEmptyAST(ctx *SimpleStatementEmptyASTContext) {}

// ExitSimpleStatementEmptyAST is called when production simpleStatementEmptyAST is exited.
func (s *BaseMiniGoParserListener) ExitSimpleStatementEmptyAST(ctx *SimpleStatementEmptyASTContext) {}

// EnterSimpleStatementExpressionAST is called when production simpleStatementExpressionAST is entered.
func (s *BaseMiniGoParserListener) EnterSimpleStatementExpressionAST(ctx *SimpleStatementExpressionASTContext) {}

// ExitSimpleStatementExpressionAST is called when production simpleStatementExpressionAST is exited.
func (s *BaseMiniGoParserListener) ExitSimpleStatementExpressionAST(ctx *SimpleStatementExpressionASTContext) {}

// EnterSimpleStatementAssignmentAST is called when production simpleStatementAssignmentAST is entered.
func (s *BaseMiniGoParserListener) EnterSimpleStatementAssignmentAST(ctx *SimpleStatementAssignmentASTContext) {}

// ExitSimpleStatementAssignmentAST is called when production simpleStatementAssignmentAST is exited.
func (s *BaseMiniGoParserListener) ExitSimpleStatementAssignmentAST(ctx *SimpleStatementAssignmentASTContext) {}

// EnterSimpleStatementExpressionListAssignAST is called when production simpleStatementExpressionListAssignAST is entered.
func (s *BaseMiniGoParserListener) EnterSimpleStatementExpressionListAssignAST(ctx *SimpleStatementExpressionListAssignASTContext) {}

// ExitSimpleStatementExpressionListAssignAST is called when production simpleStatementExpressionListAssignAST is exited.
func (s *BaseMiniGoParserListener) ExitSimpleStatementExpressionListAssignAST(ctx *SimpleStatementExpressionListAssignASTContext) {}

// EnterAssignmentStatementAST is called when production assignmentStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementAST(ctx *AssignmentStatementASTContext) {}

// ExitAssignmentStatementAST is called when production assignmentStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementAST(ctx *AssignmentStatementASTContext) {}

// EnterAssignmentStatementPlusEqualAST is called when production assignmentStatementPlusEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementPlusEqualAST(ctx *AssignmentStatementPlusEqualASTContext) {}

// ExitAssignmentStatementPlusEqualAST is called when production assignmentStatementPlusEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementPlusEqualAST(ctx *AssignmentStatementPlusEqualASTContext) {}

// EnterAssignmentStatementMinusEqualAST is called when production assignmentStatementMinusEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementMinusEqualAST(ctx *AssignmentStatementMinusEqualASTContext) {}

// ExitAssignmentStatementMinusEqualAST is called when production assignmentStatementMinusEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementMinusEqualAST(ctx *AssignmentStatementMinusEqualASTContext) {}

// EnterAssignmentStatementBitwiseAndEqualAST is called when production assignmentStatementBitwiseAndEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementBitwiseAndEqualAST(ctx *AssignmentStatementBitwiseAndEqualASTContext) {}

// ExitAssignmentStatementBitwiseAndEqualAST is called when production assignmentStatementBitwiseAndEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementBitwiseAndEqualAST(ctx *AssignmentStatementBitwiseAndEqualASTContext) {}

// EnterAssignmentStatementBitwiseOrEqualAST is called when production assignmentStatementBitwiseOrEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementBitwiseOrEqualAST(ctx *AssignmentStatementBitwiseOrEqualASTContext) {}

// ExitAssignmentStatementBitwiseOrEqualAST is called when production assignmentStatementBitwiseOrEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementBitwiseOrEqualAST(ctx *AssignmentStatementBitwiseOrEqualASTContext) {}

// EnterAssignmentStatementMultiplyEqualAST is called when production assignmentStatementMultiplyEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementMultiplyEqualAST(ctx *AssignmentStatementMultiplyEqualASTContext) {}

// ExitAssignmentStatementMultiplyEqualAST is called when production assignmentStatementMultiplyEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementMultiplyEqualAST(ctx *AssignmentStatementMultiplyEqualASTContext) {}

// EnterAssignmentStatementBitwiseXorEqualAST is called when production assignmentStatementBitwiseXorEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementBitwiseXorEqualAST(ctx *AssignmentStatementBitwiseXorEqualASTContext) {}

// ExitAssignmentStatementBitwiseXorEqualAST is called when production assignmentStatementBitwiseXorEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementBitwiseXorEqualAST(ctx *AssignmentStatementBitwiseXorEqualASTContext) {}

// EnterAssignmentStatementShiftLeftEqualAST is called when production assignmentStatementShiftLeftEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementShiftLeftEqualAST(ctx *AssignmentStatementShiftLeftEqualASTContext) {}

// ExitAssignmentStatementShiftLeftEqualAST is called when production assignmentStatementShiftLeftEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementShiftLeftEqualAST(ctx *AssignmentStatementShiftLeftEqualASTContext) {}

// EnterAssignmentStatementShiftRightEqualAST is called when production assignmentStatementShiftRightEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementShiftRightEqualAST(ctx *AssignmentStatementShiftRightEqualASTContext) {}

// ExitAssignmentStatementShiftRightEqualAST is called when production assignmentStatementShiftRightEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementShiftRightEqualAST(ctx *AssignmentStatementShiftRightEqualASTContext) {}

// EnterAssignmentStatementBitwiseClearEqualAST is called when production assignmentStatementBitwiseClearEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementBitwiseClearEqualAST(ctx *AssignmentStatementBitwiseClearEqualASTContext) {}

// ExitAssignmentStatementBitwiseClearEqualAST is called when production assignmentStatementBitwiseClearEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementBitwiseClearEqualAST(ctx *AssignmentStatementBitwiseClearEqualASTContext) {}

// EnterAssignmentStatementModuloEqualAST is called when production assignmentStatementModuloEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementModuloEqualAST(ctx *AssignmentStatementModuloEqualASTContext) {}

// ExitAssignmentStatementModuloEqualAST is called when production assignmentStatementModuloEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementModuloEqualAST(ctx *AssignmentStatementModuloEqualASTContext) {}

// EnterAssignmentStatementDivideEqualAST is called when production assignmentStatementDivideEqualAST is entered.
func (s *BaseMiniGoParserListener) EnterAssignmentStatementDivideEqualAST(ctx *AssignmentStatementDivideEqualASTContext) {}

// ExitAssignmentStatementDivideEqualAST is called when production assignmentStatementDivideEqualAST is exited.
func (s *BaseMiniGoParserListener) ExitAssignmentStatementDivideEqualAST(ctx *AssignmentStatementDivideEqualASTContext) {}

// EnterIfStatementAST is called when production ifStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfStatementAST(ctx *IfStatementASTContext) {}

// ExitIfStatementAST is called when production ifStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfStatementAST(ctx *IfStatementASTContext) {}

// EnterIfElseIfStatementAST is called when production ifElseIfStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfElseIfStatementAST(ctx *IfElseIfStatementASTContext) {}

// ExitIfElseIfStatementAST is called when production ifElseIfStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfElseIfStatementAST(ctx *IfElseIfStatementASTContext) {}

// EnterIfElseStatementAST is called when production ifElseStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfElseStatementAST(ctx *IfElseStatementASTContext) {}

// ExitIfElseStatementAST is called when production ifElseStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfElseStatementAST(ctx *IfElseStatementASTContext) {}

// EnterIfSimpleStatementAST is called when production ifSimpleStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfSimpleStatementAST(ctx *IfSimpleStatementASTContext) {}

// ExitIfSimpleStatementAST is called when production ifSimpleStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfSimpleStatementAST(ctx *IfSimpleStatementASTContext) {}

// EnterIfSimpleElseIfStatementAST is called when production ifSimpleElseIfStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfSimpleElseIfStatementAST(ctx *IfSimpleElseIfStatementASTContext) {}

// ExitIfSimpleElseIfStatementAST is called when production ifSimpleElseIfStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfSimpleElseIfStatementAST(ctx *IfSimpleElseIfStatementASTContext) {}

// EnterIfSimpleElseStatementAST is called when production ifSimpleElseStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterIfSimpleElseStatementAST(ctx *IfSimpleElseStatementASTContext) {}

// ExitIfSimpleElseStatementAST is called when production ifSimpleElseStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitIfSimpleElseStatementAST(ctx *IfSimpleElseStatementASTContext) {}

// EnterLoopBlockAST is called when production loopBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterLoopBlockAST(ctx *LoopBlockASTContext) {}

// ExitLoopBlockAST is called when production loopBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitLoopBlockAST(ctx *LoopBlockASTContext) {}

// EnterLoopExpressionBlockAST is called when production loopExpressionBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterLoopExpressionBlockAST(ctx *LoopExpressionBlockASTContext) {}

// ExitLoopExpressionBlockAST is called when production loopExpressionBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitLoopExpressionBlockAST(ctx *LoopExpressionBlockASTContext) {}

// EnterLoopSimpleStatementExpressionSimpleStatementBlockAST is called when production loopSimpleStatementExpressionSimpleStatementBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterLoopSimpleStatementExpressionSimpleStatementBlockAST(ctx *LoopSimpleStatementExpressionSimpleStatementBlockASTContext) {}

// ExitLoopSimpleStatementExpressionSimpleStatementBlockAST is called when production loopSimpleStatementExpressionSimpleStatementBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitLoopSimpleStatementExpressionSimpleStatementBlockAST(ctx *LoopSimpleStatementExpressionSimpleStatementBlockASTContext) {}

// EnterLoopSimpleStatementSimpleStatementBlockAST is called when production loopSimpleStatementSimpleStatementBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterLoopSimpleStatementSimpleStatementBlockAST(ctx *LoopSimpleStatementSimpleStatementBlockASTContext) {}

// ExitLoopSimpleStatementSimpleStatementBlockAST is called when production loopSimpleStatementSimpleStatementBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitLoopSimpleStatementSimpleStatementBlockAST(ctx *LoopSimpleStatementSimpleStatementBlockASTContext) {}

// EnterSwitchStmtSimpleStatementAST is called when production switchStmtSimpleStatementAST is entered.
func (s *BaseMiniGoParserListener) EnterSwitchStmtSimpleStatementAST(ctx *SwitchStmtSimpleStatementASTContext) {}

// ExitSwitchStmtSimpleStatementAST is called when production switchStmtSimpleStatementAST is exited.
func (s *BaseMiniGoParserListener) ExitSwitchStmtSimpleStatementAST(ctx *SwitchStmtSimpleStatementASTContext) {}

// EnterSwitchStmtExpressionAST is called when production switchStmtExpressionAST is entered.
func (s *BaseMiniGoParserListener) EnterSwitchStmtExpressionAST(ctx *SwitchStmtExpressionASTContext) {}

// ExitSwitchStmtExpressionAST is called when production switchStmtExpressionAST is exited.
func (s *BaseMiniGoParserListener) ExitSwitchStmtExpressionAST(ctx *SwitchStmtExpressionASTContext) {}

// EnterSwitchStmtSimpleStatementBlockAST is called when production switchStmtSimpleStatementBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterSwitchStmtSimpleStatementBlockAST(ctx *SwitchStmtSimpleStatementBlockASTContext) {}

// ExitSwitchStmtSimpleStatementBlockAST is called when production switchStmtSimpleStatementBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitSwitchStmtSimpleStatementBlockAST(ctx *SwitchStmtSimpleStatementBlockASTContext) {}

// EnterSwitchStmtBlockAST is called when production switchStmtBlockAST is entered.
func (s *BaseMiniGoParserListener) EnterSwitchStmtBlockAST(ctx *SwitchStmtBlockASTContext) {}

// ExitSwitchStmtBlockAST is called when production switchStmtBlockAST is exited.
func (s *BaseMiniGoParserListener) ExitSwitchStmtBlockAST(ctx *SwitchStmtBlockASTContext) {}

// EnterExpressionCaseClauseListEmptyAST is called when production expressionCaseClauseListEmptyAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionCaseClauseListEmptyAST(ctx *ExpressionCaseClauseListEmptyASTContext) {}

// ExitExpressionCaseClauseListEmptyAST is called when production expressionCaseClauseListEmptyAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionCaseClauseListEmptyAST(ctx *ExpressionCaseClauseListEmptyASTContext) {}

// EnterExpressionCaseClauseListAST is called when production expressionCaseClauseListAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionCaseClauseListAST(ctx *ExpressionCaseClauseListASTContext) {}

// ExitExpressionCaseClauseListAST is called when production expressionCaseClauseListAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionCaseClauseListAST(ctx *ExpressionCaseClauseListASTContext) {}

// EnterExpressionCaseClauseAST is called when production expressionCaseClauseAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionCaseClauseAST(ctx *ExpressionCaseClauseASTContext) {}

// ExitExpressionCaseClauseAST is called when production expressionCaseClauseAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionCaseClauseAST(ctx *ExpressionCaseClauseASTContext) {}

// EnterExpressionSwitchCaseAST is called when production expressionSwitchCaseAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionSwitchCaseAST(ctx *ExpressionSwitchCaseASTContext) {}

// ExitExpressionSwitchCaseAST is called when production expressionSwitchCaseAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionSwitchCaseAST(ctx *ExpressionSwitchCaseASTContext) {}

// EnterExpressionSwitchDefaultAST is called when production expressionSwitchDefaultAST is entered.
func (s *BaseMiniGoParserListener) EnterExpressionSwitchDefaultAST(ctx *ExpressionSwitchDefaultASTContext) {}

// ExitExpressionSwitchDefaultAST is called when production expressionSwitchDefaultAST is exited.
func (s *BaseMiniGoParserListener) ExitExpressionSwitchDefaultAST(ctx *ExpressionSwitchDefaultASTContext) {}

// EnterEpsilonAST is called when production epsilonAST is entered.
func (s *BaseMiniGoParserListener) EnterEpsilonAST(ctx *EpsilonASTContext) {}

// ExitEpsilonAST is called when production epsilonAST is exited.
func (s *BaseMiniGoParserListener) ExitEpsilonAST(ctx *EpsilonASTContext) {}
