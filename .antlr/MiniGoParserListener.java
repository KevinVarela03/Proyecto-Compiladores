// Generated from c:/Users/noni4/Desktop/Proyecto-Compiladores/MiniGoParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniGoParser}.
 */
public interface MiniGoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code rootAST}
	 * labeled alternative in {@link MiniGoParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRootAST(MiniGoParser.RootASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rootAST}
	 * labeled alternative in {@link MiniGoParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRootAST(MiniGoParser.RootASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code topDeclarationListAST}
	 * labeled alternative in {@link MiniGoParser#topDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclarationListAST(MiniGoParser.TopDeclarationListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code topDeclarationListAST}
	 * labeled alternative in {@link MiniGoParser#topDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclarationListAST(MiniGoParser.TopDeclarationListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclAST(MiniGoParser.VariableDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclAST(MiniGoParser.VariableDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclBlockAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclBlockAST(MiniGoParser.VariableDeclBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclBlockAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclBlockAST(MiniGoParser.VariableDeclBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclEmptyAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclEmptyAST(MiniGoParser.VariableDeclEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclEmptyAST}
	 * labeled alternative in {@link MiniGoParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclEmptyAST(MiniGoParser.VariableDeclEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerVarDeclsAST}
	 * labeled alternative in {@link MiniGoParser#innerVarDecls}.
	 * @param ctx the parse tree
	 */
	void enterInnerVarDeclsAST(MiniGoParser.InnerVarDeclsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerVarDeclsAST}
	 * labeled alternative in {@link MiniGoParser#innerVarDecls}.
	 * @param ctx the parse tree
	 */
	void exitInnerVarDeclsAST(MiniGoParser.InnerVarDeclsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVarDeclAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarDeclAST(MiniGoParser.SingleVarDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVarDeclAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarDeclAST(MiniGoParser.SingleVarDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVarDeclAssignAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarDeclAssignAST(MiniGoParser.SingleVarDeclAssignASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVarDeclAssignAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarDeclAssignAST(MiniGoParser.SingleVarDeclAssignASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVarDeclNoExpsAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarDeclNoExpsAST(MiniGoParser.SingleVarDeclNoExpsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVarDeclNoExpsAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarDeclNoExpsAST(MiniGoParser.SingleVarDeclNoExpsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleVarDeclNoExpsDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDeclNoExps}.
	 * @param ctx the parse tree
	 */
	void enterSingleVarDeclNoExpsDeclTypeAST(MiniGoParser.SingleVarDeclNoExpsDeclTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleVarDeclNoExpsDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#singleVarDeclNoExps}.
	 * @param ctx the parse tree
	 */
	void exitSingleVarDeclNoExpsDeclTypeAST(MiniGoParser.SingleVarDeclNoExpsDeclTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclAST(MiniGoParser.TypeDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclAST(MiniGoParser.TypeDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclBlockAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclBlockAST(MiniGoParser.TypeDeclBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclBlockAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclBlockAST(MiniGoParser.TypeDeclBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeclEmptyAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclEmptyAST(MiniGoParser.TypeDeclEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeclEmptyAST}
	 * labeled alternative in {@link MiniGoParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclEmptyAST(MiniGoParser.TypeDeclEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerTypeDeclsAST}
	 * labeled alternative in {@link MiniGoParser#innerTypeDecls}.
	 * @param ctx the parse tree
	 */
	void enterInnerTypeDeclsAST(MiniGoParser.InnerTypeDeclsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerTypeDeclsAST}
	 * labeled alternative in {@link MiniGoParser#innerTypeDecls}.
	 * @param ctx the parse tree
	 */
	void exitInnerTypeDeclsAST(MiniGoParser.InnerTypeDeclsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTypeDeclAST}
	 * labeled alternative in {@link MiniGoParser#singleTypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeDeclAST(MiniGoParser.SingleTypeDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTypeDeclAST}
	 * labeled alternative in {@link MiniGoParser#singleTypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeDeclAST(MiniGoParser.SingleTypeDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclAST}
	 * labeled alternative in {@link MiniGoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclAST(MiniGoParser.FuncDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclAST}
	 * labeled alternative in {@link MiniGoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclAST(MiniGoParser.FuncDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcFrontDeclAST}
	 * labeled alternative in {@link MiniGoParser#funcFrontDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncFrontDeclAST(MiniGoParser.FuncFrontDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcFrontDeclAST}
	 * labeled alternative in {@link MiniGoParser#funcFrontDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncFrontDeclAST(MiniGoParser.FuncFrontDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleReturnTypesAST}
	 * labeled alternative in {@link MiniGoParser#multipleReturnTypes}.
	 * @param ctx the parse tree
	 */
	void enterMultipleReturnTypesAST(MiniGoParser.MultipleReturnTypesASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleReturnTypesAST}
	 * labeled alternative in {@link MiniGoParser#multipleReturnTypes}.
	 * @param ctx the parse tree
	 */
	void exitMultipleReturnTypesAST(MiniGoParser.MultipleReturnTypesASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnTypeListAST}
	 * labeled alternative in {@link MiniGoParser#returnTypeList}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeListAST(MiniGoParser.ReturnTypeListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnTypeListAST}
	 * labeled alternative in {@link MiniGoParser#returnTypeList}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeListAST(MiniGoParser.ReturnTypeListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleReturnTypeAST}
	 * labeled alternative in {@link MiniGoParser#singleReturnType}.
	 * @param ctx the parse tree
	 */
	void enterSingleReturnTypeAST(MiniGoParser.SingleReturnTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleReturnTypeAST}
	 * labeled alternative in {@link MiniGoParser#singleReturnType}.
	 * @param ctx the parse tree
	 */
	void exitSingleReturnTypeAST(MiniGoParser.SingleReturnTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleReturnTypeEmptyAST}
	 * labeled alternative in {@link MiniGoParser#singleReturnType}.
	 * @param ctx the parse tree
	 */
	void enterSingleReturnTypeEmptyAST(MiniGoParser.SingleReturnTypeEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleReturnTypeEmptyAST}
	 * labeled alternative in {@link MiniGoParser#singleReturnType}.
	 * @param ctx the parse tree
	 */
	void exitSingleReturnTypeEmptyAST(MiniGoParser.SingleReturnTypeEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcArgDeclsAST}
	 * labeled alternative in {@link MiniGoParser#funcArgDecls}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgDeclsAST(MiniGoParser.FuncArgDeclsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcArgDeclsAST}
	 * labeled alternative in {@link MiniGoParser#funcArgDecls}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgDeclsAST(MiniGoParser.FuncArgDeclsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declTypeParenAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeParenAST(MiniGoParser.DeclTypeParenASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declTypeParenAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeParenAST(MiniGoParser.DeclTypeParenASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declTypeIdentifierAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeIdentifierAST(MiniGoParser.DeclTypeIdentifierASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declTypeIdentifierAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeIdentifierAST(MiniGoParser.DeclTypeIdentifierASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declTypeSliceAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeSliceAST(MiniGoParser.DeclTypeSliceASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declTypeSliceAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeSliceAST(MiniGoParser.DeclTypeSliceASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declTypeArrayAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeArrayAST(MiniGoParser.DeclTypeArrayASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declTypeArrayAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeArrayAST(MiniGoParser.DeclTypeArrayASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declTypeStructAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeStructAST(MiniGoParser.DeclTypeStructASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declTypeStructAST}
	 * labeled alternative in {@link MiniGoParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeStructAST(MiniGoParser.DeclTypeStructASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sliceDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#sliceDeclType}.
	 * @param ctx the parse tree
	 */
	void enterSliceDeclTypeAST(MiniGoParser.SliceDeclTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sliceDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#sliceDeclType}.
	 * @param ctx the parse tree
	 */
	void exitSliceDeclTypeAST(MiniGoParser.SliceDeclTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#arrayDeclType}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclTypeAST(MiniGoParser.ArrayDeclTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#arrayDeclType}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclTypeAST(MiniGoParser.ArrayDeclTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#structDeclType}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclTypeAST(MiniGoParser.StructDeclTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDeclTypeAST}
	 * labeled alternative in {@link MiniGoParser#structDeclType}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclTypeAST(MiniGoParser.StructDeclTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structMemDeclsAST}
	 * labeled alternative in {@link MiniGoParser#structMemDecls}.
	 * @param ctx the parse tree
	 */
	void enterStructMemDeclsAST(MiniGoParser.StructMemDeclsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structMemDeclsAST}
	 * labeled alternative in {@link MiniGoParser#structMemDecls}.
	 * @param ctx the parse tree
	 */
	void exitStructMemDeclsAST(MiniGoParser.StructMemDeclsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierListAST}
	 * labeled alternative in {@link MiniGoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierListAST(MiniGoParser.IdentifierListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierListAST}
	 * labeled alternative in {@link MiniGoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierListAST(MiniGoParser.IdentifierListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNotUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNotUnaryAST(MiniGoParser.ExpressionNotUnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNotUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNotUnaryAST(MiniGoParser.ExpressionNotUnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMultiplyAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultiplyAST(MiniGoParser.ExpressionMultiplyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMultiplyAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultiplyAST(MiniGoParser.ExpressionMultiplyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPlusAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlusAST(MiniGoParser.ExpressionPlusASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPlusAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlusAST(MiniGoParser.ExpressionPlusASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionModuloAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionModuloAST(MiniGoParser.ExpressionModuloASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionModuloAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionModuloAST(MiniGoParser.ExpressionModuloASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAndAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAndAST(MiniGoParser.ExpressionAndASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAndAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAndAST(MiniGoParser.ExpressionAndASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBitwiseXorAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwiseXorAST(MiniGoParser.ExpressionBitwiseXorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBitwiseXorAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwiseXorAST(MiniGoParser.ExpressionBitwiseXorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMinusAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMinusAST(MiniGoParser.ExpressionMinusASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMinusAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMinusAST(MiniGoParser.ExpressionMinusASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBitwiseXorUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwiseXorUnaryAST(MiniGoParser.ExpressionBitwiseXorUnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBitwiseXorUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwiseXorUnaryAST(MiniGoParser.ExpressionBitwiseXorUnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEqualAST(MiniGoParser.ExpressionEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEqualAST(MiniGoParser.ExpressionEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMinusUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMinusUnaryAST(MiniGoParser.ExpressionMinusUnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMinusUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMinusUnaryAST(MiniGoParser.ExpressionMinusUnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBitwiseClearAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwiseClearAST(MiniGoParser.ExpressionBitwiseClearASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBitwiseClearAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwiseClearAST(MiniGoParser.ExpressionBitwiseClearASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionGreaterEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGreaterEqualAST(MiniGoParser.ExpressionGreaterEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionGreaterEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGreaterEqualAST(MiniGoParser.ExpressionGreaterEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLessEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessEqualAST(MiniGoParser.ExpressionLessEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLessEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessEqualAST(MiniGoParser.ExpressionLessEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNotEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNotEqualAST(MiniGoParser.ExpressionNotEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNotEqualAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNotEqualAST(MiniGoParser.ExpressionNotEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPrimaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPrimaryAST(MiniGoParser.ExpressionPrimaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPrimaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPrimaryAST(MiniGoParser.ExpressionPrimaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBitwiseAndAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwiseAndAST(MiniGoParser.ExpressionBitwiseAndASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBitwiseAndAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwiseAndAST(MiniGoParser.ExpressionBitwiseAndASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionGreaterAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGreaterAST(MiniGoParser.ExpressionGreaterASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionGreaterAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGreaterAST(MiniGoParser.ExpressionGreaterASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDivideAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDivideAST(MiniGoParser.ExpressionDivideASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDivideAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDivideAST(MiniGoParser.ExpressionDivideASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOrAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrAST(MiniGoParser.ExpressionOrASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOrAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrAST(MiniGoParser.ExpressionOrASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPlusUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlusUnaryAST(MiniGoParser.ExpressionPlusUnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPlusUnaryAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlusUnaryAST(MiniGoParser.ExpressionPlusUnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBitwiseOrAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwiseOrAST(MiniGoParser.ExpressionBitwiseOrASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBitwiseOrAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwiseOrAST(MiniGoParser.ExpressionBitwiseOrASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLessAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessAST(MiniGoParser.ExpressionLessASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLessAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessAST(MiniGoParser.ExpressionLessASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionShiftRightAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionShiftRightAST(MiniGoParser.ExpressionShiftRightASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionShiftRightAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionShiftRightAST(MiniGoParser.ExpressionShiftRightASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionShiftLeftAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionShiftLeftAST(MiniGoParser.ExpressionShiftLeftASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionShiftLeftAST}
	 * labeled alternative in {@link MiniGoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionShiftLeftAST(MiniGoParser.ExpressionShiftLeftASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionListAST}
	 * labeled alternative in {@link MiniGoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListAST(MiniGoParser.ExpressionListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionListAST}
	 * labeled alternative in {@link MiniGoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListAST(MiniGoParser.ExpressionListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionLengthAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionLengthAST(MiniGoParser.PrimaryExpressionLengthASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionLengthAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionLengthAST(MiniGoParser.PrimaryExpressionLengthASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionOperandAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionOperandAST(MiniGoParser.PrimaryExpressionOperandASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionOperandAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionOperandAST(MiniGoParser.PrimaryExpressionOperandASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionIndexAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionIndexAST(MiniGoParser.PrimaryExpressionIndexASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionIndexAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionIndexAST(MiniGoParser.PrimaryExpressionIndexASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionAppendAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionAppendAST(MiniGoParser.PrimaryExpressionAppendASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionAppendAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionAppendAST(MiniGoParser.PrimaryExpressionAppendASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionArgumentsAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionArgumentsAST(MiniGoParser.PrimaryExpressionArgumentsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionArgumentsAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionArgumentsAST(MiniGoParser.PrimaryExpressionArgumentsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionCapAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionCapAST(MiniGoParser.PrimaryExpressionCapASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionCapAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionCapAST(MiniGoParser.PrimaryExpressionCapASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionSelectorAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionSelectorAST(MiniGoParser.PrimaryExpressionSelectorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionSelectorAST}
	 * labeled alternative in {@link MiniGoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionSelectorAST(MiniGoParser.PrimaryExpressionSelectorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandLiteralAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandLiteralAST(MiniGoParser.OperandLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandLiteralAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandLiteralAST(MiniGoParser.OperandLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandIdentifierAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandIdentifierAST(MiniGoParser.OperandIdentifierASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandIdentifierAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandIdentifierAST(MiniGoParser.OperandIdentifierASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandParenAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandParenAST(MiniGoParser.OperandParenASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandParenAST}
	 * labeled alternative in {@link MiniGoParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandParenAST(MiniGoParser.OperandParenASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalIntAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralIntAST(MiniGoParser.LiteralIntASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalIntAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralIntAST(MiniGoParser.LiteralIntASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalFloatAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralFloatAST(MiniGoParser.LiteralFloatASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalFloatAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralFloatAST(MiniGoParser.LiteralFloatASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalRuneAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRuneAST(MiniGoParser.LiteralRuneASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalRuneAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRuneAST(MiniGoParser.LiteralRuneASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalRawStringAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRawStringAST(MiniGoParser.LiteralRawStringASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalRawStringAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRawStringAST(MiniGoParser.LiteralRawStringASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInterpretedStringAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInterpretedStringAST(MiniGoParser.LiteralInterpretedStringASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInterpretedStringAST}
	 * labeled alternative in {@link MiniGoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInterpretedStringAST(MiniGoParser.LiteralInterpretedStringASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexAST}
	 * labeled alternative in {@link MiniGoParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndexAST(MiniGoParser.IndexASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexAST}
	 * labeled alternative in {@link MiniGoParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndexAST(MiniGoParser.IndexASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentsAST}
	 * labeled alternative in {@link MiniGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsAST(MiniGoParser.ArgumentsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentsAST}
	 * labeled alternative in {@link MiniGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsAST(MiniGoParser.ArgumentsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentsEmptyAST}
	 * labeled alternative in {@link MiniGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsEmptyAST(MiniGoParser.ArgumentsEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentsEmptyAST}
	 * labeled alternative in {@link MiniGoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsEmptyAST(MiniGoParser.ArgumentsEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorAST}
	 * labeled alternative in {@link MiniGoParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorAST(MiniGoParser.SelectorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorAST}
	 * labeled alternative in {@link MiniGoParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorAST(MiniGoParser.SelectorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appendExpressionAST}
	 * labeled alternative in {@link MiniGoParser#appendExpression}.
	 * @param ctx the parse tree
	 */
	void enterAppendExpressionAST(MiniGoParser.AppendExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appendExpressionAST}
	 * labeled alternative in {@link MiniGoParser#appendExpression}.
	 * @param ctx the parse tree
	 */
	void exitAppendExpressionAST(MiniGoParser.AppendExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthExpressionAST}
	 * labeled alternative in {@link MiniGoParser#lengthExpression}.
	 * @param ctx the parse tree
	 */
	void enterLengthExpressionAST(MiniGoParser.LengthExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthExpressionAST}
	 * labeled alternative in {@link MiniGoParser#lengthExpression}.
	 * @param ctx the parse tree
	 */
	void exitLengthExpressionAST(MiniGoParser.LengthExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capExpressionAST}
	 * labeled alternative in {@link MiniGoParser#capExpression}.
	 * @param ctx the parse tree
	 */
	void enterCapExpressionAST(MiniGoParser.CapExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capExpressionAST}
	 * labeled alternative in {@link MiniGoParser#capExpression}.
	 * @param ctx the parse tree
	 */
	void exitCapExpressionAST(MiniGoParser.CapExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementListAST}
	 * labeled alternative in {@link MiniGoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementListAST(MiniGoParser.StatementListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementListAST}
	 * labeled alternative in {@link MiniGoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementListAST(MiniGoParser.StatementListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockAST(MiniGoParser.BlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockAST(MiniGoParser.BlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementPrintAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrintAST(MiniGoParser.StatementPrintASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementPrintAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrintAST(MiniGoParser.StatementPrintASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementPrintlnAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrintlnAST(MiniGoParser.StatementPrintlnASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementPrintlnAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrintlnAST(MiniGoParser.StatementPrintlnASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturnAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturnAST(MiniGoParser.StatementReturnASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturnAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturnAST(MiniGoParser.StatementReturnASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreakAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreakAST(MiniGoParser.StatementBreakASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreakAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreakAST(MiniGoParser.StatementBreakASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementContinueAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinueAST(MiniGoParser.StatementContinueASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementContinueAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinueAST(MiniGoParser.StatementContinueASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSimpleAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSimpleAST(MiniGoParser.StatementSimpleASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSimpleAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSimpleAST(MiniGoParser.StatementSimpleASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlockAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlockAST(MiniGoParser.StatementBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlockAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlockAST(MiniGoParser.StatementBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitchAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitchAST(MiniGoParser.StatementSwitchASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitchAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitchAST(MiniGoParser.StatementSwitchASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIfAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfAST(MiniGoParser.StatementIfASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIfAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfAST(MiniGoParser.StatementIfASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementLoopAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLoopAST(MiniGoParser.StatementLoopASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementLoopAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLoopAST(MiniGoParser.StatementLoopASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementTypeDeclAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTypeDeclAST(MiniGoParser.StatementTypeDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementTypeDeclAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTypeDeclAST(MiniGoParser.StatementTypeDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVariableDeclAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclAST(MiniGoParser.StatementVariableDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVariableDeclAST}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclAST(MiniGoParser.StatementVariableDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleStatementEmptyAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatementEmptyAST(MiniGoParser.SimpleStatementEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleStatementEmptyAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatementEmptyAST(MiniGoParser.SimpleStatementEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleStatementExpressionAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatementExpressionAST(MiniGoParser.SimpleStatementExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleStatementExpressionAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatementExpressionAST(MiniGoParser.SimpleStatementExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleStatementAssignmentAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatementAssignmentAST(MiniGoParser.SimpleStatementAssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleStatementAssignmentAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatementAssignmentAST(MiniGoParser.SimpleStatementAssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleStatementExpressionListAssignAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatementExpressionListAssignAST(MiniGoParser.SimpleStatementExpressionListAssignASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleStatementExpressionListAssignAST}
	 * labeled alternative in {@link MiniGoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatementExpressionListAssignAST(MiniGoParser.SimpleStatementExpressionListAssignASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementAST(MiniGoParser.AssignmentStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementAST(MiniGoParser.AssignmentStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementPlusEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementPlusEqualAST(MiniGoParser.AssignmentStatementPlusEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementPlusEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementPlusEqualAST(MiniGoParser.AssignmentStatementPlusEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementMinusEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementMinusEqualAST(MiniGoParser.AssignmentStatementMinusEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementMinusEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementMinusEqualAST(MiniGoParser.AssignmentStatementMinusEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementBitwiseAndEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementBitwiseAndEqualAST(MiniGoParser.AssignmentStatementBitwiseAndEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementBitwiseAndEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementBitwiseAndEqualAST(MiniGoParser.AssignmentStatementBitwiseAndEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementBitwiseOrEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementBitwiseOrEqualAST(MiniGoParser.AssignmentStatementBitwiseOrEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementBitwiseOrEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementBitwiseOrEqualAST(MiniGoParser.AssignmentStatementBitwiseOrEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementMultiplyEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementMultiplyEqualAST(MiniGoParser.AssignmentStatementMultiplyEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementMultiplyEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementMultiplyEqualAST(MiniGoParser.AssignmentStatementMultiplyEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementBitwiseXorEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementBitwiseXorEqualAST(MiniGoParser.AssignmentStatementBitwiseXorEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementBitwiseXorEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementBitwiseXorEqualAST(MiniGoParser.AssignmentStatementBitwiseXorEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementShiftLeftEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementShiftLeftEqualAST(MiniGoParser.AssignmentStatementShiftLeftEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementShiftLeftEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementShiftLeftEqualAST(MiniGoParser.AssignmentStatementShiftLeftEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementShiftRightEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementShiftRightEqualAST(MiniGoParser.AssignmentStatementShiftRightEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementShiftRightEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementShiftRightEqualAST(MiniGoParser.AssignmentStatementShiftRightEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementBitwiseClearEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementBitwiseClearEqualAST(MiniGoParser.AssignmentStatementBitwiseClearEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementBitwiseClearEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementBitwiseClearEqualAST(MiniGoParser.AssignmentStatementBitwiseClearEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementModuloEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementModuloEqualAST(MiniGoParser.AssignmentStatementModuloEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementModuloEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementModuloEqualAST(MiniGoParser.AssignmentStatementModuloEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatementDivideEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementDivideEqualAST(MiniGoParser.AssignmentStatementDivideEqualASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatementDivideEqualAST}
	 * labeled alternative in {@link MiniGoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementDivideEqualAST(MiniGoParser.AssignmentStatementDivideEqualASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementAST(MiniGoParser.IfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementAST(MiniGoParser.IfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseIfStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfStatementAST(MiniGoParser.IfElseIfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseIfStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfStatementAST(MiniGoParser.IfElseIfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatementAST(MiniGoParser.IfElseStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatementAST(MiniGoParser.IfElseStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSimpleStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfSimpleStatementAST(MiniGoParser.IfSimpleStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSimpleStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfSimpleStatementAST(MiniGoParser.IfSimpleStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSimpleElseIfStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfSimpleElseIfStatementAST(MiniGoParser.IfSimpleElseIfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSimpleElseIfStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfSimpleElseIfStatementAST(MiniGoParser.IfSimpleElseIfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSimpleElseStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfSimpleElseStatementAST(MiniGoParser.IfSimpleElseStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSimpleElseStatementAST}
	 * labeled alternative in {@link MiniGoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfSimpleElseStatementAST(MiniGoParser.IfSimpleElseStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlockAST(MiniGoParser.LoopBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlockAST(MiniGoParser.LoopBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopExpressionBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpressionBlockAST(MiniGoParser.LoopExpressionBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopExpressionBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpressionBlockAST(MiniGoParser.LoopExpressionBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopSimpleStatementExpressionSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopSimpleStatementExpressionSimpleStatementBlockAST(MiniGoParser.LoopSimpleStatementExpressionSimpleStatementBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopSimpleStatementExpressionSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopSimpleStatementExpressionSimpleStatementBlockAST(MiniGoParser.LoopSimpleStatementExpressionSimpleStatementBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopSimpleStatementSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoopSimpleStatementSimpleStatementBlockAST(MiniGoParser.LoopSimpleStatementSimpleStatementBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopSimpleStatementSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoopSimpleStatementSimpleStatementBlockAST(MiniGoParser.LoopSimpleStatementSimpleStatementBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStmtSimpleStatementAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtSimpleStatementAST(MiniGoParser.SwitchStmtSimpleStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStmtSimpleStatementAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtSimpleStatementAST(MiniGoParser.SwitchStmtSimpleStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStmtExpressionAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtExpressionAST(MiniGoParser.SwitchStmtExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStmtExpressionAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtExpressionAST(MiniGoParser.SwitchStmtExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStmtSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtSimpleStatementBlockAST(MiniGoParser.SwitchStmtSimpleStatementBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStmtSimpleStatementBlockAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtSimpleStatementBlockAST(MiniGoParser.SwitchStmtSimpleStatementBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStmtBlockAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmtBlockAST(MiniGoParser.SwitchStmtBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStmtBlockAST}
	 * labeled alternative in {@link MiniGoParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmtBlockAST(MiniGoParser.SwitchStmtBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCaseClauseListEmptyAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClauseList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCaseClauseListEmptyAST(MiniGoParser.ExpressionCaseClauseListEmptyASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCaseClauseListEmptyAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClauseList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCaseClauseListEmptyAST(MiniGoParser.ExpressionCaseClauseListEmptyASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCaseClauseListAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClauseList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCaseClauseListAST(MiniGoParser.ExpressionCaseClauseListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCaseClauseListAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClauseList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCaseClauseListAST(MiniGoParser.ExpressionCaseClauseListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionCaseClauseAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCaseClauseAST(MiniGoParser.ExpressionCaseClauseASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionCaseClauseAST}
	 * labeled alternative in {@link MiniGoParser#expressionCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCaseClauseAST(MiniGoParser.ExpressionCaseClauseASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSwitchCaseAST}
	 * labeled alternative in {@link MiniGoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSwitchCaseAST(MiniGoParser.ExpressionSwitchCaseASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSwitchCaseAST}
	 * labeled alternative in {@link MiniGoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSwitchCaseAST(MiniGoParser.ExpressionSwitchCaseASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSwitchDefaultAST}
	 * labeled alternative in {@link MiniGoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSwitchDefaultAST(MiniGoParser.ExpressionSwitchDefaultASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSwitchDefaultAST}
	 * labeled alternative in {@link MiniGoParser#expressionSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSwitchDefaultAST(MiniGoParser.ExpressionSwitchDefaultASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilonAST}
	 * labeled alternative in {@link MiniGoParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void enterEpsilonAST(MiniGoParser.EpsilonASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilonAST}
	 * labeled alternative in {@link MiniGoParser#epsilon}.
	 * @param ctx the parse tree
	 */
	void exitEpsilonAST(MiniGoParser.EpsilonASTContext ctx);
}