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
			Signature = 15, LongID = 16, Dispatcher = 17, Throw = 18, Printf = 19, Scanf = 20,
			Auto = 21, Break = 22, Case = 23, Char = 24, Const = 25, Continue = 26, Default = 27,
			Do = 28, Double = 29, Else = 30, Enum = 31, Extern = 32, Float = 33, For = 34, Goto = 35,
			If = 36, Inline = 37, Int = 38, Long = 39, Register = 40, Restrict = 41, Return = 42,
			Short = 43, Signed = 44, Sizeof = 45, Static = 46, Struct = 47, Switch = 48, Typedef = 49,
			Union = 50, Unsigned = 51, Void = 52, Volatile = 53, While = 54, Alignas = 55, Alignof = 56,
			Atomic = 57, GccBool = 58, Complex = 59, Generic = 60, Imaginary = 61, Noreturn = 62,
			StaticAssert = 63, ThreadLocal = 64, LeftParen = 65, RightParen = 66, LeftBracket = 67,
			RightBracket = 68, LeftBrace = 69, RightBrace = 70, Less = 71, LessEqual = 72, Greater = 73,
			GreaterEqual = 74, LeftShift = 75, RightShift = 76, Plus = 77, PlusPlus = 78, Minus = 79,
			MinusMinus = 80, Star = 81, Div = 82, Mod = 83, And = 84, Or = 85, AndAnd = 86, OrOr = 87,
			Caret = 88, Not = 89, Tilde = 90, Question = 91, Colon = 92, Semi = 93, Comma = 94,
			Assign = 95, StarAssign = 96, DivAssign = 97, ModAssign = 98, PlusAssign = 99, MinusAssign = 100,
			LeftShiftAssign = 101, RightShiftAssign = 102, AndAssign = 103, XorAssign = 104,
			OrAssign = 105, Equal = 106, NotEqual = 107, Arrow = 108, Dot = 109, Ellipsis = 110,
			Identifier = 111, Constant = 112, DigitSequence = 113, StringLiteral = 114, Whitespace = 115,
			Newline = 116, BlockComment = 117, LineComment = 118;
	public static final int
			RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2,
			RULE_functionDefinition = 3, RULE_structDeclaration = 4, RULE_initializedDeclaration = 5,
			RULE_initDeclaratorList = 6, RULE_initDeclarator = 7, RULE_directDeclarator = 8,
			RULE_declarationSpecifier = 9, RULE_primaryExpression = 10, RULE_postfixExpression = 11,
			RULE_argumentExpressionList = 12, RULE_unaryExpression = 13, RULE_unaryOperator = 14,
			RULE_simpleExpression = 15, RULE_multiplicativeExpression = 16, RULE_additiveExpression = 17,
			RULE_shiftExpression = 18, RULE_relationalExpression = 19, RULE_equalityExpression = 20,
			RULE_andExpression = 21, RULE_exclusiveOrExpression = 22, RULE_inclusiveOrExpression = 23,
			RULE_logicalAndExpression = 24, RULE_logicalOrExpression = 25, RULE_conditionalExpression = 26,
			RULE_assignmentExpression = 27, RULE_assignmentOperator = 28, RULE_expression = 29,
			RULE_constantExpression = 30, RULE_primitiveType = 31, RULE_classType = 32,
			RULE_typeSpecifier = 33, RULE_structOrUnionSpecifier = 34, RULE_structOrUnion = 35,
			RULE_structDeclarationList = 36, RULE_specifierQualifierList = 37, RULE_enumSpecifier = 38,
			RULE_enumeratorList = 39, RULE_enumerator = 40, RULE_enumerationConstant = 41,
			RULE_typeQualifier = 42, RULE_nestedParenthesesBlock = 43, RULE_parameterList = 44,
			RULE_parameterDeclaration = 45, RULE_typeName = 46, RULE_initializer = 47,
			RULE_initializerList = 48, RULE_designation = 49, RULE_designatorList = 50,
			RULE_designator = 51, RULE_statement = 52, RULE_labeledStatement = 53,
			RULE_compoundStatement = 54, RULE_blockItemList = 55, RULE_blockItem = 56,
			RULE_expressionStatement = 57, RULE_selectionStatement = 58, RULE_iterationStatement = 59,
			RULE_forCondition = 60, RULE_forDeclaration = 61, RULE_forExpression = 62,
			RULE_jumpStatement = 63;

	private static String[] makeRuleNames() {
		return new String[]{
				"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition",
				"structDeclaration", "initializedDeclaration", "initDeclaratorList",
				"initDeclarator", "directDeclarator", "declarationSpecifier", "primaryExpression",
				"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator",
				"simpleExpression", "multiplicativeExpression", "additiveExpression",
				"shiftExpression", "relationalExpression", "equalityExpression", "andExpression",
				"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression",
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
				"'long_id'", "'dispatcher'", "'throw'", "'printf'", "'scanf'", "'auto'",
				"'break'", "'case'", "'char'", "'const'", "'continue'", "'default'",
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
				null, "Byte", "Int16", "Int32", "Int64", "Int128", "Float32", "Float64",
				"Float128", "Bool", "Array", "String", "StringBuffer", "PublicKey", "Message",
				"Signature", "LongID", "Dispatcher", "Throw", "Printf", "Scanf", "Auto",
				"Break", "Case", "Char", "Const", "Continue", "Default", "Do", "Double",
				"Else", "Enum", "Extern", "Float", "For", "Goto", "If", "Inline", "Int",
				"Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof",
				"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Void",
				"Volatile", "While", "Alignas", "Alignof", "Atomic", "GccBool", "Complex",
				"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen",
				"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace",
				"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift",
				"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And",
				"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon",
				"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign",
				"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign",
				"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier",
				"Constant", "DigitSequence", "StringLiteral", "Whitespace", "Newline",
				"BlockComment", "LineComment"
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
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
					{
						setState(128);
						translationUnit();
					}
				}

				setState(131);
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
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(133);
							externalDeclaration();
						}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi);
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
			setState(142);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(138);
					functionDefinition();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(139);
					structDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(140);
					initializedDeclaration();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(141);
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

		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class, 0);
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

		public TerminalNode Dispatcher() {
			return getToken(ArgCParser.Dispatcher, 0);
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
			setState(155);
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
					setState(144);
					primitiveType();
					setState(145);
					directDeclarator();
					setState(146);
					match(LeftParen);
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
						{
							setState(147);
							parameterList();
						}
					}

					setState(150);
					match(RightParen);
					setState(151);
					compoundStatement();
				}
				break;
				case Dispatcher:
					enterOuterAlt(_localctx, 2);
				{
					setState(153);
					match(Dispatcher);
					setState(154);
					compoundStatement();
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 1);
				{
					setState(157);
					structOrUnion();
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(158);
							match(Identifier);
						}
					}

					setState(161);
					match(LeftBrace);
					setState(162);
					structDeclarationList();
					setState(163);
					match(RightBrace);
					setState(164);
					match(Semi);
				}
				break;
				case Enum:
					enterOuterAlt(_localctx, 2);
				{
					setState(166);
					match(Enum);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Identifier) {
						{
							setState(167);
							match(Identifier);
						}
					}

					setState(170);
					match(LeftBrace);
					setState(171);
					enumeratorList();
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(172);
							match(Comma);
						}
					}

					setState(175);
					match(RightBrace);
					setState(176);
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
				setState(180);
				declarationSpecifier();
				setState(181);
				initDeclaratorList();
				setState(182);
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
				setState(184);
				initDeclarator();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(185);
							match(Comma);
							setState(186);
							initDeclarator();
						}
					}
					setState(191);
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
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class, 0);
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
				setState(192);
				directDeclarator();
				setState(193);
				match(Assign);
				setState(194);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(ArgCParser.Identifier, 0);
		}

		public TerminalNode Colon() {
			return getToken(ArgCParser.Colon, 0);
		}

		public TerminalNode DigitSequence() {
			return getToken(ArgCParser.DigitSequence, 0);
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
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_directDeclarator);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(196);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(197);
					match(Identifier);
					setState(198);
					match(Colon);
					setState(199);
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
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Const || _la == Static) {
					{
						{
							setState(202);
							typeQualifier();
						}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
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
		enterRule(_localctx, 20, RULE_primaryExpression);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(210);
					match(Identifier);
				}
				break;
				case Constant:
					enterOuterAlt(_localctx, 2);
				{
					setState(211);
					match(Constant);
				}
				break;
				case StringLiteral:
					enterOuterAlt(_localctx, 3);
				{
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(212);
								match(StringLiteral);
							}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == StringLiteral);
				}
				break;
				case LeftParen:
					enterOuterAlt(_localctx, 4);
				{
					setState(217);
					match(LeftParen);
					setState(218);
					expression();
					setState(219);
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
		enterRule(_localctx, 22, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case Identifier:
					case Constant:
					case StringLiteral: {
						setState(223);
						primaryExpression();
					}
					break;
					case LeftBrace: {
						setState(224);
						match(LeftBrace);
						setState(225);
						initializerList();
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Comma) {
							{
								setState(226);
								match(Comma);
							}
						}

						setState(229);
						match(RightBrace);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)))) != 0)) {
					{
						setState(245);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case LeftBracket: {
								setState(233);
								match(LeftBracket);
								setState(234);
								expression();
								setState(235);
								match(RightBracket);
							}
							break;
							case LeftParen: {
								setState(237);
								match(LeftParen);
								setState(239);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
									{
										setState(238);
										argumentExpressionList();
									}
								}

								setState(241);
								match(RightParen);
							}
							break;
							case Arrow:
							case Dot: {
								setState(242);
								_la = _input.LA(1);
								if (!(_la == Arrow || _la == Dot)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(243);
								match(Identifier);
							}
							break;
							case PlusPlus:
							case MinusMinus: {
								setState(244);
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
					setState(249);
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
		enterRule(_localctx, 24, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(250);
				assignmentExpression();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(251);
							match(Comma);
							setState(252);
							assignmentExpression();
						}
					}
					setState(257);
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
		enterRule(_localctx, 26, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(258);
								_la = _input.LA(1);
								if (!(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (Sizeof - 45)) | (1L << (PlusPlus - 45)) | (1L << (MinusMinus - 45)))) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
				}
				setState(273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case LeftBrace:
					case Identifier:
					case Constant:
					case StringLiteral: {
						setState(264);
						postfixExpression();
					}
					break;
					case Plus:
					case Minus:
					case Not:
					case Tilde: {
						setState(265);
						unaryOperator();
						setState(266);
						simpleExpression();
					}
					break;
					case Sizeof: {
						{
							setState(268);
							match(Sizeof);
						}
						setState(269);
						match(LeftParen);
						setState(270);
						typeName();
						setState(271);
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
		enterRule(_localctx, 28, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(275);
				_la = _input.LA(1);
				if (!(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Plus - 77)) | (1L << (Minus - 77)) | (1L << (Not - 77)) | (1L << (Tilde - 77)))) != 0))) {
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
		enterRule(_localctx, 30, RULE_simpleExpression);
		try {
			setState(279);
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
					setState(277);
					unaryExpression();
				}
				break;
				case DigitSequence:
					enterOuterAlt(_localctx, 2);
				{
					setState(278);
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
		enterRule(_localctx, 32, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(281);
				simpleExpression();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Star - 81)) | (1L << (Div - 81)) | (1L << (Mod - 81)))) != 0)) {
					{
						{
							setState(282);
							_la = _input.LA(1);
							if (!(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Star - 81)) | (1L << (Div - 81)) | (1L << (Mod - 81)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(283);
							simpleExpression();
						}
					}
					setState(288);
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
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(289);
				multiplicativeExpression();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Plus || _la == Minus) {
					{
						{
							setState(290);
							_la = _input.LA(1);
							if (!(_la == Plus || _la == Minus)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(291);
							multiplicativeExpression();
						}
					}
					setState(296);
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
		enterRule(_localctx, 36, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(297);
				additiveExpression();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LeftShift || _la == RightShift) {
					{
						{
							setState(298);
							_la = _input.LA(1);
							if (!(_la == LeftShift || _la == RightShift)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(299);
							additiveExpression();
						}
					}
					setState(304);
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
		enterRule(_localctx, 38, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(305);
				shiftExpression();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Less - 71)) | (1L << (LessEqual - 71)) | (1L << (Greater - 71)) | (1L << (GreaterEqual - 71)))) != 0)) {
					{
						{
							setState(306);
							_la = _input.LA(1);
							if (!(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Less - 71)) | (1L << (LessEqual - 71)) | (1L << (Greater - 71)) | (1L << (GreaterEqual - 71)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(307);
							shiftExpression();
						}
					}
					setState(312);
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
		enterRule(_localctx, 40, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(313);
				relationalExpression();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Equal || _la == NotEqual) {
					{
						{
							setState(314);
							_la = _input.LA(1);
							if (!(_la == Equal || _la == NotEqual)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(315);
							relationalExpression();
						}
					}
					setState(320);
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
		enterRule(_localctx, 42, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				equalityExpression();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == And) {
					{
						{
							setState(322);
							match(And);
							setState(323);
							equalityExpression();
						}
					}
					setState(328);
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
		enterRule(_localctx, 44, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(329);
				andExpression();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Caret) {
					{
						{
							setState(330);
							match(Caret);
							setState(331);
							andExpression();
						}
					}
					setState(336);
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
		enterRule(_localctx, 46, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				exclusiveOrExpression();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Or) {
					{
						{
							setState(338);
							match(Or);
							setState(339);
							exclusiveOrExpression();
						}
					}
					setState(344);
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
		enterRule(_localctx, 48, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(345);
				inclusiveOrExpression();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AndAnd) {
					{
						{
							setState(346);
							match(AndAnd);
							setState(347);
							inclusiveOrExpression();
						}
					}
					setState(352);
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
		enterRule(_localctx, 50, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(353);
				logicalAndExpression();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OrOr) {
					{
						{
							setState(354);
							match(OrOr);
							setState(355);
							logicalAndExpression();
						}
					}
					setState(360);
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
		enterRule(_localctx, 52, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				logicalOrExpression();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Question) {
					{
						setState(362);
						match(Question);
						setState(363);
						expression();
						setState(364);
						match(Colon);
						setState(365);
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
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(369);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(370);
					unaryExpression();
					setState(371);
					assignmentOperator();
					setState(372);
					assignmentExpression();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(374);
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
		enterRule(_localctx, 56, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(377);
				_la = _input.LA(1);
				if (!(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Assign - 95)) | (1L << (StarAssign - 95)) | (1L << (DivAssign - 95)) | (1L << (ModAssign - 95)) | (1L << (PlusAssign - 95)) | (1L << (MinusAssign - 95)) | (1L << (LeftShiftAssign - 95)) | (1L << (RightShiftAssign - 95)) | (1L << (AndAssign - 95)) | (1L << (XorAssign - 95)) | (1L << (OrAssign - 95)))) != 0))) {
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
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(379);
				assignmentExpression();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(380);
							match(Comma);
							setState(381);
							assignmentExpression();
						}
					}
					setState(386);
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
		enterRule(_localctx, 60, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(387);
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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(389);
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
		enterRule(_localctx, 64, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(391);
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
		enterRule(_localctx, 66, RULE_typeSpecifier);
		try {
			setState(408);
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
					setState(393);
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
					setState(394);
					classType();
				}
				break;
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 3);
				{
					setState(395);
					structOrUnionSpecifier();
				}
				break;
				case Enum:
					enterOuterAlt(_localctx, 4);
				{
					setState(396);
					enumSpecifier();
				}
				break;
				case Array:
					enterOuterAlt(_localctx, 5);
				{
					setState(397);
					match(Array);
					setState(398);
					match(Less);
					setState(399);
					primitiveType();
					setState(400);
					match(Comma);
					setState(401);
					match(Constant);
					setState(402);
					match(Greater);
				}
				break;
				case StringBuffer:
					enterOuterAlt(_localctx, 6);
				{
					setState(404);
					match(StringBuffer);
					setState(405);
					match(Less);
					setState(406);
					match(Constant);
					setState(407);
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
		enterRule(_localctx, 68, RULE_structOrUnionSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(410);
				structOrUnion();
				setState(411);
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
		enterRule(_localctx, 70, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(413);
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
		enterRule(_localctx, 72, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(415);
							initializedDeclaration();
						}
					}
					setState(418);
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
		enterRule(_localctx, 74, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(422);
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
						setState(420);
						typeSpecifier();
					}
					break;
					case Const:
					case Static: {
						setState(421);
						typeQualifier();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
					{
						setState(424);
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
		enterRule(_localctx, 76, RULE_enumSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(427);
				match(Enum);
				setState(428);
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
		enterRule(_localctx, 78, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(430);
				enumerator();
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(431);
								match(Comma);
								setState(432);
								enumerator();
							}
						}
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
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
		enterRule(_localctx, 80, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(438);
				enumerationConstant();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Assign) {
					{
						setState(439);
						match(Assign);
						setState(440);
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
		enterRule(_localctx, 82, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(443);
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
		enterRule(_localctx, 84, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(445);
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
		enterRule(_localctx, 86, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Throw) | (1L << Printf) | (1L << Scanf) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << GccBool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ThreadLocal - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
					{
						setState(452);
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
							case Printf:
							case Scanf:
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
							case Identifier:
							case Constant:
							case DigitSequence:
							case StringLiteral:
							case Whitespace:
							case Newline:
							case BlockComment:
							case LineComment: {
								setState(447);
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
								setState(448);
								match(LeftParen);
								setState(449);
								nestedParenthesesBlock();
								setState(450);
								match(RightParen);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(456);
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
		enterRule(_localctx, 88, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(457);
				parameterDeclaration();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(458);
							match(Comma);
							setState(459);
							parameterDeclaration();
						}
					}
					setState(464);
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

		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class, 0);
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
		enterRule(_localctx, 90, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(465);
				declarationSpecifier();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == And) {
					{
						setState(466);
						match(And);
					}
				}

				setState(469);
				directDeclarator();
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
		enterRule(_localctx, 92, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(471);
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
		enterRule(_localctx, 94, RULE_initializer);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(473);
					assignmentExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(474);
					match(LeftBrace);
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Dot - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
							setState(475);
							initializerList();
						}
					}

					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(478);
							match(Comma);
						}
					}

					setState(481);
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
		enterRule(_localctx, 96, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftBracket || _la == Dot) {
					{
						setState(484);
						designation();
					}
				}

				setState(487);
				initializer();
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 51, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(488);
								match(Comma);
								setState(490);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LeftBracket || _la == Dot) {
									{
										setState(489);
										designation();
									}
								}

								setState(492);
								initializer();
							}
						}
					}
					setState(497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 51, _ctx);
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
		enterRule(_localctx, 98, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(498);
				designatorList();
				setState(499);
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
		enterRule(_localctx, 100, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(501);
							designator();
						}
					}
					setState(504);
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
		enterRule(_localctx, 102, RULE_designator);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LeftBracket:
					enterOuterAlt(_localctx, 1);
				{
					setState(506);
					match(LeftBracket);
					setState(507);
					constantExpression();
					setState(508);
					match(RightBracket);
				}
				break;
				case Dot:
					enterOuterAlt(_localctx, 2);
				{
					setState(510);
					match(Dot);
					setState(511);
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
		enterRule(_localctx, 104, RULE_statement);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(514);
					labeledStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(515);
					compoundStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(516);
					expressionStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(517);
					selectionStatement();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(518);
					iterationStatement();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(519);
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
		enterRule(_localctx, 106, RULE_labeledStatement);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Case:
					enterOuterAlt(_localctx, 1);
				{
					setState(522);
					match(Case);
					setState(523);
					constantExpression();
					setState(524);
					match(Colon);
					setState(525);
					statement();
				}
				break;
				case Default:
					enterOuterAlt(_localctx, 2);
				{
					setState(527);
					match(Default);
					setState(528);
					match(Colon);
					setState(529);
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
		enterRule(_localctx, 108, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(532);
				match(LeftBrace);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
						setState(533);
						blockItemList();
					}
				}

				setState(536);
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
		enterRule(_localctx, 110, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(538);
							blockItem();
						}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0));
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
		enterRule(_localctx, 112, RULE_blockItem);
		try {
			setState(545);
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
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
					enterOuterAlt(_localctx, 1);
				{
					setState(543);
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
					setState(544);
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
		enterRule(_localctx, 114, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
						setState(547);
						expression();
					}
				}

				setState(550);
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
		enterRule(_localctx, 116, RULE_selectionStatement);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case If:
					enterOuterAlt(_localctx, 1);
				{
					setState(552);
					match(If);
					setState(553);
					match(LeftParen);
					setState(554);
					expression();
					setState(555);
					match(RightParen);
					setState(556);
					statement();
					setState(559);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 60, _ctx)) {
						case 1: {
							setState(557);
							match(Else);
							setState(558);
							statement();
						}
						break;
					}
				}
				break;
				case Switch:
					enterOuterAlt(_localctx, 2);
				{
					setState(561);
					match(Switch);
					setState(562);
					match(LeftParen);
					setState(563);
					expression();
					setState(564);
					match(RightParen);
					setState(565);
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
		enterRule(_localctx, 118, RULE_iterationStatement);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case While:
					enterOuterAlt(_localctx, 1);
				{
					setState(569);
					match(While);
					setState(570);
					match(LeftParen);
					setState(571);
					expression();
					setState(572);
					match(RightParen);
					setState(573);
					statement();
				}
				break;
				case Do:
					enterOuterAlt(_localctx, 2);
				{
					setState(575);
					match(Do);
					setState(576);
					statement();
					setState(577);
					match(While);
					setState(578);
					match(LeftParen);
					setState(579);
					expression();
					setState(580);
					match(RightParen);
					setState(581);
					match(Semi);
				}
				break;
				case For:
					enterOuterAlt(_localctx, 3);
				{
					setState(583);
					match(For);
					setState(584);
					match(LeftParen);
					setState(585);
					forCondition();
					setState(586);
					match(RightParen);
					setState(587);
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
		enterRule(_localctx, 120, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(595);
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
						setState(591);
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
					case Identifier:
					case Constant:
					case DigitSequence:
					case StringLiteral: {
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
								setState(592);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(597);
				match(Semi);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
						setState(598);
						forExpression();
					}
				}

				setState(601);
				match(Semi);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
						setState(602);
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
		enterRule(_localctx, 122, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(605);
				declarationSpecifier();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(606);
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
		enterRule(_localctx, 124, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(609);
				assignmentExpression();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(610);
							match(Comma);
							setState(611);
							assignmentExpression();
						}
					}
					setState(616);
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
		enterRule(_localctx, 126, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(623);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Continue: {
						setState(617);
						match(Continue);
					}
					break;
					case Break: {
						setState(618);
						match(Break);
					}
					break;
					case Return: {
						setState(619);
						match(Return);
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
								setState(620);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(625);
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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u0276\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0084\n\2\3\2\3\2\3\3\6\3\u0089\n\3\r" +
					"\3\16\3\u008a\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\5\3\5\5\5\u0097" +
					"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\5\6\u00a2\n\6\3\6\3\6\3" +
					"\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\5\6\u00b0\n\6\3\6\3\6\3\6" +
					"\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u00be\n\b\f\b\16\b\u00c1" +
					"\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00cb\n\n\3\13\7\13\u00ce\n" +
					"\13\f\13\16\13\u00d1\13\13\3\13\3\13\3\f\3\f\3\f\6\f\u00d8\n\f\r\f\16" +
					"\f\u00d9\3\f\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3" +
					"\r\3\r\5\r\u00ea\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3\r\3\r\3\r" +
					"\3\r\7\r\u00f8\n\r\f\r\16\r\u00fb\13\r\3\16\3\16\3\16\7\16\u0100\n\16" +
					"\f\16\16\16\u0103\13\16\3\17\7\17\u0106\n\17\f\17\16\17\u0109\13\17\3" +
					"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0114\n\17\3\20\3\20" +
					"\3\21\3\21\5\21\u011a\n\21\3\22\3\22\3\22\7\22\u011f\n\22\f\22\16\22\u0122" +
					"\13\22\3\23\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a\13\23\3\24\3\24" +
					"\3\24\7\24\u012f\n\24\f\24\16\24\u0132\13\24\3\25\3\25\3\25\7\25\u0137" +
					"\n\25\f\25\16\25\u013a\13\25\3\26\3\26\3\26\7\26\u013f\n\26\f\26\16\26" +
					"\u0142\13\26\3\27\3\27\3\27\7\27\u0147\n\27\f\27\16\27\u014a\13\27\3\30" +
					"\3\30\3\30\7\30\u014f\n\30\f\30\16\30\u0152\13\30\3\31\3\31\3\31\7\31" +
					"\u0157\n\31\f\31\16\31\u015a\13\31\3\32\3\32\3\32\7\32\u015f\n\32\f\32" +
					"\16\32\u0162\13\32\3\33\3\33\3\33\7\33\u0167\n\33\f\33\16\33\u016a\13" +
					"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0172\n\34\3\35\3\35\3\35\3\35" +
					"\3\35\3\35\5\35\u017a\n\35\3\36\3\36\3\37\3\37\3\37\7\37\u0181\n\37\f" +
					"\37\16\37\u0184\13\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
					"#\3#\3#\3#\3#\3#\5#\u019b\n#\3$\3$\3$\3%\3%\3&\6&\u01a3\n&\r&\16&\u01a4" +
					"\3\'\3\'\5\'\u01a9\n\'\3\'\5\'\u01ac\n\'\3(\3(\3(\3)\3)\3)\7)\u01b4\n" +
					")\f)\16)\u01b7\13)\3*\3*\3*\5*\u01bc\n*\3+\3+\3,\3,\3-\3-\3-\3-\3-\7-" +
					"\u01c7\n-\f-\16-\u01ca\13-\3.\3.\3.\7.\u01cf\n.\f.\16.\u01d2\13.\3/\3" +
					"/\5/\u01d6\n/\3/\3/\3\60\3\60\3\61\3\61\3\61\5\61\u01df\n\61\3\61\5\61" +
					"\u01e2\n\61\3\61\5\61\u01e5\n\61\3\62\5\62\u01e8\n\62\3\62\3\62\3\62\5" +
					"\62\u01ed\n\62\3\62\7\62\u01f0\n\62\f\62\16\62\u01f3\13\62\3\63\3\63\3" +
					"\63\3\64\6\64\u01f9\n\64\r\64\16\64\u01fa\3\65\3\65\3\65\3\65\3\65\3\65" +
					"\5\65\u0203\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u020b\n\66\3\67\3" +
					"\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0215\n\67\38\38\58\u0219\n8\3" +
					"8\38\39\69\u021e\n9\r9\169\u021f\3:\3:\5:\u0224\n:\3;\5;\u0227\n;\3;\3" +
					";\3<\3<\3<\3<\3<\3<\3<\5<\u0232\n<\3<\3<\3<\3<\3<\3<\5<\u023a\n<\3=\3" +
					"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0250\n=\3" +
					">\3>\5>\u0254\n>\5>\u0256\n>\3>\3>\5>\u025a\n>\3>\3>\5>\u025e\n>\3?\3" +
					"?\5?\u0262\n?\3@\3@\3@\7@\u0267\n@\f@\16@\u026a\13@\3A\3A\3A\3A\5A\u0270" +
					"\nA\5A\u0272\nA\3A\3A\3A\2\2B\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 " +
					"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\21\3" +
					"\2no\4\2PPRR\5\2//PPRR\5\2OOQQ[\\\3\2SU\4\2OOQQ\3\2MN\3\2IL\3\2lm\3\2" +
					"ak\4\2\3\13\66\66\4\2\r\r\17\22\4\2\61\61\64\64\4\2\33\33\60\60\3\2CD" +
					"\2\u028e\2\u0083\3\2\2\2\4\u0088\3\2\2\2\6\u0090\3\2\2\2\b\u009d\3\2\2" +
					"\2\n\u00b4\3\2\2\2\f\u00b6\3\2\2\2\16\u00ba\3\2\2\2\20\u00c2\3\2\2\2\22" +
					"\u00ca\3\2\2\2\24\u00cf\3\2\2\2\26\u00df\3\2\2\2\30\u00e9\3\2\2\2\32\u00fc" +
					"\3\2\2\2\34\u0107\3\2\2\2\36\u0115\3\2\2\2 \u0119\3\2\2\2\"\u011b\3\2" +
					"\2\2$\u0123\3\2\2\2&\u012b\3\2\2\2(\u0133\3\2\2\2*\u013b\3\2\2\2,\u0143" +
					"\3\2\2\2.\u014b\3\2\2\2\60\u0153\3\2\2\2\62\u015b\3\2\2\2\64\u0163\3\2" +
					"\2\2\66\u016b\3\2\2\28\u0179\3\2\2\2:\u017b\3\2\2\2<\u017d\3\2\2\2>\u0185" +
					"\3\2\2\2@\u0187\3\2\2\2B\u0189\3\2\2\2D\u019a\3\2\2\2F\u019c\3\2\2\2H" +
					"\u019f\3\2\2\2J\u01a2\3\2\2\2L\u01a8\3\2\2\2N\u01ad\3\2\2\2P\u01b0\3\2" +
					"\2\2R\u01b8\3\2\2\2T\u01bd\3\2\2\2V\u01bf\3\2\2\2X\u01c8\3\2\2\2Z\u01cb" +
					"\3\2\2\2\\\u01d3\3\2\2\2^\u01d9\3\2\2\2`\u01e4\3\2\2\2b\u01e7\3\2\2\2" +
					"d\u01f4\3\2\2\2f\u01f8\3\2\2\2h\u0202\3\2\2\2j\u020a\3\2\2\2l\u0214\3" +
					"\2\2\2n\u0216\3\2\2\2p\u021d\3\2\2\2r\u0223\3\2\2\2t\u0226\3\2\2\2v\u0239" +
					"\3\2\2\2x\u024f\3\2\2\2z\u0255\3\2\2\2|\u025f\3\2\2\2~\u0263\3\2\2\2\u0080" +
					"\u0271\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2" +
					"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u0089" +
					"\5\6\4\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a" +
					"\u008b\3\2\2\2\u008b\5\3\2\2\2\u008c\u0091\5\b\5\2\u008d\u0091\5\n\6\2" +
					"\u008e\u0091\5\f\7\2\u008f\u0091\7_\2\2\u0090\u008c\3\2\2\2\u0090\u008d" +
					"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\7\3\2\2\2\u0092" +
					"\u0093\5@!\2\u0093\u0094\5\22\n\2\u0094\u0096\7C\2\2\u0095\u0097\5Z.\2" +
					"\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099" +
					"\7D\2\2\u0099\u009a\5n8\2\u009a\u009e\3\2\2\2\u009b\u009c\7\23\2\2\u009c" +
					"\u009e\5n8\2\u009d\u0092\3\2\2\2\u009d\u009b\3\2\2\2\u009e\t\3\2\2\2\u009f" +
					"\u00a1\5H%\2\u00a0\u00a2\7q\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2" +
					"\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\5J&\2\u00a5\u00a6" +
					"\7H\2\2\u00a6\u00a7\7_\2\2\u00a7\u00b5\3\2\2\2\u00a8\u00aa\7!\2\2\u00a9" +
					"\u00ab\7q\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2" +
					"\2\2\u00ac\u00ad\7G\2\2\u00ad\u00af\5P)\2\u00ae\u00b0\7`\2\2\u00af\u00ae" +
					"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7H\2\2\u00b2" +
					"\u00b3\7_\2\2\u00b3\u00b5\3\2\2\2\u00b4\u009f\3\2\2\2\u00b4\u00a8\3\2" +
					"\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\5\16\b\2\u00b8" +
					"\u00b9\7_\2\2\u00b9\r\3\2\2\2\u00ba\u00bf\5\20\t\2\u00bb\u00bc\7`\2\2" +
					"\u00bc\u00be\5\20\t\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd" +
					"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\17\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2" +
					"\u00c3\5\22\n\2\u00c3\u00c4\7a\2\2\u00c4\u00c5\5`\61\2\u00c5\21\3\2\2" +
					"\2\u00c6\u00cb\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7^\2\2\u00c9\u00cb" +
					"\7s\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\23\3\2\2\2\u00cc" +
					"\u00ce\5V,\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2" +
					"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3" +
					"\5D#\2\u00d3\25\3\2\2\2\u00d4\u00e0\7q\2\2\u00d5\u00e0\7r\2\2\u00d6\u00d8" +
					"\7t\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9" +
					"\u00da\3\2\2\2\u00da\u00e0\3\2\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\5<\37" +
					"\2\u00dd\u00de\7D\2\2\u00de\u00e0\3\2\2\2\u00df\u00d4\3\2\2\2\u00df\u00d5" +
					"\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\27\3\2\2\2\u00e1" +
					"\u00ea\5\26\f\2\u00e2\u00e3\7G\2\2\u00e3\u00e5\5b\62\2\u00e4\u00e6\7`" +
					"\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7" +
					"\u00e8\7H\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2" +
					"\2\2\u00ea\u00f9\3\2\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\5<\37\2\u00ed" +
					"\u00ee\7F\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f1\7C\2\2\u00f0\u00f2\5\32" +
					"\16\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3" +
					"\u00f8\7D\2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f8\7q\2\2\u00f6\u00f8\t\3\2" +
					"\2\u00f7\u00eb\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6" +
					"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa" +
					"\31\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0101\58\35\2\u00fd\u00fe\7`\2\2" +
					"\u00fe\u0100\58\35\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff" +
					"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2\2\u0103\u0101\3\2\2\2\u0104" +
					"\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2" +
					"\2\2\u0107\u0108\3\2\2\2\u0108\u0113\3\2\2\2\u0109\u0107\3\2\2\2\u010a" +
					"\u0114\5\30\r\2\u010b\u010c\5\36\20\2\u010c\u010d\5 \21\2\u010d\u0114" +
					"\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7C\2\2\u0110\u0111\5^\60\2\u0111" +
					"\u0112\7D\2\2\u0112\u0114\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2" +
					"\2\2\u0113\u010e\3\2\2\2\u0114\35\3\2\2\2\u0115\u0116\t\5\2\2\u0116\37" +
					"\3\2\2\2\u0117\u011a\5\34\17\2\u0118\u011a\7s\2\2\u0119\u0117\3\2\2\2" +
					"\u0119\u0118\3\2\2\2\u011a!\3\2\2\2\u011b\u0120\5 \21\2\u011c\u011d\t" +
					"\6\2\2\u011d\u011f\5 \21\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120" +
					"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121#\3\2\2\2\u0122\u0120\3\2\2\2" +
					"\u0123\u0128\5\"\22\2\u0124\u0125\t\7\2\2\u0125\u0127\5\"\22\2\u0126\u0124" +
					"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129" +
					"%\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0130\5$\23\2\u012c\u012d\t\b\2\2" +
					"\u012d\u012f\5$\23\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e" +
					"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\'\3\2\2\2\u0132\u0130\3\2\2\2\u0133" +
					"\u0138\5&\24\2\u0134\u0135\t\t\2\2\u0135\u0137\5&\24\2\u0136\u0134\3\2" +
					"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139" +
					")\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0140\5(\25\2\u013c\u013d\t\n\2\2" +
					"\u013d\u013f\5(\25\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e" +
					"\3\2\2\2\u0140\u0141\3\2\2\2\u0141+\3\2\2\2\u0142\u0140\3\2\2\2\u0143" +
					"\u0148\5*\26\2\u0144\u0145\7V\2\2\u0145\u0147\5*\26\2\u0146\u0144\3\2" +
					"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149" +
					"-\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0150\5,\27\2\u014c\u014d\7Z\2\2\u014d" +
					"\u014f\5,\27\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2" +
					"\2\2\u0150\u0151\3\2\2\2\u0151/\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0158" +
					"\5.\30\2\u0154\u0155\7W\2\2\u0155\u0157\5.\30\2\u0156\u0154\3\2\2\2\u0157" +
					"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\61\3\2\2" +
					"\2\u015a\u0158\3\2\2\2\u015b\u0160\5\60\31\2\u015c\u015d\7X\2\2\u015d" +
					"\u015f\5\60\31\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3" +
					"\2\2\2\u0160\u0161\3\2\2\2\u0161\63\3\2\2\2\u0162\u0160\3\2\2\2\u0163" +
					"\u0168\5\62\32\2\u0164\u0165\7Y\2\2\u0165\u0167\5\62\32\2\u0166\u0164" +
					"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169" +
					"\65\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0171\5\64\33\2\u016c\u016d\7]\2" +
					"\2\u016d\u016e\5<\37\2\u016e\u016f\7^\2\2\u016f\u0170\5\66\34\2\u0170" +
					"\u0172\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u0172\3\2\2\2\u0172\67\3\2\2" +
					"\2\u0173\u017a\5\66\34\2\u0174\u0175\5\34\17\2\u0175\u0176\5:\36\2\u0176" +
					"\u0177\58\35\2\u0177\u017a\3\2\2\2\u0178\u017a\7s\2\2\u0179\u0173\3\2" +
					"\2\2\u0179\u0174\3\2\2\2\u0179\u0178\3\2\2\2\u017a9\3\2\2\2\u017b\u017c" +
					"\t\13\2\2\u017c;\3\2\2\2\u017d\u0182\58\35\2\u017e\u017f\7`\2\2\u017f" +
					"\u0181\58\35\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2" +
					"\2\2\u0182\u0183\3\2\2\2\u0183=\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186" +
					"\5\66\34\2\u0186?\3\2\2\2\u0187\u0188\t\f\2\2\u0188A\3\2\2\2\u0189\u018a" +
					"\t\r\2\2\u018aC\3\2\2\2\u018b\u019b\5@!\2\u018c\u019b\5B\"\2\u018d\u019b" +
					"\5F$\2\u018e\u019b\5N(\2\u018f\u0190\7\f\2\2\u0190\u0191\7I\2\2\u0191" +
					"\u0192\5@!\2\u0192\u0193\7`\2\2\u0193\u0194\7r\2\2\u0194\u0195\7K\2\2" +
					"\u0195\u019b\3\2\2\2\u0196\u0197\7\16\2\2\u0197\u0198\7I\2\2\u0198\u0199" +
					"\7r\2\2\u0199\u019b\7K\2\2\u019a\u018b\3\2\2\2\u019a\u018c\3\2\2\2\u019a" +
					"\u018d\3\2\2\2\u019a\u018e\3\2\2\2\u019a\u018f\3\2\2\2\u019a\u0196\3\2" +
					"\2\2\u019bE\3\2\2\2\u019c\u019d\5H%\2\u019d\u019e\7q\2\2\u019eG\3\2\2" +
					"\2\u019f\u01a0\t\16\2\2\u01a0I\3\2\2\2\u01a1\u01a3\5\f\7\2\u01a2\u01a1" +
					"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5" +
					"K\3\2\2\2\u01a6\u01a9\5D#\2\u01a7\u01a9\5V,\2\u01a8\u01a6\3\2\2\2\u01a8" +
					"\u01a7\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5L\'\2\u01ab\u01aa\3\2" +
					"\2\2\u01ab\u01ac\3\2\2\2\u01acM\3\2\2\2\u01ad\u01ae\7!\2\2\u01ae\u01af" +
					"\7q\2\2\u01afO\3\2\2\2\u01b0\u01b5\5R*\2\u01b1\u01b2\7`\2\2\u01b2\u01b4" +
					"\5R*\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5" +
					"\u01b6\3\2\2\2\u01b6Q\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\5T+\2\u01b9" +
					"\u01ba\7a\2\2\u01ba\u01bc\5> \2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2" +
					"\2\u01bcS\3\2\2\2\u01bd\u01be\7q\2\2\u01beU\3\2\2\2\u01bf\u01c0\t\17\2" +
					"\2\u01c0W\3\2\2\2\u01c1\u01c7\n\20\2\2\u01c2\u01c3\7C\2\2\u01c3\u01c4" +
					"\5X-\2\u01c4\u01c5\7D\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6" +
					"\u01c2\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2" +
					"\2\2\u01c9Y\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01d0\5\\/\2\u01cc\u01cd" +
					"\7`\2\2\u01cd\u01cf\5\\/\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0" +
					"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1[\3\2\2\2\u01d2\u01d0\3\2\2\2" +
					"\u01d3\u01d5\5\24\13\2\u01d4\u01d6\7V\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6" +
					"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5\22\n\2\u01d8]\3\2\2\2\u01d9" +
					"\u01da\5L\'\2\u01da_\3\2\2\2\u01db\u01e5\58\35\2\u01dc\u01de\7G\2\2\u01dd" +
					"\u01df\5b\62\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2" +
					"\2\2\u01e0\u01e2\7`\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2" +
					"\u01e3\3\2\2\2\u01e3\u01e5\7H\2\2\u01e4\u01db\3\2\2\2\u01e4\u01dc\3\2" +
					"\2\2\u01e5a\3\2\2\2\u01e6\u01e8\5d\63\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8" +
					"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f1\5`\61\2\u01ea\u01ec\7`\2\2\u01eb" +
					"\u01ed\5d\63\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2" +
					"\2\2\u01ee\u01f0\5`\61\2\u01ef\u01ea\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1" +
					"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2c\3\2\2\2\u01f3\u01f1\3\2\2\2" +
					"\u01f4\u01f5\5f\64\2\u01f5\u01f6\7a\2\2\u01f6e\3\2\2\2\u01f7\u01f9\5h" +
					"\65\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa" +
					"\u01fb\3\2\2\2\u01fbg\3\2\2\2\u01fc\u01fd\7E\2\2\u01fd\u01fe\5> \2\u01fe" +
					"\u01ff\7F\2\2\u01ff\u0203\3\2\2\2\u0200\u0201\7o\2\2\u0201\u0203\7q\2" +
					"\2\u0202\u01fc\3\2\2\2\u0202\u0200\3\2\2\2\u0203i\3\2\2\2\u0204\u020b" +
					"\5l\67\2\u0205\u020b\5n8\2\u0206\u020b\5t;\2\u0207\u020b\5v<\2\u0208\u020b" +
					"\5x=\2\u0209\u020b\5\u0080A\2\u020a\u0204\3\2\2\2\u020a\u0205\3\2\2\2" +
					"\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209" +
					"\3\2\2\2\u020bk\3\2\2\2\u020c\u020d\7\31\2\2\u020d\u020e\5> \2\u020e\u020f" +
					"\7^\2\2\u020f\u0210\5j\66\2\u0210\u0215\3\2\2\2\u0211\u0212\7\35\2\2\u0212" +
					"\u0213\7^\2\2\u0213\u0215\5j\66\2\u0214\u020c\3\2\2\2\u0214\u0211\3\2" +
					"\2\2\u0215m\3\2\2\2\u0216\u0218\7G\2\2\u0217\u0219\5p9\2\u0218\u0217\3" +
					"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7H\2\2\u021b" +
					"o\3\2\2\2\u021c\u021e\5r:\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f" +
					"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220q\3\2\2\2\u0221\u0224\5j\66\2" +
					"\u0222\u0224\5\f\7\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224s\3" +
					"\2\2\2\u0225\u0227\5<\37\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227" +
					"\u0228\3\2\2\2\u0228\u0229\7_\2\2\u0229u\3\2\2\2\u022a\u022b\7&\2\2\u022b" +
					"\u022c\7C\2\2\u022c\u022d\5<\37\2\u022d\u022e\7D\2\2\u022e\u0231\5j\66" +
					"\2\u022f\u0230\7 \2\2\u0230\u0232\5j\66\2\u0231\u022f\3\2\2\2\u0231\u0232" +
					"\3\2\2\2\u0232\u023a\3\2\2\2\u0233\u0234\7\62\2\2\u0234\u0235\7C\2\2\u0235" +
					"\u0236\5<\37\2\u0236\u0237\7D\2\2\u0237\u0238\5j\66\2\u0238\u023a\3\2" +
					"\2\2\u0239\u022a\3\2\2\2\u0239\u0233\3\2\2\2\u023aw\3\2\2\2\u023b\u023c" +
					"\78\2\2\u023c\u023d\7C\2\2\u023d\u023e\5<\37\2\u023e\u023f\7D\2\2\u023f" +
					"\u0240\5j\66\2\u0240\u0250\3\2\2\2\u0241\u0242\7\36\2\2\u0242\u0243\5" +
					"j\66\2\u0243\u0244\78\2\2\u0244\u0245\7C\2\2\u0245\u0246\5<\37\2\u0246" +
					"\u0247\7D\2\2\u0247\u0248\7_\2\2\u0248\u0250\3\2\2\2\u0249\u024a\7$\2" +
					"\2\u024a\u024b\7C\2\2\u024b\u024c\5z>\2\u024c\u024d\7D\2\2\u024d\u024e" +
					"\5j\66\2\u024e\u0250\3\2\2\2\u024f\u023b\3\2\2\2\u024f\u0241\3\2\2\2\u024f" +
					"\u0249\3\2\2\2\u0250y\3\2\2\2\u0251\u0256\5|?\2\u0252\u0254\5<\37\2\u0253" +
					"\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0251\3\2" +
					"\2\2\u0255\u0253\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\7_\2\2\u0258" +
					"\u025a\5~@\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2" +
					"\2\u025b\u025d\7_\2\2\u025c\u025e\5~@\2\u025d\u025c\3\2\2\2\u025d\u025e" +
					"\3\2\2\2\u025e{\3\2\2\2\u025f\u0261\5\24\13\2\u0260\u0262\5\16\b\2\u0261" +
					"\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262}\3\2\2\2\u0263\u0268\58\35\2" +
					"\u0264\u0265\7`\2\2\u0265\u0267\58\35\2\u0266\u0264\3\2\2\2\u0267\u026a" +
					"\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\177\3\2\2\2\u026a" +
					"\u0268\3\2\2\2\u026b\u0272\7\34\2\2\u026c\u0272\7\30\2\2\u026d\u026f\7" +
					",\2\2\u026e\u0270\5<\37\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270" +
					"\u0272\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u026c\3\2\2\2\u0271\u026d\3\2" +
					"\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7_\2\2\u0274\u0081\3\2\2\2I\u0083" +
					"\u008a\u0090\u0096\u009d\u00a1\u00aa\u00af\u00b4\u00bf\u00ca\u00cf\u00d9" +
					"\u00df\u00e5\u00e9\u00f1\u00f7\u00f9\u0101\u0107\u0113\u0119\u0120\u0128" +
					"\u0130\u0138\u0140\u0148\u0150\u0158\u0160\u0168\u0171\u0179\u0182\u019a" +
					"\u01a4\u01a8\u01ab\u01b5\u01bb\u01c6\u01c8\u01d0\u01d5\u01de\u01e1\u01e4" +
					"\u01e7\u01ec\u01f1\u01fa\u0202\u020a\u0214\u0218\u021f\u0223\u0226\u0231" +
					"\u0239\u024f\u0253\u0255\u0259\u025d\u0261\u0268\u026f\u0271";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}