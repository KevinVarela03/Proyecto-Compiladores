// Generated from c:/Users/noni4/Desktop/Proyecto-Compiladores/MiniGoParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniGoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLITERAL=1, FLOATLITERAL=2, RUNELITERAL=3, RAWSTRINGLITERAL=4, INTERPRETEDSTRINGLITERAL=5, 
		PACKAGE=6, VAR=7, TYPE=8, FUNC=9, STRUCT=10, LEN=11, CAP=12, PRINT=13, 
		PRINTLN=14, RETURN=15, BREAK=16, CONTINUE=17, APPEND=18, IF=19, ELSE=20, 
		FOR=21, SWITCH=22, CASE=23, DEFAULT=24, IDENTIFIER=25, PLUS=26, MINUS=27, 
		MULTIPLY=28, DIVIDE=29, MODULO=30, LESS=31, LESSEQUAL=32, GREATER=33, 
		GREATEREQUAL=34, EQUAL=35, NOTEQUAL=36, AND=37, OR=38, NOT=39, BITWISEAND=40, 
		BITWISEOR=41, BITWISEXOR=42, BITWISECLEAR=43, SHIFTLEFT=44, SHIFTRIGHT=45, 
		INCREMENT=46, DECREMENT=47, ASSIGN=48, PLUSEQUAL=49, MINUSEQUAL=50, MULTIPLYEQUAL=51, 
		DIVIDEEQUAL=52, MODULOEQUAL=53, BITWISEANDEQUAL=54, BITWISEOREQUAL=55, 
		BITWISEXOREQUAL=56, SHIFTLEFTEQUAL=57, SHIFTRIGHTEQUAL=58, BITWISECLEAREQUAL=59, 
		COLON=60, SEMICOLON=61, COMMA=62, DOT=63, LPAREN=64, RPAREN=65, LBRACKET=66, 
		RBRACKET=67, LBRACE=68, RBRACE=69, SPACES=70, LINE_COMMENT=71, BLOCK_COMMENT=72;
	public static final int
		RULE_root = 0, RULE_topDeclarationList = 1, RULE_variableDecl = 2, RULE_innerVarDecls = 3, 
		RULE_singleVarDecl = 4, RULE_singleVarDeclNoExps = 5, RULE_typeDecl = 6, 
		RULE_innerTypeDecls = 7, RULE_singleTypeDecl = 8, RULE_funcDecl = 9, RULE_funcFrontDecl = 10, 
		RULE_multipleReturnTypes = 11, RULE_returnTypeList = 12, RULE_singleReturnType = 13, 
		RULE_funcArgDecls = 14, RULE_declType = 15, RULE_sliceDeclType = 16, RULE_arrayDeclType = 17, 
		RULE_structDeclType = 18, RULE_structMemDecls = 19, RULE_identifierList = 20, 
		RULE_expression = 21, RULE_expressionList = 22, RULE_primaryExpression = 23, 
		RULE_operand = 24, RULE_literal = 25, RULE_index = 26, RULE_arguments = 27, 
		RULE_selector = 28, RULE_appendExpression = 29, RULE_lengthExpression = 30, 
		RULE_capExpression = 31, RULE_statementList = 32, RULE_block = 33, RULE_statement = 34, 
		RULE_simpleStatement = 35, RULE_assignmentStatement = 36, RULE_ifStatement = 37, 
		RULE_loop = 38, RULE_switchStmt = 39, RULE_expressionCaseClauseList = 40, 
		RULE_expressionCaseClause = 41, RULE_expressionSwitchCase = 42, RULE_epsilon = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "topDeclarationList", "variableDecl", "innerVarDecls", "singleVarDecl", 
			"singleVarDeclNoExps", "typeDecl", "innerTypeDecls", "singleTypeDecl", 
			"funcDecl", "funcFrontDecl", "multipleReturnTypes", "returnTypeList", 
			"singleReturnType", "funcArgDecls", "declType", "sliceDeclType", "arrayDeclType", 
			"structDeclType", "structMemDecls", "identifierList", "expression", "expressionList", 
			"primaryExpression", "operand", "literal", "index", "arguments", "selector", 
			"appendExpression", "lengthExpression", "capExpression", "statementList", 
			"block", "statement", "simpleStatement", "assignmentStatement", "ifStatement", 
			"loop", "switchStmt", "expressionCaseClauseList", "expressionCaseClause", 
			"expressionSwitchCase", "epsilon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'package'", "'var'", "'type'", "'func'", 
			"'struct'", "'len'", "'cap'", "'print'", "'println'", "'return'", "'break'", 
			"'continue'", "'append'", "'if'", "'else'", "'for'", "'switch'", "'case'", 
			"'default'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'&'", "'|'", "'^'", 
			"'&^'", "'<<'", "'>>'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'&^='", "':'", 
			"';'", "','", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTLITERAL", "FLOATLITERAL", "RUNELITERAL", "RAWSTRINGLITERAL", 
			"INTERPRETEDSTRINGLITERAL", "PACKAGE", "VAR", "TYPE", "FUNC", "STRUCT", 
			"LEN", "CAP", "PRINT", "PRINTLN", "RETURN", "BREAK", "CONTINUE", "APPEND", 
			"IF", "ELSE", "FOR", "SWITCH", "CASE", "DEFAULT", "IDENTIFIER", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "LESS", "LESSEQUAL", "GREATER", 
			"GREATEREQUAL", "EQUAL", "NOTEQUAL", "AND", "OR", "NOT", "BITWISEAND", 
			"BITWISEOR", "BITWISEXOR", "BITWISECLEAR", "SHIFTLEFT", "SHIFTRIGHT", 
			"INCREMENT", "DECREMENT", "ASSIGN", "PLUSEQUAL", "MINUSEQUAL", "MULTIPLYEQUAL", 
			"DIVIDEEQUAL", "MODULOEQUAL", "BITWISEANDEQUAL", "BITWISEOREQUAL", "BITWISEXOREQUAL", 
			"SHIFTLEFTEQUAL", "SHIFTRIGHTEQUAL", "BITWISECLEAREQUAL", "COLON", "SEMICOLON", 
			"COMMA", "DOT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "SPACES", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniGoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	 
		public RootContext() { }
		public void copyFrom(RootContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootASTContext extends RootContext {
		public TerminalNode PACKAGE() { return getToken(MiniGoParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public TopDeclarationListContext topDeclarationList() {
			return getRuleContext(TopDeclarationListContext.class,0);
		}
		public RootASTContext(RootContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterRootAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitRootAST(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			_localctx = new RootASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PACKAGE);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(SEMICOLON);
			setState(91);
			topDeclarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationListContext extends ParserRuleContext {
		public TopDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDeclarationList; }
	 
		public TopDeclarationListContext() { }
		public void copyFrom(TopDeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationListASTContext extends TopDeclarationListContext {
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<TypeDeclContext> typeDecl() {
			return getRuleContexts(TypeDeclContext.class);
		}
		public TypeDeclContext typeDecl(int i) {
			return getRuleContext(TypeDeclContext.class,i);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public TopDeclarationListASTContext(TopDeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterTopDeclarationListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitTopDeclarationListAST(this);
		}
	}

	public final TopDeclarationListContext topDeclarationList() throws RecognitionException {
		TopDeclarationListContext _localctx = new TopDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topDeclarationList);
		int _la;
		try {
			_localctx = new TopDeclarationListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(93);
					variableDecl();
					}
					break;
				case TYPE:
					{
					setState(94);
					typeDecl();
					}
					break;
				case FUNC:
					{
					setState(95);
					funcDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	 
		public VariableDeclContext() { }
		public void copyFrom(VariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclBlockASTContext extends VariableDeclContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public InnerVarDeclsContext innerVarDecls() {
			return getRuleContext(InnerVarDeclsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public VariableDeclBlockASTContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterVariableDeclBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitVariableDeclBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclEmptyASTContext extends VariableDeclContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public VariableDeclEmptyASTContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterVariableDeclEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitVariableDeclEmptyAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclASTContext extends VariableDeclContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public SingleVarDeclContext singleVarDecl() {
			return getRuleContext(SingleVarDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public VariableDeclASTContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterVariableDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitVariableDeclAST(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(VAR);
				setState(102);
				singleVarDecl();
				setState(103);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new VariableDeclBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(VAR);
				setState(106);
				match(LPAREN);
				setState(107);
				innerVarDecls();
				setState(108);
				match(RPAREN);
				setState(109);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new VariableDeclEmptyASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(VAR);
				setState(112);
				match(LPAREN);
				setState(113);
				match(RPAREN);
				setState(114);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerVarDeclsContext extends ParserRuleContext {
		public InnerVarDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerVarDecls; }
	 
		public InnerVarDeclsContext() { }
		public void copyFrom(InnerVarDeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InnerVarDeclsASTContext extends InnerVarDeclsContext {
		public List<SingleVarDeclContext> singleVarDecl() {
			return getRuleContexts(SingleVarDeclContext.class);
		}
		public SingleVarDeclContext singleVarDecl(int i) {
			return getRuleContext(SingleVarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniGoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniGoParser.SEMICOLON, i);
		}
		public InnerVarDeclsASTContext(InnerVarDeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterInnerVarDeclsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitInnerVarDeclsAST(this);
		}
	}

	public final InnerVarDeclsContext innerVarDecls() throws RecognitionException {
		InnerVarDeclsContext _localctx = new InnerVarDeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_innerVarDecls);
		int _la;
		try {
			_localctx = new InnerVarDeclsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			singleVarDecl();
			setState(118);
			match(SEMICOLON);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(119);
				singleVarDecl();
				setState(120);
				match(SEMICOLON);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclContext extends ParserRuleContext {
		public SingleVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarDecl; }
	 
		public SingleVarDeclContext() { }
		public void copyFrom(SingleVarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclAssignASTContext extends SingleVarDeclContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SingleVarDeclAssignASTContext(SingleVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleVarDeclAssignAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleVarDeclAssignAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclASTContext extends SingleVarDeclContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SingleVarDeclASTContext(SingleVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleVarDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleVarDeclAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclNoExpsASTContext extends SingleVarDeclContext {
		public SingleVarDeclNoExpsContext singleVarDeclNoExps() {
			return getRuleContext(SingleVarDeclNoExpsContext.class,0);
		}
		public SingleVarDeclNoExpsASTContext(SingleVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleVarDeclNoExpsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleVarDeclNoExpsAST(this);
		}
	}

	public final SingleVarDeclContext singleVarDecl() throws RecognitionException {
		SingleVarDeclContext _localctx = new SingleVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarDecl);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new SingleVarDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				identifierList();
				setState(128);
				declType();
				setState(129);
				match(ASSIGN);
				setState(130);
				expressionList();
				}
				break;
			case 2:
				_localctx = new SingleVarDeclAssignASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				identifierList();
				setState(133);
				match(ASSIGN);
				setState(134);
				expressionList();
				}
				break;
			case 3:
				_localctx = new SingleVarDeclNoExpsASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				singleVarDeclNoExps();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclNoExpsContext extends ParserRuleContext {
		public SingleVarDeclNoExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarDeclNoExps; }
	 
		public SingleVarDeclNoExpsContext() { }
		public void copyFrom(SingleVarDeclNoExpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarDeclNoExpsDeclTypeASTContext extends SingleVarDeclNoExpsContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public SingleVarDeclNoExpsDeclTypeASTContext(SingleVarDeclNoExpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleVarDeclNoExpsDeclTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleVarDeclNoExpsDeclTypeAST(this);
		}
	}

	public final SingleVarDeclNoExpsContext singleVarDeclNoExps() throws RecognitionException {
		SingleVarDeclNoExpsContext _localctx = new SingleVarDeclNoExpsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleVarDeclNoExps);
		try {
			_localctx = new SingleVarDeclNoExpsDeclTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			identifierList();
			setState(140);
			declType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclContext extends ParserRuleContext {
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
	 
		public TypeDeclContext() { }
		public void copyFrom(TypeDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclEmptyASTContext extends TypeDeclContext {
		public TerminalNode TYPE() { return getToken(MiniGoParser.TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public TypeDeclEmptyASTContext(TypeDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterTypeDeclEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitTypeDeclEmptyAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclASTContext extends TypeDeclContext {
		public TerminalNode TYPE() { return getToken(MiniGoParser.TYPE, 0); }
		public SingleTypeDeclContext singleTypeDecl() {
			return getRuleContext(SingleTypeDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public TypeDeclASTContext(TypeDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterTypeDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitTypeDeclAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclBlockASTContext extends TypeDeclContext {
		public TerminalNode TYPE() { return getToken(MiniGoParser.TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public InnerTypeDeclsContext innerTypeDecls() {
			return getRuleContext(InnerTypeDeclsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public TypeDeclBlockASTContext(TypeDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterTypeDeclBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitTypeDeclBlockAST(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeDecl);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TypeDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(TYPE);
				setState(143);
				singleTypeDecl();
				setState(144);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new TypeDeclBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(TYPE);
				setState(147);
				match(LPAREN);
				setState(148);
				innerTypeDecls();
				setState(149);
				match(RPAREN);
				setState(150);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TypeDeclEmptyASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(TYPE);
				setState(153);
				match(LPAREN);
				setState(154);
				match(RPAREN);
				setState(155);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerTypeDeclsContext extends ParserRuleContext {
		public InnerTypeDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerTypeDecls; }
	 
		public InnerTypeDeclsContext() { }
		public void copyFrom(InnerTypeDeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InnerTypeDeclsASTContext extends InnerTypeDeclsContext {
		public List<SingleTypeDeclContext> singleTypeDecl() {
			return getRuleContexts(SingleTypeDeclContext.class);
		}
		public SingleTypeDeclContext singleTypeDecl(int i) {
			return getRuleContext(SingleTypeDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniGoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniGoParser.SEMICOLON, i);
		}
		public InnerTypeDeclsASTContext(InnerTypeDeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterInnerTypeDeclsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitInnerTypeDeclsAST(this);
		}
	}

	public final InnerTypeDeclsContext innerTypeDecls() throws RecognitionException {
		InnerTypeDeclsContext _localctx = new InnerTypeDeclsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_innerTypeDecls);
		int _la;
		try {
			_localctx = new InnerTypeDeclsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			singleTypeDecl();
			setState(159);
			match(SEMICOLON);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(160);
				singleTypeDecl();
				setState(161);
				match(SEMICOLON);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTypeDeclContext extends ParserRuleContext {
		public SingleTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeDecl; }
	 
		public SingleTypeDeclContext() { }
		public void copyFrom(SingleTypeDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTypeDeclASTContext extends SingleTypeDeclContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public SingleTypeDeclASTContext(SingleTypeDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleTypeDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleTypeDeclAST(this);
		}
	}

	public final SingleTypeDeclContext singleTypeDecl() throws RecognitionException {
		SingleTypeDeclContext _localctx = new SingleTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleTypeDecl);
		try {
			_localctx = new SingleTypeDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			setState(169);
			declType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends ParserRuleContext {
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	 
		public FuncDeclContext() { }
		public void copyFrom(FuncDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclASTContext extends FuncDeclContext {
		public FuncFrontDeclContext funcFrontDecl() {
			return getRuleContext(FuncFrontDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public FuncDeclASTContext(FuncDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterFuncDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitFuncDeclAST(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDecl);
		try {
			_localctx = new FuncDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			funcFrontDecl();
			setState(172);
			block();
			setState(173);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncFrontDeclContext extends ParserRuleContext {
		public FuncFrontDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcFrontDecl; }
	 
		public FuncFrontDeclContext() { }
		public void copyFrom(FuncFrontDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncFrontDeclASTContext extends FuncFrontDeclContext {
		public TerminalNode FUNC() { return getToken(MiniGoParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public FuncArgDeclsContext funcArgDecls() {
			return getRuleContext(FuncArgDeclsContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public MultipleReturnTypesContext multipleReturnTypes() {
			return getRuleContext(MultipleReturnTypesContext.class,0);
		}
		public SingleReturnTypeContext singleReturnType() {
			return getRuleContext(SingleReturnTypeContext.class,0);
		}
		public FuncFrontDeclASTContext(FuncFrontDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterFuncFrontDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitFuncFrontDeclAST(this);
		}
	}

	public final FuncFrontDeclContext funcFrontDecl() throws RecognitionException {
		FuncFrontDeclContext _localctx = new FuncFrontDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcFrontDecl);
		try {
			_localctx = new FuncFrontDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FUNC);
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(LPAREN);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(178);
				funcArgDecls();
				}
				break;
			case RPAREN:
				{
				setState(179);
				epsilon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(RPAREN);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(183);
				multipleReturnTypes();
				}
				break;
			case 2:
				{
				setState(184);
				singleReturnType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleReturnTypesContext extends ParserRuleContext {
		public MultipleReturnTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleReturnTypes; }
	 
		public MultipleReturnTypesContext() { }
		public void copyFrom(MultipleReturnTypesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleReturnTypesASTContext extends MultipleReturnTypesContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ReturnTypeListContext returnTypeList() {
			return getRuleContext(ReturnTypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public MultipleReturnTypesASTContext(MultipleReturnTypesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterMultipleReturnTypesAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitMultipleReturnTypesAST(this);
		}
	}

	public final MultipleReturnTypesContext multipleReturnTypes() throws RecognitionException {
		MultipleReturnTypesContext _localctx = new MultipleReturnTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipleReturnTypes);
		try {
			_localctx = new MultipleReturnTypesASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LPAREN);
			setState(188);
			returnTypeList();
			setState(189);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeListContext extends ParserRuleContext {
		public ReturnTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypeList; }
	 
		public ReturnTypeListContext() { }
		public void copyFrom(ReturnTypeListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeListASTContext extends ReturnTypeListContext {
		public List<DeclTypeContext> declType() {
			return getRuleContexts(DeclTypeContext.class);
		}
		public DeclTypeContext declType(int i) {
			return getRuleContext(DeclTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ReturnTypeListASTContext(ReturnTypeListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterReturnTypeListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitReturnTypeListAST(this);
		}
	}

	public final ReturnTypeListContext returnTypeList() throws RecognitionException {
		ReturnTypeListContext _localctx = new ReturnTypeListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnTypeList);
		int _la;
		try {
			_localctx = new ReturnTypeListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			declType();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				declType();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleReturnTypeContext extends ParserRuleContext {
		public SingleReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleReturnType; }
	 
		public SingleReturnTypeContext() { }
		public void copyFrom(SingleReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleReturnTypeEmptyASTContext extends SingleReturnTypeContext {
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public SingleReturnTypeEmptyASTContext(SingleReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleReturnTypeEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleReturnTypeEmptyAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleReturnTypeASTContext extends SingleReturnTypeContext {
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public SingleReturnTypeASTContext(SingleReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSingleReturnTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSingleReturnTypeAST(this);
		}
	}

	public final SingleReturnTypeContext singleReturnType() throws RecognitionException {
		SingleReturnTypeContext _localctx = new SingleReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singleReturnType);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case IDENTIFIER:
			case LPAREN:
			case LBRACKET:
				_localctx = new SingleReturnTypeASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				declType();
				}
				break;
			case LBRACE:
				_localctx = new SingleReturnTypeEmptyASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				epsilon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncArgDeclsContext extends ParserRuleContext {
		public FuncArgDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgDecls; }
	 
		public FuncArgDeclsContext() { }
		public void copyFrom(FuncArgDeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncArgDeclsASTContext extends FuncArgDeclsContext {
		public List<SingleVarDeclNoExpsContext> singleVarDeclNoExps() {
			return getRuleContexts(SingleVarDeclNoExpsContext.class);
		}
		public SingleVarDeclNoExpsContext singleVarDeclNoExps(int i) {
			return getRuleContext(SingleVarDeclNoExpsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public FuncArgDeclsASTContext(FuncArgDeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterFuncArgDeclsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitFuncArgDeclsAST(this);
		}
	}

	public final FuncArgDeclsContext funcArgDecls() throws RecognitionException {
		FuncArgDeclsContext _localctx = new FuncArgDeclsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcArgDecls);
		int _la;
		try {
			_localctx = new FuncArgDeclsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			singleVarDeclNoExps();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				singleVarDeclNoExps();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeContext extends ParserRuleContext {
		public DeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declType; }
	 
		public DeclTypeContext() { }
		public void copyFrom(DeclTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeStructASTContext extends DeclTypeContext {
		public StructDeclTypeContext structDeclType() {
			return getRuleContext(StructDeclTypeContext.class,0);
		}
		public DeclTypeStructASTContext(DeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterDeclTypeStructAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitDeclTypeStructAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeSliceASTContext extends DeclTypeContext {
		public SliceDeclTypeContext sliceDeclType() {
			return getRuleContext(SliceDeclTypeContext.class,0);
		}
		public DeclTypeSliceASTContext(DeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterDeclTypeSliceAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitDeclTypeSliceAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeArrayASTContext extends DeclTypeContext {
		public ArrayDeclTypeContext arrayDeclType() {
			return getRuleContext(ArrayDeclTypeContext.class,0);
		}
		public DeclTypeArrayASTContext(DeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterDeclTypeArrayAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitDeclTypeArrayAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeParenASTContext extends DeclTypeContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public DeclTypeParenASTContext(DeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterDeclTypeParenAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitDeclTypeParenAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclTypeIdentifierASTContext extends DeclTypeContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public DeclTypeIdentifierASTContext(DeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterDeclTypeIdentifierAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitDeclTypeIdentifierAST(this);
		}
	}

	public final DeclTypeContext declType() throws RecognitionException {
		DeclTypeContext _localctx = new DeclTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declType);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new DeclTypeParenASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(LPAREN);
				setState(212);
				declType();
				setState(213);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new DeclTypeIdentifierASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new DeclTypeSliceASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				sliceDeclType();
				}
				break;
			case 4:
				_localctx = new DeclTypeArrayASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				arrayDeclType();
				}
				break;
			case 5:
				_localctx = new DeclTypeStructASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				structDeclType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SliceDeclTypeContext extends ParserRuleContext {
		public SliceDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceDeclType; }
	 
		public SliceDeclTypeContext() { }
		public void copyFrom(SliceDeclTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceDeclTypeASTContext extends SliceDeclTypeContext {
		public TerminalNode LBRACKET() { return getToken(MiniGoParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MiniGoParser.RBRACKET, 0); }
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public SliceDeclTypeASTContext(SliceDeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSliceDeclTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSliceDeclTypeAST(this);
		}
	}

	public final SliceDeclTypeContext sliceDeclType() throws RecognitionException {
		SliceDeclTypeContext _localctx = new SliceDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sliceDeclType);
		try {
			_localctx = new SliceDeclTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LBRACKET);
			setState(222);
			match(RBRACKET);
			setState(223);
			declType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclTypeContext extends ParserRuleContext {
		public ArrayDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclType; }
	 
		public ArrayDeclTypeContext() { }
		public void copyFrom(ArrayDeclTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclTypeASTContext extends ArrayDeclTypeContext {
		public TerminalNode LBRACKET() { return getToken(MiniGoParser.LBRACKET, 0); }
		public TerminalNode INTLITERAL() { return getToken(MiniGoParser.INTLITERAL, 0); }
		public TerminalNode RBRACKET() { return getToken(MiniGoParser.RBRACKET, 0); }
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public ArrayDeclTypeASTContext(ArrayDeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterArrayDeclTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitArrayDeclTypeAST(this);
		}
	}

	public final ArrayDeclTypeContext arrayDeclType() throws RecognitionException {
		ArrayDeclTypeContext _localctx = new ArrayDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDeclType);
		try {
			_localctx = new ArrayDeclTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LBRACKET);
			setState(226);
			match(INTLITERAL);
			setState(227);
			match(RBRACKET);
			setState(228);
			declType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclTypeContext extends ParserRuleContext {
		public StructDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclType; }
	 
		public StructDeclTypeContext() { }
		public void copyFrom(StructDeclTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclTypeASTContext extends StructDeclTypeContext {
		public TerminalNode STRUCT() { return getToken(MiniGoParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public StructMemDeclsContext structMemDecls() {
			return getRuleContext(StructMemDeclsContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public StructDeclTypeASTContext(StructDeclTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStructDeclTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStructDeclTypeAST(this);
		}
	}

	public final StructDeclTypeContext structDeclType() throws RecognitionException {
		StructDeclTypeContext _localctx = new StructDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structDeclType);
		try {
			_localctx = new StructDeclTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(STRUCT);
			setState(231);
			match(LBRACE);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(232);
				structMemDecls();
				}
				break;
			case RBRACE:
				{
				setState(233);
				epsilon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructMemDeclsContext extends ParserRuleContext {
		public StructMemDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMemDecls; }
	 
		public StructMemDeclsContext() { }
		public void copyFrom(StructMemDeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructMemDeclsASTContext extends StructMemDeclsContext {
		public List<SingleVarDeclNoExpsContext> singleVarDeclNoExps() {
			return getRuleContexts(SingleVarDeclNoExpsContext.class);
		}
		public SingleVarDeclNoExpsContext singleVarDeclNoExps(int i) {
			return getRuleContext(SingleVarDeclNoExpsContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniGoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniGoParser.SEMICOLON, i);
		}
		public StructMemDeclsASTContext(StructMemDeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStructMemDeclsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStructMemDeclsAST(this);
		}
	}

	public final StructMemDeclsContext structMemDecls() throws RecognitionException {
		StructMemDeclsContext _localctx = new StructMemDeclsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_structMemDecls);
		int _la;
		try {
			_localctx = new StructMemDeclsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			singleVarDeclNoExps();
			setState(239);
			match(SEMICOLON);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(240);
				singleVarDeclNoExps();
				setState(241);
				match(SEMICOLON);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	 
		public IdentifierListContext() { }
		public void copyFrom(IdentifierListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListASTContext extends IdentifierListContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniGoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public IdentifierListASTContext(IdentifierListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIdentifierListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIdentifierListAST(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifierList);
		int _la;
		try {
			_localctx = new IdentifierListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IDENTIFIER);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				match(IDENTIFIER);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotUnaryASTContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MiniGoParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNotUnaryASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionNotUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionNotUnaryAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultiplyASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(MiniGoParser.MULTIPLY, 0); }
		public ExpressionMultiplyASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionMultiplyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionMultiplyAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPlusASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniGoParser.PLUS, 0); }
		public ExpressionPlusASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionPlusAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionPlusAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionModuloASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(MiniGoParser.MODULO, 0); }
		public ExpressionModuloASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionModuloAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionModuloAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniGoParser.AND, 0); }
		public ExpressionAndASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionAndAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionAndAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseXorASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEXOR() { return getToken(MiniGoParser.BITWISEXOR, 0); }
		public ExpressionBitwiseXorASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionBitwiseXorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionBitwiseXorAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMinusASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MiniGoParser.MINUS, 0); }
		public ExpressionMinusASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionMinusAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionMinusAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseXorUnaryASTContext extends ExpressionContext {
		public TerminalNode BITWISEXOR() { return getToken(MiniGoParser.BITWISEXOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionBitwiseXorUnaryASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionBitwiseXorUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionBitwiseXorUnaryAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqualASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MiniGoParser.EQUAL, 0); }
		public ExpressionEqualASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMinusUnaryASTContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(MiniGoParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionMinusUnaryASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionMinusUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionMinusUnaryAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseClearASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISECLEAR() { return getToken(MiniGoParser.BITWISECLEAR, 0); }
		public ExpressionBitwiseClearASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionBitwiseClearAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionBitwiseClearAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGreaterEqualASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEREQUAL() { return getToken(MiniGoParser.GREATEREQUAL, 0); }
		public ExpressionGreaterEqualASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionGreaterEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionGreaterEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLessEqualASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSEQUAL() { return getToken(MiniGoParser.LESSEQUAL, 0); }
		public ExpressionLessEqualASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionLessEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionLessEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotEqualASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(MiniGoParser.NOTEQUAL, 0); }
		public ExpressionNotEqualASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionNotEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionNotEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPrimaryASTContext extends ExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ExpressionPrimaryASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionPrimaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionPrimaryAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseAndASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEAND() { return getToken(MiniGoParser.BITWISEAND, 0); }
		public ExpressionBitwiseAndASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionBitwiseAndAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionBitwiseAndAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGreaterASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(MiniGoParser.GREATER, 0); }
		public ExpressionGreaterASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionGreaterAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionGreaterAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDivideASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(MiniGoParser.DIVIDE, 0); }
		public ExpressionDivideASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionDivideAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionDivideAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiniGoParser.OR, 0); }
		public ExpressionOrASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionOrAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionOrAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPlusUnaryASTContext extends ExpressionContext {
		public TerminalNode PLUS() { return getToken(MiniGoParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPlusUnaryASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionPlusUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionPlusUnaryAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBitwiseOrASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEOR() { return getToken(MiniGoParser.BITWISEOR, 0); }
		public ExpressionBitwiseOrASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionBitwiseOrAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionBitwiseOrAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLessASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(MiniGoParser.LESS, 0); }
		public ExpressionLessASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionLessAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionLessAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionShiftRightASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SHIFTRIGHT() { return getToken(MiniGoParser.SHIFTRIGHT, 0); }
		public ExpressionShiftRightASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionShiftRightAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionShiftRightAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionShiftLeftASTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SHIFTLEFT() { return getToken(MiniGoParser.SHIFTLEFT, 0); }
		public ExpressionShiftLeftASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionShiftLeftAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionShiftLeftAST(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case RUNELITERAL:
			case RAWSTRINGLITERAL:
			case INTERPRETEDSTRINGLITERAL:
			case LEN:
			case CAP:
			case APPEND:
			case IDENTIFIER:
			case LPAREN:
				{
				_localctx = new ExpressionPrimaryASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(257);
				primaryExpression(0);
				}
				break;
			case PLUS:
				{
				_localctx = new ExpressionPlusUnaryASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(PLUS);
				setState(259);
				expression(4);
				}
				break;
			case MINUS:
				{
				_localctx = new ExpressionMinusUnaryASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(MINUS);
				setState(261);
				expression(3);
				}
				break;
			case NOT:
				{
				_localctx = new ExpressionNotUnaryASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(NOT);
				setState(263);
				expression(2);
				}
				break;
			case BITWISEXOR:
				{
				_localctx = new ExpressionBitwiseXorUnaryASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(BITWISEXOR);
				setState(265);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultiplyASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(269);
						match(MULTIPLY);
						setState(270);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivideASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(272);
						match(DIVIDE);
						setState(273);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionModuloASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(275);
						match(MODULO);
						setState(276);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionShiftLeftASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(278);
						match(SHIFTLEFT);
						setState(279);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionShiftRightASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(281);
						match(SHIFTRIGHT);
						setState(282);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionBitwiseAndASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(284);
						match(BITWISEAND);
						setState(285);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionBitwiseClearASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(287);
						match(BITWISECLEAR);
						setState(288);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionPlusASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(290);
						match(PLUS);
						setState(291);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionMinusASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(293);
						match(MINUS);
						setState(294);
						expression(16);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionBitwiseOrASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(296);
						match(BITWISEOR);
						setState(297);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionBitwiseXorASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(299);
						match(BITWISEXOR);
						setState(300);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionEqualASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(302);
						match(EQUAL);
						setState(303);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionNotEqualASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(305);
						match(NOTEQUAL);
						setState(306);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionLessASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(308);
						match(LESS);
						setState(309);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionLessEqualASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(311);
						match(LESSEQUAL);
						setState(312);
						expression(10);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionGreaterASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(314);
						match(GREATER);
						setState(315);
						expression(9);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionGreaterEqualASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(317);
						match(GREATEREQUAL);
						setState(318);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionAndASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(320);
						match(AND);
						setState(321);
						expression(7);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionOrASTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(323);
						match(OR);
						setState(324);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListASTContext extends ExpressionListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniGoParser.COMMA, i);
		}
		public ExpressionListASTContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionListAST(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		try {
			int _alt;
			_localctx = new ExpressionListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			expression(0);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(COMMA);
					setState(332);
					expression(0);
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionLengthASTContext extends PrimaryExpressionContext {
		public LengthExpressionContext lengthExpression() {
			return getRuleContext(LengthExpressionContext.class,0);
		}
		public PrimaryExpressionLengthASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionLengthAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionLengthAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionOperandASTContext extends PrimaryExpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public PrimaryExpressionOperandASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionOperandAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionOperandAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionIndexASTContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public PrimaryExpressionIndexASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionIndexAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionIndexAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionAppendASTContext extends PrimaryExpressionContext {
		public AppendExpressionContext appendExpression() {
			return getRuleContext(AppendExpressionContext.class,0);
		}
		public PrimaryExpressionAppendASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionAppendAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionAppendAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionArgumentsASTContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExpressionArgumentsASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionArgumentsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionArgumentsAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionCapASTContext extends PrimaryExpressionContext {
		public CapExpressionContext capExpression() {
			return getRuleContext(CapExpressionContext.class,0);
		}
		public PrimaryExpressionCapASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionCapAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionCapAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionSelectorASTContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public PrimaryExpressionSelectorASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterPrimaryExpressionSelectorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitPrimaryExpressionSelectorAST(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case RUNELITERAL:
			case RAWSTRINGLITERAL:
			case INTERPRETEDSTRINGLITERAL:
			case IDENTIFIER:
			case LPAREN:
				{
				_localctx = new PrimaryExpressionOperandASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(339);
				operand();
				}
				break;
			case APPEND:
				{
				_localctx = new PrimaryExpressionAppendASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				appendExpression();
				}
				break;
			case LEN:
				{
				_localctx = new PrimaryExpressionLengthASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				lengthExpression();
				}
				break;
			case CAP:
				{
				_localctx = new PrimaryExpressionCapASTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				capExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExpressionSelectorASTContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(345);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(346);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExpressionIndexASTContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(347);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(348);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExpressionArgumentsASTContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(349);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(350);
						arguments();
						}
						break;
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandLiteralASTContext extends OperandContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandLiteralASTContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterOperandLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitOperandLiteralAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandIdentifierASTContext extends OperandContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public OperandIdentifierASTContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterOperandIdentifierAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitOperandIdentifierAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandParenASTContext extends OperandContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public OperandParenASTContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterOperandParenAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitOperandParenAST(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operand);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
			case FLOATLITERAL:
			case RUNELITERAL:
			case RAWSTRINGLITERAL:
			case INTERPRETEDSTRINGLITERAL:
				_localctx = new OperandLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new OperandIdentifierASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				_localctx = new OperandParenASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(LPAREN);
				setState(359);
				expression(0);
				setState(360);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralIntASTContext extends LiteralContext {
		public TerminalNode INTLITERAL() { return getToken(MiniGoParser.INTLITERAL, 0); }
		public LiteralIntASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLiteralIntAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLiteralIntAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralInterpretedStringASTContext extends LiteralContext {
		public TerminalNode INTERPRETEDSTRINGLITERAL() { return getToken(MiniGoParser.INTERPRETEDSTRINGLITERAL, 0); }
		public LiteralInterpretedStringASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLiteralInterpretedStringAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLiteralInterpretedStringAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralFloatASTContext extends LiteralContext {
		public TerminalNode FLOATLITERAL() { return getToken(MiniGoParser.FLOATLITERAL, 0); }
		public LiteralFloatASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLiteralFloatAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLiteralFloatAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralRuneASTContext extends LiteralContext {
		public TerminalNode RUNELITERAL() { return getToken(MiniGoParser.RUNELITERAL, 0); }
		public LiteralRuneASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLiteralRuneAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLiteralRuneAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralRawStringASTContext extends LiteralContext {
		public TerminalNode RAWSTRINGLITERAL() { return getToken(MiniGoParser.RAWSTRINGLITERAL, 0); }
		public LiteralRawStringASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLiteralRawStringAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLiteralRawStringAST(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				_localctx = new LiteralIntASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				_localctx = new LiteralFloatASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(FLOATLITERAL);
				}
				break;
			case RUNELITERAL:
				_localctx = new LiteralRuneASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(RUNELITERAL);
				}
				break;
			case RAWSTRINGLITERAL:
				_localctx = new LiteralRawStringASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(RAWSTRINGLITERAL);
				}
				break;
			case INTERPRETEDSTRINGLITERAL:
				_localctx = new LiteralInterpretedStringASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(INTERPRETEDSTRINGLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	 
		public IndexContext() { }
		public void copyFrom(IndexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexASTContext extends IndexContext {
		public TerminalNode LBRACKET() { return getToken(MiniGoParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MiniGoParser.RBRACKET, 0); }
		public IndexASTContext(IndexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIndexAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIndexAST(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_index);
		try {
			_localctx = new IndexASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(LBRACKET);
			setState(372);
			expression(0);
			setState(373);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsASTContext extends ArgumentsContext {
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsASTContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterArgumentsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitArgumentsAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsEmptyASTContext extends ArgumentsContext {
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public ArgumentsEmptyASTContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterArgumentsEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitArgumentsEmptyAST(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ArgumentsASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(LPAREN);
				setState(376);
				expressionList();
				}
				break;
			case RPAREN:
				_localctx = new ArgumentsEmptyASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				epsilon();
				setState(378);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorASTContext extends SelectorContext {
		public TerminalNode DOT() { return getToken(MiniGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniGoParser.IDENTIFIER, 0); }
		public SelectorASTContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSelectorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSelectorAST(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selector);
		try {
			_localctx = new SelectorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(DOT);
			setState(383);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendExpressionContext extends ParserRuleContext {
		public AppendExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExpression; }
	 
		public AppendExpressionContext() { }
		public void copyFrom(AppendExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppendExpressionASTContext extends AppendExpressionContext {
		public TerminalNode APPEND() { return getToken(MiniGoParser.APPEND, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MiniGoParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public AppendExpressionASTContext(AppendExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAppendExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAppendExpressionAST(this);
		}
	}

	public final AppendExpressionContext appendExpression() throws RecognitionException {
		AppendExpressionContext _localctx = new AppendExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_appendExpression);
		try {
			_localctx = new AppendExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(APPEND);
			setState(386);
			match(LPAREN);
			setState(387);
			expression(0);
			setState(388);
			match(COMMA);
			setState(389);
			expression(0);
			setState(390);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthExpressionContext extends ParserRuleContext {
		public LengthExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthExpression; }
	 
		public LengthExpressionContext() { }
		public void copyFrom(LengthExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthExpressionASTContext extends LengthExpressionContext {
		public TerminalNode LEN() { return getToken(MiniGoParser.LEN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public LengthExpressionASTContext(LengthExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLengthExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLengthExpressionAST(this);
		}
	}

	public final LengthExpressionContext lengthExpression() throws RecognitionException {
		LengthExpressionContext _localctx = new LengthExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lengthExpression);
		try {
			_localctx = new LengthExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LEN);
			setState(393);
			match(LPAREN);
			setState(394);
			expression(0);
			setState(395);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CapExpressionContext extends ParserRuleContext {
		public CapExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capExpression; }
	 
		public CapExpressionContext() { }
		public void copyFrom(CapExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CapExpressionASTContext extends CapExpressionContext {
		public TerminalNode CAP() { return getToken(MiniGoParser.CAP, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public CapExpressionASTContext(CapExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterCapExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitCapExpressionAST(this);
		}
	}

	public final CapExpressionContext capExpression() throws RecognitionException {
		CapExpressionContext _localctx = new CapExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_capExpression);
		try {
			_localctx = new CapExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(CAP);
			setState(398);
			match(LPAREN);
			setState(399);
			expression(0);
			setState(400);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	 
		public StatementListContext() { }
		public void copyFrom(StatementListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementListASTContext extends StatementListContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListASTContext(StatementListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementListAST(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementList);
		try {
			int _alt;
			_localctx = new StatementListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					statement();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockASTContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitBlockAST(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LBRACE);
			setState(409);
			statementList();
			setState(410);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSimpleASTContext extends StatementContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementSimpleASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementSimpleAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementSimpleAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSwitchASTContext extends StatementContext {
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementSwitchASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementSwitchAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementSwitchAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementLoopASTContext extends StatementContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementLoopASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementLoopAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementLoopAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakASTContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MiniGoParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementBreakASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementBreakAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementBreakAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementBlockASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementTypeDeclASTContext extends StatementContext {
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public StatementTypeDeclASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementTypeDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementTypeDeclAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementReturnASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiniGoParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public StatementReturnASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementReturnAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementReturnAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPrintASTContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(MiniGoParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public StatementPrintASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementPrintAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementPrintAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementVariableDeclASTContext extends StatementContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public StatementVariableDeclASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementVariableDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementVariableDeclAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPrintlnASTContext extends StatementContext {
		public TerminalNode PRINTLN() { return getToken(MiniGoParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniGoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniGoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public StatementPrintlnASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementPrintlnAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementPrintlnAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementContinueASTContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MiniGoParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementContinueASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementContinueAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementContinueAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfASTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public StatementIfASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterStatementIfAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitStatementIfAST(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statement);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new StatementPrintASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(PRINT);
				setState(413);
				match(LPAREN);
				setState(416);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTLITERAL:
				case FLOATLITERAL:
				case RUNELITERAL:
				case RAWSTRINGLITERAL:
				case INTERPRETEDSTRINGLITERAL:
				case LEN:
				case CAP:
				case APPEND:
				case IDENTIFIER:
				case PLUS:
				case MINUS:
				case NOT:
				case BITWISEXOR:
				case LPAREN:
					{
					setState(414);
					expressionList();
					}
					break;
				case RPAREN:
					{
					setState(415);
					epsilon();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(418);
				match(RPAREN);
				setState(419);
				match(SEMICOLON);
				}
				break;
			case PRINTLN:
				_localctx = new StatementPrintlnASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(PRINTLN);
				setState(422);
				match(LPAREN);
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTLITERAL:
				case FLOATLITERAL:
				case RUNELITERAL:
				case RAWSTRINGLITERAL:
				case INTERPRETEDSTRINGLITERAL:
				case LEN:
				case CAP:
				case APPEND:
				case IDENTIFIER:
				case PLUS:
				case MINUS:
				case NOT:
				case BITWISEXOR:
				case LPAREN:
					{
					setState(423);
					expressionList();
					}
					break;
				case RPAREN:
					{
					setState(424);
					epsilon();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427);
				match(RPAREN);
				setState(428);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				_localctx = new StatementReturnASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(RETURN);
				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTLITERAL:
				case FLOATLITERAL:
				case RUNELITERAL:
				case RAWSTRINGLITERAL:
				case INTERPRETEDSTRINGLITERAL:
				case LEN:
				case CAP:
				case APPEND:
				case IDENTIFIER:
				case PLUS:
				case MINUS:
				case NOT:
				case BITWISEXOR:
				case LPAREN:
					{
					setState(431);
					expression(0);
					}
					break;
				case SEMICOLON:
					{
					setState(432);
					epsilon();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(435);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new StatementBreakASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(BREAK);
				setState(438);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				_localctx = new StatementContinueASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(CONTINUE);
				setState(440);
				match(SEMICOLON);
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case RUNELITERAL:
			case RAWSTRINGLITERAL:
			case INTERPRETEDSTRINGLITERAL:
			case LEN:
			case CAP:
			case APPEND:
			case IDENTIFIER:
			case PLUS:
			case MINUS:
			case NOT:
			case BITWISEXOR:
			case SEMICOLON:
			case LPAREN:
				_localctx = new StatementSimpleASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				simpleStatement();
				setState(442);
				match(SEMICOLON);
				}
				break;
			case LBRACE:
				_localctx = new StatementBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
				block();
				setState(445);
				match(SEMICOLON);
				}
				break;
			case SWITCH:
				_localctx = new StatementSwitchASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(447);
				switchStmt();
				setState(448);
				match(SEMICOLON);
				}
				break;
			case IF:
				_localctx = new StatementIfASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
				ifStatement();
				setState(451);
				match(SEMICOLON);
				}
				break;
			case FOR:
				_localctx = new StatementLoopASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(453);
				loop();
				setState(454);
				match(SEMICOLON);
				}
				break;
			case TYPE:
				_localctx = new StatementTypeDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(456);
				typeDecl();
				}
				break;
			case VAR:
				_localctx = new StatementVariableDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(457);
				variableDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	 
		public SimpleStatementContext() { }
		public void copyFrom(SimpleStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementExpressionASTContext extends SimpleStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(MiniGoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(MiniGoParser.DECREMENT, 0); }
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public SimpleStatementExpressionASTContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSimpleStatementExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSimpleStatementExpressionAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementAssignmentASTContext extends SimpleStatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public SimpleStatementAssignmentASTContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSimpleStatementAssignmentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSimpleStatementAssignmentAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementExpressionListAssignASTContext extends SimpleStatementContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public SimpleStatementExpressionListAssignASTContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSimpleStatementExpressionListAssignAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSimpleStatementExpressionListAssignAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementEmptyASTContext extends SimpleStatementContext {
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public SimpleStatementEmptyASTContext(SimpleStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSimpleStatementEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSimpleStatementEmptyAST(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simpleStatement);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new SimpleStatementEmptyASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				epsilon();
				}
				break;
			case 2:
				_localctx = new SimpleStatementExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				expression(0);
				setState(465);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCREMENT:
					{
					setState(462);
					match(INCREMENT);
					}
					break;
				case DECREMENT:
					{
					setState(463);
					match(DECREMENT);
					}
					break;
				case SEMICOLON:
				case LBRACE:
					{
					setState(464);
					epsilon();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new SimpleStatementAssignmentASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				assignmentStatement();
				}
				break;
			case 4:
				_localctx = new SimpleStatementExpressionListAssignASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				expressionList();
				setState(469);
				match(ASSIGN);
				setState(470);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	 
		public AssignmentStatementContext() { }
		public void copyFrom(AssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementBitwiseAndEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEANDEQUAL() { return getToken(MiniGoParser.BITWISEANDEQUAL, 0); }
		public AssignmentStatementBitwiseAndEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementBitwiseAndEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementBitwiseAndEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementBitwiseXorEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEXOREQUAL() { return getToken(MiniGoParser.BITWISEXOREQUAL, 0); }
		public AssignmentStatementBitwiseXorEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementBitwiseXorEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementBitwiseXorEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementShiftLeftEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SHIFTLEFTEQUAL() { return getToken(MiniGoParser.SHIFTLEFTEQUAL, 0); }
		public AssignmentStatementShiftLeftEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementShiftLeftEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementShiftLeftEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementPlusEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUSEQUAL() { return getToken(MiniGoParser.PLUSEQUAL, 0); }
		public AssignmentStatementPlusEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementPlusEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementPlusEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementMinusEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUSEQUAL() { return getToken(MiniGoParser.MINUSEQUAL, 0); }
		public AssignmentStatementMinusEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementMinusEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementMinusEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementModuloEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULOEQUAL() { return getToken(MiniGoParser.MODULOEQUAL, 0); }
		public AssignmentStatementModuloEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementModuloEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementModuloEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementASTContext extends AssignmentStatementContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MiniGoParser.ASSIGN, 0); }
		public AssignmentStatementASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementBitwiseClearEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISECLEAREQUAL() { return getToken(MiniGoParser.BITWISECLEAREQUAL, 0); }
		public AssignmentStatementBitwiseClearEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementBitwiseClearEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementBitwiseClearEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementDivideEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDEEQUAL() { return getToken(MiniGoParser.DIVIDEEQUAL, 0); }
		public AssignmentStatementDivideEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementDivideEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementDivideEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementShiftRightEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SHIFTRIGHTEQUAL() { return getToken(MiniGoParser.SHIFTRIGHTEQUAL, 0); }
		public AssignmentStatementShiftRightEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementShiftRightEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementShiftRightEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementMultiplyEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLYEQUAL() { return getToken(MiniGoParser.MULTIPLYEQUAL, 0); }
		public AssignmentStatementMultiplyEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementMultiplyEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementMultiplyEqualAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementBitwiseOrEqualASTContext extends AssignmentStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISEOREQUAL() { return getToken(MiniGoParser.BITWISEOREQUAL, 0); }
		public AssignmentStatementBitwiseOrEqualASTContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterAssignmentStatementBitwiseOrEqualAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitAssignmentStatementBitwiseOrEqualAST(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignmentStatement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new AssignmentStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				expressionList();
				setState(475);
				match(ASSIGN);
				setState(476);
				expressionList();
				}
				break;
			case 2:
				_localctx = new AssignmentStatementPlusEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				expression(0);
				setState(479);
				match(PLUSEQUAL);
				setState(480);
				expression(0);
				}
				break;
			case 3:
				_localctx = new AssignmentStatementMinusEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				expression(0);
				setState(483);
				match(MINUSEQUAL);
				setState(484);
				expression(0);
				}
				break;
			case 4:
				_localctx = new AssignmentStatementBitwiseAndEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				expression(0);
				setState(487);
				match(BITWISEANDEQUAL);
				setState(488);
				expression(0);
				}
				break;
			case 5:
				_localctx = new AssignmentStatementBitwiseOrEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				expression(0);
				setState(491);
				match(BITWISEOREQUAL);
				setState(492);
				expression(0);
				}
				break;
			case 6:
				_localctx = new AssignmentStatementMultiplyEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				expression(0);
				setState(495);
				match(MULTIPLYEQUAL);
				setState(496);
				expression(0);
				}
				break;
			case 7:
				_localctx = new AssignmentStatementBitwiseXorEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(498);
				expression(0);
				setState(499);
				match(BITWISEXOREQUAL);
				setState(500);
				expression(0);
				}
				break;
			case 8:
				_localctx = new AssignmentStatementShiftLeftEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(502);
				expression(0);
				setState(503);
				match(SHIFTLEFTEQUAL);
				setState(504);
				expression(0);
				}
				break;
			case 9:
				_localctx = new AssignmentStatementShiftRightEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(506);
				expression(0);
				setState(507);
				match(SHIFTRIGHTEQUAL);
				setState(508);
				expression(0);
				}
				break;
			case 10:
				_localctx = new AssignmentStatementBitwiseClearEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(510);
				expression(0);
				setState(511);
				match(BITWISECLEAREQUAL);
				setState(512);
				expression(0);
				}
				break;
			case 11:
				_localctx = new AssignmentStatementModuloEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(514);
				expression(0);
				setState(515);
				match(MODULOEQUAL);
				setState(516);
				expression(0);
				}
				break;
			case 12:
				_localctx = new AssignmentStatementDivideEqualASTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(518);
				expression(0);
				setState(519);
				match(DIVIDEEQUAL);
				setState(520);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfSimpleStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfSimpleStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfSimpleStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfSimpleStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseIfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfElseIfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfElseIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfElseIfStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public IfElseStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfElseStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfElseStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfSimpleElseStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public IfSimpleElseStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfSimpleElseStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfSimpleElseStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfSimpleElseIfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfSimpleElseIfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterIfSimpleElseIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitIfSimpleElseIfStatementAST(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new IfStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(IF);
				setState(525);
				expression(0);
				setState(526);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseIfStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(IF);
				setState(529);
				expression(0);
				setState(530);
				block();
				setState(531);
				match(ELSE);
				setState(532);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new IfElseStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				match(IF);
				setState(535);
				expression(0);
				setState(536);
				block();
				setState(537);
				match(ELSE);
				setState(538);
				block();
				}
				break;
			case 4:
				_localctx = new IfSimpleStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				match(IF);
				setState(541);
				simpleStatement();
				setState(542);
				match(SEMICOLON);
				setState(543);
				expression(0);
				setState(544);
				block();
				}
				break;
			case 5:
				_localctx = new IfSimpleElseIfStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				match(IF);
				setState(547);
				simpleStatement();
				setState(548);
				match(SEMICOLON);
				setState(549);
				expression(0);
				setState(550);
				block();
				setState(551);
				match(ELSE);
				setState(552);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new IfSimpleElseStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(IF);
				setState(555);
				simpleStatement();
				setState(556);
				match(SEMICOLON);
				setState(557);
				expression(0);
				setState(558);
				block();
				setState(559);
				match(ELSE);
				setState(560);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopExpressionBlockASTContext extends LoopContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopExpressionBlockASTContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLoopExpressionBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLoopExpressionBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopBlockASTContext extends LoopContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopBlockASTContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLoopBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLoopBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopSimpleStatementExpressionSimpleStatementBlockASTContext extends LoopContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniGoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniGoParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopSimpleStatementExpressionSimpleStatementBlockASTContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLoopSimpleStatementExpressionSimpleStatementBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLoopSimpleStatementExpressionSimpleStatementBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopSimpleStatementSimpleStatementBlockASTContext extends LoopContext {
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public List<SimpleStatementContext> simpleStatement() {
			return getRuleContexts(SimpleStatementContext.class);
		}
		public SimpleStatementContext simpleStatement(int i) {
			return getRuleContext(SimpleStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniGoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniGoParser.SEMICOLON, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopSimpleStatementSimpleStatementBlockASTContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterLoopSimpleStatementSimpleStatementBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitLoopSimpleStatementSimpleStatementBlockAST(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loop);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new LoopBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(FOR);
				setState(565);
				block();
				}
				break;
			case 2:
				_localctx = new LoopExpressionBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(FOR);
				setState(567);
				expression(0);
				setState(568);
				block();
				}
				break;
			case 3:
				_localctx = new LoopSimpleStatementExpressionSimpleStatementBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(FOR);
				setState(571);
				simpleStatement();
				setState(572);
				match(SEMICOLON);
				setState(573);
				expression(0);
				setState(574);
				match(SEMICOLON);
				setState(575);
				simpleStatement();
				setState(576);
				block();
				}
				break;
			case 4:
				_localctx = new LoopSimpleStatementSimpleStatementBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(FOR);
				setState(579);
				simpleStatement();
				setState(580);
				match(SEMICOLON);
				setState(581);
				match(SEMICOLON);
				setState(582);
				simpleStatement();
				setState(583);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends ParserRuleContext {
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
	 
		public SwitchStmtContext() { }
		public void copyFrom(SwitchStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtSimpleStatementASTContext extends SwitchStmtContext {
		public TerminalNode SWITCH() { return getToken(MiniGoParser.SWITCH, 0); }
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public ExpressionCaseClauseListContext expressionCaseClauseList() {
			return getRuleContext(ExpressionCaseClauseListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public SwitchStmtSimpleStatementASTContext(SwitchStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSwitchStmtSimpleStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSwitchStmtSimpleStatementAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtExpressionASTContext extends SwitchStmtContext {
		public TerminalNode SWITCH() { return getToken(MiniGoParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public ExpressionCaseClauseListContext expressionCaseClauseList() {
			return getRuleContext(ExpressionCaseClauseListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public SwitchStmtExpressionASTContext(SwitchStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSwitchStmtExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSwitchStmtExpressionAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtSimpleStatementBlockASTContext extends SwitchStmtContext {
		public TerminalNode SWITCH() { return getToken(MiniGoParser.SWITCH, 0); }
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniGoParser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public ExpressionCaseClauseListContext expressionCaseClauseList() {
			return getRuleContext(ExpressionCaseClauseListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public SwitchStmtSimpleStatementBlockASTContext(SwitchStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSwitchStmtSimpleStatementBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSwitchStmtSimpleStatementBlockAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtBlockASTContext extends SwitchStmtContext {
		public TerminalNode SWITCH() { return getToken(MiniGoParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(MiniGoParser.LBRACE, 0); }
		public ExpressionCaseClauseListContext expressionCaseClauseList() {
			return getRuleContext(ExpressionCaseClauseListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MiniGoParser.RBRACE, 0); }
		public SwitchStmtBlockASTContext(SwitchStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterSwitchStmtBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitSwitchStmtBlockAST(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchStmt);
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new SwitchStmtSimpleStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(SWITCH);
				setState(588);
				simpleStatement();
				setState(589);
				match(SEMICOLON);
				setState(590);
				expression(0);
				setState(591);
				match(LBRACE);
				setState(592);
				expressionCaseClauseList(0);
				setState(593);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new SwitchStmtExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(SWITCH);
				setState(596);
				expression(0);
				setState(597);
				match(LBRACE);
				setState(598);
				expressionCaseClauseList(0);
				setState(599);
				match(RBRACE);
				}
				break;
			case 3:
				_localctx = new SwitchStmtSimpleStatementBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(SWITCH);
				setState(602);
				simpleStatement();
				setState(603);
				match(SEMICOLON);
				setState(604);
				match(LBRACE);
				setState(605);
				expressionCaseClauseList(0);
				setState(606);
				match(RBRACE);
				}
				break;
			case 4:
				_localctx = new SwitchStmtBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(SWITCH);
				setState(609);
				match(LBRACE);
				setState(610);
				expressionCaseClauseList(0);
				setState(611);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCaseClauseListContext extends ParserRuleContext {
		public ExpressionCaseClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCaseClauseList; }
	 
		public ExpressionCaseClauseListContext() { }
		public void copyFrom(ExpressionCaseClauseListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCaseClauseListEmptyASTContext extends ExpressionCaseClauseListContext {
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public ExpressionCaseClauseListEmptyASTContext(ExpressionCaseClauseListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionCaseClauseListEmptyAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionCaseClauseListEmptyAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCaseClauseListASTContext extends ExpressionCaseClauseListContext {
		public ExpressionCaseClauseListContext expressionCaseClauseList() {
			return getRuleContext(ExpressionCaseClauseListContext.class,0);
		}
		public ExpressionCaseClauseContext expressionCaseClause() {
			return getRuleContext(ExpressionCaseClauseContext.class,0);
		}
		public ExpressionCaseClauseListASTContext(ExpressionCaseClauseListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionCaseClauseListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionCaseClauseListAST(this);
		}
	}

	public final ExpressionCaseClauseListContext expressionCaseClauseList() throws RecognitionException {
		return expressionCaseClauseList(0);
	}

	private ExpressionCaseClauseListContext expressionCaseClauseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionCaseClauseListContext _localctx = new ExpressionCaseClauseListContext(_ctx, _parentState);
		ExpressionCaseClauseListContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expressionCaseClauseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpressionCaseClauseListEmptyASTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(616);
			epsilon();
			}
			_ctx.stop = _input.LT(-1);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionCaseClauseListASTContext(new ExpressionCaseClauseListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressionCaseClauseList);
					setState(618);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(619);
					expressionCaseClause();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCaseClauseContext extends ParserRuleContext {
		public ExpressionCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCaseClause; }
	 
		public ExpressionCaseClauseContext() { }
		public void copyFrom(ExpressionCaseClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionCaseClauseASTContext extends ExpressionCaseClauseContext {
		public ExpressionSwitchCaseContext expressionSwitchCase() {
			return getRuleContext(ExpressionSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniGoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionCaseClauseASTContext(ExpressionCaseClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionCaseClauseAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionCaseClauseAST(this);
		}
	}

	public final ExpressionCaseClauseContext expressionCaseClause() throws RecognitionException {
		ExpressionCaseClauseContext _localctx = new ExpressionCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionCaseClause);
		try {
			_localctx = new ExpressionCaseClauseASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			expressionSwitchCase();
			setState(626);
			match(COLON);
			setState(627);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSwitchCaseContext extends ParserRuleContext {
		public ExpressionSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSwitchCase; }
	 
		public ExpressionSwitchCaseContext() { }
		public void copyFrom(ExpressionSwitchCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSwitchCaseASTContext extends ExpressionSwitchCaseContext {
		public TerminalNode CASE() { return getToken(MiniGoParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionSwitchCaseASTContext(ExpressionSwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionSwitchCaseAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionSwitchCaseAST(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSwitchDefaultASTContext extends ExpressionSwitchCaseContext {
		public TerminalNode DEFAULT() { return getToken(MiniGoParser.DEFAULT, 0); }
		public ExpressionSwitchDefaultASTContext(ExpressionSwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterExpressionSwitchDefaultAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitExpressionSwitchDefaultAST(this);
		}
	}

	public final ExpressionSwitchCaseContext expressionSwitchCase() throws RecognitionException {
		ExpressionSwitchCaseContext _localctx = new ExpressionSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionSwitchCase);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				_localctx = new ExpressionSwitchCaseASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(CASE);
				setState(630);
				expressionList();
				}
				break;
			case DEFAULT:
				_localctx = new ExpressionSwitchDefaultASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EpsilonContext extends ParserRuleContext {
		public EpsilonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epsilon; }
	 
		public EpsilonContext() { }
		public void copyFrom(EpsilonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EpsilonASTContext extends EpsilonContext {
		public EpsilonASTContext(EpsilonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).enterEpsilonAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoParserListener ) ((MiniGoParserListener)listener).exitEpsilonAST(this);
		}
	}

	public final EpsilonContext epsilon() throws RecognitionException {
		EpsilonContext _localctx = new EpsilonContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_epsilon);
		try {
			_localctx = new EpsilonASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 23:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 40:
			return expressionCaseClauseList_sempred((ExpressionCaseClauseListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 6);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expressionCaseClauseList_sempred(ExpressionCaseClauseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u027d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001a\b\u0001\n\u0001\f\u0001d\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002t\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00a4\b\u0007\n\u0007\f\u0007\u00a7\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b5\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ba\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c3\b"+
		"\f\n\f\f\f\u00c6\t\f\u0001\r\u0001\r\u0003\r\u00ca\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00cf\b\u000e\n\u000e\f\u000e\u00d2\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00eb\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00f4\b\u0013\n\u0013\f\u0013\u00f7"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00fc\b\u0014"+
		"\n\u0014\f\u0014\u00ff\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u010b\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0146\b\u0015\n\u0015\f\u0015\u0149\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u014e\b\u0016\n\u0016\f\u0016\u0151\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0158"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0160\b\u0017\n\u0017\f\u0017\u0163\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u016b\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0172\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u017d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0005 \u0194\b \n \f \u0197"+
		"\t \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01a1\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01aa\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01b2"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01cb\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01d2\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01d9\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u020b\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0233\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u024a\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0266\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0005(\u026d\b(\n(\f(\u0270\t(\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0003*\u0279\b*\u0001+\u0001+\u0001+\u0000\u0003"+
		"*.P,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0000\u02b8\u0000"+
		"X\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004s\u0001"+
		"\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000"+
		"\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000"+
		"\u0000\u000e\u009e\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000"+
		"\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014\u00af\u0001\u0000\u0000"+
		"\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018\u00bf\u0001\u0000\u0000"+
		"\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000\u0000"+
		"\u0000\u001e\u00db\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000"+
		"\"\u00e1\u0001\u0000\u0000\u0000$\u00e6\u0001\u0000\u0000\u0000&\u00ee"+
		"\u0001\u0000\u0000\u0000(\u00f8\u0001\u0000\u0000\u0000*\u010a\u0001\u0000"+
		"\u0000\u0000,\u014a\u0001\u0000\u0000\u0000.\u0157\u0001\u0000\u0000\u0000"+
		"0\u016a\u0001\u0000\u0000\u00002\u0171\u0001\u0000\u0000\u00004\u0173"+
		"\u0001\u0000\u0000\u00006\u017c\u0001\u0000\u0000\u00008\u017e\u0001\u0000"+
		"\u0000\u0000:\u0181\u0001\u0000\u0000\u0000<\u0188\u0001\u0000\u0000\u0000"+
		">\u018d\u0001\u0000\u0000\u0000@\u0195\u0001\u0000\u0000\u0000B\u0198"+
		"\u0001\u0000\u0000\u0000D\u01ca\u0001\u0000\u0000\u0000F\u01d8\u0001\u0000"+
		"\u0000\u0000H\u020a\u0001\u0000\u0000\u0000J\u0232\u0001\u0000\u0000\u0000"+
		"L\u0249\u0001\u0000\u0000\u0000N\u0265\u0001\u0000\u0000\u0000P\u0267"+
		"\u0001\u0000\u0000\u0000R\u0271\u0001\u0000\u0000\u0000T\u0278\u0001\u0000"+
		"\u0000\u0000V\u027a\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000"+
		"YZ\u0005\u0019\u0000\u0000Z[\u0005=\u0000\u0000[\\\u0003\u0002\u0001\u0000"+
		"\\\u0001\u0001\u0000\u0000\u0000]a\u0003\u0004\u0002\u0000^a\u0003\f\u0006"+
		"\u0000_a\u0003\u0012\t\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000ef\u0005\u0007\u0000\u0000fg\u0003\b\u0004\u0000"+
		"gh\u0005=\u0000\u0000ht\u0001\u0000\u0000\u0000ij\u0005\u0007\u0000\u0000"+
		"jk\u0005@\u0000\u0000kl\u0003\u0006\u0003\u0000lm\u0005A\u0000\u0000m"+
		"n\u0005=\u0000\u0000nt\u0001\u0000\u0000\u0000op\u0005\u0007\u0000\u0000"+
		"pq\u0005@\u0000\u0000qr\u0005A\u0000\u0000rt\u0005=\u0000\u0000se\u0001"+
		"\u0000\u0000\u0000si\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"t\u0005\u0001\u0000\u0000\u0000uv\u0003\b\u0004\u0000v|\u0005=\u0000\u0000"+
		"wx\u0003\b\u0004\u0000xy\u0005=\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0007\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0003(\u0014\u0000\u0080\u0081\u0003\u001e"+
		"\u000f\u0000\u0081\u0082\u00050\u0000\u0000\u0082\u0083\u0003,\u0016\u0000"+
		"\u0083\u008a\u0001\u0000\u0000\u0000\u0084\u0085\u0003(\u0014\u0000\u0085"+
		"\u0086\u00050\u0000\u0000\u0086\u0087\u0003,\u0016\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0003\n\u0005\u0000\u0089\u007f\u0001\u0000"+
		"\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008c\u0003(\u0014"+
		"\u0000\u008c\u008d\u0003\u001e\u000f\u0000\u008d\u000b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0003\u0010\b\u0000"+
		"\u0090\u0091\u0005=\u0000\u0000\u0091\u009d\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\b\u0000\u0000\u0093\u0094\u0005@\u0000\u0000\u0094\u0095"+
		"\u0003\u000e\u0007\u0000\u0095\u0096\u0005A\u0000\u0000\u0096\u0097\u0005"+
		"=\u0000\u0000\u0097\u009d\u0001\u0000\u0000\u0000\u0098\u0099\u0005\b"+
		"\u0000\u0000\u0099\u009a\u0005@\u0000\u0000\u009a\u009b\u0005A\u0000\u0000"+
		"\u009b\u009d\u0005=\u0000\u0000\u009c\u008e\u0001\u0000\u0000\u0000\u009c"+
		"\u0092\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d"+
		"\r\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u0010\b\u0000\u009f\u00a5"+
		"\u0005=\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1\u00a2\u0005"+
		"=\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u000f\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0019"+
		"\u0000\u0000\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa\u0011\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0003\u0014\n\u0000\u00ac\u00ad\u0003B!\u0000"+
		"\u00ad\u00ae\u0005=\u0000\u0000\u00ae\u0013\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\t\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b4"+
		"\u0005@\u0000\u0000\u00b2\u00b5\u0003\u001c\u000e\u0000\u00b3\u00b5\u0003"+
		"V+\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0005A\u0000\u0000"+
		"\u00b7\u00ba\u0003\u0016\u000b\u0000\u00b8\u00ba\u0003\u001a\r\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u0015\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005@\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0018\f\u0000\u00bd\u00be\u0005A\u0000\u0000\u00be\u0017\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c4\u0003\u001e\u000f\u0000\u00c0\u00c1\u0005"+
		">\u0000\u0000\u00c1\u00c3\u0003\u001e\u000f\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0019\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003\u001e"+
		"\u000f\u0000\u00c8\u00ca\u0003V+\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u001b\u0001\u0000\u0000\u0000"+
		"\u00cb\u00d0\u0003\n\u0005\u0000\u00cc\u00cd\u0005>\u0000\u0000\u00cd"+
		"\u00cf\u0003\n\u0005\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005@\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001e\u000f\u0000\u00d5\u00d6\u0005A\u0000\u0000\u00d6\u00dc\u0001\u0000"+
		"\u0000\u0000\u00d7\u00dc\u0005\u0019\u0000\u0000\u00d8\u00dc\u0003 \u0010"+
		"\u0000\u00d9\u00dc\u0003\"\u0011\u0000\u00da\u00dc\u0003$\u0012\u0000"+
		"\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000"+
		"\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u001f\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005B\u0000\u0000\u00de\u00df\u0005C\u0000\u0000\u00df\u00e0"+
		"\u0003\u001e\u000f\u0000\u00e0!\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"B\u0000\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4\u0005C\u0000"+
		"\u0000\u00e4\u00e5\u0003\u001e\u000f\u0000\u00e5#\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\n\u0000\u0000\u00e7\u00ea\u0005D\u0000\u0000\u00e8"+
		"\u00eb\u0003&\u0013\u0000\u00e9\u00eb\u0003V+\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005E\u0000\u0000\u00ed%\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0003\n\u0005\u0000\u00ef\u00f5\u0005=\u0000\u0000"+
		"\u00f0\u00f1\u0003\n\u0005\u0000\u00f1\u00f2\u0005=\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fd\u0005\u0019\u0000\u0000\u00f9\u00fa"+
		"\u0005>\u0000\u0000\u00fa\u00fc\u0005\u0019\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe)\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0006\u0015"+
		"\uffff\uffff\u0000\u0101\u010b\u0003.\u0017\u0000\u0102\u0103\u0005\u001a"+
		"\u0000\u0000\u0103\u010b\u0003*\u0015\u0004\u0104\u0105\u0005\u001b\u0000"+
		"\u0000\u0105\u010b\u0003*\u0015\u0003\u0106\u0107\u0005\'\u0000\u0000"+
		"\u0107\u010b\u0003*\u0015\u0002\u0108\u0109\u0005*\u0000\u0000\u0109\u010b"+
		"\u0003*\u0015\u0001\u010a\u0100\u0001\u0000\u0000\u0000\u010a\u0102\u0001"+
		"\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000\u0000\u010a\u0106\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u0147\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\n\u0017\u0000\u0000\u010d\u010e\u0005\u001c"+
		"\u0000\u0000\u010e\u0146\u0003*\u0015\u0018\u010f\u0110\n\u0016\u0000"+
		"\u0000\u0110\u0111\u0005\u001d\u0000\u0000\u0111\u0146\u0003*\u0015\u0017"+
		"\u0112\u0113\n\u0015\u0000\u0000\u0113\u0114\u0005\u001e\u0000\u0000\u0114"+
		"\u0146\u0003*\u0015\u0016\u0115\u0116\n\u0014\u0000\u0000\u0116\u0117"+
		"\u0005,\u0000\u0000\u0117\u0146\u0003*\u0015\u0015\u0118\u0119\n\u0013"+
		"\u0000\u0000\u0119\u011a\u0005-\u0000\u0000\u011a\u0146\u0003*\u0015\u0014"+
		"\u011b\u011c\n\u0012\u0000\u0000\u011c\u011d\u0005(\u0000\u0000\u011d"+
		"\u0146\u0003*\u0015\u0013\u011e\u011f\n\u0011\u0000\u0000\u011f\u0120"+
		"\u0005+\u0000\u0000\u0120\u0146\u0003*\u0015\u0012\u0121\u0122\n\u0010"+
		"\u0000\u0000\u0122\u0123\u0005\u001a\u0000\u0000\u0123\u0146\u0003*\u0015"+
		"\u0011\u0124\u0125\n\u000f\u0000\u0000\u0125\u0126\u0005\u001b\u0000\u0000"+
		"\u0126\u0146\u0003*\u0015\u0010\u0127\u0128\n\u000e\u0000\u0000\u0128"+
		"\u0129\u0005)\u0000\u0000\u0129\u0146\u0003*\u0015\u000f\u012a\u012b\n"+
		"\r\u0000\u0000\u012b\u012c\u0005*\u0000\u0000\u012c\u0146\u0003*\u0015"+
		"\u000e\u012d\u012e\n\f\u0000\u0000\u012e\u012f\u0005#\u0000\u0000\u012f"+
		"\u0146\u0003*\u0015\r\u0130\u0131\n\u000b\u0000\u0000\u0131\u0132\u0005"+
		"$\u0000\u0000\u0132\u0146\u0003*\u0015\f\u0133\u0134\n\n\u0000\u0000\u0134"+
		"\u0135\u0005\u001f\u0000\u0000\u0135\u0146\u0003*\u0015\u000b\u0136\u0137"+
		"\n\t\u0000\u0000\u0137\u0138\u0005 \u0000\u0000\u0138\u0146\u0003*\u0015"+
		"\n\u0139\u013a\n\b\u0000\u0000\u013a\u013b\u0005!\u0000\u0000\u013b\u0146"+
		"\u0003*\u0015\t\u013c\u013d\n\u0007\u0000\u0000\u013d\u013e\u0005\"\u0000"+
		"\u0000\u013e\u0146\u0003*\u0015\b\u013f\u0140\n\u0006\u0000\u0000\u0140"+
		"\u0141\u0005%\u0000\u0000\u0141\u0146\u0003*\u0015\u0007\u0142\u0143\n"+
		"\u0005\u0000\u0000\u0143\u0144\u0005&\u0000\u0000\u0144\u0146\u0003*\u0015"+
		"\u0006\u0145\u010c\u0001\u0000\u0000\u0000\u0145\u010f\u0001\u0000\u0000"+
		"\u0000\u0145\u0112\u0001\u0000\u0000\u0000\u0145\u0115\u0001\u0000\u0000"+
		"\u0000\u0145\u0118\u0001\u0000\u0000\u0000\u0145\u011b\u0001\u0000\u0000"+
		"\u0000\u0145\u011e\u0001\u0000\u0000\u0000\u0145\u0121\u0001\u0000\u0000"+
		"\u0000\u0145\u0124\u0001\u0000\u0000\u0000\u0145\u0127\u0001\u0000\u0000"+
		"\u0000\u0145\u012a\u0001\u0000\u0000\u0000\u0145\u012d\u0001\u0000\u0000"+
		"\u0000\u0145\u0130\u0001\u0000\u0000\u0000\u0145\u0133\u0001\u0000\u0000"+
		"\u0000\u0145\u0136\u0001\u0000\u0000\u0000\u0145\u0139\u0001\u0000\u0000"+
		"\u0000\u0145\u013c\u0001\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000"+
		"\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148+\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014f\u0003*\u0015\u0000\u014b\u014c\u0005>\u0000\u0000\u014c\u014e"+
		"\u0003*\u0015\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150-\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0006\u0017\uffff\uffff\u0000\u0153\u0158\u0003"+
		"0\u0018\u0000\u0154\u0158\u0003:\u001d\u0000\u0155\u0158\u0003<\u001e"+
		"\u0000\u0156\u0158\u0003>\u001f\u0000\u0157\u0152\u0001\u0000\u0000\u0000"+
		"\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u0161\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\n\u0006\u0000\u0000\u015a\u0160\u00038\u001c\u0000\u015b"+
		"\u015c\n\u0005\u0000\u0000\u015c\u0160\u00034\u001a\u0000\u015d\u015e"+
		"\n\u0004\u0000\u0000\u015e\u0160\u00036\u001b\u0000\u015f\u0159\u0001"+
		"\u0000\u0000\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162/\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u016b\u00032\u0019"+
		"\u0000\u0165\u016b\u0005\u0019\u0000\u0000\u0166\u0167\u0005@\u0000\u0000"+
		"\u0167\u0168\u0003*\u0015\u0000\u0168\u0169\u0005A\u0000\u0000\u0169\u016b"+
		"\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000\u016a\u0165"+
		"\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b1\u0001"+
		"\u0000\u0000\u0000\u016c\u0172\u0005\u0001\u0000\u0000\u016d\u0172\u0005"+
		"\u0002\u0000\u0000\u016e\u0172\u0005\u0003\u0000\u0000\u016f\u0172\u0005"+
		"\u0004\u0000\u0000\u0170\u0172\u0005\u0005\u0000\u0000\u0171\u016c\u0001"+
		"\u0000\u0000\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u0171\u016e\u0001"+
		"\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001"+
		"\u0000\u0000\u0000\u01723\u0001\u0000\u0000\u0000\u0173\u0174\u0005B\u0000"+
		"\u0000\u0174\u0175\u0003*\u0015\u0000\u0175\u0176\u0005C\u0000\u0000\u0176"+
		"5\u0001\u0000\u0000\u0000\u0177\u0178\u0005@\u0000\u0000\u0178\u017d\u0003"+
		",\u0016\u0000\u0179\u017a\u0003V+\u0000\u017a\u017b\u0005A\u0000\u0000"+
		"\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0177\u0001\u0000\u0000\u0000"+
		"\u017c\u0179\u0001\u0000\u0000\u0000\u017d7\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005?\u0000\u0000\u017f\u0180\u0005\u0019\u0000\u0000\u01809\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\u0012\u0000\u0000\u0182\u0183\u0005"+
		"@\u0000\u0000\u0183\u0184\u0003*\u0015\u0000\u0184\u0185\u0005>\u0000"+
		"\u0000\u0185\u0186\u0003*\u0015\u0000\u0186\u0187\u0005A\u0000\u0000\u0187"+
		";\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u000b\u0000\u0000\u0189\u018a"+
		"\u0005@\u0000\u0000\u018a\u018b\u0003*\u0015\u0000\u018b\u018c\u0005A"+
		"\u0000\u0000\u018c=\u0001\u0000\u0000\u0000\u018d\u018e\u0005\f\u0000"+
		"\u0000\u018e\u018f\u0005@\u0000\u0000\u018f\u0190\u0003*\u0015\u0000\u0190"+
		"\u0191\u0005A\u0000\u0000\u0191?\u0001\u0000\u0000\u0000\u0192\u0194\u0003"+
		"D\"\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000"+
		"\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196A\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0005D\u0000\u0000\u0199\u019a\u0003@ \u0000\u019a"+
		"\u019b\u0005E\u0000\u0000\u019bC\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"\r\u0000\u0000\u019d\u01a0\u0005@\u0000\u0000\u019e\u01a1\u0003,\u0016"+
		"\u0000\u019f\u01a1\u0003V+\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0005A\u0000\u0000\u01a3\u01a4\u0005=\u0000\u0000\u01a4\u01cb\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005\u000e\u0000\u0000\u01a6\u01a9\u0005"+
		"@\u0000\u0000\u01a7\u01aa\u0003,\u0016\u0000\u01a8\u01aa\u0003V+\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005A\u0000\u0000\u01ac"+
		"\u01ad\u0005=\u0000\u0000\u01ad\u01cb\u0001\u0000\u0000\u0000\u01ae\u01b1"+
		"\u0005\u000f\u0000\u0000\u01af\u01b2\u0003*\u0015\u0000\u01b0\u01b2\u0003"+
		"V+\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005=\u0000\u0000"+
		"\u01b4\u01cb\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\u0010\u0000\u0000"+
		"\u01b6\u01cb\u0005=\u0000\u0000\u01b7\u01b8\u0005\u0011\u0000\u0000\u01b8"+
		"\u01cb\u0005=\u0000\u0000\u01b9\u01ba\u0003F#\u0000\u01ba\u01bb\u0005"+
		"=\u0000\u0000\u01bb\u01cb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003B!"+
		"\u0000\u01bd\u01be\u0005=\u0000\u0000\u01be\u01cb\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0003N\'\u0000\u01c0\u01c1\u0005=\u0000\u0000\u01c1\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003J%\u0000\u01c3\u01c4\u0005="+
		"\u0000\u0000\u01c4\u01cb\u0001\u0000\u0000\u0000\u01c5\u01c6\u0003L&\u0000"+
		"\u01c6\u01c7\u0005=\u0000\u0000\u01c7\u01cb\u0001\u0000\u0000\u0000\u01c8"+
		"\u01cb\u0003\f\u0006\u0000\u01c9\u01cb\u0003\u0004\u0002\u0000\u01ca\u019c"+
		"\u0001\u0000\u0000\u0000\u01ca\u01a5\u0001\u0000\u0000\u0000\u01ca\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ca\u01b5\u0001\u0000\u0000\u0000\u01ca\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ca\u01b9\u0001\u0000\u0000\u0000\u01ca\u01bc"+
		"\u0001\u0000\u0000\u0000\u01ca\u01bf\u0001\u0000\u0000\u0000\u01ca\u01c2"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000\u0000\u01ca\u01c8"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cbE\u0001"+
		"\u0000\u0000\u0000\u01cc\u01d9\u0003V+\u0000\u01cd\u01d1\u0003*\u0015"+
		"\u0000\u01ce\u01d2\u0005.\u0000\u0000\u01cf\u01d2\u0005/\u0000\u0000\u01d0"+
		"\u01d2\u0003V+\u0000\u01d1\u01ce\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d9\u0003H$\u0000\u01d4\u01d5\u0003,\u0016"+
		"\u0000\u01d5\u01d6\u00050\u0000\u0000\u01d6\u01d7\u0003,\u0016\u0000\u01d7"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d8\u01cc\u0001\u0000\u0000\u0000\u01d8"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d8\u01d3\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d9G\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0003,\u0016\u0000\u01db\u01dc\u00050\u0000\u0000\u01dc\u01dd\u0003,"+
		"\u0016\u0000\u01dd\u020b\u0001\u0000\u0000\u0000\u01de\u01df\u0003*\u0015"+
		"\u0000\u01df\u01e0\u00051\u0000\u0000\u01e0\u01e1\u0003*\u0015\u0000\u01e1"+
		"\u020b\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003*\u0015\u0000\u01e3\u01e4"+
		"\u00052\u0000\u0000\u01e4\u01e5\u0003*\u0015\u0000\u01e5\u020b\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0003*\u0015\u0000\u01e7\u01e8\u00056\u0000\u0000"+
		"\u01e8\u01e9\u0003*\u0015\u0000\u01e9\u020b\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0003*\u0015\u0000\u01eb\u01ec\u00057\u0000\u0000\u01ec\u01ed\u0003"+
		"*\u0015\u0000\u01ed\u020b\u0001\u0000\u0000\u0000\u01ee\u01ef\u0003*\u0015"+
		"\u0000\u01ef\u01f0\u00053\u0000\u0000\u01f0\u01f1\u0003*\u0015\u0000\u01f1"+
		"\u020b\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003*\u0015\u0000\u01f3\u01f4"+
		"\u00058\u0000\u0000\u01f4\u01f5\u0003*\u0015\u0000\u01f5\u020b\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0003*\u0015\u0000\u01f7\u01f8\u00059\u0000\u0000"+
		"\u01f8\u01f9\u0003*\u0015\u0000\u01f9\u020b\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0003*\u0015\u0000\u01fb\u01fc\u0005:\u0000\u0000\u01fc\u01fd\u0003"+
		"*\u0015\u0000\u01fd\u020b\u0001\u0000\u0000\u0000\u01fe\u01ff\u0003*\u0015"+
		"\u0000\u01ff\u0200\u0005;\u0000\u0000\u0200\u0201\u0003*\u0015\u0000\u0201"+
		"\u020b\u0001\u0000\u0000\u0000\u0202\u0203\u0003*\u0015\u0000\u0203\u0204"+
		"\u00055\u0000\u0000\u0204\u0205\u0003*\u0015\u0000\u0205\u020b\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0003*\u0015\u0000\u0207\u0208\u00054\u0000\u0000"+
		"\u0208\u0209\u0003*\u0015\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a"+
		"\u01da\u0001\u0000\u0000\u0000\u020a\u01de\u0001\u0000\u0000\u0000\u020a"+
		"\u01e2\u0001\u0000\u0000\u0000\u020a\u01e6\u0001\u0000\u0000\u0000\u020a"+
		"\u01ea\u0001\u0000\u0000\u0000\u020a\u01ee\u0001\u0000\u0000\u0000\u020a"+
		"\u01f2\u0001\u0000\u0000\u0000\u020a\u01f6\u0001\u0000\u0000\u0000\u020a"+
		"\u01fa\u0001\u0000\u0000\u0000\u020a\u01fe\u0001\u0000\u0000\u0000\u020a"+
		"\u0202\u0001\u0000\u0000\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020b"+
		"I\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u0013\u0000\u0000\u020d\u020e"+
		"\u0003*\u0015\u0000\u020e\u020f\u0003B!\u0000\u020f\u0233\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0005\u0013\u0000\u0000\u0211\u0212\u0003*\u0015"+
		"\u0000\u0212\u0213\u0003B!\u0000\u0213\u0214\u0005\u0014\u0000\u0000\u0214"+
		"\u0215\u0003J%\u0000\u0215\u0233\u0001\u0000\u0000\u0000\u0216\u0217\u0005"+
		"\u0013\u0000\u0000\u0217\u0218\u0003*\u0015\u0000\u0218\u0219\u0003B!"+
		"\u0000\u0219\u021a\u0005\u0014\u0000\u0000\u021a\u021b\u0003B!\u0000\u021b"+
		"\u0233\u0001\u0000\u0000\u0000\u021c\u021d\u0005\u0013\u0000\u0000\u021d"+
		"\u021e\u0003F#\u0000\u021e\u021f\u0005=\u0000\u0000\u021f\u0220\u0003"+
		"*\u0015\u0000\u0220\u0221\u0003B!\u0000\u0221\u0233\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0005\u0013\u0000\u0000\u0223\u0224\u0003F#\u0000\u0224"+
		"\u0225\u0005=\u0000\u0000\u0225\u0226\u0003*\u0015\u0000\u0226\u0227\u0003"+
		"B!\u0000\u0227\u0228\u0005\u0014\u0000\u0000\u0228\u0229\u0003J%\u0000"+
		"\u0229\u0233\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u0013\u0000\u0000"+
		"\u022b\u022c\u0003F#\u0000\u022c\u022d\u0005=\u0000\u0000\u022d\u022e"+
		"\u0003*\u0015\u0000\u022e\u022f\u0003B!\u0000\u022f\u0230\u0005\u0014"+
		"\u0000\u0000\u0230\u0231\u0003B!\u0000\u0231\u0233\u0001\u0000\u0000\u0000"+
		"\u0232\u020c\u0001\u0000\u0000\u0000\u0232\u0210\u0001\u0000\u0000\u0000"+
		"\u0232\u0216\u0001\u0000\u0000\u0000\u0232\u021c\u0001\u0000\u0000\u0000"+
		"\u0232\u0222\u0001\u0000\u0000\u0000\u0232\u022a\u0001\u0000\u0000\u0000"+
		"\u0233K\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0015\u0000\u0000\u0235"+
		"\u024a\u0003B!\u0000\u0236\u0237\u0005\u0015\u0000\u0000\u0237\u0238\u0003"+
		"*\u0015\u0000\u0238\u0239\u0003B!\u0000\u0239\u024a\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0005\u0015\u0000\u0000\u023b\u023c\u0003F#\u0000\u023c"+
		"\u023d\u0005=\u0000\u0000\u023d\u023e\u0003*\u0015\u0000\u023e\u023f\u0005"+
		"=\u0000\u0000\u023f\u0240\u0003F#\u0000\u0240\u0241\u0003B!\u0000\u0241"+
		"\u024a\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u0015\u0000\u0000\u0243"+
		"\u0244\u0003F#\u0000\u0244\u0245\u0005=\u0000\u0000\u0245\u0246\u0005"+
		"=\u0000\u0000\u0246\u0247\u0003F#\u0000\u0247\u0248\u0003B!\u0000\u0248"+
		"\u024a\u0001\u0000\u0000\u0000\u0249\u0234\u0001\u0000\u0000\u0000\u0249"+
		"\u0236\u0001\u0000\u0000\u0000\u0249\u023a\u0001\u0000\u0000\u0000\u0249"+
		"\u0242\u0001\u0000\u0000\u0000\u024aM\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0005\u0016\u0000\u0000\u024c\u024d\u0003F#\u0000\u024d\u024e\u0005="+
		"\u0000\u0000\u024e\u024f\u0003*\u0015\u0000\u024f\u0250\u0005D\u0000\u0000"+
		"\u0250\u0251\u0003P(\u0000\u0251\u0252\u0005E\u0000\u0000\u0252\u0266"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u0016\u0000\u0000\u0254\u0255"+
		"\u0003*\u0015\u0000\u0255\u0256\u0005D\u0000\u0000\u0256\u0257\u0003P"+
		"(\u0000\u0257\u0258\u0005E\u0000\u0000\u0258\u0266\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0005\u0016\u0000\u0000\u025a\u025b\u0003F#\u0000\u025b\u025c"+
		"\u0005=\u0000\u0000\u025c\u025d\u0005D\u0000\u0000\u025d\u025e\u0003P"+
		"(\u0000\u025e\u025f\u0005E\u0000\u0000\u025f\u0266\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0005\u0016\u0000\u0000\u0261\u0262\u0005D\u0000\u0000\u0262"+
		"\u0263\u0003P(\u0000\u0263\u0264\u0005E\u0000\u0000\u0264\u0266\u0001"+
		"\u0000\u0000\u0000\u0265\u024b\u0001\u0000\u0000\u0000\u0265\u0253\u0001"+
		"\u0000\u0000\u0000\u0265\u0259\u0001\u0000\u0000\u0000\u0265\u0260\u0001"+
		"\u0000\u0000\u0000\u0266O\u0001\u0000\u0000\u0000\u0267\u0268\u0006(\uffff"+
		"\uffff\u0000\u0268\u0269\u0003V+\u0000\u0269\u026e\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\n\u0001\u0000\u0000\u026b\u026d\u0003R)\u0000\u026c\u026a"+
		"\u0001\u0000\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026fQ\u0001"+
		"\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0003"+
		"T*\u0000\u0272\u0273\u0005<\u0000\u0000\u0273\u0274\u0003@ \u0000\u0274"+
		"S\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0017\u0000\u0000\u0276\u0279"+
		"\u0003,\u0016\u0000\u0277\u0279\u0005\u0018\u0000\u0000\u0278\u0275\u0001"+
		"\u0000\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279U\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027bW\u0001\u0000\u0000"+
		"\u0000\'`bs|\u0089\u009c\u00a5\u00b4\u00b9\u00c4\u00c9\u00d0\u00db\u00ea"+
		"\u00f5\u00fd\u010a\u0145\u0147\u014f\u0157\u015f\u0161\u016a\u0171\u017c"+
		"\u0195\u01a0\u01a9\u01b1\u01ca\u01d1\u01d8\u020a\u0232\u0249\u0265\u026e"+
		"\u0278";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}