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
            Signature = 15, LongID = 16, Dispatcher = 17, Auto = 18, Break = 19, Case = 20, Char = 21,
            Const = 22, Continue = 23, Default = 24, Do = 25, Double = 26, Else = 27, Enum = 28,
            Extern = 29, Float = 30, For = 31, Goto = 32, If = 33, Inline = 34, Int = 35, Long = 36,
            Register = 37, Restrict = 38, Return = 39, Short = 40, Signed = 41, Sizeof = 42, Static = 43,
            Struct = 44, Switch = 45, Typedef = 46, Union = 47, Unsigned = 48, Void = 49, Volatile = 50,
            While = 51, Alignas = 52, Alignof = 53, Atomic = 54, GccBool = 55, Complex = 56, Generic = 57,
            Imaginary = 58, Noreturn = 59, StaticAssert = 60, ThreadLocal = 61, LeftParen = 62,
            RightParen = 63, LeftBracket = 64, RightBracket = 65, LeftBrace = 66, RightBrace = 67,
            Less = 68, LessEqual = 69, Greater = 70, GreaterEqual = 71, LeftShift = 72, RightShift = 73,
            Plus = 74, PlusPlus = 75, Minus = 76, MinusMinus = 77, Star = 78, Div = 79, Mod = 80,
            And = 81, Or = 82, AndAnd = 83, OrOr = 84, Caret = 85, Not = 86, Tilde = 87, Question = 88,
            Colon = 89, Semi = 90, Comma = 91, Assign = 92, StarAssign = 93, DivAssign = 94, ModAssign = 95,
            PlusAssign = 96, MinusAssign = 97, LeftShiftAssign = 98, RightShiftAssign = 99,
            AndAssign = 100, XorAssign = 101, OrAssign = 102, Equal = 103, NotEqual = 104, Arrow = 105,
            Dot = 106, Ellipsis = 107, Identifier = 108, Constant = 109, DigitSequence = 110,
            StringLiteral = 111, Whitespace = 112, Newline = 113, BlockComment = 114, LineComment = 115;
    public static final int
            RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2,
            RULE_functionDeclaration = 3, RULE_functionDefinition = 4, RULE_structDeclaration = 5,
            RULE_initializedDeclaration = 6, RULE_initDeclaratorList = 7, RULE_initDeclarator = 8,
            RULE_directDeclarator = 9, RULE_declarationSpecifier = 10, RULE_primaryExpression = 11,
            RULE_postfixExpression = 12, RULE_argumentExpressionList = 13, RULE_unaryExpression = 14,
            RULE_unaryOperator = 15, RULE_simpleExpression = 16, RULE_multiplicativeExpression = 17,
            RULE_additiveExpression = 18, RULE_shiftExpression = 19, RULE_relationalExpression = 20,
            RULE_equalityExpression = 21, RULE_andExpression = 22, RULE_exclusiveOrExpression = 23,
            RULE_inclusiveOrExpression = 24, RULE_logicalAndExpression = 25, RULE_logicalOrExpression = 26,
            RULE_conditionalExpression = 27, RULE_assignmentExpression = 28, RULE_assignmentOperator = 29,
            RULE_expression = 30, RULE_constantExpression = 31, RULE_primitiveType = 32,
            RULE_classType = 33, RULE_typeSpecifier = 34, RULE_structOrUnionSpecifier = 35,
            RULE_structOrUnion = 36, RULE_structDeclarationList = 37, RULE_specifierQualifierList = 38,
            RULE_enumSpecifier = 39, RULE_enumeratorList = 40, RULE_enumerator = 41,
            RULE_enumerationConstant = 42, RULE_typeQualifier = 43, RULE_nestedParenthesesBlock = 44,
            RULE_parameterList = 45, RULE_parameterDeclaration = 46, RULE_typeName = 47,
            RULE_initializer = 48, RULE_initializerList = 49, RULE_designation = 50,
            RULE_designatorList = 51, RULE_designator = 52, RULE_statement = 53, RULE_labeledStatement = 54,
            RULE_compoundStatement = 55, RULE_blockItemList = 56, RULE_blockItem = 57,
            RULE_expressionStatement = 58, RULE_selectionStatement = 59, RULE_iterationStatement = 60,
            RULE_forCondition = 61, RULE_forDeclaration = 62, RULE_forExpression = 63,
            RULE_jumpStatement = 64;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "translationUnit", "externalDeclaration", "functionDeclaration",
                "functionDefinition", "structDeclaration", "initializedDeclaration",
                "initDeclaratorList", "initDeclarator", "directDeclarator", "declarationSpecifier",
                "primaryExpression", "postfixExpression", "argumentExpressionList", "unaryExpression",
                "unaryOperator", "simpleExpression", "multiplicativeExpression", "additiveExpression",
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
                "'long_id'", "'dispatcher'", "'auto'", "'break'", "'case'", "'char'",
                "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'",
                "'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'",
                "'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'",
                "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'",
                "'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'",
                "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'",
                "'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'",
                "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'",
                "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'",
                "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='",
                "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'",
                "'.'", "'...'"
        };
    }
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
        return new String[]{
                null, "Byte", "Int16", "Int32", "Int64", "Int128", "Float32", "Float64",
                "Float128", "Bool", "Array", "String", "StringBuffer", "PublicKey", "Message",
                "Signature", "LongID", "Dispatcher", "Auto", "Break", "Case", "Char",
                "Const", "Continue", "Default", "Do", "Double", "Else", "Enum", "Extern",
                "Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict",
                "Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch",
                "Typedef", "Union", "Unsigned", "Void", "Volatile", "While", "Alignas",
                "Alignof", "Atomic", "GccBool", "Complex", "Generic", "Imaginary", "Noreturn",
                "StaticAssert", "ThreadLocal", "LeftParen", "RightParen", "LeftBracket",
                "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater",
                "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus",
                "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret",
                "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign",
                "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign",
                "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual",
                "Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence",
                "StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment"
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
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0) || _la == Semi) {
                    {
                        setState(130);
                        translationUnit();
                    }
                }

                setState(133);
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
                setState(136);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(135);
                            externalDeclaration();
                        }
                    }
                    setState(138);
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

        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class, 0);
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
            setState(145);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(140);
                    functionDefinition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(141);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(142);
                    structDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(143);
                    initializedDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(144);
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

    public static class FunctionDeclarationContext extends ParserRuleContext {
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

        public TerminalNode Semi() {
            return getToken(ArgCParser.Semi, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterFunctionDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitFunctionDeclaration(this);
        }
    }

    public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
        FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_functionDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                primitiveType();
                setState(148);
                directDeclarator();
                setState(149);
                match(LeftParen);
                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
                    {
                        setState(150);
                        parameterList();
                    }
                }

                setState(153);
                match(RightParen);
                setState(154);
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
        enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
            setState(167);
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
                    setState(156);
                    primitiveType();
                    setState(157);
                    directDeclarator();
                    setState(158);
                    match(LeftParen);
                    setState(160);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
                        {
                            setState(159);
                            parameterList();
                        }
                    }

                    setState(162);
                    match(RightParen);
                    setState(163);
                    compoundStatement();
                }
                break;
                case Dispatcher:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(165);
                    match(Dispatcher);
                    setState(166);
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
        enterRule(_localctx, 10, RULE_structDeclaration);
        int _la;
        try {
            setState(190);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Struct:
                case Union:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(169);
                    structOrUnion();
                    setState(171);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(170);
                            match(Identifier);
                        }
                    }

                    setState(173);
                    match(LeftBrace);
                    setState(174);
                    structDeclarationList();
                    setState(175);
                    match(RightBrace);
                    setState(176);
                    match(Semi);
                }
                break;
                case Enum:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(178);
                    match(Enum);
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(179);
                            match(Identifier);
                        }
                    }

                    setState(182);
                    match(LeftBrace);
                    setState(183);
                    enumeratorList();
                    setState(185);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Comma) {
                        {
                            setState(184);
                            match(Comma);
                        }
                    }

                    setState(187);
                    match(RightBrace);
                    setState(188);
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
        enterRule(_localctx, 12, RULE_initializedDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(192);
                declarationSpecifier();
                setState(193);
                initDeclaratorList();
                setState(194);
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
        enterRule(_localctx, 14, RULE_initDeclaratorList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                initDeclarator();
                setState(201);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(197);
                            match(Comma);
                            setState(198);
                            initDeclarator();
                        }
                    }
                    setState(203);
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
        enterRule(_localctx, 16, RULE_initDeclarator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(204);
                directDeclarator();
                setState(205);
                match(Assign);
                setState(206);
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
        enterRule(_localctx, 18, RULE_directDeclarator);
        try {
            setState(212);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(208);
                    match(Identifier);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(209);
                    match(Identifier);
                    setState(210);
                    match(Colon);
                    setState(211);
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
        enterRule(_localctx, 20, RULE_declarationSpecifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Const || _la == Static) {
                    {
                        {
                            setState(214);
                            typeQualifier();
                        }
                    }
                    setState(219);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(220);
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
        enterRule(_localctx, 22, RULE_primaryExpression);
		int _la;
		try {
            setState(233);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(222);
                    match(Identifier);
                }
                break;
                case Constant:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(223);
                    match(Constant);
                }
                break;
                case StringLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(225);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(224);
                                match(StringLiteral);
                            }
                        }
                        setState(227);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == StringLiteral);
                }
                break;
                case LeftParen:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(229);
                    match(LeftParen);
                    setState(230);
                    expression();
                    setState(231);
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
        enterRule(_localctx, 24, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(243);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case LeftParen:
                    case Identifier:
                    case Constant:
                    case StringLiteral: {
                        setState(235);
                        primaryExpression();
                    }
                    break;
                    case LeftBrace: {
                        setState(236);
                        match(LeftBrace);
                        setState(237);
                        initializerList();
                        setState(239);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Comma) {
                            {
                                setState(238);
                                match(Comma);
                            }
                        }

                        setState(241);
                        match(RightBrace);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(259);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (PlusPlus - 62)) | (1L << (MinusMinus - 62)) | (1L << (Arrow - 62)) | (1L << (Dot - 62)))) != 0)) {
                    {
                        setState(257);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LeftBracket: {
                                setState(245);
                                match(LeftBracket);
                                setState(246);
                                expression();
                                setState(247);
                                match(RightBracket);
                            }
                            break;
                            case LeftParen: {
                                setState(249);
                                match(LeftParen);
                                setState(251);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                                    {
                                        setState(250);
                                        argumentExpressionList();
                                    }
                                }

                                setState(253);
                                match(RightParen);
                            }
                            break;
                            case Arrow:
                            case Dot: {
                                setState(254);
                                _la = _input.LA(1);
                                if (!(_la == Arrow || _la == Dot)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(255);
                                match(Identifier);
                            }
                            break;
                            case PlusPlus:
                            case MinusMinus: {
                                setState(256);
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
        enterRule(_localctx, 26, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(262);
                assignmentExpression();
                setState(267);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(263);
                            match(Comma);
                            setState(264);
                            assignmentExpression();
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
        enterRule(_localctx, 28, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(273);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(270);
                                _la = _input.LA(1);
                                if (!(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (Sizeof - 42)) | (1L << (PlusPlus - 42)) | (1L << (MinusMinus - 42)))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(275);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                }
                setState(285);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case LeftParen:
                    case LeftBrace:
                    case Identifier:
                    case Constant:
                    case StringLiteral: {
                        setState(276);
                        postfixExpression();
                    }
                    break;
                    case Plus:
                    case Minus:
                    case Not:
                    case Tilde: {
                        setState(277);
                        unaryOperator();
                        setState(278);
                        simpleExpression();
                    }
                    break;
                    case Sizeof: {
                        {
                            setState(280);
                            match(Sizeof);
                        }
                        setState(281);
                        match(LeftParen);
                        setState(282);
                        typeName();
                        setState(283);
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
        enterRule(_localctx, 30, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(287);
                _la = _input.LA(1);
                if (!(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (Minus - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)))) != 0))) {
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
        enterRule(_localctx, 32, RULE_simpleExpression);
		try {
            setState(291);
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
                    setState(289);
                    unaryExpression();
                }
                break;
                case DigitSequence:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(290);
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
        enterRule(_localctx, 34, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(293);
                simpleExpression();
                setState(298);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Div - 78)) | (1L << (Mod - 78)))) != 0)) {
                    {
                        {
                            setState(294);
                            _la = _input.LA(1);
                            if (!(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Div - 78)) | (1L << (Mod - 78)))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(295);
                            simpleExpression();
                        }
                    }
                    setState(300);
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
        enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(301);
                multiplicativeExpression();
                setState(306);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Plus || _la == Minus) {
                    {
                        {
                            setState(302);
                            _la = _input.LA(1);
                            if (!(_la == Plus || _la == Minus)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(303);
                            multiplicativeExpression();
                        }
                    }
                    setState(308);
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
        enterRule(_localctx, 38, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(309);
                additiveExpression();
                setState(314);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LeftShift || _la == RightShift) {
                    {
                        {
                            setState(310);
                            _la = _input.LA(1);
                            if (!(_la == LeftShift || _la == RightShift)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(311);
                            additiveExpression();
                        }
                    }
                    setState(316);
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
        enterRule(_localctx, 40, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(317);
                shiftExpression();
                setState(322);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Less - 68)) | (1L << (LessEqual - 68)) | (1L << (Greater - 68)) | (1L << (GreaterEqual - 68)))) != 0)) {
                    {
                        {
                            setState(318);
                            _la = _input.LA(1);
                            if (!(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Less - 68)) | (1L << (LessEqual - 68)) | (1L << (Greater - 68)) | (1L << (GreaterEqual - 68)))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(319);
                            shiftExpression();
                        }
                    }
                    setState(324);
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
        enterRule(_localctx, 42, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(325);
                relationalExpression();
                setState(330);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Equal || _la == NotEqual) {
                    {
                        {
                            setState(326);
                            _la = _input.LA(1);
                            if (!(_la == Equal || _la == NotEqual)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(327);
                            relationalExpression();
                        }
                    }
                    setState(332);
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
        enterRule(_localctx, 44, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(333);
                equalityExpression();
                setState(338);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == And) {
                    {
                        {
                            setState(334);
                            match(And);
                            setState(335);
                            equalityExpression();
                        }
                    }
                    setState(340);
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
        enterRule(_localctx, 46, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(341);
                andExpression();
                setState(346);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Caret) {
                    {
                        {
                            setState(342);
                            match(Caret);
                            setState(343);
                            andExpression();
                        }
                    }
                    setState(348);
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
        enterRule(_localctx, 48, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(349);
                exclusiveOrExpression();
                setState(354);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Or) {
                    {
                        {
                            setState(350);
                            match(Or);
                            setState(351);
                            exclusiveOrExpression();
                        }
                    }
                    setState(356);
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
        enterRule(_localctx, 50, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(357);
                inclusiveOrExpression();
                setState(362);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AndAnd) {
                    {
                        {
                            setState(358);
                            match(AndAnd);
                            setState(359);
                            inclusiveOrExpression();
                        }
                    }
                    setState(364);
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
        enterRule(_localctx, 52, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(365);
                logicalAndExpression();
                setState(370);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OrOr) {
                    {
                        {
                            setState(366);
                            match(OrOr);
                            setState(367);
                            logicalAndExpression();
                        }
                    }
                    setState(372);
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
        enterRule(_localctx, 54, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(373);
                logicalOrExpression();
                setState(379);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Question) {
                    {
                        setState(374);
                        match(Question);
                        setState(375);
                        expression();
                        setState(376);
                        match(Colon);
                        setState(377);
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
        enterRule(_localctx, 56, RULE_assignmentExpression);
		try {
            setState(387);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(381);
                    conditionalExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(382);
                    unaryExpression();
                    setState(383);
                    assignmentOperator();
                    setState(384);
                    assignmentExpression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(386);
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
        enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(389);
                _la = _input.LA(1);
                if (!(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (Assign - 92)) | (1L << (StarAssign - 92)) | (1L << (DivAssign - 92)) | (1L << (ModAssign - 92)) | (1L << (PlusAssign - 92)) | (1L << (MinusAssign - 92)) | (1L << (LeftShiftAssign - 92)) | (1L << (RightShiftAssign - 92)) | (1L << (AndAssign - 92)) | (1L << (XorAssign - 92)) | (1L << (OrAssign - 92)))) != 0))) {
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
        enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(391);
                assignmentExpression();
                setState(396);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(392);
                            match(Comma);
                            setState(393);
                            assignmentExpression();
                        }
                    }
                    setState(398);
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
        enterRule(_localctx, 62, RULE_constantExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(399);
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
        enterRule(_localctx, 64, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(401);
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
        enterRule(_localctx, 66, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(403);
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
        enterRule(_localctx, 68, RULE_typeSpecifier);
		try {
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
                case Void:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(405);
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
                    setState(406);
                    classType();
                }
                break;
                case Struct:
                case Union:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(407);
                    structOrUnionSpecifier();
                }
                break;
                case Enum:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(408);
                    enumSpecifier();
                }
                break;
                case Array:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(409);
                    match(Array);
                    setState(410);
                    match(Less);
                    setState(411);
                    primitiveType();
                    setState(412);
                    match(Comma);
                    setState(413);
                    match(Constant);
                    setState(414);
                    match(Greater);
                }
                break;
                case StringBuffer:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(416);
                    match(StringBuffer);
                    setState(417);
                    match(Less);
                    setState(418);
                    match(Constant);
                    setState(419);
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
        enterRule(_localctx, 70, RULE_structOrUnionSpecifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(422);
                structOrUnion();
                setState(423);
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
        enterRule(_localctx, 72, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(425);
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
        enterRule(_localctx, 74, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(428);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(427);
                            initializedDeclaration();
                        }
                    }
                    setState(430);
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
        enterRule(_localctx, 76, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(434);
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
                        setState(432);
                        typeSpecifier();
                    }
                    break;
                    case Const:
                    case Static: {
                        setState(433);
                        typeQualifier();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Const) | (1L << Enum) | (1L << Static) | (1L << Struct) | (1L << Union) | (1L << Void))) != 0)) {
                    {
                        setState(436);
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
        enterRule(_localctx, 78, RULE_enumSpecifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(439);
                match(Enum);
                setState(440);
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
        enterRule(_localctx, 80, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(442);
                enumerator();
                setState(447);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 41, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(443);
                                match(Comma);
                                setState(444);
                                enumerator();
                            }
                        }
                    }
                    setState(449);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 41, _ctx);
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
        enterRule(_localctx, 82, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(450);
                enumerationConstant();
                setState(453);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Assign) {
                    {
                        setState(451);
                        match(Assign);
                        setState(452);
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
        enterRule(_localctx, 84, RULE_enumerationConstant);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(455);
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
        enterRule(_localctx, 86, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(457);
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
        enterRule(_localctx, 88, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(466);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Dispatcher) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << GccBool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
                    {
                        setState(464);
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
                                setState(459);
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
                                setState(460);
                                match(LeftParen);
                                setState(461);
                                nestedParenthesesBlock();
                                setState(462);
                                match(RightParen);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(468);
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
        enterRule(_localctx, 90, RULE_parameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                parameterDeclaration();
                setState(474);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(470);
                            match(Comma);
                            setState(471);
                            parameterDeclaration();
                        }
                    }
                    setState(476);
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

        public TerminalNode And() {
            return getToken(ArgCParser.And, 0);
        }

        public DirectDeclaratorContext directDeclarator() {
            return getRuleContext(DirectDeclaratorContext.class, 0);
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
        enterRule(_localctx, 92, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(477);
                declarationSpecifier();
                setState(479);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == And) {
                    {
                        setState(478);
                        match(And);
                    }
                }

                setState(482);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(481);
                        directDeclarator();
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
        enterRule(_localctx, 94, RULE_typeName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(484);
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
        enterRule(_localctx, 96, RULE_initializer);
		int _la;
		try {
            setState(495);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(486);
                    assignmentExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(487);
                    match(LeftBrace);
                    setState(489);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Sizeof || _la == LeftParen || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Dot - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
                        {
                            setState(488);
                            initializerList();
                        }
                    }

                    setState(492);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Comma) {
                        {
                            setState(491);
                            match(Comma);
                        }
                    }

                    setState(494);
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
        enterRule(_localctx, 98, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(498);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LeftBracket || _la == Dot) {
                    {
                        setState(497);
                        designation();
                    }
                }

                setState(500);
                initializer();
                setState(508);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(501);
                                match(Comma);
                                setState(503);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LeftBracket || _la == Dot) {
                                    {
                                        setState(502);
                                        designation();
                                    }
                                }

                                setState(505);
                                initializer();
                            }
                        }
                    }
                    setState(510);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
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
        enterRule(_localctx, 100, RULE_designation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(511);
                designatorList();
                setState(512);
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
        enterRule(_localctx, 102, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(515);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(514);
                            designator();
                        }
                    }
                    setState(517);
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
        enterRule(_localctx, 104, RULE_designator);
		try {
            setState(525);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
                case LeftBracket:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(519);
                    match(LeftBracket);
                    setState(520);
                    constantExpression();
                    setState(521);
                    match(RightBracket);
                }
                break;
                case Dot:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(523);
                    match(Dot);
                    setState(524);
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
        enterRule(_localctx, 106, RULE_statement);
		try {
            setState(533);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(527);
                    labeledStatement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(528);
                    compoundStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(529);
                    expressionStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(530);
                    selectionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(531);
                    iterationStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(532);
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
        enterRule(_localctx, 108, RULE_labeledStatement);
		try {
            setState(543);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
                case Case:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(535);
                    match(Case);
                    setState(536);
                    constantExpression();
                    setState(537);
                    match(Colon);
                    setState(538);
                    statement();
                }
                break;
                case Default:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(540);
                    match(Default);
                    setState(541);
                    match(Colon);
                    setState(542);
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
        enterRule(_localctx, 110, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(545);
                match(LeftBrace);
                setState(547);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                    {
                        setState(546);
                        blockItemList();
                    }
                }

                setState(549);
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
        enterRule(_localctx, 112, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(552);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(551);
                            blockItem();
                        }
                    }
                    setState(554);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Byte) | (1L << Int16) | (1L << Int32) | (1L << Int64) | (1L << Int128) | (1L << Float32) | (1L << Float64) | (1L << Float128) | (1L << Bool) | (1L << Array) | (1L << String) | (1L << StringBuffer) | (1L << PublicKey) | (1L << Message) | (1L << Signature) | (1L << LongID) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Void) | (1L << While) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0));
            }
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
        enterRule(_localctx, 114, RULE_blockItem);
		try {
            setState(558);
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
                    setState(556);
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
                    setState(557);
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
        enterRule(_localctx, 116, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(561);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                    {
                        setState(560);
                        expression();
                    }
                }

                setState(563);
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
        enterRule(_localctx, 118, RULE_selectionStatement);
		try {
            setState(580);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
                case If:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(565);
                    match(If);
                    setState(566);
                    match(LeftParen);
                    setState(567);
                    expression();
                    setState(568);
                    match(RightParen);
                    setState(569);
                    statement();
                    setState(572);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
                        case 1: {
                            setState(570);
                            match(Else);
                            setState(571);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case Switch:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(574);
                    match(Switch);
                    setState(575);
                    match(LeftParen);
                    setState(576);
                    expression();
                    setState(577);
                    match(RightParen);
                    setState(578);
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
        enterRule(_localctx, 120, RULE_iterationStatement);
		try {
            setState(602);
            _errHandler.sync(this);
			switch (_input.LA(1)) {
                case While:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(582);
                    match(While);
                    setState(583);
                    match(LeftParen);
                    setState(584);
                    expression();
                    setState(585);
                    match(RightParen);
                    setState(586);
                    statement();
                }
                break;
                case Do:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(588);
                    match(Do);
                    setState(589);
                    statement();
                    setState(590);
                    match(While);
                    setState(591);
                    match(LeftParen);
                    setState(592);
                    expression();
                    setState(593);
                    match(RightParen);
                    setState(594);
                    match(Semi);
                }
                break;
                case For:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(596);
                    match(For);
                    setState(597);
                    match(LeftParen);
                    setState(598);
                    forCondition();
                    setState(599);
                    match(RightParen);
                    setState(600);
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
        enterRule(_localctx, 122, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(608);
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
                        setState(604);
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
                        setState(606);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                            {
                                setState(605);
                                expression();
                            }
                        }

                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(610);
                match(Semi);
                setState(612);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                    {
                        setState(611);
                        forExpression();
                    }
                }

                setState(614);
                match(Semi);
                setState(616);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                    {
                        setState(615);
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
        enterRule(_localctx, 124, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(618);
                declarationSpecifier();
                setState(620);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Identifier) {
                    {
                        setState(619);
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
        enterRule(_localctx, 126, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(622);
                assignmentExpression();
                setState(627);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(623);
                            match(Comma);
                            setState(624);
                            assignmentExpression();
                        }
                    }
                    setState(629);
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
        enterRule(_localctx, 128, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(636);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Continue: {
                        setState(630);
                        match(Continue);
                    }
                    break;
                    case Break: {
                        setState(631);
                        match(Break);
                    }
                    break;
                    case Return: {
                        setState(632);
                        match(Return);
                        setState(634);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sizeof || _la == LeftParen || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
                            {
                                setState(633);
                                expression();
                            }
                        }

                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
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

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u0283\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\5\2\u0086\n\2\3\2\3\2\3\3\6\3\u008b" +
                    "\n\3\r\3\16\3\u008c\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\3\5\3\5" +
                    "\5\5\u009a\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\6\3\6\3\6\3" +
                    "\6\3\6\5\6\u00aa\n\6\3\7\3\7\5\7\u00ae\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" +
                    "\5\7\u00b7\n\7\3\7\3\7\3\7\5\7\u00bc\n\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b" +
                    "\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\n\3\n\3\n" +
                    "\3\n\3\13\3\13\3\13\3\13\5\13\u00d7\n\13\3\f\7\f\u00da\n\f\f\f\16\f\u00dd" +
                    "\13\f\3\f\3\f\3\r\3\r\3\r\6\r\u00e4\n\r\r\r\16\r\u00e5\3\r\3\r\3\r\3\r" +
                    "\5\r\u00ec\n\r\3\16\3\16\3\16\3\16\5\16\u00f2\n\16\3\16\3\16\5\16\u00f6" +
                    "\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\16\3\16\3\16\3\16" +
                    "\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\17\3\17\3\17\7\17\u010c\n\17" +
                    "\f\17\16\17\u010f\13\17\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3" +
                    "\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0120\n\20\3\21\3\21" +
                    "\3\22\3\22\5\22\u0126\n\22\3\23\3\23\3\23\7\23\u012b\n\23\f\23\16\23\u012e" +
                    "\13\23\3\24\3\24\3\24\7\24\u0133\n\24\f\24\16\24\u0136\13\24\3\25\3\25" +
                    "\3\25\7\25\u013b\n\25\f\25\16\25\u013e\13\25\3\26\3\26\3\26\7\26\u0143" +
                    "\n\26\f\26\16\26\u0146\13\26\3\27\3\27\3\27\7\27\u014b\n\27\f\27\16\27" +
                    "\u014e\13\27\3\30\3\30\3\30\7\30\u0153\n\30\f\30\16\30\u0156\13\30\3\31" +
                    "\3\31\3\31\7\31\u015b\n\31\f\31\16\31\u015e\13\31\3\32\3\32\3\32\7\32" +
                    "\u0163\n\32\f\32\16\32\u0166\13\32\3\33\3\33\3\33\7\33\u016b\n\33\f\33" +
                    "\16\33\u016e\13\33\3\34\3\34\3\34\7\34\u0173\n\34\f\34\16\34\u0176\13" +
                    "\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u017e\n\35\3\36\3\36\3\36\3\36" +
                    "\3\36\3\36\5\36\u0186\n\36\3\37\3\37\3 \3 \3 \7 \u018d\n \f \16 \u0190" +
                    "\13 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$" +
                    "\5$\u01a7\n$\3%\3%\3%\3&\3&\3\'\6\'\u01af\n\'\r\'\16\'\u01b0\3(\3(\5(" +
                    "\u01b5\n(\3(\5(\u01b8\n(\3)\3)\3)\3*\3*\3*\7*\u01c0\n*\f*\16*\u01c3\13" +
                    "*\3+\3+\3+\5+\u01c8\n+\3,\3,\3-\3-\3.\3.\3.\3.\3.\7.\u01d3\n.\f.\16.\u01d6" +
                    "\13.\3/\3/\3/\7/\u01db\n/\f/\16/\u01de\13/\3\60\3\60\5\60\u01e2\n\60\3" +
                    "\60\5\60\u01e5\n\60\3\61\3\61\3\62\3\62\3\62\5\62\u01ec\n\62\3\62\5\62" +
                    "\u01ef\n\62\3\62\5\62\u01f2\n\62\3\63\5\63\u01f5\n\63\3\63\3\63\3\63\5" +
                    "\63\u01fa\n\63\3\63\7\63\u01fd\n\63\f\63\16\63\u0200\13\63\3\64\3\64\3" +
                    "\64\3\65\6\65\u0206\n\65\r\65\16\65\u0207\3\66\3\66\3\66\3\66\3\66\3\66" +
                    "\5\66\u0210\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0218\n\67\38\38\3" +
                    "8\38\38\38\38\38\58\u0222\n8\39\39\59\u0226\n9\39\39\3:\6:\u022b\n:\r" +
                    ":\16:\u022c\3;\3;\5;\u0231\n;\3<\5<\u0234\n<\3<\3<\3=\3=\3=\3=\3=\3=\3" +
                    "=\5=\u023f\n=\3=\3=\3=\3=\3=\3=\5=\u0247\n=\3>\3>\3>\3>\3>\3>\3>\3>\3" +
                    ">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u025d\n>\3?\3?\5?\u0261\n?\5?\u0263" +
                    "\n?\3?\3?\5?\u0267\n?\3?\3?\5?\u026b\n?\3@\3@\5@\u026f\n@\3A\3A\3A\7A" +
                    "\u0274\nA\fA\16A\u0277\13A\3B\3B\3B\3B\5B\u027d\nB\5B\u027f\nB\3B\3B\3" +
                    "B\2\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<" +
                    ">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\21\3\2kl\4\2MMOO\5\2" +
                    ",,MMOO\5\2LLNNXY\3\2PR\4\2LLNN\3\2JK\3\2FI\3\2ij\3\2^h\4\2\3\13\63\63" +
                    "\4\2\r\r\17\22\4\2..\61\61\4\2\30\30--\3\2@A\2\u029d\2\u0085\3\2\2\2\4" +
                    "\u008a\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n\u00a9\3\2\2\2\f\u00c0" +
                    "\3\2\2\2\16\u00c2\3\2\2\2\20\u00c6\3\2\2\2\22\u00ce\3\2\2\2\24\u00d6\3" +
                    "\2\2\2\26\u00db\3\2\2\2\30\u00eb\3\2\2\2\32\u00f5\3\2\2\2\34\u0108\3\2" +
                    "\2\2\36\u0113\3\2\2\2 \u0121\3\2\2\2\"\u0125\3\2\2\2$\u0127\3\2\2\2&\u012f" +
                    "\3\2\2\2(\u0137\3\2\2\2*\u013f\3\2\2\2,\u0147\3\2\2\2.\u014f\3\2\2\2\60" +
                    "\u0157\3\2\2\2\62\u015f\3\2\2\2\64\u0167\3\2\2\2\66\u016f\3\2\2\28\u0177" +
                    "\3\2\2\2:\u0185\3\2\2\2<\u0187\3\2\2\2>\u0189\3\2\2\2@\u0191\3\2\2\2B" +
                    "\u0193\3\2\2\2D\u0195\3\2\2\2F\u01a6\3\2\2\2H\u01a8\3\2\2\2J\u01ab\3\2" +
                    "\2\2L\u01ae\3\2\2\2N\u01b4\3\2\2\2P\u01b9\3\2\2\2R\u01bc\3\2\2\2T\u01c4" +
                    "\3\2\2\2V\u01c9\3\2\2\2X\u01cb\3\2\2\2Z\u01d4\3\2\2\2\\\u01d7\3\2\2\2" +
                    "^\u01df\3\2\2\2`\u01e6\3\2\2\2b\u01f1\3\2\2\2d\u01f4\3\2\2\2f\u0201\3" +
                    "\2\2\2h\u0205\3\2\2\2j\u020f\3\2\2\2l\u0217\3\2\2\2n\u0221\3\2\2\2p\u0223" +
                    "\3\2\2\2r\u022a\3\2\2\2t\u0230\3\2\2\2v\u0233\3\2\2\2x\u0246\3\2\2\2z" +
                    "\u025c\3\2\2\2|\u0262\3\2\2\2~\u026c\3\2\2\2\u0080\u0270\3\2\2\2\u0082" +
                    "\u027e\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2" +
                    "\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008b" +
                    "\5\6\4\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c" +
                    "\u008d\3\2\2\2\u008d\5\3\2\2\2\u008e\u0094\5\n\6\2\u008f\u0094\5\b\5\2" +
                    "\u0090\u0094\5\f\7\2\u0091\u0094\5\16\b\2\u0092\u0094\7\\\2\2\u0093\u008e" +
                    "\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093" +
                    "\u0092\3\2\2\2\u0094\7\3\2\2\2\u0095\u0096\5B\"\2\u0096\u0097\5\24\13" +
                    "\2\u0097\u0099\7@\2\2\u0098\u009a\5\\/\2\u0099\u0098\3\2\2\2\u0099\u009a" +
                    "\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7A\2\2\u009c\u009d\7\\\2\2\u009d" +
                    "\t\3\2\2\2\u009e\u009f\5B\"\2\u009f\u00a0\5\24\13\2\u00a0\u00a2\7@\2\2" +
                    "\u00a1\u00a3\5\\/\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4" +
                    "\3\2\2\2\u00a4\u00a5\7A\2\2\u00a5\u00a6\5p9\2\u00a6\u00aa\3\2\2\2\u00a7" +
                    "\u00a8\7\23\2\2\u00a8\u00aa\5p9\2\u00a9\u009e\3\2\2\2\u00a9\u00a7\3\2" +
                    "\2\2\u00aa\13\3\2\2\2\u00ab\u00ad\5J&\2\u00ac\u00ae\7n\2\2\u00ad\u00ac" +
                    "\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7D\2\2\u00b0" +
                    "\u00b1\5L\'\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7\\\2\2\u00b3\u00c1\3\2\2" +
                    "\2\u00b4\u00b6\7\36\2\2\u00b5\u00b7\7n\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7" +
                    "\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7D\2\2\u00b9\u00bb\5R*\2\u00ba" +
                    "\u00bc\7]\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2" +
                    "\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7\\\2\2\u00bf\u00c1\3\2\2\2\u00c0" +
                    "\u00ab\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\5\26\f" +
                    "\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7\\\2\2\u00c5\17\3\2\2\2\u00c6\u00cb" +
                    "\5\22\n\2\u00c7\u00c8\7]\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00c7\3\2\2\2" +
                    "\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\21" +
                    "\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7^\2\2" +
                    "\u00d0\u00d1\5b\62\2\u00d1\23\3\2\2\2\u00d2\u00d7\7n\2\2\u00d3\u00d4\7" +
                    "n\2\2\u00d4\u00d5\7[\2\2\u00d5\u00d7\7p\2\2\u00d6\u00d2\3\2\2\2\u00d6" +
                    "\u00d3\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00da\5X-\2\u00d9\u00d8\3\2\2\2" +
                    "\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de" +
                    "\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5F$\2\u00df\27\3\2\2\2\u00e0" +
                    "\u00ec\7n\2\2\u00e1\u00ec\7o\2\2\u00e2\u00e4\7q\2\2\u00e3\u00e2\3\2\2" +
                    "\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ec" +
                    "\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9\5> \2\u00e9\u00ea\7A\2\2\u00ea" +
                    "\u00ec\3\2\2\2\u00eb\u00e0\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e3\3\2" +
                    "\2\2\u00eb\u00e7\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00f6\5\30\r\2\u00ee\u00ef" +
                    "\7D\2\2\u00ef\u00f1\5d\63\2\u00f0\u00f2\7]\2\2\u00f1\u00f0\3\2\2\2\u00f1" +
                    "\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f6\3\2" +
                    "\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f6\u0105\3\2\2\2\u00f7" +
                    "\u00f8\7B\2\2\u00f8\u00f9\5> \2\u00f9\u00fa\7C\2\2\u00fa\u0104\3\2\2\2" +
                    "\u00fb\u00fd\7@\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe" +
                    "\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\7A\2\2\u0100\u0101\t\2\2\2\u0101" +
                    "\u0104\7n\2\2\u0102\u0104\t\3\2\2\u0103\u00f7\3\2\2\2\u0103\u00fb\3\2" +
                    "\2\2\u0103\u0100\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105" +
                    "\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2" +
                    "\2\u0108\u010d\5:\36\2\u0109\u010a\7]\2\2\u010a\u010c\5:\36\2\u010b\u0109" +
                    "\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e" +
                    "\35\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\t\4\2\2\u0111\u0110\3\2\2" +
                    "\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011f" +
                    "\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0120\5\32\16\2\u0117\u0118\5 \21\2" +
                    "\u0118\u0119\5\"\22\2\u0119\u0120\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c" +
                    "\7@\2\2\u011c\u011d\5`\61\2\u011d\u011e\7A\2\2\u011e\u0120\3\2\2\2\u011f" +
                    "\u0116\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u011a\3\2\2\2\u0120\37\3\2\2" +
                    "\2\u0121\u0122\t\5\2\2\u0122!\3\2\2\2\u0123\u0126\5\36\20\2\u0124\u0126" +
                    "\7p\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126#\3\2\2\2\u0127\u012c" +
                    "\5\"\22\2\u0128\u0129\t\6\2\2\u0129\u012b\5\"\22\2\u012a\u0128\3\2\2\2" +
                    "\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d%\3" +
                    "\2\2\2\u012e\u012c\3\2\2\2\u012f\u0134\5$\23\2\u0130\u0131\t\7\2\2\u0131" +
                    "\u0133\5$\23\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2" +
                    "\2\2\u0134\u0135\3\2\2\2\u0135\'\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013c" +
                    "\5&\24\2\u0138\u0139\t\b\2\2\u0139\u013b\5&\24\2\u013a\u0138\3\2\2\2\u013b" +
                    "\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d)\3\2\2\2" +
                    "\u013e\u013c\3\2\2\2\u013f\u0144\5(\25\2\u0140\u0141\t\t\2\2\u0141\u0143" +
                    "\5(\25\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144" +
                    "\u0145\3\2\2\2\u0145+\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014c\5*\26\2" +
                    "\u0148\u0149\t\n\2\2\u0149\u014b\5*\26\2\u014a\u0148\3\2\2\2\u014b\u014e" +
                    "\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d-\3\2\2\2\u014e" +
                    "\u014c\3\2\2\2\u014f\u0154\5,\27\2\u0150\u0151\7S\2\2\u0151\u0153\5,\27" +
                    "\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155" +
                    "\3\2\2\2\u0155/\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015c\5.\30\2\u0158" +
                    "\u0159\7W\2\2\u0159\u015b\5.\30\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2" +
                    "\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\61\3\2\2\2\u015e\u015c" +
                    "\3\2\2\2\u015f\u0164\5\60\31\2\u0160\u0161\7T\2\2\u0161\u0163\5\60\31" +
                    "\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165" +
                    "\3\2\2\2\u0165\63\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016c\5\62\32\2\u0168" +
                    "\u0169\7U\2\2\u0169\u016b\5\62\32\2\u016a\u0168\3\2\2\2\u016b\u016e\3" +
                    "\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\65\3\2\2\2\u016e" +
                    "\u016c\3\2\2\2\u016f\u0174\5\64\33\2\u0170\u0171\7V\2\2\u0171\u0173\5" +
                    "\64\33\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174" +
                    "\u0175\3\2\2\2\u0175\67\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017d\5\66\34" +
                    "\2\u0178\u0179\7Z\2\2\u0179\u017a\5> \2\u017a\u017b\7[\2\2\u017b\u017c" +
                    "\58\35\2\u017c\u017e\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u017e\3\2\2\2\u017e" +
                    "9\3\2\2\2\u017f\u0186\58\35\2\u0180\u0181\5\36\20\2\u0181\u0182\5<\37" +
                    "\2\u0182\u0183\5:\36\2\u0183\u0186\3\2\2\2\u0184\u0186\7p\2\2\u0185\u017f" +
                    "\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186;\3\2\2\2\u0187" +
                    "\u0188\t\13\2\2\u0188=\3\2\2\2\u0189\u018e\5:\36\2\u018a\u018b\7]\2\2" +
                    "\u018b\u018d\5:\36\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c" +
                    "\3\2\2\2\u018e\u018f\3\2\2\2\u018f?\3\2\2\2\u0190\u018e\3\2\2\2\u0191" +
                    "\u0192\58\35\2\u0192A\3\2\2\2\u0193\u0194\t\f\2\2\u0194C\3\2\2\2\u0195" +
                    "\u0196\t\r\2\2\u0196E\3\2\2\2\u0197\u01a7\5B\"\2\u0198\u01a7\5D#\2\u0199" +
                    "\u01a7\5H%\2\u019a\u01a7\5P)\2\u019b\u019c\7\f\2\2\u019c\u019d\7F\2\2" +
                    "\u019d\u019e\5B\"\2\u019e\u019f\7]\2\2\u019f\u01a0\7o\2\2\u01a0\u01a1" +
                    "\7H\2\2\u01a1\u01a7\3\2\2\2\u01a2\u01a3\7\16\2\2\u01a3\u01a4\7F\2\2\u01a4" +
                    "\u01a5\7o\2\2\u01a5\u01a7\7H\2\2\u01a6\u0197\3\2\2\2\u01a6\u0198\3\2\2" +
                    "\2\u01a6\u0199\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6\u019b\3\2\2\2\u01a6\u01a2" +
                    "\3\2\2\2\u01a7G\3\2\2\2\u01a8\u01a9\5J&\2\u01a9\u01aa\7n\2\2\u01aaI\3" +
                    "\2\2\2\u01ab\u01ac\t\16\2\2\u01acK\3\2\2\2\u01ad\u01af\5\16\b\2\u01ae" +
                    "\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2" +
                    "\2\2\u01b1M\3\2\2\2\u01b2\u01b5\5F$\2\u01b3\u01b5\5X-\2\u01b4\u01b2\3" +
                    "\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\5N(\2\u01b7" +
                    "\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8O\3\2\2\2\u01b9\u01ba\7\36\2\2" +
                    "\u01ba\u01bb\7n\2\2\u01bbQ\3\2\2\2\u01bc\u01c1\5T+\2\u01bd\u01be\7]\2" +
                    "\2\u01be\u01c0\5T+\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf" +
                    "\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2S\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4" +
                    "\u01c7\5V,\2\u01c5\u01c6\7^\2\2\u01c6\u01c8\5@!\2\u01c7\u01c5\3\2\2\2" +
                    "\u01c7\u01c8\3\2\2\2\u01c8U\3\2\2\2\u01c9\u01ca\7n\2\2\u01caW\3\2\2\2" +
                    "\u01cb\u01cc\t\17\2\2\u01ccY\3\2\2\2\u01cd\u01d3\n\20\2\2\u01ce\u01cf" +
                    "\7@\2\2\u01cf\u01d0\5Z.\2\u01d0\u01d1\7A\2\2\u01d1\u01d3\3\2\2\2\u01d2" +
                    "\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2" +
                    "\2\2\u01d4\u01d5\3\2\2\2\u01d5[\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01dc" +
                    "\5^\60\2\u01d8\u01d9\7]\2\2\u01d9\u01db\5^\60\2\u01da\u01d8\3\2\2\2\u01db" +
                    "\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd]\3\2\2\2" +
                    "\u01de\u01dc\3\2\2\2\u01df\u01e1\5\26\f\2\u01e0\u01e2\7S\2\2\u01e1\u01e0" +
                    "\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5\24\13\2" +
                    "\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5_\3\2\2\2\u01e6\u01e7\5" +
                    "N(\2\u01e7a\3\2\2\2\u01e8\u01f2\5:\36\2\u01e9\u01eb\7D\2\2\u01ea\u01ec" +
                    "\5d\63\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed" +
                    "\u01ef\7]\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2" +
                    "\2\2\u01f0\u01f2\7E\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f2" +
                    "c\3\2\2\2\u01f3\u01f5\5f\64\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2" +
                    "\u01f5\u01f6\3\2\2\2\u01f6\u01fe\5b\62\2\u01f7\u01f9\7]\2\2\u01f8\u01fa" +
                    "\5f\64\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb" +
                    "\u01fd\5b\62\2\u01fc\u01f7\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2" +
                    "\2\2\u01fe\u01ff\3\2\2\2\u01ffe\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202" +
                    "\5h\65\2\u0202\u0203\7^\2\2\u0203g\3\2\2\2\u0204\u0206\5j\66\2\u0205\u0204" +
                    "\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208" +
                    "i\3\2\2\2\u0209\u020a\7B\2\2\u020a\u020b\5@!\2\u020b\u020c\7C\2\2\u020c" +
                    "\u0210\3\2\2\2\u020d\u020e\7l\2\2\u020e\u0210\7n\2\2\u020f\u0209\3\2\2" +
                    "\2\u020f\u020d\3\2\2\2\u0210k\3\2\2\2\u0211\u0218\5n8\2\u0212\u0218\5" +
                    "p9\2\u0213\u0218\5v<\2\u0214\u0218\5x=\2\u0215\u0218\5z>\2\u0216\u0218" +
                    "\5\u0082B\2\u0217\u0211\3\2\2\2\u0217\u0212\3\2\2\2\u0217\u0213\3\2\2" +
                    "\2\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218m" +
                    "\3\2\2\2\u0219\u021a\7\26\2\2\u021a\u021b\5@!\2\u021b\u021c\7[\2\2\u021c" +
                    "\u021d\5l\67\2\u021d\u0222\3\2\2\2\u021e\u021f\7\32\2\2\u021f\u0220\7" +
                    "[\2\2\u0220\u0222\5l\67\2\u0221\u0219\3\2\2\2\u0221\u021e\3\2\2\2\u0222" +
                    "o\3\2\2\2\u0223\u0225\7D\2\2\u0224\u0226\5r:\2\u0225\u0224\3\2\2\2\u0225" +
                    "\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7E\2\2\u0228q\3\2\2\2\u0229" +
                    "\u022b\5t;\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2" +
                    "\2\u022c\u022d\3\2\2\2\u022ds\3\2\2\2\u022e\u0231\5l\67\2\u022f\u0231" +
                    "\5\16\b\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231u\3\2\2\2\u0232" +
                    "\u0234\5> \2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2" +
                    "\2\u0235\u0236\7\\\2\2\u0236w\3\2\2\2\u0237\u0238\7#\2\2\u0238\u0239\7" +
                    "@\2\2\u0239\u023a\5> \2\u023a\u023b\7A\2\2\u023b\u023e\5l\67\2\u023c\u023d" +
                    "\7\35\2\2\u023d\u023f\5l\67\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2" +
                    "\u023f\u0247\3\2\2\2\u0240\u0241\7/\2\2\u0241\u0242\7@\2\2\u0242\u0243" +
                    "\5> \2\u0243\u0244\7A\2\2\u0244\u0245\5l\67\2\u0245\u0247\3\2\2\2\u0246" +
                    "\u0237\3\2\2\2\u0246\u0240\3\2\2\2\u0247y\3\2\2\2\u0248\u0249\7\65\2\2" +
                    "\u0249\u024a\7@\2\2\u024a\u024b\5> \2\u024b\u024c\7A\2\2\u024c\u024d\5" +
                    "l\67\2\u024d\u025d\3\2\2\2\u024e\u024f\7\33\2\2\u024f\u0250\5l\67\2\u0250" +
                    "\u0251\7\65\2\2\u0251\u0252\7@\2\2\u0252\u0253\5> \2\u0253\u0254\7A\2" +
                    "\2\u0254\u0255\7\\\2\2\u0255\u025d\3\2\2\2\u0256\u0257\7!\2\2\u0257\u0258" +
                    "\7@\2\2\u0258\u0259\5|?\2\u0259\u025a\7A\2\2\u025a\u025b\5l\67\2\u025b" +
                    "\u025d\3\2\2\2\u025c\u0248\3\2\2\2\u025c\u024e\3\2\2\2\u025c\u0256\3\2" +
                    "\2\2\u025d{\3\2\2\2\u025e\u0263\5~@\2\u025f\u0261\5> \2\u0260\u025f\3" +
                    "\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u025e\3\2\2\2\u0262" +
                    "\u0260\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\7\\\2\2\u0265\u0267\5\u0080" +
                    "A\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268" +
                    "\u026a\7\\\2\2\u0269\u026b\5\u0080A\2\u026a\u0269\3\2\2\2\u026a\u026b" +
                    "\3\2\2\2\u026b}\3\2\2\2\u026c\u026e\5\26\f\2\u026d\u026f\5\20\t\2\u026e" +
                    "\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\177\3\2\2\2\u0270\u0275\5:\36" +
                    "\2\u0271\u0272\7]\2\2\u0272\u0274\5:\36\2\u0273\u0271\3\2\2\2\u0274\u0277" +
                    "\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0081\3\2\2\2\u0277" +
                    "\u0275\3\2\2\2\u0278\u027f\7\31\2\2\u0279\u027f\7\25\2\2\u027a\u027c\7" +
                    ")\2\2\u027b\u027d\5> \2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d" +
                    "\u027f\3\2\2\2\u027e\u0278\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2" +
                    "\2\2\u027f\u0280\3\2\2\2\u0280\u0281\7\\\2\2\u0281\u0083\3\2\2\2K\u0085" +
                    "\u008c\u0093\u0099\u00a2\u00a9\u00ad\u00b6\u00bb\u00c0\u00cb\u00d6\u00db" +
                    "\u00e5\u00eb\u00f1\u00f5\u00fd\u0103\u0105\u010d\u0113\u011f\u0125\u012c" +
                    "\u0134\u013c\u0144\u014c\u0154\u015c\u0164\u016c\u0174\u017d\u0185\u018e" +
                    "\u01a6\u01b0\u01b4\u01b7\u01c1\u01c7\u01d2\u01d4\u01dc\u01e1\u01e4\u01eb" +
                    "\u01ee\u01f1\u01f4\u01f9\u01fe\u0207\u020f\u0217\u0221\u0225\u022c\u0230" +
                    "\u0233\u023e\u0246\u025c\u0260\u0262\u0266\u026a\u026e\u0275\u027c\u027e";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}