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
			Byte = 1, Int16 = 2, Int32 = 3, Int64 = 4, Int128 = 5, Float32 = 6, Float64 = 7, Float128 = 8,
			Bool = 9, Array = 10, String = 11, StringBuffer = 12, PublicKey = 13, Message = 14,
			Signature = 15, LongID = 16, Dispatcher = 17, Throw = 18, Auto = 19, Break = 20, Case = 21,
			Char = 22, Const = 23, Continue = 24, Default = 25, Do = 26, Double = 27, Else = 28,
			Enum = 29, Extern = 30, Float = 31, For = 32, Goto = 33, If = 34, Inline = 35, Int = 36,
			Long = 37, Register = 38, Restrict = 39, Return = 40, Short = 41, Signed = 42, Sizeof = 43,
			Static = 44, Struct = 45, Switch = 46, Typedef = 47, Union = 48, Unsigned = 49, Void = 50,
			Volatile = 51, While = 52, Alignas = 53, Alignof = 54, Atomic = 55, GccBool = 56,
			Complex = 57, Generic = 58, Imaginary = 59, Noreturn = 60, StaticAssert = 61, ThreadLocal = 62,
			LeftParen = 63, RightParen = 64, LeftBracket = 65, RightBracket = 66, LeftBrace = 67,
			RightBrace = 68, Less = 69, LessEqual = 70, Greater = 71, GreaterEqual = 72, LeftShift = 73,
			RightShift = 74, Plus = 75, PlusPlus = 76, Minus = 77, MinusMinus = 78, Star = 79,
			Div = 80, Mod = 81, And = 82, Or = 83, AndAnd = 84, OrOr = 85, Caret = 86, Not = 87, Tilde = 88,
			Question = 89, Colon = 90, Semi = 91, Comma = 92, Assign = 93, StarAssign = 94, DivAssign = 95,
			ModAssign = 96, PlusAssign = 97, MinusAssign = 98, LeftShiftAssign = 99, RightShiftAssign = 100,
			AndAssign = 101, XorAssign = 102, OrAssign = 103, Equal = 104, NotEqual = 105, Arrow = 106,
			Dot = 107, Ellipsis = 108, Constant = 109, Identifier = 110, DigitSequence = 111,
			StringLiteral = 112, Whitespace = 113, Newline = 114, BlockComment = 115, LineComment = 116;
	public static final int
			RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2,
			RULE_functionDefinition = 3, RULE_structDeclaration = 4, RULE_initializedDeclaration = 5,
			RULE_initDeclaratorList = 6, RULE_initDeclarator = 7, RULE_variableDeclarator = 8,
			RULE_declarationSpecifier = 9, RULE_primaryExpression = 10, RULE_variableUsage = 11,
			RULE_functionCall = 12, RULE_postfixExpression = 13, RULE_argumentExpressionList = 14,
			RULE_unaryExpression = 15, RULE_unaryOperator = 16, RULE_simpleExpression = 17,
			RULE_multiplicativeExpression = 18, RULE_additiveExpression = 19, RULE_shiftExpression = 20,
			RULE_relationalExpression = 21, RULE_equalityExpression = 22, RULE_andExpression = 23,
			RULE_exclusiveOrExpression = 24, RULE_inclusiveOrExpression = 25, RULE_logicalAndExpression = 26,
			RULE_logicalOrExpression = 27, RULE_conditionalExpression = 28, RULE_assignmentExpression = 29,
			RULE_assignmentOperator = 30, RULE_expression = 31, RULE_constantExpression = 32,
			RULE_primitiveType = 33, RULE_classType = 34, RULE_typeSpecifier = 35,
			RULE_structOrUnionSpecifier = 36, RULE_structOrUnion = 37, RULE_structDeclarationList = 38,
			RULE_specifierQualifierList = 39, RULE_enumSpecifier = 40, RULE_enumeratorList = 41,
			RULE_enumerator = 42, RULE_enumerationConstant = 43, RULE_typeQualifier = 44,
			RULE_nestedParenthesesBlock = 45, RULE_parameterList = 46, RULE_parameterDeclaration = 47,
			RULE_typeName = 48, RULE_initializer = 49, RULE_initializerList = 50,
			RULE_designation = 51, RULE_designatorList = 52, RULE_designator = 53,
			RULE_statement = 54, RULE_labeledStatement = 55, RULE_compoundStatement = 56,
			RULE_blockItemList = 57, RULE_blockItem = 58, RULE_expressionStatement = 59,
			RULE_selectionStatement = 60, RULE_iterationStatement = 61, RULE_forCondition = 62,
			RULE_forDeclaration = 63, RULE_forExpression = 64, RULE_jumpStatement = 65;

	private static String[] makeRuleNames() {
		return new String[]{
				"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition",
				"structDeclaration", "initializedDeclaration", "initDeclaratorList",
				"initDeclarator", "variableDeclarator", "declarationSpecifier", "primaryExpression",
				"variableUsage", "functionCall", "postfixExpression", "argumentExpressionList",
				"unaryExpression", "unaryOperator", "simpleExpression", "multiplicativeExpression",
				"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression",
				"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression",
				"logicalOrExpression", "conditionalExpression", "assignmentExpression",
				"assignmentOperator", "expression", "constantExpression", "primitiveType",
				"classType", "typeSpecifier", "structOrUnionSpecifier", "structOrUnion",
				"structDeclarationList", "specifierQualifierList", "enumSpecifier", "enumeratorList",
				"enumerator", "enumerationConstant", "typeQualifier", "nestedParenthesesBlock",
				"parameterList", "parameterDeclaration", "typeName", "initializer", "initializerList",
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
				"'float64'", "'float128'", "'bool'", "'array_c'", "'string_view_c'",
				"'string_buffer_c'", "'publickey_c'", "'message_c'", "'signature_c'",
				"'long_id'", "'dispatcher'", "'throw'", "'auto'", "'break'", "'case'",
				"'char'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'",
				"'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'",
				"'int'", "'long'", "'register'", "'restrict'", "'return'", "'short'",
				"'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'",
				"'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'",
				"'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'",
				"'_Noreturn'", "'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['",
				"']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'",
				"'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'",
				"'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='",
				"'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='",
				"'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "Byte", "Int16", "Int32", "Int64", "Int128", "Float32", "Float64",
				"Float128", "Bool", "Array", "String", "StringBuffer", "PublicKey", "Message",
				"Signature", "LongID", "Dispatcher", "Throw", "Auto", "Break", "Case",
				"Char", "Const", "Continue", "Default", "Do", "Double", "Else", "Enum",
				"Extern", "Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register",
				"Restrict", "Return", "Short", "Signed", "Sizeof", "Static", "Struct",
				"Switch", "Typedef", "Union", "Unsigned", "Void", "Volatile", "While",
				"Alignas", "Alignof", "Atomic", "GccBool", "Complex", "Generic", "Imaginary",
				"Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", "RightParen",
				"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual",
				"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus",
				"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr",
				"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign",
				"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign",
				"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign",
				"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Constant", "Identifier",
				"DigitSequence", "StringLiteral", "Whitespace", "Newline", "BlockComment",
				"LineComment"
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
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
					{
						setState(132);
						translationUnit();
					}
				}

				setState(135);
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
		public TerminalNode Dispatcher() {
			return getToken(ArgCParser.Dispatcher, 0);
		}

		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class, 0);
		}
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
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
					{
						{
							setState(137);
							externalDeclaration();
						}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(Dispatcher);
				setState(144);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class, 0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class, 0);
		}

		public InitializedDeclarationContext initializedDeclaration() {
			return getRuleContext(InitializedDeclarationContext.class, 0);
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
			setState(150);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(146);
					functionDefinition();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(147);
					structDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(148);
					initializedDeclaration();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(149);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class, 0);
		}

		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class, 0);
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
				setState(152);
				primitiveType();
				setState(153);
				match(Identifier);
				setState(154);
				match(LeftParen);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
					{
						setState(155);
						parameterList();
					}
				}

				setState(158);
				match(RightParen);
				setState(159);
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

	public static class StructDeclarationContext extends ParserRuleContext {
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

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Enum() {
			return getToken(ArgCParser.Enum, 0);
		}

		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class, 0);
		}

		public TerminalNode Comma() {
			return getToken(ArgCParser.Comma, 0);
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
		enterRule(_localctx, 8, RULE_structDeclaration);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 1);
				{
					setState(161);
					structOrUnion();
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(162);
							match(Identifier);
						}
					}

					setState(165);
					match(LeftBrace);
					setState(166);
					structDeclarationList();
					setState(167);
					match(RightBrace);
					setState(168);
					match(Semi);
				}
				break;
				case Enum:
					enterOuterAlt(_localctx, 2);
				{
					setState(170);
					match(Enum);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(171);
							match(Identifier);
						}
					}

					setState(174);
					match(LeftBrace);
					setState(175);
					enumeratorList();
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(176);
							match(Comma);
						}
					}

					setState(179);
					match(RightBrace);
					setState(180);
					match(Semi);
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

	public static class InitializedDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class, 0);
		}

		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class, 0);
		}

		public TerminalNode Semi() {
			return getToken(ArgCParser.Semi, 0);
		}

		public InitializedDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_initializedDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterInitializedDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitInitializedDeclaration(this);
		}
	}

	public final InitializedDeclarationContext initializedDeclaration() throws RecognitionException {
		InitializedDeclarationContext _localctx = new InitializedDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initializedDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(184);
				declarationSpecifier();
				setState(185);
				initDeclaratorList();
				setState(186);
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
		enterRule(_localctx, 12, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(188);
				initDeclarator();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(189);
							match(Comma);
							setState(190);
							initDeclarator();
						}
					}
					setState(195);
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
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class, 0);
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
		enterRule(_localctx, 14, RULE_initDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(196);
				variableDeclarator();
				setState(197);
				match(Assign);
				setState(198);
				initializer();
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public TerminalNode DigitSequence() {
			return getToken(ArgCParser.DigitSequence, 0);
		}

		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarator);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(200);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(201);
					match(Identifier);
					setState(202);
					match(Colon);
					setState(203);
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class, 0);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class, i);
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
		enterRule(_localctx, 18, RULE_declarationSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Const || _la == Static) {
					{
						{
							setState(206);
							typeQualifier();
						}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				typeSpecifier();
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
		public VariableUsageContext variableUsage() {
			return getRuleContext(VariableUsageContext.class, 0);
		}

		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class, 0);
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
		enterRule(_localctx, 20, RULE_primaryExpression);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(214);
					variableUsage();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(215);
					functionCall();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(216);
					match(Constant);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(217);
								match(StringLiteral);
							}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == StringLiteral);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(222);
					match(LeftParen);
					setState(223);
					expression();
					setState(224);
					match(RightParen);
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

	public static class VariableUsageContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public VariableUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableUsage;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterVariableUsage(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitVariableUsage(this);
		}
	}

	public final VariableUsageContext variableUsage() throws RecognitionException {
		VariableUsageContext _localctx = new VariableUsageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableUsage);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(228);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode LeftParen() {
			return getToken(ArgCParser.LeftParen, 0);
		}

		public TerminalNode RightParen() {
			return getToken(ArgCParser.RightParen, 0);
		}

		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class, 0);
		}

		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionCall;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
				match(Identifier);
				setState(231);
				match(LeftParen);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(232);
						argumentExpressionList();
					}
				}

				setState(235);
				match(RightParen);
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

		public List<VariableUsageContext> variableUsage() {
			return getRuleContexts(VariableUsageContext.class);
		}

		public VariableUsageContext variableUsage(int i) {
			return getRuleContext(VariableUsageContext.class, i);
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
		enterRule(_localctx, 26, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case Constant:
					case Identifier:
					case StringLiteral: {
						setState(237);
						primaryExpression();
					}
					break;
					case LeftBrace: {
						setState(238);
						match(LeftBrace);
						setState(239);
						initializerList();
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Comma) {
							{
								setState(240);
								match(Comma);
							}
						}

						setState(243);
						match(RightBrace);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)))) != 0)) {
					{
						setState(254);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case LeftBracket: {
								setState(247);
								match(LeftBracket);
								setState(248);
								expression();
								setState(249);
								match(RightBracket);
							}
							break;
							case Arrow:
							case Dot: {
								setState(251);
								_la = _input.LA(1);
								if (!(_la == Arrow || _la == Dot)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(252);
								variableUsage();
							}
							break;
							case PlusPlus:
							case MinusMinus: {
								setState(253);
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
					setState(258);
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
		enterRule(_localctx, 28, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(259);
				assignmentExpression();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(260);
							match(Comma);
							setState(261);
							assignmentExpression();
						}
					}
					setState(266);
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
		enterRule(_localctx, 30, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(267);
								_la = _input.LA(1);
								if (!(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (Sizeof - 43)) | (1L << (PlusPlus - 43)) | (1L << (MinusMinus - 43)))) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
				}
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case LeftBrace:
					case Constant:
					case Identifier:
					case StringLiteral: {
						setState(273);
						postfixExpression();
					}
					break;
					case Plus:
					case Minus:
					case Not:
					case Tilde: {
						setState(274);
						unaryOperator();
						setState(275);
						simpleExpression();
					}
					break;
					case Sizeof: {
						{
							setState(277);
							match(Sizeof);
						}
						setState(278);
						match(LeftParen);
						setState(279);
						typeName();
						setState(280);
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
		enterRule(_localctx, 32, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(284);
				_la = _input.LA(1);
				if (!(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Plus - 75)) | (1L << (Minus - 75)) | (1L << (Not - 75)) | (1L << (Tilde - 75)))) != 0))) {
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
		enterRule(_localctx, 34, RULE_simpleExpression);
		try {
			setState(288);
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
				case Constant:
				case Identifier:
				case StringLiteral:
					enterOuterAlt(_localctx, 1);
				{
					setState(286);
					unaryExpression();
				}
				break;
				case DigitSequence:
					enterOuterAlt(_localctx, 2);
				{
					setState(287);
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
		enterRule(_localctx, 36, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(290);
				simpleExpression();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0)) {
					{
						{
							setState(291);
							_la = _input.LA(1);
							if (!(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(292);
							simpleExpression();
						}
					}
					setState(297);
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
		enterRule(_localctx, 38, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(298);
				multiplicativeExpression();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Plus || _la == Minus) {
					{
						{
							setState(299);
							_la = _input.LA(1);
							if (!(_la == Plus || _la == Minus)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(300);
							multiplicativeExpression();
						}
					}
					setState(305);
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
		enterRule(_localctx, 40, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(306);
				additiveExpression();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LeftShift || _la == RightShift) {
					{
						{
							setState(307);
							_la = _input.LA(1);
							if (!(_la == LeftShift || _la == RightShift)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(308);
							additiveExpression();
						}
					}
					setState(313);
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
		enterRule(_localctx, 42, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(314);
				shiftExpression();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0)) {
					{
						{
							setState(315);
							_la = _input.LA(1);
							if (!(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(316);
							shiftExpression();
						}
					}
					setState(321);
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
		enterRule(_localctx, 44, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(322);
				relationalExpression();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Equal || _la == NotEqual) {
					{
						{
							setState(323);
							_la = _input.LA(1);
							if (!(_la == Equal || _la == NotEqual)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(324);
							relationalExpression();
						}
					}
					setState(329);
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
		enterRule(_localctx, 46, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(330);
				equalityExpression();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == And) {
					{
						{
							setState(331);
							match(And);
							setState(332);
							equalityExpression();
						}
					}
					setState(337);
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
		enterRule(_localctx, 48, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(338);
				andExpression();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Caret) {
					{
						{
							setState(339);
							match(Caret);
							setState(340);
							andExpression();
						}
					}
					setState(345);
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
		enterRule(_localctx, 50, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(346);
				exclusiveOrExpression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Or) {
					{
						{
							setState(347);
							match(Or);
							setState(348);
							exclusiveOrExpression();
						}
					}
					setState(353);
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
		enterRule(_localctx, 52, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(354);
				inclusiveOrExpression();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AndAnd) {
					{
						{
							setState(355);
							match(AndAnd);
							setState(356);
							inclusiveOrExpression();
						}
					}
					setState(361);
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
		enterRule(_localctx, 54, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(362);
				logicalAndExpression();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OrOr) {
					{
						{
							setState(363);
							match(OrOr);
							setState(364);
							logicalAndExpression();
						}
					}
					setState(369);
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
		enterRule(_localctx, 56, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(370);
				logicalOrExpression();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Question) {
					{
						setState(371);
						match(Question);
						setState(372);
						expression();
						setState(373);
						match(Colon);
						setState(374);
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
		enterRule(_localctx, 58, RULE_assignmentExpression);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(378);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(379);
					unaryExpression();
					setState(380);
					assignmentOperator();
					setState(381);
					assignmentExpression();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(383);
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
		enterRule(_localctx, 60, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(386);
				_la = _input.LA(1);
				if (!(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Assign - 93)) | (1L << (StarAssign - 93)) | (1L << (DivAssign - 93)) | (1L << (ModAssign - 93)) | (1L << (PlusAssign - 93)) | (1L << (MinusAssign - 93)) | (1L << (LeftShiftAssign - 93)) | (1L << (RightShiftAssign - 93)) | (1L << (AndAssign - 93)) | (1L << (XorAssign - 93)) | (1L << (OrAssign - 93)))) != 0))) {
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
		enterRule(_localctx, 62, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(388);
				assignmentExpression();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(389);
							match(Comma);
							setState(390);
							assignmentExpression();
						}
					}
					setState(395);
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
		enterRule(_localctx, 64, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(396);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode Void() {
			return getToken(ArgCParser.Void, 0);
		}

		public TerminalNode Byte() {
			return getToken(ArgCParser.Byte, 0);
		}

		public TerminalNode Int16() {
			return getToken(ArgCParser.Int16, 0);
		}

		public TerminalNode Int32() {
			return getToken(ArgCParser.Int32, 0);
		}

		public TerminalNode Int64() {
			return getToken(ArgCParser.Int64, 0);
		}

		public TerminalNode Int128() {
			return getToken(ArgCParser.Int128, 0);
		}

		public TerminalNode Float32() {
			return getToken(ArgCParser.Float32, 0);
		}

		public TerminalNode Float64() {
			return getToken(ArgCParser.Float64, 0);
		}

		public TerminalNode Float128() {
			return getToken(ArgCParser.Float128, 0);
		}

		public TerminalNode Bool() {
			return getToken(ArgCParser.Bool, 0);
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
		enterRule(_localctx, 66, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(398);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Void))) != 0))) {
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode String() {
			return getToken(ArgCParser.String, 0);
		}

		public TerminalNode PublicKey() {
			return getToken(ArgCParser.PublicKey, 0);
		}

		public TerminalNode Message() {
			return getToken(ArgCParser.Message, 0);
		}

		public TerminalNode Signature() {
			return getToken(ArgCParser.Signature, 0);
		}

		public TerminalNode LongID() {
			return getToken(ArgCParser.LongID, 0);
		}

		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).enterClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ArgCListener) ((ArgCListener) listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(400);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID))) != 0))) {
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

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class, 0);
		}

		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class, 0);
		}

		public TerminalNode Array() {
			return getToken(ArgCParser.Array, 0);
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

		public TerminalNode StringBuffer() {
			return getToken(ArgCParser.StringBuffer, 0);
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
		enterRule(_localctx, 70, RULE_typeSpecifier);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Byte:
				case Int16:
				case Int32:
				case Int64:
				case Int128:
				case Float32:
				case Float64:
				case Float128:
				case Bool:
				case Void:
					enterOuterAlt(_localctx, 1);
				{
					setState(402);
					primitiveType();
				}
				break;
				case String:
				case PublicKey:
				case Message:
				case Signature:
				case LongID:
					enterOuterAlt(_localctx, 2);
				{
					setState(403);
					classType();
				}
				break;
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 3);
				{
					setState(404);
					structOrUnionSpecifier();
				}
				break;
				case Enum:
					enterOuterAlt(_localctx, 4);
				{
					setState(405);
					enumSpecifier();
				}
				break;
				case Array:
					enterOuterAlt(_localctx, 5);
				{
					setState(406);
					match(Array);
					setState(407);
					match(Less);
					setState(408);
					primitiveType();
					setState(409);
					match(Comma);
					setState(410);
					match(Constant);
					setState(411);
					match(Greater);
				}
				break;
				case StringBuffer:
					enterOuterAlt(_localctx, 6);
				{
					setState(413);
					match(StringBuffer);
					setState(414);
					match(Less);
					setState(415);
					match(Constant);
					setState(416);
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
		enterRule(_localctx, 72, RULE_structOrUnionSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(419);
				structOrUnion();
				setState(420);
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
		enterRule(_localctx, 74, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(422);
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
		public List<InitializedDeclarationContext> initializedDeclaration() {
			return getRuleContexts(InitializedDeclarationContext.class);
		}
		public InitializedDeclarationContext initializedDeclaration(int i) {
			return getRuleContext(InitializedDeclarationContext.class, i);
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
		enterRule(_localctx, 76, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(424);
							initializedDeclaration();
						}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0));
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
		enterRule(_localctx, 78, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Byte:
					case Int16:
					case Int32:
					case Int64:
					case Int128:
					case Float32:
					case Float64:
					case Float128:
					case Bool:
					case Array:
					case String:
					case StringBuffer:
					case PublicKey:
					case Message:
					case Signature:
					case LongID:
					case Enum:
					case Struct:
					case Union:
					case Void: {
						setState(429);
						typeSpecifier();
					}
					break;
					case Const:
					case Static: {
						setState(430);
						typeQualifier();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
					{
						setState(433);
						specifierQualifierList();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() {
			return getToken(ArgCParser.Enum, 0);
		}

		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
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
		enterRule(_localctx, 80, RULE_enumSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(436);
				match(Enum);
				setState(437);
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
		enterRule(_localctx, 82, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(439);
				enumerator();
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(440);
								match(Comma);
								setState(441);
								enumerator();
							}
						}
					}
					setState(446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
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
		enterRule(_localctx, 84, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(447);
				enumerationConstant();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Assign) {
					{
						setState(448);
						match(Assign);
						setState(449);
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
		enterRule(_localctx, 86, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(452);
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

		public TerminalNode Static() {
			return getToken(ArgCParser.Static, 0);
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
		enterRule(_localctx, 88, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(454);
				_la = _input.LA(1);
				if (!(_la == Const || _la == Static)) {
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
		enterRule(_localctx, 90, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Throw) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << GccBool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Comma - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Constant - 65)) | (1L << (Identifier - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
					{
						setState(461);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Byte:
							case Int16:
							case Int32:
							case Int64:
							case Int128:
							case Float32:
							case Float64:
							case Float128:
							case Bool:
							case Array:
							case String:
							case StringBuffer:
							case PublicKey:
							case Message:
							case Signature:
							case LongID:
							case Dispatcher:
							case Throw:
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
							case GccBool:
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
							case Constant:
							case Identifier:
							case DigitSequence:
							case StringLiteral:
							case Whitespace:
							case Newline:
							case BlockComment:
							case LineComment: {
								setState(456);
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
								setState(457);
								match(LeftParen);
								setState(458);
								nestedParenthesesBlock();
								setState(459);
								match(RightParen);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(465);
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
		enterRule(_localctx, 92, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(466);
				parameterDeclaration();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(467);
							match(Comma);
							setState(468);
							parameterDeclaration();
						}
					}
					setState(473);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class, 0);
		}

		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class, 0);
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
		enterRule(_localctx, 94, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(474);
				declarationSpecifier();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == And) {
					{
						setState(475);
						match(And);
					}
				}

				setState(478);
				variableDeclarator();
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
		enterRule(_localctx, 96, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(480);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class, 0);
		}

		public TerminalNode LeftBrace() {
			return getToken(ArgCParser.LeftBrace, 0);
		}

		public TerminalNode RightBrace() {
			return getToken(ArgCParser.RightBrace, 0);
		}

		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class, 0);
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
		enterRule(_localctx, 98, RULE_initializer);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(482);
					assignmentExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(483);
					match(LeftBrace);
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Sizeof || _la == LeftParen || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Dot - 65)) | (1L << (Constant - 65)) | (1L << (Identifier - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
							setState(484);
							initializerList();
						}
					}

					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(487);
							match(Comma);
						}
					}

					setState(490);
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
		enterRule(_localctx, 100, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftBracket || _la == Dot) {
					{
						setState(493);
						designation();
					}
				}

				setState(496);
				initializer();
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(497);
								match(Comma);
								setState(499);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LeftBracket || _la == Dot) {
									{
										setState(498);
										designation();
									}
								}

								setState(501);
								initializer();
							}
						}
					}
					setState(506);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
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
		enterRule(_localctx, 102, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(507);
				designatorList();
				setState(508);
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
		enterRule(_localctx, 104, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(510);
							designator();
						}
					}
					setState(513);
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
		enterRule(_localctx, 106, RULE_designator);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LeftBracket:
					enterOuterAlt(_localctx, 1);
				{
					setState(515);
					match(LeftBracket);
					setState(516);
					constantExpression();
					setState(517);
					match(RightBracket);
				}
				break;
				case Dot:
					enterOuterAlt(_localctx, 2);
				{
					setState(519);
					match(Dot);
					setState(520);
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
		enterRule(_localctx, 108, RULE_statement);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(523);
					labeledStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(524);
					compoundStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(525);
					expressionStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(526);
					selectionStatement();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(527);
					iterationStatement();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(528);
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
		public TerminalNode Case() {
			return getToken(ArgCParser.Case, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
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
		enterRule(_localctx, 110, RULE_labeledStatement);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Case:
					enterOuterAlt(_localctx, 1);
				{
					setState(531);
					match(Case);
					setState(532);
					constantExpression();
					setState(533);
					match(Colon);
					setState(534);
					statement();
				}
				break;
				case Default:
					enterOuterAlt(_localctx, 2);
				{
					setState(536);
					match(Default);
					setState(537);
					match(Colon);
					setState(538);
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
		enterRule(_localctx, 112, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(541);
				match(LeftBrace);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(542);
						blockItemList();
					}
				}

				setState(545);
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
		enterRule(_localctx, 114, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(547);
							blockItem();
						}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0));
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
		public InitializedDeclarationContext initializedDeclaration() {
			return getRuleContext(InitializedDeclarationContext.class, 0);
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
		enterRule(_localctx, 116, RULE_blockItem);
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Break:
				case Case:
				case Continue:
				case Default:
				case Do:
				case For:
				case If:
				case Return:
				case Sizeof:
				case Switch:
				case While:
				case LeftParen:
				case LeftBrace:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Not:
				case Tilde:
				case Semi:
				case Constant:
				case Identifier:
				case DigitSequence:
				case StringLiteral:
					enterOuterAlt(_localctx, 1);
				{
					setState(552);
					statement();
				}
				break;
				case Byte:
				case Int16:
				case Int32:
				case Int64:
				case Int128:
				case Float32:
				case Float64:
				case Float128:
				case Bool:
				case Array:
				case String:
				case StringBuffer:
				case PublicKey:
				case Message:
				case Signature:
				case LongID:
				case Const:
				case Enum:
				case Static:
				case Struct:
				case Union:
				case Void:
					enterOuterAlt(_localctx, 2);
				{
					setState(553);
					initializedDeclaration();
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
		enterRule(_localctx, 118, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(556);
						expression();
					}
				}

				setState(559);
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
		enterRule(_localctx, 120, RULE_selectionStatement);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case If:
					enterOuterAlt(_localctx, 1);
				{
					setState(561);
					match(If);
					setState(562);
					match(LeftParen);
					setState(563);
					expression();
					setState(564);
					match(RightParen);
					setState(565);
					statement();
					setState(568);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
						case 1: {
							setState(566);
							match(Else);
							setState(567);
							statement();
						}
						break;
					}
				}
				break;
				case Switch:
					enterOuterAlt(_localctx, 2);
				{
					setState(570);
					match(Switch);
					setState(571);
					match(LeftParen);
					setState(572);
					expression();
					setState(573);
					match(RightParen);
					setState(574);
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
		enterRule(_localctx, 122, RULE_iterationStatement);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case While:
					enterOuterAlt(_localctx, 1);
				{
					setState(578);
					match(While);
					setState(579);
					match(LeftParen);
					setState(580);
					expression();
					setState(581);
					match(RightParen);
					setState(582);
					statement();
				}
				break;
				case Do:
					enterOuterAlt(_localctx, 2);
				{
					setState(584);
					match(Do);
					setState(585);
					statement();
					setState(586);
					match(While);
					setState(587);
					match(LeftParen);
					setState(588);
					expression();
					setState(589);
					match(RightParen);
					setState(590);
					match(Semi);
				}
				break;
				case For:
					enterOuterAlt(_localctx, 3);
				{
					setState(592);
					match(For);
					setState(593);
					match(LeftParen);
					setState(594);
					forCondition();
					setState(595);
					match(RightParen);
					setState(596);
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
		enterRule(_localctx, 124, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(604);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Byte:
					case Int16:
					case Int32:
					case Int64:
					case Int128:
					case Float32:
					case Float64:
					case Float128:
					case Bool:
					case Array:
					case String:
					case StringBuffer:
					case PublicKey:
					case Message:
					case Signature:
					case LongID:
					case Const:
					case Enum:
					case Static:
					case Struct:
					case Union:
					case Void: {
						setState(600);
						forDeclaration();
					}
					break;
					case Sizeof:
					case LeftParen:
					case LeftBrace:
					case Plus:
					case PlusPlus:
					case Minus:
					case MinusMinus:
					case Not:
					case Tilde:
					case Semi:
					case Constant:
					case Identifier:
					case DigitSequence:
					case StringLiteral: {
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
								setState(601);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(606);
				match(Semi);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(607);
						forExpression();
					}
				}

				setState(610);
				match(Semi);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(611);
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
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class, 0);
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
		enterRule(_localctx, 126, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(614);
				declarationSpecifier();
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(615);
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
		enterRule(_localctx, 128, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(618);
				assignmentExpression();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(619);
							match(Comma);
							setState(620);
							assignmentExpression();
						}
					}
					setState(625);
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
		enterRule(_localctx, 130, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Continue: {
						setState(626);
						match(Continue);
					}
					break;
					case Break: {
						setState(627);
						match(Break);
					}
					break;
					case Return: {
						setState(628);
						match(Return);
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
								setState(629);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(634);
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

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u027f\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\5\2\u0088\n\2\3\2\3\2\3\3\7\3" +
					"\u008d\n\3\f\3\16\3\u0090\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0099\n" +
					"\4\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u00a6\n\6\3\6" +
					"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00af\n\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\6\3" +
					"\6\3\6\5\6\u00b9\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u00c2\n\b\f\b\16" +
					"\b\u00c5\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\13\7\13" +
					"\u00d2\n\13\f\13\16\13\u00d5\13\13\3\13\3\13\3\f\3\f\3\f\3\f\6\f\u00dd" +
					"\n\f\r\f\16\f\u00de\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\r\3\r\3\16\3\16\3" +
					"\16\5\16\u00ec\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\3\17" +
					"\3\17\5\17\u00f8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0101\n" +
					"\17\f\17\16\17\u0104\13\17\3\20\3\20\3\20\7\20\u0109\n\20\f\20\16\20\u010c" +
					"\13\20\3\21\7\21\u010f\n\21\f\21\16\21\u0112\13\21\3\21\3\21\3\21\3\21" +
					"\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\22\3\22\3\23\3\23\5\23\u0123" +
					"\n\23\3\24\3\24\3\24\7\24\u0128\n\24\f\24\16\24\u012b\13\24\3\25\3\25" +
					"\3\25\7\25\u0130\n\25\f\25\16\25\u0133\13\25\3\26\3\26\3\26\7\26\u0138" +
					"\n\26\f\26\16\26\u013b\13\26\3\27\3\27\3\27\7\27\u0140\n\27\f\27\16\27" +
					"\u0143\13\27\3\30\3\30\3\30\7\30\u0148\n\30\f\30\16\30\u014b\13\30\3\31" +
					"\3\31\3\31\7\31\u0150\n\31\f\31\16\31\u0153\13\31\3\32\3\32\3\32\7\32" +
					"\u0158\n\32\f\32\16\32\u015b\13\32\3\33\3\33\3\33\7\33\u0160\n\33\f\33" +
					"\16\33\u0163\13\33\3\34\3\34\3\34\7\34\u0168\n\34\f\34\16\34\u016b\13" +
					"\34\3\35\3\35\3\35\7\35\u0170\n\35\f\35\16\35\u0173\13\35\3\36\3\36\3" +
					"\36\3\36\3\36\3\36\5\36\u017b\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37" +
					"\u0183\n\37\3 \3 \3!\3!\3!\7!\u018a\n!\f!\16!\u018d\13!\3\"\3\"\3#\3#" +
					"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01a4\n%\3&\3&" +
					"\3&\3\'\3\'\3(\6(\u01ac\n(\r(\16(\u01ad\3)\3)\5)\u01b2\n)\3)\5)\u01b5" +
					"\n)\3*\3*\3*\3+\3+\3+\7+\u01bd\n+\f+\16+\u01c0\13+\3,\3,\3,\5,\u01c5\n" +
					",\3-\3-\3.\3.\3/\3/\3/\3/\3/\7/\u01d0\n/\f/\16/\u01d3\13/\3\60\3\60\3" +
					"\60\7\60\u01d8\n\60\f\60\16\60\u01db\13\60\3\61\3\61\5\61\u01df\n\61\3" +
					"\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u01e8\n\63\3\63\5\63\u01eb\n\63" +
					"\3\63\5\63\u01ee\n\63\3\64\5\64\u01f1\n\64\3\64\3\64\3\64\5\64\u01f6\n" +
					"\64\3\64\7\64\u01f9\n\64\f\64\16\64\u01fc\13\64\3\65\3\65\3\65\3\66\6" +
					"\66\u0202\n\66\r\66\16\66\u0203\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u020c" +
					"\n\67\38\38\38\38\38\38\58\u0214\n8\39\39\39\39\39\39\39\39\59\u021e\n" +
					"9\3:\3:\5:\u0222\n:\3:\3:\3;\6;\u0227\n;\r;\16;\u0228\3<\3<\5<\u022d\n" +
					"<\3=\5=\u0230\n=\3=\3=\3>\3>\3>\3>\3>\3>\3>\5>\u023b\n>\3>\3>\3>\3>\3" +
					">\3>\5>\u0243\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3" +
					"?\3?\3?\5?\u0259\n?\3@\3@\5@\u025d\n@\5@\u025f\n@\3@\3@\5@\u0263\n@\3" +
					"@\3@\5@\u0267\n@\3A\3A\5A\u026b\nA\3B\3B\3B\7B\u0270\nB\fB\16B\u0273\13" +
					"B\3C\3C\3C\3C\5C\u0279\nC\5C\u027b\nC\3C\3C\3C\2\2D\2\4\6\b\n\f\16\20" +
					"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj" +
					"lnprtvxz|~\u0080\u0082\u0084\2\21\3\2lm\4\2NNPP\5\2--NNPP\5\2MMOOYZ\3" +
					"\2QS\4\2MMOO\3\2KL\3\2GJ\3\2jk\3\2_i\4\2\3\13\64\64\4\2\r\r\17\22\4\2" +
					"//\62\62\4\2\31\31..\3\2AB\2\u0294\2\u0087\3\2\2\2\4\u008e\3\2\2\2\6\u0098" +
					"\3\2\2\2\b\u009a\3\2\2\2\n\u00b8\3\2\2\2\f\u00ba\3\2\2\2\16\u00be\3\2" +
					"\2\2\20\u00c6\3\2\2\2\22\u00ce\3\2\2\2\24\u00d3\3\2\2\2\26\u00e4\3\2\2" +
					"\2\30\u00e6\3\2\2\2\32\u00e8\3\2\2\2\34\u00f7\3\2\2\2\36\u0105\3\2\2\2" +
					" \u0110\3\2\2\2\"\u011e\3\2\2\2$\u0122\3\2\2\2&\u0124\3\2\2\2(\u012c\3" +
					"\2\2\2*\u0134\3\2\2\2,\u013c\3\2\2\2.\u0144\3\2\2\2\60\u014c\3\2\2\2\62" +
					"\u0154\3\2\2\2\64\u015c\3\2\2\2\66\u0164\3\2\2\28\u016c\3\2\2\2:\u0174" +
					"\3\2\2\2<\u0182\3\2\2\2>\u0184\3\2\2\2@\u0186\3\2\2\2B\u018e\3\2\2\2D" +
					"\u0190\3\2\2\2F\u0192\3\2\2\2H\u01a3\3\2\2\2J\u01a5\3\2\2\2L\u01a8\3\2" +
					"\2\2N\u01ab\3\2\2\2P\u01b1\3\2\2\2R\u01b6\3\2\2\2T\u01b9\3\2\2\2V\u01c1" +
					"\3\2\2\2X\u01c6\3\2\2\2Z\u01c8\3\2\2\2\\\u01d1\3\2\2\2^\u01d4\3\2\2\2" +
					"`\u01dc\3\2\2\2b\u01e2\3\2\2\2d\u01ed\3\2\2\2f\u01f0\3\2\2\2h\u01fd\3" +
					"\2\2\2j\u0201\3\2\2\2l\u020b\3\2\2\2n\u0213\3\2\2\2p\u021d\3\2\2\2r\u021f" +
					"\3\2\2\2t\u0226\3\2\2\2v\u022c\3\2\2\2x\u022f\3\2\2\2z\u0242\3\2\2\2|" +
					"\u0258\3\2\2\2~\u025e\3\2\2\2\u0080\u0268\3\2\2\2\u0082\u026c\3\2\2\2" +
					"\u0084\u027a\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0087\u0088" +
					"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2\u008b" +
					"\u008d\5\6\4\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2" +
					"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091" +
					"\u0092\7\23\2\2\u0092\u0093\5r:\2\u0093\5\3\2\2\2\u0094\u0099\5\b\5\2" +
					"\u0095\u0099\5\n\6\2\u0096\u0099\5\f\7\2\u0097\u0099\7]\2\2\u0098\u0094" +
					"\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099" +
					"\7\3\2\2\2\u009a\u009b\5D#\2\u009b\u009c\7p\2\2\u009c\u009e\7A\2\2\u009d" +
					"\u009f\5^\60\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2" +
					"\2\2\u00a0\u00a1\7B\2\2\u00a1\u00a2\5r:\2\u00a2\t\3\2\2\2\u00a3\u00a5" +
					"\5L\'\2\u00a4\u00a6\7p\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6" +
					"\u00a7\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8\u00a9\5N(\2\u00a9\u00aa\7F\2\2" +
					"\u00aa\u00ab\7]\2\2\u00ab\u00b9\3\2\2\2\u00ac\u00ae\7\37\2\2\u00ad\u00af" +
					"\7p\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0" +
					"\u00b1\7E\2\2\u00b1\u00b3\5T+\2\u00b2\u00b4\7^\2\2\u00b3\u00b2\3\2\2\2" +
					"\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7F\2\2\u00b6\u00b7" +
					"\7]\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00a3\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b9" +
					"\13\3\2\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\7]" +
					"\2\2\u00bd\r\3\2\2\2\u00be\u00c3\5\20\t\2\u00bf\u00c0\7^\2\2\u00c0\u00c2" +
					"\5\20\t\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2" +
					"\u00c3\u00c4\3\2\2\2\u00c4\17\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7" +
					"\5\22\n\2\u00c7\u00c8\7_\2\2\u00c8\u00c9\5d\63\2\u00c9\21\3\2\2\2\u00ca" +
					"\u00cf\7p\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7\\\2\2\u00cd\u00cf\7q\2" +
					"\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00d2" +
					"\5Z.\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3" +
					"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\5H" +
					"%\2\u00d7\25\3\2\2\2\u00d8\u00e5\5\30\r\2\u00d9\u00e5\5\32\16\2\u00da" +
					"\u00e5\7o\2\2\u00db\u00dd\7r\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2" +
					"\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1" +
					"\7A\2\2\u00e1\u00e2\5@!\2\u00e2\u00e3\7B\2\2\u00e3\u00e5\3\2\2\2\u00e4" +
					"\u00d8\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00dc\3\2" +
					"\2\2\u00e4\u00e0\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\7p\2\2\u00e7\31" +
					"\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00eb\7A\2\2\u00ea\u00ec\5\36\20\2\u00eb" +
					"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7B" +
					"\2\2\u00ee\33\3\2\2\2\u00ef\u00f8\5\26\f\2\u00f0\u00f1\7E\2\2\u00f1\u00f3" +
					"\5f\64\2\u00f2\u00f4\7^\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4" +
					"\u00f5\3\2\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00ef\3\2" +
					"\2\2\u00f7\u00f0\3\2\2\2\u00f8\u0102\3\2\2\2\u00f9\u00fa\7C\2\2\u00fa" +
					"\u00fb\5@!\2\u00fb\u00fc\7D\2\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\t\2\2" +
					"\2\u00fe\u0101\5\30\r\2\u00ff\u0101\t\3\2\2\u0100\u00f9\3\2\2\2\u0100" +
					"\u00fd\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2" +
					"\2\2\u0102\u0103\3\2\2\2\u0103\35\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a" +
					"\5<\37\2\u0106\u0107\7^\2\2\u0107\u0109\5<\37\2\u0108\u0106\3\2\2\2\u0109" +
					"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\37\3\2\2" +
					"\2\u010c\u010a\3\2\2\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2\2\2\u010f\u0112" +
					"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u011c\3\2\2\2\u0112" +
					"\u0110\3\2\2\2\u0113\u011d\5\34\17\2\u0114\u0115\5\"\22\2\u0115\u0116" +
					"\5$\23\2\u0116\u011d\3\2\2\2\u0117\u0118\7-\2\2\u0118\u0119\7A\2\2\u0119" +
					"\u011a\5b\62\2\u011a\u011b\7B\2\2\u011b\u011d\3\2\2\2\u011c\u0113\3\2" +
					"\2\2\u011c\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011d!\3\2\2\2\u011e\u011f" +
					"\t\5\2\2\u011f#\3\2\2\2\u0120\u0123\5 \21\2\u0121\u0123\7q\2\2\u0122\u0120" +
					"\3\2\2\2\u0122\u0121\3\2\2\2\u0123%\3\2\2\2\u0124\u0129\5$\23\2\u0125" +
					"\u0126\t\6\2\2\u0126\u0128\5$\23\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2" +
					"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\'\3\2\2\2\u012b\u0129" +
					"\3\2\2\2\u012c\u0131\5&\24\2\u012d\u012e\t\7\2\2\u012e\u0130\5&\24\2\u012f" +
					"\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2" +
					"\2\2\u0132)\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0139\5(\25\2\u0135\u0136" +
					"\t\b\2\2\u0136\u0138\5(\25\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139" +
					"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a+\3\2\2\2\u013b\u0139\3\2\2\2" +
					"\u013c\u0141\5*\26\2\u013d\u013e\t\t\2\2\u013e\u0140\5*\26\2\u013f\u013d" +
					"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142" +
					"-\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0149\5,\27\2\u0145\u0146\t\n\2\2" +
					"\u0146\u0148\5,\27\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147" +
					"\3\2\2\2\u0149\u014a\3\2\2\2\u014a/\3\2\2\2\u014b\u0149\3\2\2\2\u014c" +
					"\u0151\5.\30\2\u014d\u014e\7T\2\2\u014e\u0150\5.\30\2\u014f\u014d\3\2" +
					"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152" +
					"\61\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0159\5\60\31\2\u0155\u0156\7X\2" +
					"\2\u0156\u0158\5\60\31\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159" +
					"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\63\3\2\2\2\u015b\u0159\3\2\2" +
					"\2\u015c\u0161\5\62\32\2\u015d\u015e\7U\2\2\u015e\u0160\5\62\32\2\u015f" +
					"\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2" +
					"\2\2\u0162\65\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0169\5\64\33\2\u0165" +
					"\u0166\7V\2\2\u0166\u0168\5\64\33\2\u0167\u0165\3\2\2\2\u0168\u016b\3" +
					"\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\67\3\2\2\2\u016b" +
					"\u0169\3\2\2\2\u016c\u0171\5\66\34\2\u016d\u016e\7W\2\2\u016e\u0170\5" +
					"\66\34\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171" +
					"\u0172\3\2\2\2\u01729\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u017a\58\35\2" +
					"\u0175\u0176\7[\2\2\u0176\u0177\5@!\2\u0177\u0178\7\\\2\2\u0178\u0179" +
					"\5:\36\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u017b\3\2\2\2\u017b" +
					";\3\2\2\2\u017c\u0183\5:\36\2\u017d\u017e\5 \21\2\u017e\u017f\5> \2\u017f" +
					"\u0180\5<\37\2\u0180\u0183\3\2\2\2\u0181\u0183\7q\2\2\u0182\u017c\3\2" +
					"\2\2\u0182\u017d\3\2\2\2\u0182\u0181\3\2\2\2\u0183=\3\2\2\2\u0184\u0185" +
					"\t\13\2\2\u0185?\3\2\2\2\u0186\u018b\5<\37\2\u0187\u0188\7^\2\2\u0188" +
					"\u018a\5<\37\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2" +
					"\2\2\u018b\u018c\3\2\2\2\u018cA\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f" +
					"\5:\36\2\u018fC\3\2\2\2\u0190\u0191\t\f\2\2\u0191E\3\2\2\2\u0192\u0193" +
					"\t\r\2\2\u0193G\3\2\2\2\u0194\u01a4\5D#\2\u0195\u01a4\5F$\2\u0196\u01a4" +
					"\5J&\2\u0197\u01a4\5R*\2\u0198\u0199\7\f\2\2\u0199\u019a\7G\2\2\u019a" +
					"\u019b\5D#\2\u019b\u019c\7^\2\2\u019c\u019d\7o\2\2\u019d\u019e\7I\2\2" +
					"\u019e\u01a4\3\2\2\2\u019f\u01a0\7\16\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2" +
					"\7o\2\2\u01a2\u01a4\7I\2\2\u01a3\u0194\3\2\2\2\u01a3\u0195\3\2\2\2\u01a3" +
					"\u0196\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u019f\3\2" +
					"\2\2\u01a4I\3\2\2\2\u01a5\u01a6\5L\'\2\u01a6\u01a7\7p\2\2\u01a7K\3\2\2" +
					"\2\u01a8\u01a9\t\16\2\2\u01a9M\3\2\2\2\u01aa\u01ac\5\f\7\2\u01ab\u01aa" +
					"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae" +
					"O\3\2\2\2\u01af\u01b2\5H%\2\u01b0\u01b2\5Z.\2\u01b1\u01af\3\2\2\2\u01b1" +
					"\u01b0\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5P)\2\u01b4\u01b3\3\2\2" +
					"\2\u01b4\u01b5\3\2\2\2\u01b5Q\3\2\2\2\u01b6\u01b7\7\37\2\2\u01b7\u01b8" +
					"\7p\2\2\u01b8S\3\2\2\2\u01b9\u01be\5V,\2\u01ba\u01bb\7^\2\2\u01bb\u01bd" +
					"\5V,\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be" +
					"\u01bf\3\2\2\2\u01bfU\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\5X-\2\u01c2" +
					"\u01c3\7_\2\2\u01c3\u01c5\5B\"\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2" +
					"\2\u01c5W\3\2\2\2\u01c6\u01c7\7p\2\2\u01c7Y\3\2\2\2\u01c8\u01c9\t\17\2" +
					"\2\u01c9[\3\2\2\2\u01ca\u01d0\n\20\2\2\u01cb\u01cc\7A\2\2\u01cc\u01cd" +
					"\5\\/\2\u01cd\u01ce\7B\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf" +
					"\u01cb\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2" +
					"\2\2\u01d2]\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d9\5`\61\2\u01d5\u01d6" +
					"\7^\2\2\u01d6\u01d8\5`\61\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9" +
					"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da_\3\2\2\2\u01db\u01d9\3\2\2\2" +
					"\u01dc\u01de\5\24\13\2\u01dd\u01df\7T\2\2\u01de\u01dd\3\2\2\2\u01de\u01df" +
					"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5\22\n\2\u01e1a\3\2\2\2\u01e2" +
					"\u01e3\5P)\2\u01e3c\3\2\2\2\u01e4\u01ee\5<\37\2\u01e5\u01e7\7E\2\2\u01e6" +
					"\u01e8\5f\64\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2" +
					"\2\2\u01e9\u01eb\7^\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb" +
					"\u01ec\3\2\2\2\u01ec\u01ee\7F\2\2\u01ed\u01e4\3\2\2\2\u01ed\u01e5\3\2" +
					"\2\2\u01eee\3\2\2\2\u01ef\u01f1\5h\65\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1" +
					"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fa\5d\63\2\u01f3\u01f5\7^\2\2\u01f4" +
					"\u01f6\5h\65\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2" +
					"\2\2\u01f7\u01f9\5d\63\2\u01f8\u01f3\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa" +
					"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbg\3\2\2\2\u01fc\u01fa\3\2\2\2" +
					"\u01fd\u01fe\5j\66\2\u01fe\u01ff\7_\2\2\u01ffi\3\2\2\2\u0200\u0202\5l" +
					"\67\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203" +
					"\u0204\3\2\2\2\u0204k\3\2\2\2\u0205\u0206\7C\2\2\u0206\u0207\5B\"\2\u0207" +
					"\u0208\7D\2\2\u0208\u020c\3\2\2\2\u0209\u020a\7m\2\2\u020a\u020c\7p\2" +
					"\2\u020b\u0205\3\2\2\2\u020b\u0209\3\2\2\2\u020cm\3\2\2\2\u020d\u0214" +
					"\5p9\2\u020e\u0214\5r:\2\u020f\u0214\5x=\2\u0210\u0214\5z>\2\u0211\u0214" +
					"\5|?\2\u0212\u0214\5\u0084C\2\u0213\u020d\3\2\2\2\u0213\u020e\3\2\2\2" +
					"\u0213\u020f\3\2\2\2\u0213\u0210\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212" +
					"\3\2\2\2\u0214o\3\2\2\2\u0215\u0216\7\27\2\2\u0216\u0217\5B\"\2\u0217" +
					"\u0218\7\\\2\2\u0218\u0219\5n8\2\u0219\u021e\3\2\2\2\u021a\u021b\7\33" +
					"\2\2\u021b\u021c\7\\\2\2\u021c\u021e\5n8\2\u021d\u0215\3\2\2\2\u021d\u021a" +
					"\3\2\2\2\u021eq\3\2\2\2\u021f\u0221\7E\2\2\u0220\u0222\5t;\2\u0221\u0220" +
					"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7F\2\2\u0224" +
					"s\3\2\2\2\u0225\u0227\5v<\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228" +
					"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229u\3\2\2\2\u022a\u022d\5n8\2\u022b" +
					"\u022d\5\f\7\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022dw\3\2\2\2" +
					"\u022e\u0230\5@!\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231" +
					"\3\2\2\2\u0231\u0232\7]\2\2\u0232y\3\2\2\2\u0233\u0234\7$\2\2\u0234\u0235" +
					"\7A\2\2\u0235\u0236\5@!\2\u0236\u0237\7B\2\2\u0237\u023a\5n8\2\u0238\u0239" +
					"\7\36\2\2\u0239\u023b\5n8\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b" +
					"\u0243\3\2\2\2\u023c\u023d\7\60\2\2\u023d\u023e\7A\2\2\u023e\u023f\5@" +
					"!\2\u023f\u0240\7B\2\2\u0240\u0241\5n8\2\u0241\u0243\3\2\2\2\u0242\u0233" +
					"\3\2\2\2\u0242\u023c\3\2\2\2\u0243{\3\2\2\2\u0244\u0245\7\66\2\2\u0245" +
					"\u0246\7A\2\2\u0246\u0247\5@!\2\u0247\u0248\7B\2\2\u0248\u0249\5n8\2\u0249" +
					"\u0259\3\2\2\2\u024a\u024b\7\34\2\2\u024b\u024c\5n8\2\u024c\u024d\7\66" +
					"\2\2\u024d\u024e\7A\2\2\u024e\u024f\5@!\2\u024f\u0250\7B\2\2\u0250\u0251" +
					"\7]\2\2\u0251\u0259\3\2\2\2\u0252\u0253\7\"\2\2\u0253\u0254\7A\2\2\u0254" +
					"\u0255\5~@\2\u0255\u0256\7B\2\2\u0256\u0257\5n8\2\u0257\u0259\3\2\2\2" +
					"\u0258\u0244\3\2\2\2\u0258\u024a\3\2\2\2\u0258\u0252\3\2\2\2\u0259}\3" +
					"\2\2\2\u025a\u025f\5\u0080A\2\u025b\u025d\5@!\2\u025c\u025b\3\2\2\2\u025c" +
					"\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025a\3\2\2\2\u025e\u025c\3\2" +
					"\2\2\u025f\u0260\3\2\2\2\u0260\u0262\7]\2\2\u0261\u0263\5\u0082B\2\u0262" +
					"\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\7]" +
					"\2\2\u0265\u0267\5\u0082B\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267" +
					"\177\3\2\2\2\u0268\u026a\5\24\13\2\u0269\u026b\5\16\b\2\u026a\u0269\3" +
					"\2\2\2\u026a\u026b\3\2\2\2\u026b\u0081\3\2\2\2\u026c\u0271\5<\37\2\u026d" +
					"\u026e\7^\2\2\u026e\u0270\5<\37\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2" +
					"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0083\3\2\2\2\u0273" +
					"\u0271\3\2\2\2\u0274\u027b\7\32\2\2\u0275\u027b\7\26\2\2\u0276\u0278\7" +
					"*\2\2\u0277\u0279\5@!\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279" +
					"\u027b\3\2\2\2\u027a\u0274\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2" +
					"\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7]\2\2\u027d\u0085\3\2\2\2H\u0087" +
					"\u008e\u0098\u009e\u00a5\u00ae\u00b3\u00b8\u00c3\u00ce\u00d3\u00de\u00e4" +
					"\u00eb\u00f3\u00f7\u0100\u0102\u010a\u0110\u011c\u0122\u0129\u0131\u0139" +
					"\u0141\u0149\u0151\u0159\u0161\u0169\u0171\u017a\u0182\u018b\u01a3\u01ad" +
					"\u01b1\u01b4\u01be\u01c4\u01cf\u01d1\u01d9\u01de\u01e7\u01ea\u01ed\u01f0" +
					"\u01f5\u01fa\u0203\u020b\u0213\u021d\u0221\u0228\u022c\u022f\u023a\u0242" +
					"\u0258\u025c\u025e\u0262\u0266\u026a\u0271\u0278\u027a";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}