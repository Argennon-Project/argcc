// Generated from /home/aybehrouz/IdeaProjects/argcc/src/main/java/org/argennon/argcc/grammar/ArgC.g4 by ANTLR 4.9.2
package org.argennon.argcc.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArgCParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, Auto = 12, Break = 13, Case = 14, Char = 15, Const = 16, Continue = 17,
			Default = 18, Do = 19, Double = 20, Else = 21, Enum = 22, Extern = 23, Float = 24, For = 25,
			Goto = 26, If = 27, Inline = 28, Int = 29, Long = 30, Register = 31, Restrict = 32,
			Return = 33, Short = 34, Signed = 35, Sizeof = 36, Static = 37, Struct = 38, Switch = 39,
			Typedef = 40, Union = 41, Unsigned = 42, Void = 43, Volatile = 44, While = 45, Alignas = 46,
			Alignof = 47, Atomic = 48, Bool = 49, Complex = 50, Generic = 51, Imaginary = 52,
			Noreturn = 53, StaticAssert = 54, ThreadLocal = 55, LeftParen = 56, RightParen = 57,
			LeftBracket = 58, RightBracket = 59, LeftBrace = 60, RightBrace = 61, Less = 62,
			LessEqual = 63, Greater = 64, GreaterEqual = 65, LeftShift = 66, RightShift = 67,
			Plus = 68, PlusPlus = 69, Minus = 70, MinusMinus = 71, Star = 72, Div = 73, Mod = 74,
			And = 75, Or = 76, AndAnd = 77, OrOr = 78, Caret = 79, Not = 80, Tilde = 81, Question = 82,
			Colon = 83, Semi = 84, Comma = 85, Assign = 86, StarAssign = 87, DivAssign = 88, ModAssign = 89,
			PlusAssign = 90, MinusAssign = 91, LeftShiftAssign = 92, RightShiftAssign = 93,
			AndAssign = 94, XorAssign = 95, OrAssign = 96, Equal = 97, NotEqual = 98, Arrow = 99,
			Dot = 100, Ellipsis = 101, Identifier = 102, Constant = 103, DigitSequence = 104,
			StringLiteral = 105, ComplexDefine = 106, IncludeDirective = 107, AsmBlock = 108,
			LineAfterPreprocessing = 109, LineDirective = 110, PragmaDirective = 111, Whitespace = 112,
			Newline = 113, BlockComment = 114, LineComment = 115;
	public static final int
			RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2,
			RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_primaryExpression = 5,
			RULE_postfixExpression = 6, RULE_argumentExpressionList = 7, RULE_unaryExpression = 8,
			RULE_unaryOperator = 9, RULE_simpleExpression = 10, RULE_multiplicativeExpression = 11,
			RULE_additiveExpression = 12, RULE_shiftExpression = 13, RULE_relationalExpression = 14,
			RULE_equalityExpression = 15, RULE_andExpression = 16, RULE_exclusiveOrExpression = 17,
			RULE_inclusiveOrExpression = 18, RULE_logicalAndExpression = 19, RULE_logicalOrExpression = 20,
			RULE_conditionalExpression = 21, RULE_assignmentExpression = 22, RULE_assignmentOperator = 23,
			RULE_expression = 24, RULE_constantExpression = 25, RULE_declaration = 26,
			RULE_declarationSpecifiers = 27, RULE_declarationSpecifier = 28, RULE_initDeclaratorList = 29,
			RULE_initDeclarator = 30, RULE_storageClassSpecifier = 31, RULE_primitiveType = 32,
			RULE_typeSpecifier = 33, RULE_structOrUnionSpecifier = 34, RULE_structOrUnion = 35,
			RULE_structDeclarationList = 36, RULE_structDeclaration = 37, RULE_specifierQualifierList = 38,
			RULE_structDeclaratorList = 39, RULE_structDeclarator = 40, RULE_enumSpecifier = 41,
			RULE_enumeratorList = 42, RULE_enumerator = 43, RULE_enumerationConstant = 44,
			RULE_typeQualifier = 45, RULE_declarator = 46, RULE_directDeclarator = 47,
			RULE_nestedParenthesesBlock = 48, RULE_typeQualifierList = 49, RULE_parameterTypeList = 50,
			RULE_parameterList = 51, RULE_parameterDeclaration = 52, RULE_identifierList = 53,
			RULE_typeName = 54, RULE_typedefName = 55, RULE_initializer = 56, RULE_initializerList = 57,
			RULE_designation = 58, RULE_designatorList = 59, RULE_designator = 60,
			RULE_statement = 61, RULE_labeledStatement = 62, RULE_compoundStatement = 63,
			RULE_blockItemList = 64, RULE_blockItem = 65, RULE_expressionStatement = 66,
			RULE_selectionStatement = 67, RULE_iterationStatement = 68, RULE_forCondition = 69,
			RULE_forDeclaration = 70, RULE_forExpression = 71, RULE_jumpStatement = 72;

	private static String[] makeRuleNames() {
		return new String[]{
				"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition",
				"declarationList", "primaryExpression", "postfixExpression", "argumentExpressionList",
				"unaryExpression", "unaryOperator", "simpleExpression", "multiplicativeExpression",
				"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression",
				"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression",
				"logicalOrExpression", "conditionalExpression", "assignmentExpression",
				"assignmentOperator", "expression", "constantExpression", "declaration",
				"declarationSpecifiers", "declarationSpecifier", "initDeclaratorList",
				"initDeclarator", "storageClassSpecifier", "primitiveType", "typeSpecifier",
				"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration",
				"specifierQualifierList", "structDeclaratorList", "structDeclarator",
				"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant",
				"typeQualifier", "declarator", "directDeclarator", "nestedParenthesesBlock",
				"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration",
				"identifierList", "typeName", "typedefName", "initializer", "initializerList",
				"designation", "designatorList", "designator", "statement", "labeledStatement",
				"compoundStatement", "blockItemList", "blockItem", "expressionStatement",
				"selectionStatement", "iterationStatement", "forCondition", "forDeclaration",
				"forExpression", "jumpStatement"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'byte'", "'int16'", "'int32'", "'int64'", "'int128'", "'float32'",
				"'float64'", "'float128'", "'bool'", "'array_c'", "'string_buffer_c<'",
				"'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", "'default'",
				"'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", "'for'",
				"'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", "'restrict'",
				"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'struct'",
				"'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'",
				"'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'",
				"'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'",
				"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='",
				"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'",
				"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','",
				"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='",
				"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, null, null, null,
				"Auto", "Break", "Case", "Char", "Const", "Continue", "Default", "Do",
				"Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", "Inline",
				"Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof",
				"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Void",
				"Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", "Complex",
				"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen",
				"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace",
				"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift",
				"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And",
				"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon",
				"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign",
				"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign",
				"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier",
				"Constant", "DigitSequence", "StringLiteral", "ComplexDefine", "IncludeDirective",
				"AsmBlock", "LineAfterPreprocessing", "LineDirective", "PragmaDirective",
				"Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() {
		return "ArgC.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public ArgCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(ArgCParser.EOF, 0);
		}

		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class, 0);
		}

		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << LeftParen))) != 0) || _la == Semi || _la == Identifier) {
					{
						setState(146);
						translationUnit();
					}
				}

				setState(149);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}

		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class, i);
		}

		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_translationUnit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTranslationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(151);
							externalDeclaration();
						}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << LeftParen))) != 0) || _la == Semi || _la == Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class, 0);
		}

		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class, 0);
		}

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_externalDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterExternalDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(156);
					functionDefinition();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(157);
					declaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(158);
					match(Semi);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class, 0);
		}

		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class, 0);
		}

		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionDefinition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterFunctionDefinition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Void))) != 0)) {
					{
						setState(161);
						primitiveType();
					}
				}

				setState(164);
				declarator();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void))) != 0) || _la == Identifier) {
					{
						setState(165);
						declarationList();
					}
				}

				setState(168);
				compoundStatement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}

		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class, i);
		}

		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarationList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclarationList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(170);
							declaration();
						}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Void))) != 0) || _la == Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Constant() {
			return getToken(ArgCParser.Constant, 0);
		}

		public List<TerminalNode> StringLiteral() {
			return getTokens(ArgCParser.StringLiteral);
		}

		public TerminalNode StringLiteral(int i) {
			return getToken(ArgCParser.StringLiteral, i);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterPrimaryExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primaryExpression);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(175);
					match(Identifier);
				}
				break;
				case Constant:
					enterOuterAlt(_localctx, 2);
				{
					setState(176);
					match(Constant);
				}
				break;
				case StringLiteral:
					enterOuterAlt(_localctx, 3);
				{
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(177);
								match(StringLiteral);
							}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == StringLiteral);
				}
				break;
				case LeftParen:
					enterOuterAlt(_localctx, 4);
				{
					setState(182);
					match(LeftParen);
					setState(183);
					expression();
					setState(184);
					match(RightParen);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class, 0);
		}

		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public List<TerminalNode> LeftBracket() {
			return getTokens(ArgCParser.LeftBracket);
		}

		public TerminalNode LeftBracket(int i) {
			return getToken(ArgCParser.LeftBracket, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<TerminalNode> RightBracket() {
			return getTokens(ArgCParser.RightBracket);
		}

		public TerminalNode RightBracket(int i) {
			return getToken(ArgCParser.RightBracket, i);
		}

		public List<TerminalNode> LeftParen() {
			return getTokens(ArgCParser.LeftParen);
		}

		public TerminalNode LeftParen(int i) {
			return getToken(ArgCParser.LeftParen, i);
		}

		public List<TerminalNode> RightParen() {
			return getTokens(ArgCParser.RightParen);
		}

		public TerminalNode RightParen(int i) {
			return getToken(ArgCParser.RightParen, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(ArgCParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(ArgCParser.Identifier, i);
		}

		public List<TerminalNode> Dot() {
			return getTokens(ArgCParser.Dot);
		}

		public TerminalNode Dot(int i) {
			return getToken(ArgCParser.Dot, i);
		}

		public List<TerminalNode> Arrow() {
			return getTokens(ArgCParser.Arrow);
		}

		public TerminalNode Arrow(int i) {
			return getToken(ArgCParser.Arrow, i);
		}

		public List<TerminalNode> PlusPlus() {
			return getTokens(ArgCParser.PlusPlus);
		}

		public TerminalNode PlusPlus(int i) {
			return getToken(ArgCParser.PlusPlus, i);
		}

		public List<TerminalNode> MinusMinus() {
			return getTokens(ArgCParser.MinusMinus);
		}

		public TerminalNode MinusMinus(int i) {
			return getToken(ArgCParser.MinusMinus, i);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
		}

		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}

		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class, i);
		}

		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterPostfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case Identifier:
					case Constant:
					case StringLiteral: {
						setState(188);
						primaryExpression();
					}
					break;
					case LeftBrace: {
						setState(189);
						match(LeftBrace);
						setState(190);
						initializerList();
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Comma) {
							{
								setState(191);
								match(Comma);
							}
						}

						setState(194);
						match(RightBrace);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (LeftParen - 56)) | (1L << (LeftBracket - 56)) | (1L << (PlusPlus - 56)) | (1L << (MinusMinus - 56)) | (1L << (Arrow - 56)) | (1L << (Dot - 56)))) != 0)) {
					{
						setState(210);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case LeftBracket: {
								setState(198);
								match(LeftBracket);
								setState(199);
								expression();
								setState(200);
								match(RightBracket);
							}
							break;
							case LeftParen: {
								setState(202);
								match(LeftParen);
								setState(204);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
									{
										setState(203);
										argumentExpressionList();
									}
								}

								setState(206);
								match(RightParen);
							}
							break;
							case Arrow:
							case Dot: {
								setState(207);
								_la = _input.LA(1);
								if (!(_la == Arrow || _la == Dot)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(208);
								match(Identifier);
							}
							break;
							case PlusPlus:
							case MinusMinus: {
								setState(209);
								_la = _input.LA(1);
								if (!(_la == PlusPlus || _la == MinusMinus)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}

		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_argumentExpressionList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterArgumentExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(215);
				assignmentExpression();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(216);
							match(Comma);
							setState(217);
							assignmentExpression();
						}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class, 0);
		}

		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public List<TerminalNode> PlusPlus() {
			return getTokens(ArgCParser.PlusPlus);
		}

		public TerminalNode PlusPlus(int i) {
			return getToken(ArgCParser.PlusPlus, i);
		}

		public List<TerminalNode> MinusMinus() {
			return getTokens(ArgCParser.MinusMinus);
		}

		public TerminalNode MinusMinus(int i) {
			return getToken(ArgCParser.MinusMinus, i);
		}

		public List<TerminalNode> Sizeof() {
			return getTokens(ArgCParser.Sizeof);
		}

		public TerminalNode Sizeof(int i) {
			return getToken(ArgCParser.Sizeof, i);
		}

		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterUnaryExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(223);
								_la = _input.LA(1);
								if (!(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Sizeof - 36)) | (1L << (PlusPlus - 36)) | (1L << (MinusMinus - 36)))) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				}
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case LeftBrace:
					case Identifier:
					case Constant:
					case StringLiteral: {
						setState(229);
						postfixExpression();
					}
					break;
					case Plus:
					case Minus:
					case Not:
					case Tilde: {
						setState(230);
						unaryOperator();
						setState(231);
						simpleExpression();
					}
					break;
					case Sizeof: {
						{
							setState(233);
							match(Sizeof);
						}
						setState(234);
						match(LeftParen);
						setState(235);
						typeName();
						setState(236);
						match(RightParen);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() {
			return getToken(ArgCParser.Plus, 0);
		}

		public TerminalNode Minus() {
			return getToken(ArgCParser.Minus, 0);
		}

		public TerminalNode Tilde() {
			return getToken(ArgCParser.Tilde, 0);
		}

		public TerminalNode Not() {
			return getToken(ArgCParser.Not, 0);
		}

		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryOperator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterUnaryOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(240);
				_la = _input.LA(1);
				if (!(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (Minus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public TerminalNode DigitSequence() {
			return getToken(ArgCParser.DigitSequence, 0);
		}

		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simpleExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterSimpleExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleExpression);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Sizeof:
				case LeftParen:
				case LeftBrace:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Not:
				case Tilde:
				case Identifier:
				case Constant:
				case StringLiteral:
					enterOuterAlt(_localctx, 1);
				{
					setState(242);
					unaryExpression();
				}
				break;
				case DigitSequence:
					enterOuterAlt(_localctx, 2);
				{
					setState(243);
					match(DigitSequence);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}

		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class, i);
		}

		public List<TerminalNode> Star() {
			return getTokens(ArgCParser.Star);
		}

		public TerminalNode Star(int i) {
			return getToken(ArgCParser.Star, i);
		}

		public List<TerminalNode> Div() {
			return getTokens(ArgCParser.Div);
		}

		public TerminalNode Div(int i) {
			return getToken(ArgCParser.Div, i);
		}

		public List<TerminalNode> Mod() {
			return getTokens(ArgCParser.Mod);
		}

		public TerminalNode Mod(int i) {
			return getToken(ArgCParser.Mod, i);
		}

		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiplicativeExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterMultiplicativeExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(246);
				simpleExpression();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Star - 72)) | (1L << (Div - 72)) | (1L << (Mod - 72)))) != 0)) {
					{
						{
							setState(247);
							_la = _input.LA(1);
							if (!(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Star - 72)) | (1L << (Div - 72)) | (1L << (Mod - 72)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(248);
							simpleExpression();
						}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}

		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class, i);
		}

		public List<TerminalNode> Plus() {
			return getTokens(ArgCParser.Plus);
		}

		public TerminalNode Plus(int i) {
			return getToken(ArgCParser.Plus, i);
		}

		public List<TerminalNode> Minus() {
			return getTokens(ArgCParser.Minus);
		}

		public TerminalNode Minus(int i) {
			return getToken(ArgCParser.Minus, i);
		}

		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_additiveExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAdditiveExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(254);
				multiplicativeExpression();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Plus || _la == Minus) {
					{
						{
							setState(255);
							_la = _input.LA(1);
							if (!(_la == Plus || _la == Minus)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(256);
							multiplicativeExpression();
						}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}

		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class, i);
		}

		public List<TerminalNode> LeftShift() {
			return getTokens(ArgCParser.LeftShift);
		}

		public TerminalNode LeftShift(int i) {
			return getToken(ArgCParser.LeftShift, i);
		}

		public List<TerminalNode> RightShift() {
			return getTokens(ArgCParser.RightShift);
		}

		public TerminalNode RightShift(int i) {
			return getToken(ArgCParser.RightShift, i);
		}

		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_shiftExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterShiftExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				additiveExpression();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LeftShift || _la == RightShift) {
					{
						{
							setState(263);
							_la = _input.LA(1);
							if (!(_la == LeftShift || _la == RightShift)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(264);
							additiveExpression();
						}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}

		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class, i);
		}

		public List<TerminalNode> Less() {
			return getTokens(ArgCParser.Less);
		}

		public TerminalNode Less(int i) {
			return getToken(ArgCParser.Less, i);
		}

		public List<TerminalNode> Greater() {
			return getTokens(ArgCParser.Greater);
		}

		public TerminalNode Greater(int i) {
			return getToken(ArgCParser.Greater, i);
		}

		public List<TerminalNode> LessEqual() {
			return getTokens(ArgCParser.LessEqual);
		}

		public TerminalNode LessEqual(int i) {
			return getToken(ArgCParser.LessEqual, i);
		}

		public List<TerminalNode> GreaterEqual() {
			return getTokens(ArgCParser.GreaterEqual);
		}

		public TerminalNode GreaterEqual(int i) {
			return getToken(ArgCParser.GreaterEqual, i);
		}

		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterRelationalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(270);
				shiftExpression();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Less - 62)) | (1L << (LessEqual - 62)) | (1L << (Greater - 62)) | (1L << (GreaterEqual - 62)))) != 0)) {
					{
						{
							setState(271);
							_la = _input.LA(1);
							if (!(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Less - 62)) | (1L << (LessEqual - 62)) | (1L << (Greater - 62)) | (1L << (GreaterEqual - 62)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(272);
							shiftExpression();
						}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}

		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class, i);
		}

		public List<TerminalNode> Equal() {
			return getTokens(ArgCParser.Equal);
		}

		public TerminalNode Equal(int i) {
			return getToken(ArgCParser.Equal, i);
		}

		public List<TerminalNode> NotEqual() {
			return getTokens(ArgCParser.NotEqual);
		}

		public TerminalNode NotEqual(int i) {
			return getToken(ArgCParser.NotEqual, i);
		}

		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_equalityExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterEqualityExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(278);
				relationalExpression();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Equal || _la == NotEqual) {
					{
						{
							setState(279);
							_la = _input.LA(1);
							if (!(_la == Equal || _la == NotEqual)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(280);
							relationalExpression();
						}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}

		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class, i);
		}

		public List<TerminalNode> And() {
			return getTokens(ArgCParser.And);
		}

		public TerminalNode And(int i) {
			return getToken(ArgCParser.And, i);
		}

		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_andExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(286);
				equalityExpression();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == And) {
					{
						{
							setState(287);
							match(And);
							setState(288);
							equalityExpression();
						}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}

		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class, i);
		}

		public List<TerminalNode> Caret() {
			return getTokens(ArgCParser.Caret);
		}

		public TerminalNode Caret(int i) {
			return getToken(ArgCParser.Caret, i);
		}

		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterExclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(294);
				andExpression();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Caret) {
					{
						{
							setState(295);
							match(Caret);
							setState(296);
							andExpression();
						}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class, i);
		}

		public List<TerminalNode> Or() {
			return getTokens(ArgCParser.Or);
		}

		public TerminalNode Or(int i) {
			return getToken(ArgCParser.Or, i);
		}

		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(302);
				exclusiveOrExpression();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Or) {
					{
						{
							setState(303);
							match(Or);
							setState(304);
							exclusiveOrExpression();
						}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}

		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class, i);
		}

		public List<TerminalNode> AndAnd() {
			return getTokens(ArgCParser.AndAnd);
		}

		public TerminalNode AndAnd(int i) {
			return getToken(ArgCParser.AndAnd, i);
		}

		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_logicalAndExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterLogicalAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(310);
				inclusiveOrExpression();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AndAnd) {
					{
						{
							setState(311);
							match(AndAnd);
							setState(312);
							inclusiveOrExpression();
						}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}

		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class, i);
		}

		public List<TerminalNode> OrOr() {
			return getTokens(ArgCParser.OrOr);
		}

		public TerminalNode OrOr(int i) {
			return getToken(ArgCParser.OrOr, i);
		}

		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_logicalOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterLogicalOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(318);
				logicalAndExpression();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OrOr) {
					{
						{
							setState(319);
							match(OrOr);
							setState(320);
							logicalAndExpression();
						}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class, 0);
		}

		public TerminalNode Question() {
			return getToken(ArgCParser.Question, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterConditionalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(326);
				logicalOrExpression();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Question) {
					{
						setState(327);
						match(Question);
						setState(328);
						expression();
						setState(329);
						match(Colon);
						setState(330);
						conditionalExpression();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class, 0);
		}

		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class, 0);
		}

		public TerminalNode DigitSequence() {
			return getToken(ArgCParser.DigitSequence, 0);
		}

		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAssignmentExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentExpression);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(334);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(335);
					unaryExpression();
					setState(336);
					assignmentOperator();
					setState(337);
					assignmentExpression();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(339);
					match(DigitSequence);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() {
			return getToken(ArgCParser.Assign, 0);
		}

		public TerminalNode StarAssign() {
			return getToken(ArgCParser.StarAssign, 0);
		}

		public TerminalNode DivAssign() {
			return getToken(ArgCParser.DivAssign, 0);
		}

		public TerminalNode ModAssign() {
			return getToken(ArgCParser.ModAssign, 0);
		}

		public TerminalNode PlusAssign() {
			return getToken(ArgCParser.PlusAssign, 0);
		}

		public TerminalNode MinusAssign() {
			return getToken(ArgCParser.MinusAssign, 0);
		}

		public TerminalNode LeftShiftAssign() {
			return getToken(ArgCParser.LeftShiftAssign, 0);
		}

		public TerminalNode RightShiftAssign() {
			return getToken(ArgCParser.RightShiftAssign, 0);
		}

		public TerminalNode AndAssign() {
			return getToken(ArgCParser.AndAssign, 0);
		}

		public TerminalNode XorAssign() {
			return getToken(ArgCParser.XorAssign, 0);
		}

		public TerminalNode OrAssign() {
			return getToken(ArgCParser.OrAssign, 0);
		}

		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentOperator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAssignmentOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(342);
				_la = _input.LA(1);
				if (!(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (Assign - 86)) | (1L << (StarAssign - 86)) | (1L << (DivAssign - 86)) | (1L << (ModAssign - 86)) | (1L << (PlusAssign - 86)) | (1L << (MinusAssign - 86)) | (1L << (LeftShiftAssign - 86)) | (1L << (RightShiftAssign - 86)) | (1L << (AndAssign - 86)) | (1L << (XorAssign - 86)) | (1L << (OrAssign - 86)))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}

		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(344);
				assignmentExpression();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(345);
							match(Comma);
							setState(346);
							assignmentExpression();
						}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterConstantExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(352);
				conditionalExpression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class, 0);
		}

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class, 0);
		}

		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(354);
				declarationSpecifiers();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftParen || _la == Identifier) {
					{
						setState(355);
						initDeclaratorList();
					}
				}

				setState(358);
				match(Semi);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}

		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class, i);
		}

		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarationSpecifiers;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclarationSpecifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(360);
								declarationSpecifier();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class, 0);
		}

		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class, 0);
		}

		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class, 0);
		}

		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarationSpecifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclarationSpecifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationSpecifier);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Static:
				case Typedef:
					enterOuterAlt(_localctx, 1);
				{
					setState(365);
					storageClassSpecifier();
				}
				break;
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case Enum:
				case Struct:
				case Union:
				case Void:
				case Identifier:
					enterOuterAlt(_localctx, 2);
				{
					setState(366);
					typeSpecifier();
				}
				break;
				case Const:
					enterOuterAlt(_localctx, 3);
				{
					setState(367);
					typeQualifier();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}

		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_initDeclaratorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInitDeclaratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(370);
				initDeclarator();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(371);
							match(Comma);
							setState(372);
							initDeclarator();
						}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class, 0);
		}

		public TerminalNode Assign() {
			return getToken(ArgCParser.Assign, 0);
		}

		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class, 0);
		}

		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_initDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInitDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(378);
				declarator();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Assign) {
					{
						setState(379);
						match(Assign);
						setState(380);
						initializer();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() {
			return getToken(ArgCParser.Typedef, 0);
		}

		public TerminalNode Static() {
			return getToken(ArgCParser.Static, 0);
		}

		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_storageClassSpecifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStorageClassSpecifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(383);
				_la = _input.LA(1);
				if (!(_la == Static || _la == Typedef)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode Void() {
			return getToken(ArgCParser.Void, 0);
		}

		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(385);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Void))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class, 0);
		}

		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class, 0);
		}

		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class, 0);
		}

		public TerminalNode Less() {
			return getToken(ArgCParser.Less, 0);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
		}

		public TerminalNode Constant() {
			return getToken(ArgCParser.Constant, 0);
		}

		public TerminalNode Greater() {
			return getToken(ArgCParser.Greater, 0);
		}

		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeSpecifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTypeSpecifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeSpecifier);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case Void:
					enterOuterAlt(_localctx, 1);
				{
					setState(387);
					primitiveType();
				}
				break;
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 2);
				{
					setState(388);
					structOrUnionSpecifier();
				}
				break;
				case Enum:
					enterOuterAlt(_localctx, 3);
				{
					setState(389);
					enumSpecifier();
				}
				break;
				case Identifier:
					enterOuterAlt(_localctx, 4);
				{
					setState(390);
					typedefName();
				}
				break;
				case T__9:
					enterOuterAlt(_localctx, 5);
				{
					setState(391);
					match(T__9);
					setState(392);
					match(Less);
					setState(393);
					primitiveType();
					setState(394);
					match(Comma);
					setState(395);
					match(Constant);
					setState(396);
					match(Greater);
				}
				break;
				case T__10:
					enterOuterAlt(_localctx, 6);
				{
					setState(398);
					match(T__10);
					setState(399);
					match(Constant);
					setState(400);
					match(Greater);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class, 0);
		}

		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structOrUnionSpecifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructOrUnionSpecifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(403);
					structOrUnion();
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(404);
							match(Identifier);
						}
					}

					setState(407);
					match(LeftBrace);
					setState(408);
					structDeclarationList();
					setState(409);
					match(RightBrace);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(411);
					structOrUnion();
					setState(412);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() {
			return getToken(ArgCParser.Struct, 0);
		}

		public TerminalNode Union() {
			return getToken(ArgCParser.Union, 0);
		}

		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structOrUnion;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructOrUnion(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructOrUnion(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(416);
				_la = _input.LA(1);
				if (!(_la == Struct || _la == Union)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}

		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class, i);
		}

		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structDeclarationList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructDeclarationList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(418);
							structDeclaration();
						}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Const) | (1L << Enum) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class, 0);
		}

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class, 0);
		}

		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(423);
				specifierQualifierList();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (LeftParen - 56)) | (1L << (Colon - 56)) | (1L << (Identifier - 56)))) != 0)) {
					{
						setState(424);
						structDeclaratorList();
					}
				}

				setState(427);
				match(Semi);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class, 0);
		}

		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class, 0);
		}

		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class, 0);
		}

		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_specifierQualifierList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterSpecifierQualifierList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T__0:
					case T__1:
					case T__2:
					case T__3:
					case T__4:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case Enum:
					case Struct:
					case Union:
					case Void:
					case Identifier: {
						setState(429);
						typeSpecifier();
					}
					break;
					case Const: {
						setState(430);
						typeQualifier();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(434);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
					case 1: {
						setState(433);
						specifierQualifierList();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}

		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structDeclaratorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructDeclaratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(436);
				structDeclarator();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(437);
							match(Comma);
							setState(438);
							structDeclarator();
						}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_structDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStructDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structDeclarator);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(444);
					declarator();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == LeftParen || _la == Identifier) {
						{
							setState(445);
							declarator();
						}
					}

					setState(448);
					match(Colon);
					setState(449);
					constantExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() {
			return getToken(ArgCParser.Enum, 0);
		}

		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
		}

		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumSpecifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterEnumSpecifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumSpecifier);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(452);
					match(Enum);
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(453);
							match(Identifier);
						}
					}

					setState(456);
					match(LeftBrace);
					setState(457);
					enumeratorList();
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(458);
							match(Comma);
						}
					}

					setState(461);
					match(RightBrace);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(463);
					match(Enum);
					setState(464);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}

		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumeratorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterEnumeratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(467);
				enumerator();
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(468);
								match(Comma);
								setState(469);
								enumerator();
							}
						}
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class, 0);
		}

		public TerminalNode Assign() {
			return getToken(ArgCParser.Assign, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumerator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterEnumerator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(475);
				enumerationConstant();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Assign) {
					{
						setState(476);
						match(Assign);
						setState(477);
						constantExpression();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumerationConstant;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterEnumerationConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(480);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() {
			return getToken(ArgCParser.Const, 0);
		}

		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeQualifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTypeQualifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(482);
				match(Const);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class, 0);
		}

		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(484);
				directDeclarator(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public TerminalNode DigitSequence() {
			return getToken(ArgCParser.DigitSequence, 0);
		}

		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class, 0);
		}

		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class, 0);
		}

		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class, 0);
		}

		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_directDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDirectDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(495);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
					case 1: {
						setState(487);
						match(Identifier);
					}
					break;
					case 2: {
						setState(488);
						match(LeftParen);
						setState(489);
						declarator();
						setState(490);
						match(RightParen);
					}
					break;
					case 3: {
						setState(492);
						match(Identifier);
						setState(493);
						match(Colon);
						setState(494);
						match(DigitSequence);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(508);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
								case 1: {
									_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
									setState(497);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(498);
									match(LeftParen);
									setState(499);
									parameterTypeList();
									setState(500);
									match(RightParen);
								}
								break;
								case 2: {
									_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
									setState(502);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(503);
									match(LeftParen);
									setState(505);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la == Identifier) {
										{
											setState(504);
											identifierList();
										}
									}

									setState(507);
									match(RightParen);
								}
								break;
							}
						}
					}
					setState(512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() {
			return getTokens(ArgCParser.LeftParen);
		}

		public TerminalNode LeftParen(int i) {
			return getToken(ArgCParser.LeftParen, i);
		}

		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}

		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class, i);
		}

		public List<TerminalNode> RightParen() {
			return getTokens(ArgCParser.RightParen);
		}

		public TerminalNode RightParen(int i) {
			return getToken(ArgCParser.RightParen, i);
		}

		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_nestedParenthesesBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterNestedParenthesesBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Less) | (1L << LessEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
					{
						setState(518);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case T__0:
							case T__1:
							case T__2:
							case T__3:
							case T__4:
							case T__5:
							case T__6:
							case T__7:
							case T__8:
							case T__9:
							case T__10:
							case Auto:
							case Break:
							case Case:
							case Char:
							case Const:
							case Continue:
							case Default:
							case Do:
							case Double:
							case Else:
							case Enum:
							case Extern:
							case Float:
							case For:
							case Goto:
							case If:
							case Inline:
							case Int:
							case Long:
							case Register:
							case Restrict:
							case Return:
							case Short:
							case Signed:
							case Sizeof:
							case Static:
							case Struct:
							case Switch:
							case Typedef:
							case Union:
							case Unsigned:
							case Void:
							case Volatile:
							case While:
							case Alignas:
							case Alignof:
							case Atomic:
							case Bool:
							case Complex:
							case Generic:
							case Imaginary:
							case Noreturn:
							case StaticAssert:
							case ThreadLocal:
							case LeftBracket:
							case RightBracket:
							case LeftBrace:
							case RightBrace:
							case Less:
							case LessEqual:
							case Greater:
							case GreaterEqual:
							case LeftShift:
							case RightShift:
							case Plus:
							case PlusPlus:
							case Minus:
							case MinusMinus:
							case Star:
							case Div:
							case Mod:
							case And:
							case Or:
							case AndAnd:
							case OrOr:
							case Caret:
							case Not:
							case Tilde:
							case Question:
							case Colon:
							case Semi:
							case Comma:
							case Assign:
							case StarAssign:
							case DivAssign:
							case ModAssign:
							case PlusAssign:
							case MinusAssign:
							case LeftShiftAssign:
							case RightShiftAssign:
							case AndAssign:
							case XorAssign:
							case OrAssign:
							case Equal:
							case NotEqual:
							case Arrow:
							case Dot:
							case Ellipsis:
							case Identifier:
							case Constant:
							case DigitSequence:
							case StringLiteral:
							case ComplexDefine:
							case IncludeDirective:
							case AsmBlock:
							case LineAfterPreprocessing:
							case LineDirective:
							case PragmaDirective:
							case Whitespace:
							case Newline:
							case BlockComment:
							case LineComment: {
								setState(513);
								_la = _input.LA(1);
								if (_la <= 0 || (_la == LeftParen || _la == RightParen)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
							break;
							case LeftParen: {
								setState(514);
								match(LeftParen);
								setState(515);
								nestedParenthesesBlock();
								setState(516);
								match(RightParen);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}

		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class, i);
		}

		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeQualifierList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTypeQualifierList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(523);
							typeQualifier();
						}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == Const);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class, 0);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
		}

		public TerminalNode Ellipsis() {
			return getToken(ArgCParser.Ellipsis, 0);
		}

		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameterTypeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterParameterTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(528);
				parameterList();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Comma) {
					{
						setState(529);
						match(Comma);
						setState(530);
						match(Ellipsis);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}

		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(533);
				parameterDeclaration();
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(534);
								match(Comma);
								setState(535);
								parameterDeclaration();
							}
						}
					}
					setState(540);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class, 0);
		}

		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class, 0);
		}

		public TerminalNode And() {
			return getToken(ArgCParser.And, 0);
		}

		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameterDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterParameterDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(541);
				declarationSpecifiers();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == And) {
					{
						setState(542);
						match(And);
					}
				}

				setState(545);
				declarator();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(ArgCParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(ArgCParser.Identifier, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_identifierList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterIdentifierList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(547);
				match(Identifier);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(548);
							match(Comma);
							setState(549);
							match(Identifier);
						}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class, 0);
		}

		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(555);
				specifierQualifierList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typedefName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterTypedefName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(557);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class, 0);
		}

		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
		}

		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_initializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_initializer);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(559);
					assignmentExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(560);
					match(LeftBrace);
					setState(561);
					initializerList();
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(562);
							match(Comma);
						}
					}

					setState(565);
					match(RightBrace);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}

		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class, i);
		}

		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}

		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_initializerList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInitializerList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftBracket || _la == Dot) {
					{
						setState(569);
						designation();
					}
				}

				setState(572);
				initializer();
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 65, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(573);
								match(Comma);
								setState(575);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LeftBracket || _la == Dot) {
									{
										setState(574);
										designation();
									}
								}

								setState(577);
								initializer();
							}
						}
					}
					setState(582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 65, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class, 0);
		}

		public TerminalNode Assign() {
			return getToken(ArgCParser.Assign, 0);
		}

		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_designation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDesignation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(583);
				designatorList();
				setState(584);
				match(Assign);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}

		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class, i);
		}

		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_designatorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDesignatorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(586);
							designator();
						}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == LeftBracket || _la == Dot);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() {
			return getToken(ArgCParser.LeftBracket, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public TerminalNode RightBracket() {
			return getToken(ArgCParser.RightBracket, 0);
		}

		public TerminalNode Dot() {
			return getToken(ArgCParser.Dot, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_designator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDesignator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_designator);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LeftBracket:
					enterOuterAlt(_localctx, 1);
				{
					setState(591);
					match(LeftBracket);
					setState(592);
					constantExpression();
					setState(593);
					match(RightBracket);
				}
				break;
				case Dot:
					enterOuterAlt(_localctx, 2);
				{
					setState(595);
					match(Dot);
					setState(596);
					match(Identifier);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class, 0);
		}

		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class, 0);
		}

		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class, 0);
		}

		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class, 0);
		}

		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class, 0);
		}

		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_statement);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(599);
					labeledStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(600);
					compoundStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(601);
					expressionStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(602);
					selectionStatement();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(603);
					iterationStatement();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(604);
					jumpStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode Case() {
			return getToken(ArgCParser.Case, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public TerminalNode Default() {
			return getToken(ArgCParser.Default, 0);
		}

		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labeledStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterLabeledStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_labeledStatement);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(607);
					match(Identifier);
					setState(608);
					match(Colon);
					setState(609);
					statement();
				}
				break;
				case Case:
					enterOuterAlt(_localctx, 2);
				{
					setState(610);
					match(Case);
					setState(611);
					constantExpression();
					setState(612);
					match(Colon);
					setState(613);
					statement();
				}
				break;
				case Default:
					enterOuterAlt(_localctx, 3);
				{
					setState(615);
					match(Default);
					setState(616);
					match(Colon);
					setState(617);
					statement();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class, 0);
		}

		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compoundStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterCompoundStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(620);
				match(LeftBrace);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Semi - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
						setState(621);
						blockItemList();
					}
				}

				setState(624);
				match(RightBrace);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}

		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class, i);
		}

		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockItemList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterBlockItemList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(626);
							blockItem();
						}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Semi - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class, 0);
		}

		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterBlockItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockItem);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(631);
					statement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(632);
					declaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterExpressionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
						setState(635);
						expression();
					}
				}

				setState(638);
				match(Semi);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() {
			return getToken(ArgCParser.If, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public TerminalNode Else() {
			return getToken(ArgCParser.Else, 0);
		}

		public TerminalNode Switch() {
			return getToken(ArgCParser.Switch, 0);
		}

		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectionStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterSelectionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_selectionStatement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case If:
					enterOuterAlt(_localctx, 1);
				{
					setState(640);
					match(If);
					setState(641);
					match(LeftParen);
					setState(642);
					expression();
					setState(643);
					match(RightParen);
					setState(644);
					statement();
					setState(647);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
						case 1: {
							setState(645);
							match(Else);
							setState(646);
							statement();
						}
						break;
					}
				}
				break;
				case Switch:
					enterOuterAlt(_localctx, 2);
				{
					setState(649);
					match(Switch);
					setState(650);
					match(LeftParen);
					setState(651);
					expression();
					setState(652);
					match(RightParen);
					setState(653);
					statement();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() {
			return getToken(ArgCParser.While, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode Do() {
			return getToken(ArgCParser.Do, 0);
		}

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public TerminalNode For() {
			return getToken(ArgCParser.For, 0);
		}

		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class, 0);
		}

		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_iterationStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterIterationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_iterationStatement);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case While:
					enterOuterAlt(_localctx, 1);
				{
					setState(657);
					match(While);
					setState(658);
					match(LeftParen);
					setState(659);
					expression();
					setState(660);
					match(RightParen);
					setState(661);
					statement();
				}
				break;
				case Do:
					enterOuterAlt(_localctx, 2);
				{
					setState(663);
					match(Do);
					setState(664);
					statement();
					setState(665);
					match(While);
					setState(666);
					match(LeftParen);
					setState(667);
					expression();
					setState(668);
					match(RightParen);
					setState(669);
					match(Semi);
				}
				break;
				case For:
					enterOuterAlt(_localctx, 3);
				{
					setState(671);
					match(For);
					setState(672);
					match(LeftParen);
					setState(673);
					forCondition();
					setState(674);
					match(RightParen);
					setState(675);
					statement();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() {
			return getTokens(ArgCParser.Semi);
		}

		public TerminalNode Semi(int i) {
			return getToken(ArgCParser.Semi, i);
		}

		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class, 0);
		}

		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}

		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class, i);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forCondition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterForCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitForCondition(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(683);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
					case 1: {
						setState(679);
						forDeclaration();
					}
					break;
					case 2: {
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
								setState(680);
								expression();
							}
						}

					}
					break;
				}
				setState(685);
				match(Semi);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
						setState(686);
						forExpression();
					}
				}

				setState(689);
				match(Semi);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
						setState(690);
						forExpression();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class, 0);
		}

		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class, 0);
		}

		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterForDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitForDeclaration(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(693);
				declarationSpecifiers();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftParen || _la == Identifier) {
					{
						setState(694);
						initDeclaratorList();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}

		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class, i);
		}

		public List<TerminalNode> Comma() {
			return getTokens(ArgCParser.Comma);
		}

		public TerminalNode Comma(int i) {
			return getToken(ArgCParser.Comma, i);
		}

		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterForExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(697);
				assignmentExpression();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(698);
							match(Comma);
							setState(699);
							assignmentExpression();
						}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public TerminalNode Continue() {
			return getToken(ArgCParser.Continue, 0);
		}

		public TerminalNode Break() {
			return getToken(ArgCParser.Break, 0);
		}

		public TerminalNode Return() {
			return getToken(ArgCParser.Return, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jumpStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterJumpStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(711);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Continue: {
						setState(705);
						match(Continue);
					}
					break;
					case Break: {
						setState(706);
						match(Break);
					}
					break;
					case Return: {
						setState(707);
						match(Return);
						setState(709);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
								setState(708);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(713);
				match(Semi);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 47:
				return directDeclarator_sempred((DirectDeclaratorContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 3);
			case 1:
				return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u02ce\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
					"\tI\4J\tJ\3\2\5\2\u0096\n\2\3\2\3\2\3\3\6\3\u009b\n\3\r\3\16\3\u009c\3" +
					"\4\3\4\3\4\5\4\u00a2\n\4\3\5\5\5\u00a5\n\5\3\5\3\5\5\5\u00a9\n\5\3\5\3" +
					"\5\3\6\6\6\u00ae\n\6\r\6\16\6\u00af\3\7\3\7\3\7\6\7\u00b5\n\7\r\7\16\7" +
					"\u00b6\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\b\3\b\3\b\3\b\5\b\u00c3\n\b\3\b" +
					"\3\b\5\b\u00c7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\b\3\b\3\b\3" +
					"\b\7\b\u00d5\n\b\f\b\16\b\u00d8\13\b\3\t\3\t\3\t\7\t\u00dd\n\t\f\t\16" +
					"\t\u00e0\13\t\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\3\n\3\n\3\n\3\n\3" +
					"\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\13\3\13\3\f\3\f\5\f\u00f7\n\f\3\r\3" +
					"\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\16\3\16\3\16\7\16\u0104\n\16" +
					"\f\16\16\16\u0107\13\16\3\17\3\17\3\17\7\17\u010c\n\17\f\17\16\17\u010f" +
					"\13\17\3\20\3\20\3\20\7\20\u0114\n\20\f\20\16\20\u0117\13\20\3\21\3\21" +
					"\3\21\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\22\3\22\3\22\7\22\u0124" +
					"\n\22\f\22\16\22\u0127\13\22\3\23\3\23\3\23\7\23\u012c\n\23\f\23\16\23" +
					"\u012f\13\23\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16\24\u0137\13\24\3\25" +
					"\3\25\3\25\7\25\u013c\n\25\f\25\16\25\u013f\13\25\3\26\3\26\3\26\7\26" +
					"\u0144\n\26\f\26\16\26\u0147\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27" +
					"\u014f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0157\n\30\3\31\3\31\3" +
					"\32\3\32\3\32\7\32\u015e\n\32\f\32\16\32\u0161\13\32\3\33\3\33\3\34\3" +
					"\34\5\34\u0167\n\34\3\34\3\34\3\35\6\35\u016c\n\35\r\35\16\35\u016d\3" +
					"\36\3\36\3\36\5\36\u0173\n\36\3\37\3\37\3\37\7\37\u0178\n\37\f\37\16\37" +
					"\u017b\13\37\3 \3 \3 \5 \u0180\n \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3" +
					"#\3#\3#\3#\3#\3#\3#\5#\u0194\n#\3$\3$\5$\u0198\n$\3$\3$\3$\3$\3$\3$\3" +
					"$\5$\u01a1\n$\3%\3%\3&\6&\u01a6\n&\r&\16&\u01a7\3\'\3\'\5\'\u01ac\n\'" +
					"\3\'\3\'\3(\3(\5(\u01b2\n(\3(\5(\u01b5\n(\3)\3)\3)\7)\u01ba\n)\f)\16)" +
					"\u01bd\13)\3*\3*\5*\u01c1\n*\3*\3*\5*\u01c5\n*\3+\3+\5+\u01c9\n+\3+\3" +
					"+\3+\5+\u01ce\n+\3+\3+\3+\3+\5+\u01d4\n+\3,\3,\3,\7,\u01d9\n,\f,\16,\u01dc" +
					"\13,\3-\3-\3-\5-\u01e1\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3" +
					"\61\3\61\3\61\3\61\3\61\5\61\u01f2\n\61\3\61\3\61\3\61\3\61\3\61\3\61" +
					"\3\61\3\61\5\61\u01fc\n\61\3\61\7\61\u01ff\n\61\f\61\16\61\u0202\13\61" +
					"\3\62\3\62\3\62\3\62\3\62\7\62\u0209\n\62\f\62\16\62\u020c\13\62\3\63" +
					"\6\63\u020f\n\63\r\63\16\63\u0210\3\64\3\64\3\64\5\64\u0216\n\64\3\65" +
					"\3\65\3\65\7\65\u021b\n\65\f\65\16\65\u021e\13\65\3\66\3\66\5\66\u0222" +
					"\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u0229\n\67\f\67\16\67\u022c\13\67" +
					"\38\38\39\39\3:\3:\3:\3:\5:\u0236\n:\3:\3:\5:\u023a\n:\3;\5;\u023d\n;" +
					"\3;\3;\3;\5;\u0242\n;\3;\7;\u0245\n;\f;\16;\u0248\13;\3<\3<\3<\3=\6=\u024e" +
					"\n=\r=\16=\u024f\3>\3>\3>\3>\3>\3>\5>\u0258\n>\3?\3?\3?\3?\3?\3?\5?\u0260" +
					"\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u026d\n@\3A\3A\5A\u0271\nA\3A" +
					"\3A\3B\6B\u0276\nB\rB\16B\u0277\3C\3C\5C\u027c\nC\3D\5D\u027f\nD\3D\3" +
					"D\3E\3E\3E\3E\3E\3E\3E\5E\u028a\nE\3E\3E\3E\3E\3E\3E\5E\u0292\nE\3F\3" +
					"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u02a8\nF\3" +
					"G\3G\5G\u02ac\nG\5G\u02ae\nG\3G\3G\5G\u02b2\nG\3G\3G\5G\u02b6\nG\3H\3" +
					"H\5H\u02ba\nH\3I\3I\3I\7I\u02bf\nI\fI\16I\u02c2\13I\3J\3J\3J\3J\5J\u02c8" +
					"\nJ\5J\u02ca\nJ\3J\3J\3J\2\3`K\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
					" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
					"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2\20\3\2ef\4\2GGII\5" +
					"\2&&GGII\5\2FFHHRS\3\2JL\4\2FFHH\3\2DE\3\2@C\3\2cd\3\2Xb\4\2\'\'**\4\2" +
					"\3\13--\4\2((++\3\2:;\2\u02ed\2\u0095\3\2\2\2\4\u009a\3\2\2\2\6\u00a1" +
					"\3\2\2\2\b\u00a4\3\2\2\2\n\u00ad\3\2\2\2\f\u00bc\3\2\2\2\16\u00c6\3\2" +
					"\2\2\20\u00d9\3\2\2\2\22\u00e4\3\2\2\2\24\u00f2\3\2\2\2\26\u00f6\3\2\2" +
					"\2\30\u00f8\3\2\2\2\32\u0100\3\2\2\2\34\u0108\3\2\2\2\36\u0110\3\2\2\2" +
					" \u0118\3\2\2\2\"\u0120\3\2\2\2$\u0128\3\2\2\2&\u0130\3\2\2\2(\u0138\3" +
					"\2\2\2*\u0140\3\2\2\2,\u0148\3\2\2\2.\u0156\3\2\2\2\60\u0158\3\2\2\2\62" +
					"\u015a\3\2\2\2\64\u0162\3\2\2\2\66\u0164\3\2\2\28\u016b\3\2\2\2:\u0172" +
					"\3\2\2\2<\u0174\3\2\2\2>\u017c\3\2\2\2@\u0181\3\2\2\2B\u0183\3\2\2\2D" +
					"\u0193\3\2\2\2F\u01a0\3\2\2\2H\u01a2\3\2\2\2J\u01a5\3\2\2\2L\u01a9\3\2" +
					"\2\2N\u01b1\3\2\2\2P\u01b6\3\2\2\2R\u01c4\3\2\2\2T\u01d3\3\2\2\2V\u01d5" +
					"\3\2\2\2X\u01dd\3\2\2\2Z\u01e2\3\2\2\2\\\u01e4\3\2\2\2^\u01e6\3\2\2\2" +
					"`\u01f1\3\2\2\2b\u020a\3\2\2\2d\u020e\3\2\2\2f\u0212\3\2\2\2h\u0217\3" +
					"\2\2\2j\u021f\3\2\2\2l\u0225\3\2\2\2n\u022d\3\2\2\2p\u022f\3\2\2\2r\u0239" +
					"\3\2\2\2t\u023c\3\2\2\2v\u0249\3\2\2\2x\u024d\3\2\2\2z\u0257\3\2\2\2|" +
					"\u025f\3\2\2\2~\u026c\3\2\2\2\u0080\u026e\3\2\2\2\u0082\u0275\3\2\2\2" +
					"\u0084\u027b\3\2\2\2\u0086\u027e\3\2\2\2\u0088\u0291\3\2\2\2\u008a\u02a7" +
					"\3\2\2\2\u008c\u02ad\3\2\2\2\u008e\u02b7\3\2\2\2\u0090\u02bb\3\2\2\2\u0092" +
					"\u02c9\3\2\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2" +
					"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\2\2\3\u0098\3\3\2\2\2\u0099\u009b" +
					"\5\6\4\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c" +
					"\u009d\3\2\2\2\u009d\5\3\2\2\2\u009e\u00a2\5\b\5\2\u009f\u00a2\5\66\34" +
					"\2\u00a0\u00a2\7V\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0" +
					"\3\2\2\2\u00a2\7\3\2\2\2\u00a3\u00a5\5B\"\2\u00a4\u00a3\3\2\2\2\u00a4" +
					"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\5^\60\2\u00a7\u00a9\5\n" +
					"\6\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa" +
					"\u00ab\5\u0080A\2\u00ab\t\3\2\2\2\u00ac\u00ae\5\66\34\2\u00ad\u00ac\3" +
					"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0" +
					"\13\3\2\2\2\u00b1\u00bd\7h\2\2\u00b2\u00bd\7i\2\2\u00b3\u00b5\7k\2\2\u00b4" +
					"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2" +
					"\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\7:\2\2\u00b9\u00ba\5\62\32\2\u00ba" +
					"\u00bb\7;\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b2\3\2" +
					"\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00c7" +
					"\5\f\7\2\u00bf\u00c0\7>\2\2\u00c0\u00c2\5t;\2\u00c1\u00c3\7W\2\2\u00c2" +
					"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7?" +
					"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7" +
					"\u00d6\3\2\2\2\u00c8\u00c9\7<\2\2\u00c9\u00ca\5\62\32\2\u00ca\u00cb\7" +
					"=\2\2\u00cb\u00d5\3\2\2\2\u00cc\u00ce\7:\2\2\u00cd\u00cf\5\20\t\2\u00ce" +
					"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d5\7;" +
					"\2\2\u00d1\u00d2\t\2\2\2\u00d2\u00d5\7h\2\2\u00d3\u00d5\t\3\2\2\u00d4" +
					"\u00c8\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2" +
					"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7" +
					"\17\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\5.\30\2\u00da\u00db\7W\2\2" +
					"\u00db\u00dd\5.\30\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc" +
					"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\21\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1" +
					"\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2" +
					"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f0\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7" +
					"\u00f1\5\16\b\2\u00e8\u00e9\5\24\13\2\u00e9\u00ea\5\26\f\2\u00ea\u00f1" +
					"\3\2\2\2\u00eb\u00ec\7&\2\2\u00ec\u00ed\7:\2\2\u00ed\u00ee\5n8\2\u00ee" +
					"\u00ef\7;\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e8\3\2" +
					"\2\2\u00f0\u00eb\3\2\2\2\u00f1\23\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3\25" +
					"\3\2\2\2\u00f4\u00f7\5\22\n\2\u00f5\u00f7\7j\2\2\u00f6\u00f4\3\2\2\2\u00f6" +
					"\u00f5\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00fd\5\26\f\2\u00f9\u00fa\t\6\2" +
					"\2\u00fa\u00fc\5\26\f\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd" +
					"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u00fd\3\2\2" +
					"\2\u0100\u0105\5\30\r\2\u0101\u0102\t\7\2\2\u0102\u0104\5\30\r\2\u0103" +
					"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2" +
					"\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5\32\16\2\u0109" +
					"\u010a\t\b\2\2\u010a\u010c\5\32\16\2\u010b\u0109\3\2\2\2\u010c\u010f\3" +
					"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\35\3\2\2\2\u010f" +
					"\u010d\3\2\2\2\u0110\u0115\5\34\17\2\u0111\u0112\t\t\2\2\u0112\u0114\5" +
					"\34\17\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115" +
					"\u0116\3\2\2\2\u0116\37\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011d\5\36\20" +
					"\2\u0119\u011a\t\n\2\2\u011a\u011c\5\36\20\2\u011b\u0119\3\2\2\2\u011c" +
					"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e!\3\2\2\2" +
					"\u011f\u011d\3\2\2\2\u0120\u0125\5 \21\2\u0121\u0122\7M\2\2\u0122\u0124" +
					"\5 \21\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125" +
					"\u0126\3\2\2\2\u0126#\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012d\5\"\22\2" +
					"\u0129\u012a\7Q\2\2\u012a\u012c\5\"\22\2\u012b\u0129\3\2\2\2\u012c\u012f" +
					"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e%\3\2\2\2\u012f" +
					"\u012d\3\2\2\2\u0130\u0135\5$\23\2\u0131\u0132\7N\2\2\u0132\u0134\5$\23" +
					"\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136" +
					"\3\2\2\2\u0136\'\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013d\5&\24\2\u0139" +
					"\u013a\7O\2\2\u013a\u013c\5&\24\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2" +
					"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e)\3\2\2\2\u013f\u013d" +
					"\3\2\2\2\u0140\u0145\5(\25\2\u0141\u0142\7P\2\2\u0142\u0144\5(\25\2\u0143" +
					"\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2" +
					"\2\2\u0146+\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014e\5*\26\2\u0149\u014a" +
					"\7T\2\2\u014a\u014b\5\62\32\2\u014b\u014c\7U\2\2\u014c\u014d\5,\27\2\u014d" +
					"\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014f\3\2\2\2\u014f-\3\2\2\2" +
					"\u0150\u0157\5,\27\2\u0151\u0152\5\22\n\2\u0152\u0153\5\60\31\2\u0153" +
					"\u0154\5.\30\2\u0154\u0157\3\2\2\2\u0155\u0157\7j\2\2\u0156\u0150\3\2" +
					"\2\2\u0156\u0151\3\2\2\2\u0156\u0155\3\2\2\2\u0157/\3\2\2\2\u0158\u0159" +
					"\t\13\2\2\u0159\61\3\2\2\2\u015a\u015f\5.\30\2\u015b\u015c\7W\2\2\u015c" +
					"\u015e\5.\30\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2" +
					"\2\2\u015f\u0160\3\2\2\2\u0160\63\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163" +
					"\5,\27\2\u0163\65\3\2\2\2\u0164\u0166\58\35\2\u0165\u0167\5<\37\2\u0166" +
					"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7V" +
					"\2\2\u0169\67\3\2\2\2\u016a\u016c\5:\36\2\u016b\u016a\3\2\2\2\u016c\u016d" +
					"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e9\3\2\2\2\u016f" +
					"\u0173\5@!\2\u0170\u0173\5D#\2\u0171\u0173\5\\/\2\u0172\u016f\3\2\2\2" +
					"\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173;\3\2\2\2\u0174\u0179\5" +
					"> \2\u0175\u0176\7W\2\2\u0176\u0178\5> \2\u0177\u0175\3\2\2\2\u0178\u017b" +
					"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a=\3\2\2\2\u017b" +
					"\u0179\3\2\2\2\u017c\u017f\5^\60\2\u017d\u017e\7X\2\2\u017e\u0180\5r:" +
					"\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180?\3\2\2\2\u0181\u0182" +
					"\t\f\2\2\u0182A\3\2\2\2\u0183\u0184\t\r\2\2\u0184C\3\2\2\2\u0185\u0194" +
					"\5B\"\2\u0186\u0194\5F$\2\u0187\u0194\5T+\2\u0188\u0194\5p9\2\u0189\u018a" +
					"\7\f\2\2\u018a\u018b\7@\2\2\u018b\u018c\5B\"\2\u018c\u018d\7W\2\2\u018d" +
					"\u018e\7i\2\2\u018e\u018f\7B\2\2\u018f\u0194\3\2\2\2\u0190\u0191\7\r\2" +
					"\2\u0191\u0192\7i\2\2\u0192\u0194\7B\2\2\u0193\u0185\3\2\2\2\u0193\u0186" +
					"\3\2\2\2\u0193\u0187\3\2\2\2\u0193\u0188\3\2\2\2\u0193\u0189\3\2\2\2\u0193" +
					"\u0190\3\2\2\2\u0194E\3\2\2\2\u0195\u0197\5H%\2\u0196\u0198\7h\2\2\u0197" +
					"\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7>" +
					"\2\2\u019a\u019b\5J&\2\u019b\u019c\7?\2\2\u019c\u01a1\3\2\2\2\u019d\u019e" +
					"\5H%\2\u019e\u019f\7h\2\2\u019f\u01a1\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0" +
					"\u019d\3\2\2\2\u01a1G\3\2\2\2\u01a2\u01a3\t\16\2\2\u01a3I\3\2\2\2\u01a4" +
					"\u01a6\5L\'\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2" +
					"\2\2\u01a7\u01a8\3\2\2\2\u01a8K\3\2\2\2\u01a9\u01ab\5N(\2\u01aa\u01ac" +
					"\5P)\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad" +
					"\u01ae\7V\2\2\u01aeM\3\2\2\2\u01af\u01b2\5D#\2\u01b0\u01b2\5\\/\2\u01b1" +
					"\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5N" +
					"(\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5O\3\2\2\2\u01b6\u01bb" +
					"\5R*\2\u01b7\u01b8\7W\2\2\u01b8\u01ba\5R*\2\u01b9\u01b7\3\2\2\2\u01ba" +
					"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcQ\3\2\2\2" +
					"\u01bd\u01bb\3\2\2\2\u01be\u01c5\5^\60\2\u01bf\u01c1\5^\60\2\u01c0\u01bf" +
					"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7U\2\2\u01c3" +
					"\u01c5\5\64\33\2\u01c4\u01be\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5S\3\2\2" +
					"\2\u01c6\u01c8\7\30\2\2\u01c7\u01c9\7h\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9" +
					"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7>\2\2\u01cb\u01cd\5V,\2\u01cc" +
					"\u01ce\7W\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2" +
					"\2\2\u01cf\u01d0\7?\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01d2\7\30\2\2\u01d2" +
					"\u01d4\7h\2\2\u01d3\u01c6\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4U\3\2\2\2\u01d5" +
					"\u01da\5X-\2\u01d6\u01d7\7W\2\2\u01d7\u01d9\5X-\2\u01d8\u01d6\3\2\2\2" +
					"\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbW\3" +
					"\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\5Z.\2\u01de\u01df\7X\2\2\u01df" +
					"\u01e1\5\64\33\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1Y\3\2\2" +
					"\2\u01e2\u01e3\7h\2\2\u01e3[\3\2\2\2\u01e4\u01e5\7\22\2\2\u01e5]\3\2\2" +
					"\2\u01e6\u01e7\5`\61\2\u01e7_\3\2\2\2\u01e8\u01e9\b\61\1\2\u01e9\u01f2" +
					"\7h\2\2\u01ea\u01eb\7:\2\2\u01eb\u01ec\5^\60\2\u01ec\u01ed\7;\2\2\u01ed" +
					"\u01f2\3\2\2\2\u01ee\u01ef\7h\2\2\u01ef\u01f0\7U\2\2\u01f0\u01f2\7j\2" +
					"\2\u01f1\u01e8\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f2\u0200" +
					"\3\2\2\2\u01f3\u01f4\f\5\2\2\u01f4\u01f5\7:\2\2\u01f5\u01f6\5f\64\2\u01f6" +
					"\u01f7\7;\2\2\u01f7\u01ff\3\2\2\2\u01f8\u01f9\f\4\2\2\u01f9\u01fb\7:\2" +
					"\2\u01fa\u01fc\5l\67\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd" +
					"\3\2\2\2\u01fd\u01ff\7;\2\2\u01fe\u01f3\3\2\2\2\u01fe\u01f8\3\2\2\2\u01ff" +
					"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201a\3\2\2\2" +
					"\u0202\u0200\3\2\2\2\u0203\u0209\n\17\2\2\u0204\u0205\7:\2\2\u0205\u0206" +
					"\5b\62\2\u0206\u0207\7;\2\2\u0207\u0209\3\2\2\2\u0208\u0203\3\2\2\2\u0208" +
					"\u0204\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2" +
					"\2\2\u020bc\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\5\\/\2\u020e\u020d" +
					"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211" +
					"e\3\2\2\2\u0212\u0215\5h\65\2\u0213\u0214\7W\2\2\u0214\u0216\7g\2\2\u0215" +
					"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216g\3\2\2\2\u0217\u021c\5j\66\2" +
					"\u0218\u0219\7W\2\2\u0219\u021b\5j\66\2\u021a\u0218\3\2\2\2\u021b\u021e" +
					"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021di\3\2\2\2\u021e" +
					"\u021c\3\2\2\2\u021f\u0221\58\35\2\u0220\u0222\7M\2\2\u0221\u0220\3\2" +
					"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5^\60\2\u0224" +
					"k\3\2\2\2\u0225\u022a\7h\2\2\u0226\u0227\7W\2\2\u0227\u0229\7h\2\2\u0228" +
					"\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2" +
					"\2\2\u022bm\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\5N(\2\u022eo\3\2\2" +
					"\2\u022f\u0230\7h\2\2\u0230q\3\2\2\2\u0231\u023a\5.\30\2\u0232\u0233\7" +
					">\2\2\u0233\u0235\5t;\2\u0234\u0236\7W\2\2\u0235\u0234\3\2\2\2\u0235\u0236" +
					"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7?\2\2\u0238\u023a\3\2\2\2\u0239" +
					"\u0231\3\2\2\2\u0239\u0232\3\2\2\2\u023as\3\2\2\2\u023b\u023d\5v<\2\u023c" +
					"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0246\5r" +
					":\2\u023f\u0241\7W\2\2\u0240\u0242\5v<\2\u0241\u0240\3\2\2\2\u0241\u0242" +
					"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\5r:\2\u0244\u023f\3\2\2\2\u0245" +
					"\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247u\3\2\2\2" +
					"\u0248\u0246\3\2\2\2\u0249\u024a\5x=\2\u024a\u024b\7X\2\2\u024bw\3\2\2" +
					"\2\u024c\u024e\5z>\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d" +
					"\3\2\2\2\u024f\u0250\3\2\2\2\u0250y\3\2\2\2\u0251\u0252\7<\2\2\u0252\u0253" +
					"\5\64\33\2\u0253\u0254\7=\2\2\u0254\u0258\3\2\2\2\u0255\u0256\7f\2\2\u0256" +
					"\u0258\7h\2\2\u0257\u0251\3\2\2\2\u0257\u0255\3\2\2\2\u0258{\3\2\2\2\u0259" +
					"\u0260\5~@\2\u025a\u0260\5\u0080A\2\u025b\u0260\5\u0086D\2\u025c\u0260" +
					"\5\u0088E\2\u025d\u0260\5\u008aF\2\u025e\u0260\5\u0092J\2\u025f\u0259" +
					"\3\2\2\2\u025f\u025a\3\2\2\2\u025f\u025b\3\2\2\2\u025f\u025c\3\2\2\2\u025f" +
					"\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260}\3\2\2\2\u0261\u0262\7h\2\2\u0262" +
					"\u0263\7U\2\2\u0263\u026d\5|?\2\u0264\u0265\7\20\2\2\u0265\u0266\5\64" +
					"\33\2\u0266\u0267\7U\2\2\u0267\u0268\5|?\2\u0268\u026d\3\2\2\2\u0269\u026a" +
					"\7\24\2\2\u026a\u026b\7U\2\2\u026b\u026d\5|?\2\u026c\u0261\3\2\2\2\u026c" +
					"\u0264\3\2\2\2\u026c\u0269\3\2\2\2\u026d\177\3\2\2\2\u026e\u0270\7>\2" +
					"\2\u026f\u0271\5\u0082B\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271" +
					"\u0272\3\2\2\2\u0272\u0273\7?\2\2\u0273\u0081\3\2\2\2\u0274\u0276\5\u0084" +
					"C\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277" +
					"\u0278\3\2\2\2\u0278\u0083\3\2\2\2\u0279\u027c\5|?\2\u027a\u027c\5\66" +
					"\34\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c\u0085\3\2\2\2\u027d" +
					"\u027f\5\62\32\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3" +
					"\2\2\2\u0280\u0281\7V\2\2\u0281\u0087\3\2\2\2\u0282\u0283\7\35\2\2\u0283" +
					"\u0284\7:\2\2\u0284\u0285\5\62\32\2\u0285\u0286\7;\2\2\u0286\u0289\5|" +
					"?\2\u0287\u0288\7\27\2\2\u0288\u028a\5|?\2\u0289\u0287\3\2\2\2\u0289\u028a" +
					"\3\2\2\2\u028a\u0292\3\2\2\2\u028b\u028c\7)\2\2\u028c\u028d\7:\2\2\u028d" +
					"\u028e\5\62\32\2\u028e\u028f\7;\2\2\u028f\u0290\5|?\2\u0290\u0292\3\2" +
					"\2\2\u0291\u0282\3\2\2\2\u0291\u028b\3\2\2\2\u0292\u0089\3\2\2\2\u0293" +
					"\u0294\7/\2\2\u0294\u0295\7:\2\2\u0295\u0296\5\62\32\2\u0296\u0297\7;" +
					"\2\2\u0297\u0298\5|?\2\u0298\u02a8\3\2\2\2\u0299\u029a\7\25\2\2\u029a" +
					"\u029b\5|?\2\u029b\u029c\7/\2\2\u029c\u029d\7:\2\2\u029d\u029e\5\62\32" +
					"\2\u029e\u029f\7;\2\2\u029f\u02a0\7V\2\2\u02a0\u02a8\3\2\2\2\u02a1\u02a2" +
					"\7\33\2\2\u02a2\u02a3\7:\2\2\u02a3\u02a4\5\u008cG\2\u02a4\u02a5\7;\2\2" +
					"\u02a5\u02a6\5|?\2\u02a6\u02a8\3\2\2\2\u02a7\u0293\3\2\2\2\u02a7\u0299" +
					"\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a8\u008b\3\2\2\2\u02a9\u02ae\5\u008eH" +
					"\2\u02aa\u02ac\5\62\32\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac" +
					"\u02ae\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\3\2" +
					"\2\2\u02af\u02b1\7V\2\2\u02b0\u02b2\5\u0090I\2\u02b1\u02b0\3\2\2\2\u02b1" +
					"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\7V\2\2\u02b4\u02b6\5\u0090" +
					"I\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u008d\3\2\2\2\u02b7" +
					"\u02b9\58\35\2\u02b8\u02ba\5<\37\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2" +
					"\2\2\u02ba\u008f\3\2\2\2\u02bb\u02c0\5.\30\2\u02bc\u02bd\7W\2\2\u02bd" +
					"\u02bf\5.\30\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2" +
					"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u0091\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3" +
					"\u02ca\7\23\2\2\u02c4\u02ca\7\17\2\2\u02c5\u02c7\7#\2\2\u02c6\u02c8\5" +
					"\62\32\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9" +
					"\u02c3\3\2\2\2\u02c9\u02c4\3\2\2\2\u02c9\u02c5\3\2\2\2\u02ca\u02cb\3\2" +
					"\2\2\u02cb\u02cc\7V\2\2\u02cc\u0093\3\2\2\2W\u0095\u009c\u00a1\u00a4\u00a8" +
					"\u00af\u00b6\u00bc\u00c2\u00c6\u00ce\u00d4\u00d6\u00de\u00e4\u00f0\u00f6" +
					"\u00fd\u0105\u010d\u0115\u011d\u0125\u012d\u0135\u013d\u0145\u014e\u0156" +
					"\u015f\u0166\u016d\u0172\u0179\u017f\u0193\u0197\u01a0\u01a7\u01ab\u01b1" +
					"\u01b4\u01bb\u01c0\u01c4\u01c8\u01cd\u01d3\u01da\u01e0\u01f1\u01fb\u01fe" +
					"\u0200\u0208\u020a\u0210\u0215\u021c\u0221\u022a\u0235\u0239\u023c\u0241" +
					"\u0246\u024f\u0257\u025f\u026c\u0270\u0277\u027b\u027e\u0289\u0291\u02a7" +
					"\u02ab\u02ad\u02b1\u02b5\u02b9\u02c0\u02c7\u02c9";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}