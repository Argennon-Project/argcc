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
			RULE_specifierQualifierList = 39, RULE_typeQualifier = 40, RULE_nestedParenthesesBlock = 41,
			RULE_parameterList = 42, RULE_parameterDeclaration = 43, RULE_typeName = 44,
			RULE_initializer = 45, RULE_initializerList = 46, RULE_designation = 47,
			RULE_designatorList = 48, RULE_designator = 49, RULE_statement = 50, RULE_labeledStatement = 51,
			RULE_compoundStatement = 52, RULE_blockItemList = 53, RULE_blockItem = 54,
			RULE_expressionStatement = 55, RULE_selectionStatement = 56, RULE_iterationStatement = 57,
			RULE_forCondition = 58, RULE_forDeclaration = 59, RULE_forExpression = 60,
			RULE_jumpStatement = 61;

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
				"structDeclarationList", "specifierQualifierList", "typeQualifier", "nestedParenthesesBlock",
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
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Const) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
					{
						setState(124);
						translationUnit();
					}
				}

				setState(127);
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
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
					{
						{
							setState(129);
							externalDeclaration();
						}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(Dispatcher);
				setState(136);
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
				setState(144);
				primitiveType();
				setState(145);
				match(Identifier);
				setState(146);
				match(LeftParen);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
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
			enterOuterAlt(_localctx, 1);
			{
				setState(153);
				structOrUnion();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(154);
						match(Identifier);
					}
				}

				setState(157);
				match(LeftBrace);
				setState(158);
				structDeclarationList();
				setState(159);
				match(RightBrace);
				setState(160);
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
				setState(162);
				declarationSpecifier();
				setState(163);
				initDeclaratorList();
				setState(164);
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
				setState(166);
				initDeclarator();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(167);
							match(Comma);
							setState(168);
							initDeclarator();
						}
					}
					setState(173);
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
				setState(174);
				variableDeclarator();
				setState(175);
				match(Assign);
				setState(176);
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
			setState(182);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(178);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(179);
					match(Identifier);
					setState(180);
					match(Colon);
					setState(181);
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
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Const || _la == Static) {
					{
						{
							setState(184);
							typeQualifier();
						}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
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
			setState(204);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(192);
					variableUsage();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(193);
					functionCall();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(194);
					match(Constant);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(195);
								match(StringLiteral);
							}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == StringLiteral);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(200);
					match(LeftParen);
					setState(201);
					expression();
					setState(202);
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
				setState(206);
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
				setState(208);
				match(Identifier);
				setState(209);
				match(LeftParen);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(210);
						argumentExpressionList();
					}
				}

				setState(213);
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
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case Constant:
					case Identifier:
					case StringLiteral: {
						setState(215);
						primaryExpression();
					}
					break;
					case LeftBrace: {
						setState(216);
						match(LeftBrace);
						setState(217);
						initializerList();
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Comma) {
							{
								setState(218);
								match(Comma);
							}
						}

						setState(221);
						match(RightBrace);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)))) != 0)) {
					{
						setState(232);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case LeftBracket: {
								setState(225);
								match(LeftBracket);
								setState(226);
								expression();
								setState(227);
								match(RightBracket);
							}
							break;
							case Arrow:
							case Dot: {
								setState(229);
								_la = _input.LA(1);
								if (!(_la == Arrow || _la == Dot)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(230);
								variableUsage();
							}
							break;
							case PlusPlus:
							case MinusMinus: {
								setState(231);
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
					setState(236);
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
				setState(237);
				assignmentExpression();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(238);
							match(Comma);
							setState(239);
							assignmentExpression();
						}
					}
					setState(244);
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
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(245);
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
					setState(250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LeftParen:
					case LeftBrace:
					case Constant:
					case Identifier:
					case StringLiteral: {
						setState(251);
						postfixExpression();
					}
					break;
					case Plus:
					case Minus:
					case Not:
					case Tilde: {
						setState(252);
						unaryOperator();
						setState(253);
						simpleExpression();
					}
					break;
					case Sizeof: {
						{
							setState(255);
							match(Sizeof);
						}
						setState(256);
						match(LeftParen);
						setState(257);
						typeName();
						setState(258);
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
				setState(262);
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
			setState(266);
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
					setState(264);
					unaryExpression();
				}
				break;
				case DigitSequence:
					enterOuterAlt(_localctx, 2);
				{
					setState(265);
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
				setState(268);
				simpleExpression();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0)) {
					{
						{
							setState(269);
							_la = _input.LA(1);
							if (!(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Star - 79)) | (1L << (Div - 79)) | (1L << (Mod - 79)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(270);
							simpleExpression();
						}
					}
					setState(275);
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
				setState(276);
				multiplicativeExpression();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Plus || _la == Minus) {
					{
						{
							setState(277);
							_la = _input.LA(1);
							if (!(_la == Plus || _la == Minus)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(278);
							multiplicativeExpression();
						}
					}
					setState(283);
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
				setState(284);
				additiveExpression();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LeftShift || _la == RightShift) {
					{
						{
							setState(285);
							_la = _input.LA(1);
							if (!(_la == LeftShift || _la == RightShift)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(286);
							additiveExpression();
						}
					}
					setState(291);
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
				setState(292);
				shiftExpression();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0)) {
					{
						{
							setState(293);
							_la = _input.LA(1);
							if (!(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Less - 69)) | (1L << (LessEqual - 69)) | (1L << (Greater - 69)) | (1L << (GreaterEqual - 69)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(294);
							shiftExpression();
						}
					}
					setState(299);
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
				setState(300);
				relationalExpression();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Equal || _la == NotEqual) {
					{
						{
							setState(301);
							_la = _input.LA(1);
							if (!(_la == Equal || _la == NotEqual)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(302);
							relationalExpression();
						}
					}
					setState(307);
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
				setState(308);
				equalityExpression();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == And) {
					{
						{
							setState(309);
							match(And);
							setState(310);
							equalityExpression();
						}
					}
					setState(315);
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
				setState(316);
				andExpression();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Caret) {
					{
						{
							setState(317);
							match(Caret);
							setState(318);
							andExpression();
						}
					}
					setState(323);
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
				setState(324);
				exclusiveOrExpression();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Or) {
					{
						{
							setState(325);
							match(Or);
							setState(326);
							exclusiveOrExpression();
						}
					}
					setState(331);
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
				setState(332);
				inclusiveOrExpression();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AndAnd) {
					{
						{
							setState(333);
							match(AndAnd);
							setState(334);
							inclusiveOrExpression();
						}
					}
					setState(339);
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
				setState(340);
				logicalAndExpression();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OrOr) {
					{
						{
							setState(341);
							match(OrOr);
							setState(342);
							logicalAndExpression();
						}
					}
					setState(347);
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
				setState(348);
				logicalOrExpression();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Question) {
					{
						setState(349);
						match(Question);
						setState(350);
						expression();
						setState(351);
						match(Colon);
						setState(352);
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
			setState(362);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(356);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(357);
					unaryExpression();
					setState(358);
					assignmentOperator();
					setState(359);
					assignmentExpression();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(361);
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
				setState(364);
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
				setState(366);
				assignmentExpression();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(367);
							match(Comma);
							setState(368);
							assignmentExpression();
						}
					}
					setState(373);
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
				setState(374);
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
				setState(376);
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
				setState(378);
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
			setState(394);
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
					setState(380);
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
					setState(381);
					classType();
				}
				break;
				case Struct:
				case Union:
					enterOuterAlt(_localctx, 3);
				{
					setState(382);
					structOrUnionSpecifier();
				}
				break;
				case Array:
					enterOuterAlt(_localctx, 4);
				{
					setState(383);
					match(Array);
					setState(384);
					match(Less);
					setState(385);
					primitiveType();
					setState(386);
					match(Comma);
					setState(387);
					match(Constant);
					setState(388);
					match(Greater);
				}
				break;
				case StringBuffer:
					enterOuterAlt(_localctx, 5);
				{
					setState(390);
					match(StringBuffer);
					setState(391);
					match(Less);
					setState(392);
					match(Constant);
					setState(393);
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
				setState(396);
				structOrUnion();
				setState(397);
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
				setState(399);
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
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(401);
							initializedDeclaration();
						}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0));
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
					case Array:
					case String:
					case StringBuffer:
					case PublicKey:
					case Message:
					case Signature:
					case LongID:
					case Struct:
					case Union:
					case Void: {
						setState(406);
						typeSpecifier();
					}
					break;
					case Const:
					case Static: {
						setState(407);
						typeQualifier();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
					{
						setState(410);
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
		enterRule(_localctx, 80, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(413);
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
		enterRule(_localctx, 82, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Throw) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << GccBool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (RightBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (RightBrace - 65)) | (1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)) | (1L << (LeftShift - 65)) | (1L << (RightShift - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (Div - 65)) | (1L << (Mod - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (AndAnd - 65)) | (1L << (OrOr - 65)) | (1L << (Caret - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Question - 65)) | (1L << (Colon - 65)) | (1L << (Semi - 65)) | (1L << (Comma - 65)) | (1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)) | (1L << (Equal - 65)) | (1L << (NotEqual - 65)) | (1L << (Arrow - 65)) | (1L << (Dot - 65)) | (1L << (Ellipsis - 65)) | (1L << (Constant - 65)) | (1L << (Identifier - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)) | (1L << (Whitespace - 65)) | (1L << (Newline - 65)) | (1L << (BlockComment - 65)) | (1L << (LineComment - 65)))) != 0)) {
					{
						setState(420);
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
								setState(415);
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
								setState(416);
								match(LeftParen);
								setState(417);
								nestedParenthesesBlock();
								setState(418);
								match(RightParen);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(424);
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
		enterRule(_localctx, 84, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(425);
				parameterDeclaration();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(426);
							match(Comma);
							setState(427);
							parameterDeclaration();
						}
					}
					setState(432);
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
		enterRule(_localctx, 86, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(433);
				declarationSpecifier();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == And) {
					{
						setState(434);
						match(And);
					}
				}

				setState(437);
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
		enterRule(_localctx, 88, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(439);
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
		enterRule(_localctx, 90, RULE_initializer);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(441);
					assignmentExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(442);
					match(LeftBrace);
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Sizeof || _la == LeftParen || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Dot - 65)) | (1L << (Constant - 65)) | (1L << (Identifier - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
							setState(443);
							initializerList();
						}
					}

					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Comma) {
						{
							setState(446);
							match(Comma);
						}
					}

					setState(449);
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
		enterRule(_localctx, 92, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftBracket || _la == Dot) {
					{
						setState(452);
						designation();
					}
				}

				setState(455);
				initializer();
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(456);
								match(Comma);
								setState(458);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LeftBracket || _la == Dot) {
									{
										setState(457);
										designation();
									}
								}

								setState(460);
								initializer();
							}
						}
					}
					setState(465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
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
		enterRule(_localctx, 94, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(466);
				designatorList();
				setState(467);
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
		enterRule(_localctx, 96, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(469);
							designator();
						}
					}
					setState(472);
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
		enterRule(_localctx, 98, RULE_designator);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LeftBracket:
					enterOuterAlt(_localctx, 1);
				{
					setState(474);
					match(LeftBracket);
					setState(475);
					constantExpression();
					setState(476);
					match(RightBracket);
				}
				break;
				case Dot:
					enterOuterAlt(_localctx, 2);
				{
					setState(478);
					match(Dot);
					setState(479);
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
		enterRule(_localctx, 100, RULE_statement);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(482);
					labeledStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(483);
					compoundStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(484);
					expressionStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(485);
					selectionStatement();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(486);
					iterationStatement();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(487);
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
		enterRule(_localctx, 102, RULE_labeledStatement);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Case:
					enterOuterAlt(_localctx, 1);
				{
					setState(490);
					match(Case);
					setState(491);
					constantExpression();
					setState(492);
					match(Colon);
					setState(493);
					statement();
				}
				break;
				case Default:
					enterOuterAlt(_localctx, 2);
				{
					setState(495);
					match(Default);
					setState(496);
					match(Colon);
					setState(497);
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
		enterRule(_localctx, 104, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(500);
				match(LeftBrace);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(501);
						blockItemList();
					}
				}

				setState(504);
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
		enterRule(_localctx, 106, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(506);
							blockItem();
						}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Semi - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0));
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
		enterRule(_localctx, 108, RULE_blockItem);
		try {
			setState(513);
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
					setState(511);
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
				case Static:
				case Struct:
				case Union:
				case Void:
					enterOuterAlt(_localctx, 2);
				{
					setState(512);
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
		enterRule(_localctx, 110, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(515);
						expression();
					}
				}

				setState(518);
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
		enterRule(_localctx, 112, RULE_selectionStatement);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case If:
					enterOuterAlt(_localctx, 1);
				{
					setState(520);
					match(If);
					setState(521);
					match(LeftParen);
					setState(522);
					expression();
					setState(523);
					match(RightParen);
					setState(524);
					statement();
					setState(527);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
						case 1: {
							setState(525);
							match(Else);
							setState(526);
							statement();
						}
						break;
					}
				}
				break;
				case Switch:
					enterOuterAlt(_localctx, 2);
				{
					setState(529);
					match(Switch);
					setState(530);
					match(LeftParen);
					setState(531);
					expression();
					setState(532);
					match(RightParen);
					setState(533);
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
		enterRule(_localctx, 114, RULE_iterationStatement);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case While:
					enterOuterAlt(_localctx, 1);
				{
					setState(537);
					match(While);
					setState(538);
					match(LeftParen);
					setState(539);
					expression();
					setState(540);
					match(RightParen);
					setState(541);
					statement();
				}
				break;
				case Do:
					enterOuterAlt(_localctx, 2);
				{
					setState(543);
					match(Do);
					setState(544);
					statement();
					setState(545);
					match(While);
					setState(546);
					match(LeftParen);
					setState(547);
					expression();
					setState(548);
					match(RightParen);
					setState(549);
					match(Semi);
				}
				break;
				case For:
					enterOuterAlt(_localctx, 3);
				{
					setState(551);
					match(For);
					setState(552);
					match(LeftParen);
					setState(553);
					forCondition();
					setState(554);
					match(RightParen);
					setState(555);
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
		enterRule(_localctx, 116, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(563);
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
					case Static:
					case Struct:
					case Union:
					case Void: {
						setState(559);
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
						setState(561);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
								setState(560);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(565);
				match(Semi);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(566);
						forExpression();
					}
				}

				setState(569);
				match(Semi);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
						setState(570);
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
		enterRule(_localctx, 118, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(573);
				declarationSpecifier();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(574);
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
		enterRule(_localctx, 120, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(577);
				assignmentExpression();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(578);
							match(Comma);
							setState(579);
							assignmentExpression();
						}
					}
					setState(584);
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
		enterRule(_localctx, 122, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(591);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Continue: {
						setState(585);
						match(Continue);
					}
					break;
					case Break: {
						setState(586);
						match(Break);
					}
					break;
					case Return: {
						setState(587);
						match(Return);
						setState(589);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == Sizeof || _la == LeftParen || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (PlusPlus - 67)) | (1L << (Minus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Not - 67)) | (1L << (Tilde - 67)) | (1L << (Constant - 67)) | (1L << (Identifier - 67)) | (1L << (DigitSequence - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
								setState(588);
								expression();
							}
						}

					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(593);
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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u0256\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\3\2\5\2\u0080\n\2\3\2\3\2\3\3\7\3\u0085\n\3\f\3\16\3\u0088" +
					"\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\5\3\5\5\5\u0097" +
					"\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7" +
					"\3\7\3\b\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\t\3\t\3\t\3\t\3\n" +
					"\3\n\3\n\3\n\5\n\u00b9\n\n\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13" +
					"\3\13\3\13\3\f\3\f\3\f\3\f\6\f\u00c7\n\f\r\f\16\f\u00c8\3\f\3\f\3\f\3" +
					"\f\5\f\u00cf\n\f\3\r\3\r\3\16\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\3\17" +
					"\3\17\3\17\3\17\5\17\u00de\n\17\3\17\3\17\5\17\u00e2\n\17\3\17\3\17\3" +
					"\17\3\17\3\17\3\17\3\17\7\17\u00eb\n\17\f\17\16\17\u00ee\13\17\3\20\3" +
					"\20\3\20\7\20\u00f3\n\20\f\20\16\20\u00f6\13\20\3\21\7\21\u00f9\n\21\f" +
					"\21\16\21\u00fc\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21" +
					"\u0107\n\21\3\22\3\22\3\23\3\23\5\23\u010d\n\23\3\24\3\24\3\24\7\24\u0112" +
					"\n\24\f\24\16\24\u0115\13\24\3\25\3\25\3\25\7\25\u011a\n\25\f\25\16\25" +
					"\u011d\13\25\3\26\3\26\3\26\7\26\u0122\n\26\f\26\16\26\u0125\13\26\3\27" +
					"\3\27\3\27\7\27\u012a\n\27\f\27\16\27\u012d\13\27\3\30\3\30\3\30\7\30" +
					"\u0132\n\30\f\30\16\30\u0135\13\30\3\31\3\31\3\31\7\31\u013a\n\31\f\31" +
					"\16\31\u013d\13\31\3\32\3\32\3\32\7\32\u0142\n\32\f\32\16\32\u0145\13" +
					"\32\3\33\3\33\3\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\34\3\34\3" +
					"\34\7\34\u0152\n\34\f\34\16\34\u0155\13\34\3\35\3\35\3\35\7\35\u015a\n" +
					"\35\f\35\16\35\u015d\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0165\n" +
					"\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016d\n\37\3 \3 \3!\3!\3!\7!\u0174" +
					"\n!\f!\16!\u0177\13!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3" +
					"%\3%\3%\3%\3%\5%\u018d\n%\3&\3&\3&\3\'\3\'\3(\6(\u0195\n(\r(\16(\u0196" +
					"\3)\3)\5)\u019b\n)\3)\5)\u019e\n)\3*\3*\3+\3+\3+\3+\3+\7+\u01a7\n+\f+" +
					"\16+\u01aa\13+\3,\3,\3,\7,\u01af\n,\f,\16,\u01b2\13,\3-\3-\5-\u01b6\n" +
					"-\3-\3-\3.\3.\3/\3/\3/\5/\u01bf\n/\3/\5/\u01c2\n/\3/\5/\u01c5\n/\3\60" +
					"\5\60\u01c8\n\60\3\60\3\60\3\60\5\60\u01cd\n\60\3\60\7\60\u01d0\n\60\f" +
					"\60\16\60\u01d3\13\60\3\61\3\61\3\61\3\62\6\62\u01d9\n\62\r\62\16\62\u01da" +
					"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01e3\n\63\3\64\3\64\3\64\3\64\3\64" +
					"\3\64\5\64\u01eb\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01f5" +
					"\n\65\3\66\3\66\5\66\u01f9\n\66\3\66\3\66\3\67\6\67\u01fe\n\67\r\67\16" +
					"\67\u01ff\38\38\58\u0204\n8\39\59\u0207\n9\39\39\3:\3:\3:\3:\3:\3:\3:" +
					"\5:\u0212\n:\3:\3:\3:\3:\3:\3:\5:\u021a\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;" +
					"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0230\n;\3<\3<\5<\u0234\n<\5<\u0236" +
					"\n<\3<\3<\5<\u023a\n<\3<\3<\5<\u023e\n<\3=\3=\5=\u0242\n=\3>\3>\3>\7>" +
					"\u0247\n>\f>\16>\u024a\13>\3?\3?\3?\3?\5?\u0250\n?\5?\u0252\n?\3?\3?\3" +
					"?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<" +
					">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\21\3\2lm\4\2NNPP\5\2--NNPP\5\2MMO" +
					"OYZ\3\2QS\4\2MMOO\3\2KL\3\2GJ\3\2jk\3\2_i\4\2\3\13\64\64\4\2\r\r\17\22" +
					"\4\2//\62\62\4\2\31\31..\3\2AB\2\u0269\2\177\3\2\2\2\4\u0086\3\2\2\2\6" +
					"\u0090\3\2\2\2\b\u0092\3\2\2\2\n\u009b\3\2\2\2\f\u00a4\3\2\2\2\16\u00a8" +
					"\3\2\2\2\20\u00b0\3\2\2\2\22\u00b8\3\2\2\2\24\u00bd\3\2\2\2\26\u00ce\3" +
					"\2\2\2\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34\u00e1\3\2\2\2\36\u00ef\3\2" +
					"\2\2 \u00fa\3\2\2\2\"\u0108\3\2\2\2$\u010c\3\2\2\2&\u010e\3\2\2\2(\u0116" +
					"\3\2\2\2*\u011e\3\2\2\2,\u0126\3\2\2\2.\u012e\3\2\2\2\60\u0136\3\2\2\2" +
					"\62\u013e\3\2\2\2\64\u0146\3\2\2\2\66\u014e\3\2\2\28\u0156\3\2\2\2:\u015e" +
					"\3\2\2\2<\u016c\3\2\2\2>\u016e\3\2\2\2@\u0170\3\2\2\2B\u0178\3\2\2\2D" +
					"\u017a\3\2\2\2F\u017c\3\2\2\2H\u018c\3\2\2\2J\u018e\3\2\2\2L\u0191\3\2" +
					"\2\2N\u0194\3\2\2\2P\u019a\3\2\2\2R\u019f\3\2\2\2T\u01a8\3\2\2\2V\u01ab" +
					"\3\2\2\2X\u01b3\3\2\2\2Z\u01b9\3\2\2\2\\\u01c4\3\2\2\2^\u01c7\3\2\2\2" +
					"`\u01d4\3\2\2\2b\u01d8\3\2\2\2d\u01e2\3\2\2\2f\u01ea\3\2\2\2h\u01f4\3" +
					"\2\2\2j\u01f6\3\2\2\2l\u01fd\3\2\2\2n\u0203\3\2\2\2p\u0206\3\2\2\2r\u0219" +
					"\3\2\2\2t\u022f\3\2\2\2v\u0235\3\2\2\2x\u023f\3\2\2\2z\u0243\3\2\2\2|" +
					"\u0251\3\2\2\2~\u0080\5\4\3\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081" +
					"\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0085\5\6\4\2\u0084" +
					"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2" +
					"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\23\2\2\u008a" +
					"\u008b\5j\66\2\u008b\5\3\2\2\2\u008c\u0091\5\b\5\2\u008d\u0091\5\n\6\2" +
					"\u008e\u0091\5\f\7\2\u008f\u0091\7]\2\2\u0090\u008c\3\2\2\2\u0090\u008d" +
					"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\7\3\2\2\2\u0092" +
					"\u0093\5D#\2\u0093\u0094\7p\2\2\u0094\u0096\7A\2\2\u0095\u0097\5V,\2\u0096" +
					"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7B" +
					"\2\2\u0099\u009a\5j\66\2\u009a\t\3\2\2\2\u009b\u009d\5L\'\2\u009c\u009e" +
					"\7p\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f" +
					"\u00a0\7E\2\2\u00a0\u00a1\5N(\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7]\2\2" +
					"\u00a3\13\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7" +
					"\7]\2\2\u00a7\r\3\2\2\2\u00a8\u00ad\5\20\t\2\u00a9\u00aa\7^\2\2\u00aa" +
					"\u00ac\5\20\t\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3" +
					"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0" +
					"\u00b1\5\22\n\2\u00b1\u00b2\7_\2\2\u00b2\u00b3\5\\/\2\u00b3\21\3\2\2\2" +
					"\u00b4\u00b9\7p\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7\\\2\2\u00b7\u00b9" +
					"\7q\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\23\3\2\2\2\u00ba" +
					"\u00bc\5R*\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2" +
					"\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1" +
					"\5H%\2\u00c1\25\3\2\2\2\u00c2\u00cf\5\30\r\2\u00c3\u00cf\5\32\16\2\u00c4" +
					"\u00cf\7o\2\2\u00c5\u00c7\7r\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2" +
					"\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb" +
					"\7A\2\2\u00cb\u00cc\5@!\2\u00cc\u00cd\7B\2\2\u00cd\u00cf\3\2\2\2\u00ce" +
					"\u00c2\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c6\3\2" +
					"\2\2\u00ce\u00ca\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\31" +
					"\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d5\7A\2\2\u00d4\u00d6\5\36\20\2\u00d5" +
					"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7B" +
					"\2\2\u00d8\33\3\2\2\2\u00d9\u00e2\5\26\f\2\u00da\u00db\7E\2\2\u00db\u00dd" +
					"\5^\60\2\u00dc\u00de\7^\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de" +
					"\u00df\3\2\2\2\u00df\u00e0\7F\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d9\3\2" +
					"\2\2\u00e1\u00da\3\2\2\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\7C\2\2\u00e4" +
					"\u00e5\5@!\2\u00e5\u00e6\7D\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\t\2\2" +
					"\2\u00e8\u00eb\5\30\r\2\u00e9\u00eb\t\3\2\2\u00ea\u00e3\3\2\2\2\u00ea" +
					"\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2" +
					"\2\2\u00ec\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f4" +
					"\5<\37\2\u00f0\u00f1\7^\2\2\u00f1\u00f3\5<\37\2\u00f2\u00f0\3\2\2\2\u00f3" +
					"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\37\3\2\2" +
					"\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\t\4\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc" +
					"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0106\3\2\2\2\u00fc" +
					"\u00fa\3\2\2\2\u00fd\u0107\5\34\17\2\u00fe\u00ff\5\"\22\2\u00ff\u0100" +
					"\5$\23\2\u0100\u0107\3\2\2\2\u0101\u0102\7-\2\2\u0102\u0103\7A\2\2\u0103" +
					"\u0104\5Z.\2\u0104\u0105\7B\2\2\u0105\u0107\3\2\2\2\u0106\u00fd\3\2\2" +
					"\2\u0106\u00fe\3\2\2\2\u0106\u0101\3\2\2\2\u0107!\3\2\2\2\u0108\u0109" +
					"\t\5\2\2\u0109#\3\2\2\2\u010a\u010d\5 \21\2\u010b\u010d\7q\2\2\u010c\u010a" +
					"\3\2\2\2\u010c\u010b\3\2\2\2\u010d%\3\2\2\2\u010e\u0113\5$\23\2\u010f" +
					"\u0110\t\6\2\2\u0110\u0112\5$\23\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2" +
					"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\'\3\2\2\2\u0115\u0113" +
					"\3\2\2\2\u0116\u011b\5&\24\2\u0117\u0118\t\7\2\2\u0118\u011a\5&\24\2\u0119" +
					"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2" +
					"\2\2\u011c)\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5(\25\2\u011f\u0120" +
					"\t\b\2\2\u0120\u0122\5(\25\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123" +
					"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124+\3\2\2\2\u0125\u0123\3\2\2\2" +
					"\u0126\u012b\5*\26\2\u0127\u0128\t\t\2\2\u0128\u012a\5*\26\2\u0129\u0127" +
					"\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c" +
					"-\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133\5,\27\2\u012f\u0130\t\n\2\2" +
					"\u0130\u0132\5,\27\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131" +
					"\3\2\2\2\u0133\u0134\3\2\2\2\u0134/\3\2\2\2\u0135\u0133\3\2\2\2\u0136" +
					"\u013b\5.\30\2\u0137\u0138\7T\2\2\u0138\u013a\5.\30\2\u0139\u0137\3\2" +
					"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c" +
					"\61\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0143\5\60\31\2\u013f\u0140\7X\2" +
					"\2\u0140\u0142\5\60\31\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143" +
					"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\63\3\2\2\2\u0145\u0143\3\2\2" +
					"\2\u0146\u014b\5\62\32\2\u0147\u0148\7U\2\2\u0148\u014a\5\62\32\2\u0149" +
					"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2" +
					"\2\2\u014c\65\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0153\5\64\33\2\u014f" +
					"\u0150\7V\2\2\u0150\u0152\5\64\33\2\u0151\u014f\3\2\2\2\u0152\u0155\3" +
					"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\67\3\2\2\2\u0155" +
					"\u0153\3\2\2\2\u0156\u015b\5\66\34\2\u0157\u0158\7W\2\2\u0158\u015a\5" +
					"\66\34\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b" +
					"\u015c\3\2\2\2\u015c9\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0164\58\35\2" +
					"\u015f\u0160\7[\2\2\u0160\u0161\5@!\2\u0161\u0162\7\\\2\2\u0162\u0163" +
					"\5:\36\2\u0163\u0165\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0165\3\2\2\2\u0165" +
					";\3\2\2\2\u0166\u016d\5:\36\2\u0167\u0168\5 \21\2\u0168\u0169\5> \2\u0169" +
					"\u016a\5<\37\2\u016a\u016d\3\2\2\2\u016b\u016d\7q\2\2\u016c\u0166\3\2" +
					"\2\2\u016c\u0167\3\2\2\2\u016c\u016b\3\2\2\2\u016d=\3\2\2\2\u016e\u016f" +
					"\t\13\2\2\u016f?\3\2\2\2\u0170\u0175\5<\37\2\u0171\u0172\7^\2\2\u0172" +
					"\u0174\5<\37\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2" +
					"\2\2\u0175\u0176\3\2\2\2\u0176A\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179" +
					"\5:\36\2\u0179C\3\2\2\2\u017a\u017b\t\f\2\2\u017bE\3\2\2\2\u017c\u017d" +
					"\t\r\2\2\u017dG\3\2\2\2\u017e\u018d\5D#\2\u017f\u018d\5F$\2\u0180\u018d" +
					"\5J&\2\u0181\u0182\7\f\2\2\u0182\u0183\7G\2\2\u0183\u0184\5D#\2\u0184" +
					"\u0185\7^\2\2\u0185\u0186\7o\2\2\u0186\u0187\7I\2\2\u0187\u018d\3\2\2" +
					"\2\u0188\u0189\7\16\2\2\u0189\u018a\7G\2\2\u018a\u018b\7o\2\2\u018b\u018d" +
					"\7I\2\2\u018c\u017e\3\2\2\2\u018c\u017f\3\2\2\2\u018c\u0180\3\2\2\2\u018c" +
					"\u0181\3\2\2\2\u018c\u0188\3\2\2\2\u018dI\3\2\2\2\u018e\u018f\5L\'\2\u018f" +
					"\u0190\7p\2\2\u0190K\3\2\2\2\u0191\u0192\t\16\2\2\u0192M\3\2\2\2\u0193" +
					"\u0195\5\f\7\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2" +
					"\2\2\u0196\u0197\3\2\2\2\u0197O\3\2\2\2\u0198\u019b\5H%\2\u0199\u019b" +
					"\5R*\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019d\3\2\2\2\u019c" +
					"\u019e\5P)\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019eQ\3\2\2\2\u019f" +
					"\u01a0\t\17\2\2\u01a0S\3\2\2\2\u01a1\u01a7\n\20\2\2\u01a2\u01a3\7A\2\2" +
					"\u01a3\u01a4\5T+\2\u01a4\u01a5\7B\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1" +
					"\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8" +
					"\u01a9\3\2\2\2\u01a9U\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b0\5X-\2\u01ac" +
					"\u01ad\7^\2\2\u01ad\u01af\5X-\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2" +
					"\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1W\3\2\2\2\u01b2\u01b0" +
					"\3\2\2\2\u01b3\u01b5\5\24\13\2\u01b4\u01b6\7T\2\2\u01b5\u01b4\3\2\2\2" +
					"\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5\22\n\2\u01b8Y\3" +
					"\2\2\2\u01b9\u01ba\5P)\2\u01ba[\3\2\2\2\u01bb\u01c5\5<\37\2\u01bc\u01be" +
					"\7E\2\2\u01bd\u01bf\5^\60\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf" +
					"\u01c1\3\2\2\2\u01c0\u01c2\7^\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2" +
					"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\7F\2\2\u01c4\u01bb\3\2\2\2\u01c4" +
					"\u01bc\3\2\2\2\u01c5]\3\2\2\2\u01c6\u01c8\5`\61\2\u01c7\u01c6\3\2\2\2" +
					"\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d1\5\\/\2\u01ca\u01cc" +
					"\7^\2\2\u01cb\u01cd\5`\61\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd" +
					"\u01ce\3\2\2\2\u01ce\u01d0\5\\/\2\u01cf\u01ca\3\2\2\2\u01d0\u01d3\3\2" +
					"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2_\3\2\2\2\u01d3\u01d1" +
					"\3\2\2\2\u01d4\u01d5\5b\62\2\u01d5\u01d6\7_\2\2\u01d6a\3\2\2\2\u01d7\u01d9" +
					"\5d\63\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da" +
					"\u01db\3\2\2\2\u01dbc\3\2\2\2\u01dc\u01dd\7C\2\2\u01dd\u01de\5B\"\2\u01de" +
					"\u01df\7D\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e1\7m\2\2\u01e1\u01e3\7p\2" +
					"\2\u01e2\u01dc\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3e\3\2\2\2\u01e4\u01eb" +
					"\5h\65\2\u01e5\u01eb\5j\66\2\u01e6\u01eb\5p9\2\u01e7\u01eb\5r:\2\u01e8" +
					"\u01eb\5t;\2\u01e9\u01eb\5|?\2\u01ea\u01e4\3\2\2\2\u01ea\u01e5\3\2\2\2" +
					"\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9" +
					"\3\2\2\2\u01ebg\3\2\2\2\u01ec\u01ed\7\27\2\2\u01ed\u01ee\5B\"\2\u01ee" +
					"\u01ef\7\\\2\2\u01ef\u01f0\5f\64\2\u01f0\u01f5\3\2\2\2\u01f1\u01f2\7\33" +
					"\2\2\u01f2\u01f3\7\\\2\2\u01f3\u01f5\5f\64\2\u01f4\u01ec\3\2\2\2\u01f4" +
					"\u01f1\3\2\2\2\u01f5i\3\2\2\2\u01f6\u01f8\7E\2\2\u01f7\u01f9\5l\67\2\u01f8" +
					"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7F" +
					"\2\2\u01fbk\3\2\2\2\u01fc\u01fe\5n8\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff" +
					"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200m\3\2\2\2\u0201" +
					"\u0204\5f\64\2\u0202\u0204\5\f\7\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2" +
					"\2\2\u0204o\3\2\2\2\u0205\u0207\5@!\2\u0206\u0205\3\2\2\2\u0206\u0207" +
					"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7]\2\2\u0209q\3\2\2\2\u020a\u020b" +
					"\7$\2\2\u020b\u020c\7A\2\2\u020c\u020d\5@!\2\u020d\u020e\7B\2\2\u020e" +
					"\u0211\5f\64\2\u020f\u0210\7\36\2\2\u0210\u0212\5f\64\2\u0211\u020f\3" +
					"\2\2\2\u0211\u0212\3\2\2\2\u0212\u021a\3\2\2\2\u0213\u0214\7\60\2\2\u0214" +
					"\u0215\7A\2\2\u0215\u0216\5@!\2\u0216\u0217\7B\2\2\u0217\u0218\5f\64\2" +
					"\u0218\u021a\3\2\2\2\u0219\u020a\3\2\2\2\u0219\u0213\3\2\2\2\u021as\3" +
					"\2\2\2\u021b\u021c\7\66\2\2\u021c\u021d\7A\2\2\u021d\u021e\5@!\2\u021e" +
					"\u021f\7B\2\2\u021f\u0220\5f\64\2\u0220\u0230\3\2\2\2\u0221\u0222\7\34" +
					"\2\2\u0222\u0223\5f\64\2\u0223\u0224\7\66\2\2\u0224\u0225\7A\2\2\u0225" +
					"\u0226\5@!\2\u0226\u0227\7B\2\2\u0227\u0228\7]\2\2\u0228\u0230\3\2\2\2" +
					"\u0229\u022a\7\"\2\2\u022a\u022b\7A\2\2\u022b\u022c\5v<\2\u022c\u022d" +
					"\7B\2\2\u022d\u022e\5f\64\2\u022e\u0230\3\2\2\2\u022f\u021b\3\2\2\2\u022f" +
					"\u0221\3\2\2\2\u022f\u0229\3\2\2\2\u0230u\3\2\2\2\u0231\u0236\5x=\2\u0232" +
					"\u0234\5@!\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2" +
					"\2\u0235\u0231\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239" +
					"\7]\2\2\u0238\u023a\5z>\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a" +
					"\u023b\3\2\2\2\u023b\u023d\7]\2\2\u023c\u023e\5z>\2\u023d\u023c\3\2\2" +
					"\2\u023d\u023e\3\2\2\2\u023ew\3\2\2\2\u023f\u0241\5\24\13\2\u0240\u0242" +
					"\5\16\b\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242y\3\2\2\2\u0243" +
					"\u0248\5<\37\2\u0244\u0245\7^\2\2\u0245\u0247\5<\37\2\u0246\u0244\3\2" +
					"\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249" +
					"{\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u0252\7\32\2\2\u024c\u0252\7\26\2" +
					"\2\u024d\u024f\7*\2\2\u024e\u0250\5@!\2\u024f\u024e\3\2\2\2\u024f\u0250" +
					"\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024b\3\2\2\2\u0251\u024c\3\2\2\2\u0251" +
					"\u024d\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7]\2\2\u0254}\3\2\2\2C" +
					"\177\u0086\u0090\u0096\u009d\u00ad\u00b8\u00bd\u00c8\u00ce\u00d5\u00dd" +
					"\u00e1\u00ea\u00ec\u00f4\u00fa\u0106\u010c\u0113\u011b\u0123\u012b\u0133" +
					"\u013b\u0143\u014b\u0153\u015b\u0164\u016c\u0175\u018c\u0196\u019a\u019d" +
					"\u01a6\u01a8\u01b0\u01b5\u01be\u01c1\u01c4\u01c7\u01cc\u01d1\u01da\u01e2" +
					"\u01ea\u01f4\u01f8\u01ff\u0203\u0206\u0211\u0219\u022f\u0233\u0235\u0239" +
					"\u023d\u0241\u0248\u024f\u0251";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}