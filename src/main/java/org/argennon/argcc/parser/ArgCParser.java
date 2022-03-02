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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, Auto = 15, Break = 16, Case = 17,
            Char = 18, Const = 19, Continue = 20, Default = 21, Do = 22, Double = 23, Else = 24,
            Enum = 25, Extern = 26, Float = 27, For = 28, Goto = 29, If = 30, Inline = 31, Int = 32,
            Long = 33, Register = 34, Restrict = 35, Return = 36, Short = 37, Signed = 38, Sizeof = 39,
            Static = 40, Struct = 41, Switch = 42, Typedef = 43, Union = 44, Unsigned = 45, Void = 46,
            Volatile = 47, While = 48, Alignas = 49, Alignof = 50, Atomic = 51, Bool = 52, Complex = 53,
            Generic = 54, Imaginary = 55, Noreturn = 56, StaticAssert = 57, ThreadLocal = 58,
            LeftParen = 59, RightParen = 60, LeftBracket = 61, RightBracket = 62, LeftBrace = 63,
            RightBrace = 64, Less = 65, LessEqual = 66, Greater = 67, GreaterEqual = 68, LeftShift = 69,
            RightShift = 70, Plus = 71, PlusPlus = 72, Minus = 73, MinusMinus = 74, Star = 75,
            Div = 76, Mod = 77, And = 78, Or = 79, AndAnd = 80, OrOr = 81, Caret = 82, Not = 83, Tilde = 84,
            Question = 85, Colon = 86, Semi = 87, Comma = 88, Assign = 89, StarAssign = 90, DivAssign = 91,
            ModAssign = 92, PlusAssign = 93, MinusAssign = 94, LeftShiftAssign = 95, RightShiftAssign = 96,
            AndAssign = 97, XorAssign = 98, OrAssign = 99, Equal = 100, NotEqual = 101, Arrow = 102,
            Dot = 103, Ellipsis = 104, Identifier = 105, Constant = 106, DigitSequence = 107,
            StringLiteral = 108, ComplexDefine = 109, IncludeDirective = 110, AsmBlock = 111,
            LineAfterPreprocessing = 112, LineDirective = 113, PragmaDirective = 114, Whitespace = 115,
            Newline = 116, BlockComment = 117, LineComment = 118;
    public static final int
            RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2,
            RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_primaryExpression = 5,
            RULE_genericSelection = 6, RULE_genericAssocList = 7, RULE_genericAssociation = 8,
            RULE_postfixExpression = 9, RULE_argumentExpressionList = 10, RULE_unaryExpression = 11,
            RULE_unaryOperator = 12, RULE_castExpression = 13, RULE_multiplicativeExpression = 14,
            RULE_additiveExpression = 15, RULE_shiftExpression = 16, RULE_relationalExpression = 17,
            RULE_equalityExpression = 18, RULE_andExpression = 19, RULE_exclusiveOrExpression = 20,
            RULE_inclusiveOrExpression = 21, RULE_logicalAndExpression = 22, RULE_logicalOrExpression = 23,
            RULE_conditionalExpression = 24, RULE_assignmentExpression = 25, RULE_assignmentOperator = 26,
            RULE_expression = 27, RULE_constantExpression = 28, RULE_declaration = 29,
            RULE_declarationSpecifiers = 30, RULE_declarationSpecifiers2 = 31, RULE_declarationSpecifier = 32,
            RULE_initDeclaratorList = 33, RULE_initDeclarator = 34, RULE_storageClassSpecifier = 35,
            RULE_typeSpecifier = 36, RULE_structOrUnionSpecifier = 37, RULE_structOrUnion = 38,
            RULE_structDeclarationList = 39, RULE_structDeclaration = 40, RULE_specifierQualifierList = 41,
            RULE_structDeclaratorList = 42, RULE_structDeclarator = 43, RULE_enumSpecifier = 44,
            RULE_enumeratorList = 45, RULE_enumerator = 46, RULE_enumerationConstant = 47,
            RULE_atomicTypeSpecifier = 48, RULE_typeQualifier = 49, RULE_functionSpecifier = 50,
            RULE_alignmentSpecifier = 51, RULE_declarator = 52, RULE_directDeclarator = 53,
            RULE_gccDeclaratorExtension = 54, RULE_gccAttributeSpecifier = 55, RULE_gccAttributeList = 56,
            RULE_gccAttribute = 57, RULE_nestedParenthesesBlock = 58, RULE_pointer = 59,
            RULE_typeQualifierList = 60, RULE_parameterTypeList = 61, RULE_parameterList = 62,
            RULE_parameterDeclaration = 63, RULE_identifierList = 64, RULE_typeName = 65,
            RULE_abstractDeclarator = 66, RULE_directAbstractDeclarator = 67, RULE_typedefName = 68,
            RULE_initializer = 69, RULE_initializerList = 70, RULE_designation = 71,
            RULE_designatorList = 72, RULE_designator = 73, RULE_staticAssertDeclaration = 74,
            RULE_statement = 75, RULE_labeledStatement = 76, RULE_compoundStatement = 77,
            RULE_blockItemList = 78, RULE_blockItem = 79, RULE_expressionStatement = 80,
            RULE_selectionStatement = 81, RULE_iterationStatement = 82, RULE_forCondition = 83,
            RULE_forDeclaration = 84, RULE_forExpression = 85, RULE_jumpStatement = 86;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition",
                "declarationList", "primaryExpression", "genericSelection", "genericAssocList",
                "genericAssociation", "postfixExpression", "argumentExpressionList",
                "unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression",
                "additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression",
                "andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression",
                "logicalOrExpression", "conditionalExpression", "assignmentExpression",
                "assignmentOperator", "expression", "constantExpression", "declaration",
                "declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier",
                "initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier",
                "structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration",
                "specifierQualifierList", "structDeclaratorList", "structDeclarator",
                "enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant",
                "atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier",
                "declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier",
                "gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer",
                "typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration",
                "identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator",
                "typedefName", "initializer", "initializerList", "designation", "designatorList",
                "designator", "staticAssertDeclaration", "statement", "labeledStatement",
                "compoundStatement", "blockItemList", "blockItem", "expressionStatement",
                "selectionStatement", "iterationStatement", "forCondition", "forDeclaration",
                "forExpression", "jumpStatement"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'",
                "'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'",
                "'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'__asm__'",
                "'__volatile__'", "'auto'", "'break'", "'case'", "'char'", "'const'",
                "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'",
                "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'",
                "'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'",
                "'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'",
                "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'",
                "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'",
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
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, "Auto", "Break", "Case", "Char", "Const", "Continue",
                "Default", "Do", "Double", "Else", "Enum", "Extern", "Float", "For",
                "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", "Return",
                "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", "Typedef",
                "Union", "Unsigned", "Void", "Volatile", "While", "Alignas", "Alignof",
                "Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert",
                "ThreadLocal", "LeftParen", "RightParen", "LeftBracket", "RightBracket",
                "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual",
                "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus",
                "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not",
                "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign",
                "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign",
                "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual",
                "Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence",
                "StringLiteral", "ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing",
                "LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment",
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
                setState(175);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Star - 75)) | (1L << (Caret - 75)) | (1L << (Semi - 75)) | (1L << (Identifier - 75)))) != 0)) {
                    {
                        setState(174);
                        translationUnit();
                    }
                }

                setState(177);
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
                setState(180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(179);
                            externalDeclaration();
                        }
                    }
                    setState(182);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Star - 75)) | (1L << (Caret - 75)) | (1L << (Semi - 75)) | (1L << (Identifier - 75)))) != 0));
            }
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
            setState(187);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(184);
                    functionDefinition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(185);
                    declaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(186);
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

        public DeclarationSpecifiersContext declarationSpecifiers() {
            return getRuleContext(DeclarationSpecifiersContext.class, 0);
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
                setState(190);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(189);
                        declarationSpecifiers();
                    }
                    break;
                }
                setState(192);
                declarator();
                setState(194);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la == Identifier) {
                    {
                        setState(193);
                        declarationList();
                    }
                }

                setState(196);
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
                setState(199);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(198);
                            declaration();
                        }
                    }
                    setState(201);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la == Identifier);
            }
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

        public GenericSelectionContext genericSelection() {
            return getRuleContext(GenericSelectionContext.class, 0);
        }

        public CompoundStatementContext compoundStatement() {
            return getRuleContext(CompoundStatementContext.class, 0);
        }

        public UnaryExpressionContext unaryExpression() {
            return getRuleContext(UnaryExpressionContext.class, 0);
        }

        public TerminalNode Comma() {
            return getToken(ArgCParser.Comma, 0);
        }

        public TypeNameContext typeName() {
            return getRuleContext(TypeNameContext.class, 0);
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
            setState(236);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(203);
                    match(Identifier);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(204);
                    match(Constant);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(206);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(205);
                                match(StringLiteral);
                            }
                        }
                        setState(208);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == StringLiteral);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(210);
                    match(LeftParen);
                    setState(211);
                    expression();
                    setState(212);
                    match(RightParen);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(214);
                    genericSelection();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(216);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__0) {
                        {
                            setState(215);
                            match(T__0);
                        }
                    }

                    setState(218);
                    match(LeftParen);
                    setState(219);
                    compoundStatement();
                    setState(220);
                    match(RightParen);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(222);
                    match(T__1);
                    setState(223);
                    match(LeftParen);
                    setState(224);
                    unaryExpression();
                    setState(225);
                    match(Comma);
                    setState(226);
                    typeName();
                    setState(227);
                    match(RightParen);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(229);
                    match(T__2);
                    setState(230);
                    match(LeftParen);
                    setState(231);
                    typeName();
                    setState(232);
                    match(Comma);
                    setState(233);
                    unaryExpression();
                    setState(234);
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

    public static class GenericSelectionContext extends ParserRuleContext {
        public TerminalNode Generic() {
            return getToken(ArgCParser.Generic, 0);
        }

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public AssignmentExpressionContext assignmentExpression() {
            return getRuleContext(AssignmentExpressionContext.class, 0);
        }

        public TerminalNode Comma() {
            return getToken(ArgCParser.Comma, 0);
        }

        public GenericAssocListContext genericAssocList() {
            return getRuleContext(GenericAssocListContext.class, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericSelection;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGenericSelection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGenericSelection(this);
        }
    }

    public final GenericSelectionContext genericSelection() throws RecognitionException {
        GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_genericSelection);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(Generic);
                setState(239);
                match(LeftParen);
                setState(240);
                assignmentExpression();
                setState(241);
                match(Comma);
                setState(242);
                genericAssocList();
                setState(243);
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

    public static class GenericAssocListContext extends ParserRuleContext {
        public List<GenericAssociationContext> genericAssociation() {
            return getRuleContexts(GenericAssociationContext.class);
        }

        public GenericAssociationContext genericAssociation(int i) {
            return getRuleContext(GenericAssociationContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ArgCParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ArgCParser.Comma, i);
        }

        public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericAssocList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGenericAssocList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGenericAssocList(this);
        }
    }

    public final GenericAssocListContext genericAssocList() throws RecognitionException {
        GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_genericAssocList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                genericAssociation();
                setState(250);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(246);
                            match(Comma);
                            setState(247);
                            genericAssociation();
                        }
                    }
                    setState(252);
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

    public static class GenericAssociationContext extends ParserRuleContext {
        public TerminalNode Colon() {
            return getToken(ArgCParser.Colon, 0);
        }

        public AssignmentExpressionContext assignmentExpression() {
            return getRuleContext(AssignmentExpressionContext.class, 0);
        }

        public TypeNameContext typeName() {
            return getRuleContext(TypeNameContext.class, 0);
        }

        public TerminalNode Default() {
            return getToken(ArgCParser.Default, 0);
        }

        public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericAssociation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGenericAssociation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGenericAssociation(this);
        }
    }

    public final GenericAssociationContext genericAssociation() throws RecognitionException {
        GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_genericAssociation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__0:
                    case T__3:
                    case T__4:
                    case T__5:
                    case T__6:
                    case Char:
                    case Const:
                    case Double:
                    case Enum:
                    case Float:
                    case Int:
                    case Long:
                    case Restrict:
                    case Short:
                    case Signed:
                    case Struct:
                    case Union:
                    case Unsigned:
                    case Void:
                    case Volatile:
                    case Atomic:
                    case Bool:
                    case Complex:
                    case Identifier: {
                        setState(253);
                        typeName();
                    }
                    break;
                    case Default: {
                        setState(254);
                        match(Default);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(257);
                match(Colon);
                setState(258);
                assignmentExpression();
            }
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

        public List<TerminalNode> LeftParen() {
            return getTokens(ArgCParser.LeftParen);
        }

        public TerminalNode LeftParen(int i) {
            return getToken(ArgCParser.LeftParen, i);
        }

        public TypeNameContext typeName() {
            return getRuleContext(TypeNameContext.class, 0);
        }

        public List<TerminalNode> RightParen() {
            return getTokens(ArgCParser.RightParen);
        }

        public TerminalNode RightParen(int i) {
            return getToken(ArgCParser.RightParen, i);
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
        enterRule(_localctx, 18, RULE_postfixExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                    case 1: {
                        setState(260);
                        primaryExpression();
                    }
                    break;
                    case 2: {
                        setState(262);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__0) {
                            {
                                setState(261);
                                match(T__0);
                            }
                        }

                        setState(264);
                        match(LeftParen);
                        setState(265);
                        typeName();
                        setState(266);
                        match(RightParen);
                        setState(267);
                        match(LeftBrace);
                        setState(268);
                        initializerList();
                        setState(270);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Comma) {
                            {
                                setState(269);
                                match(Comma);
                            }
                        }

                        setState(272);
                        match(RightBrace);
                    }
                    break;
                }
                setState(290);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (LeftBracket - 59)) | (1L << (PlusPlus - 59)) | (1L << (MinusMinus - 59)) | (1L << (Arrow - 59)) | (1L << (Dot - 59)))) != 0)) {
                    {
                        setState(288);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case LeftBracket: {
                                setState(276);
                                match(LeftBracket);
                                setState(277);
                                expression();
                                setState(278);
                                match(RightBracket);
                            }
                            break;
                            case LeftParen: {
                                setState(280);
                                match(LeftParen);
                                setState(282);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                                    {
                                        setState(281);
                                        argumentExpressionList();
                                    }
                                }

                                setState(284);
                                match(RightParen);
                            }
                            break;
                            case Arrow:
                            case Dot: {
                                setState(285);
                                _la = _input.LA(1);
                                if (!(_la == Arrow || _la == Dot)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(286);
                                match(Identifier);
                            }
                            break;
                            case PlusPlus:
                            case MinusMinus: {
                                setState(287);
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
                    setState(292);
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
        enterRule(_localctx, 20, RULE_argumentExpressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(293);
                assignmentExpression();
                setState(298);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(294);
                            match(Comma);
                            setState(295);
                            assignmentExpression();
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

    public static class UnaryExpressionContext extends ParserRuleContext {
        public PostfixExpressionContext postfixExpression() {
            return getRuleContext(PostfixExpressionContext.class, 0);
        }

        public UnaryOperatorContext unaryOperator() {
            return getRuleContext(UnaryOperatorContext.class, 0);
        }

        public CastExpressionContext castExpression() {
            return getRuleContext(CastExpressionContext.class, 0);
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

        public TerminalNode AndAnd() {
            return getToken(ArgCParser.AndAnd, 0);
        }

        public TerminalNode Identifier() {
            return getToken(ArgCParser.Identifier, 0);
        }

        public List<TerminalNode> Sizeof() {
            return getTokens(ArgCParser.Sizeof);
        }

        public TerminalNode Sizeof(int i) {
            return getToken(ArgCParser.Sizeof, i);
        }

        public TerminalNode Alignof() {
            return getToken(ArgCParser.Alignof, 0);
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
        enterRule(_localctx, 22, RULE_unaryExpression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(304);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(301);
                                _la = _input.LA(1);
                                if (!(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (Sizeof - 39)) | (1L << (PlusPlus - 39)) | (1L << (MinusMinus - 39)))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                    }
                    setState(306);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                }
                setState(318);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__0:
                    case T__1:
                    case T__2:
                    case Generic:
                    case LeftParen:
                    case Identifier:
                    case Constant:
                    case StringLiteral: {
                        setState(307);
                        postfixExpression();
                    }
                    break;
                    case Plus:
                    case Minus:
                    case Star:
                    case And:
                    case Not:
                    case Tilde: {
                        setState(308);
                        unaryOperator();
                        setState(309);
                        castExpression();
                    }
                    break;
                    case Sizeof:
                    case Alignof: {
                        setState(311);
                        _la = _input.LA(1);
                        if (!(_la == Sizeof || _la == Alignof)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(312);
                        match(LeftParen);
                        setState(313);
                        typeName();
                        setState(314);
                        match(RightParen);
                    }
                    break;
                    case AndAnd: {
                        setState(316);
                        match(AndAnd);
                        setState(317);
                        match(Identifier);
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
        public TerminalNode And() {
            return getToken(ArgCParser.And, 0);
        }

        public TerminalNode Star() {
            return getToken(ArgCParser.Star, 0);
        }

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
        enterRule(_localctx, 24, RULE_unaryOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(320);
                _la = _input.LA(1);
                if (!(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)))) != 0))) {
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

    public static class CastExpressionContext extends ParserRuleContext {
        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TypeNameContext typeName() {
            return getRuleContext(TypeNameContext.class, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public CastExpressionContext castExpression() {
            return getRuleContext(CastExpressionContext.class, 0);
        }

        public UnaryExpressionContext unaryExpression() {
            return getRuleContext(UnaryExpressionContext.class, 0);
        }

        public TerminalNode DigitSequence() {
            return getToken(ArgCParser.DigitSequence, 0);
        }

        public CastExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_castExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterCastExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitCastExpression(this);
        }
    }

    public final CastExpressionContext castExpression() throws RecognitionException {
        CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_castExpression);
        int _la;
        try {
            setState(332);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(323);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__0) {
                        {
                            setState(322);
                            match(T__0);
                        }
                    }

                    setState(325);
                    match(LeftParen);
                    setState(326);
                    typeName();
                    setState(327);
                    match(RightParen);
                    setState(328);
                    castExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(330);
                    unaryExpression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(331);
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

    public static class MultiplicativeExpressionContext extends ParserRuleContext {
        public List<CastExpressionContext> castExpression() {
            return getRuleContexts(CastExpressionContext.class);
        }

        public CastExpressionContext castExpression(int i) {
            return getRuleContext(CastExpressionContext.class, i);
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
        enterRule(_localctx, 28, RULE_multiplicativeExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                castExpression();
                setState(339);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Star - 75)) | (1L << (Div - 75)) | (1L << (Mod - 75)))) != 0)) {
                    {
                        {
                            setState(335);
                            _la = _input.LA(1);
                            if (!(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Star - 75)) | (1L << (Div - 75)) | (1L << (Mod - 75)))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(336);
                            castExpression();
                        }
                    }
                    setState(341);
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
        enterRule(_localctx, 30, RULE_additiveExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(342);
                multiplicativeExpression();
                setState(347);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Plus || _la == Minus) {
                    {
                        {
                            setState(343);
                            _la = _input.LA(1);
                            if (!(_la == Plus || _la == Minus)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(344);
                            multiplicativeExpression();
                        }
                    }
                    setState(349);
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
        enterRule(_localctx, 32, RULE_shiftExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(350);
                additiveExpression();
                setState(355);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LeftShift || _la == RightShift) {
                    {
                        {
                            setState(351);
                            _la = _input.LA(1);
                            if (!(_la == LeftShift || _la == RightShift)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(352);
                            additiveExpression();
                        }
                    }
                    setState(357);
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
        enterRule(_localctx, 34, RULE_relationalExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(358);
                shiftExpression();
                setState(363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)))) != 0)) {
                    {
                        {
                            setState(359);
                            _la = _input.LA(1);
                            if (!(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Less - 65)) | (1L << (LessEqual - 65)) | (1L << (Greater - 65)) | (1L << (GreaterEqual - 65)))) != 0))) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(360);
                            shiftExpression();
                        }
                    }
                    setState(365);
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
        enterRule(_localctx, 36, RULE_equalityExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(366);
                relationalExpression();
                setState(371);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Equal || _la == NotEqual) {
                    {
                        {
                            setState(367);
                            _la = _input.LA(1);
                            if (!(_la == Equal || _la == NotEqual)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(368);
                            relationalExpression();
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
        enterRule(_localctx, 38, RULE_andExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(374);
                equalityExpression();
                setState(379);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == And) {
                    {
                        {
                            setState(375);
                            match(And);
                            setState(376);
                            equalityExpression();
                        }
                    }
                    setState(381);
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
        enterRule(_localctx, 40, RULE_exclusiveOrExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(382);
                andExpression();
                setState(387);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Caret) {
                    {
                        {
                            setState(383);
                            match(Caret);
                            setState(384);
                            andExpression();
                        }
                    }
                    setState(389);
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
        enterRule(_localctx, 42, RULE_inclusiveOrExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(390);
                exclusiveOrExpression();
                setState(395);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Or) {
                    {
                        {
                            setState(391);
                            match(Or);
                            setState(392);
                            exclusiveOrExpression();
                        }
                    }
                    setState(397);
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
        enterRule(_localctx, 44, RULE_logicalAndExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(398);
                inclusiveOrExpression();
                setState(403);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == AndAnd) {
                    {
                        {
                            setState(399);
                            match(AndAnd);
                            setState(400);
                            inclusiveOrExpression();
                        }
                    }
                    setState(405);
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
        enterRule(_localctx, 46, RULE_logicalOrExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(406);
                logicalAndExpression();
                setState(411);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OrOr) {
                    {
                        {
                            setState(407);
                            match(OrOr);
                            setState(408);
                            logicalAndExpression();
                        }
                    }
                    setState(413);
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
        enterRule(_localctx, 48, RULE_conditionalExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(414);
                logicalOrExpression();
                setState(420);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Question) {
                    {
                        setState(415);
                        match(Question);
                        setState(416);
                        expression();
                        setState(417);
                        match(Colon);
                        setState(418);
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
        enterRule(_localctx, 50, RULE_assignmentExpression);
        try {
            setState(428);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(422);
                    conditionalExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(423);
                    unaryExpression();
                    setState(424);
                    assignmentOperator();
                    setState(425);
                    assignmentExpression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(427);
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
        enterRule(_localctx, 52, RULE_assignmentOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(430);
                _la = _input.LA(1);
                if (!(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Assign - 89)) | (1L << (StarAssign - 89)) | (1L << (DivAssign - 89)) | (1L << (ModAssign - 89)) | (1L << (PlusAssign - 89)) | (1L << (MinusAssign - 89)) | (1L << (LeftShiftAssign - 89)) | (1L << (RightShiftAssign - 89)) | (1L << (AndAssign - 89)) | (1L << (XorAssign - 89)) | (1L << (OrAssign - 89)))) != 0))) {
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
        enterRule(_localctx, 54, RULE_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(432);
                assignmentExpression();
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(433);
                            match(Comma);
                            setState(434);
                            assignmentExpression();
                        }
                    }
                    setState(439);
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
        enterRule(_localctx, 56, RULE_constantExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(440);
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

        public StaticAssertDeclarationContext staticAssertDeclaration() {
            return getRuleContext(StaticAssertDeclarationContext.class, 0);
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
        enterRule(_localctx, 58, RULE_declaration);
        int _la;
        try {
            setState(449);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case T__9:
                case T__11:
                case Auto:
                case Char:
                case Const:
                case Double:
                case Enum:
                case Extern:
                case Float:
                case Inline:
                case Int:
                case Long:
                case Register:
                case Restrict:
                case Short:
                case Signed:
                case Static:
                case Struct:
                case Typedef:
                case Union:
                case Unsigned:
                case Void:
                case Volatile:
                case Alignas:
                case Atomic:
                case Bool:
                case Complex:
                case Noreturn:
                case ThreadLocal:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(442);
                    declarationSpecifiers();
                    setState(444);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)) | (1L << (Identifier - 59)))) != 0)) {
                        {
                            setState(443);
                            initDeclaratorList();
                        }
                    }

                    setState(446);
                    match(Semi);
                }
                break;
                case StaticAssert:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(448);
                    staticAssertDeclaration();
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
        enterRule(_localctx, 60, RULE_declarationSpecifiers);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(451);
                                declarationSpecifier();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(454);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
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

    public static class DeclarationSpecifiers2Context extends ParserRuleContext {
        public List<DeclarationSpecifierContext> declarationSpecifier() {
            return getRuleContexts(DeclarationSpecifierContext.class);
        }

        public DeclarationSpecifierContext declarationSpecifier(int i) {
            return getRuleContext(DeclarationSpecifierContext.class, i);
        }

        public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declarationSpecifiers2;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDeclarationSpecifiers2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDeclarationSpecifiers2(this);
        }
    }

    public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
        DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
        enterRule(_localctx, 62, RULE_declarationSpecifiers2);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(457);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(456);
                            declarationSpecifier();
                        }
                    }
                    setState(459);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la == Identifier);
            }
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

        public FunctionSpecifierContext functionSpecifier() {
            return getRuleContext(FunctionSpecifierContext.class, 0);
        }

        public AlignmentSpecifierContext alignmentSpecifier() {
            return getRuleContext(AlignmentSpecifierContext.class, 0);
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
        enterRule(_localctx, 64, RULE_declarationSpecifier);
        try {
            setState(466);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(461);
                    storageClassSpecifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(462);
                    typeSpecifier(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(463);
                    typeQualifier();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(464);
                    functionSpecifier();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(465);
                    alignmentSpecifier();
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
        enterRule(_localctx, 66, RULE_initDeclaratorList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(468);
                initDeclarator();
                setState(473);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(469);
                            match(Comma);
                            setState(470);
                            initDeclarator();
                        }
                    }
                    setState(475);
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
        enterRule(_localctx, 68, RULE_initDeclarator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(476);
                declarator();
                setState(479);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Assign) {
                    {
                        setState(477);
                        match(Assign);
                        setState(478);
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

        public TerminalNode Extern() {
            return getToken(ArgCParser.Extern, 0);
        }

        public TerminalNode Static() {
            return getToken(ArgCParser.Static, 0);
        }

        public TerminalNode ThreadLocal() {
            return getToken(ArgCParser.ThreadLocal, 0);
        }

        public TerminalNode Auto() {
            return getToken(ArgCParser.Auto, 0);
        }

        public TerminalNode Register() {
            return getToken(ArgCParser.Register, 0);
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
        enterRule(_localctx, 70, RULE_storageClassSpecifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(481);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0))) {
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
        public TerminalNode Void() {
            return getToken(ArgCParser.Void, 0);
        }

        public TerminalNode Char() {
            return getToken(ArgCParser.Char, 0);
        }

        public TerminalNode Short() {
            return getToken(ArgCParser.Short, 0);
        }

        public TerminalNode Int() {
            return getToken(ArgCParser.Int, 0);
        }

        public TerminalNode Long() {
            return getToken(ArgCParser.Long, 0);
        }

        public TerminalNode Float() {
            return getToken(ArgCParser.Float, 0);
        }

        public TerminalNode Double() {
            return getToken(ArgCParser.Double, 0);
        }

        public TerminalNode Signed() {
            return getToken(ArgCParser.Signed, 0);
        }

        public TerminalNode Unsigned() {
            return getToken(ArgCParser.Unsigned, 0);
        }

        public TerminalNode Bool() {
            return getToken(ArgCParser.Bool, 0);
        }

        public TerminalNode Complex() {
            return getToken(ArgCParser.Complex, 0);
        }

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public AtomicTypeSpecifierContext atomicTypeSpecifier() {
            return getRuleContext(AtomicTypeSpecifierContext.class, 0);
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

        public ConstantExpressionContext constantExpression() {
            return getRuleContext(ConstantExpressionContext.class, 0);
        }

        public TypeSpecifierContext typeSpecifier() {
            return getRuleContext(TypeSpecifierContext.class, 0);
        }

        public PointerContext pointer() {
            return getRuleContext(PointerContext.class, 0);
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
        return typeSpecifier(0);
    }

    private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
        TypeSpecifierContext _prevctx = _localctx;
        int _startState = 72;
        enterRecursionRule(_localctx, 72, RULE_typeSpecifier, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(498);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__3:
                    case T__4:
                    case T__5:
                    case Char:
                    case Double:
                    case Float:
                    case Int:
                    case Long:
                    case Short:
                    case Signed:
                    case Unsigned:
                    case Void:
                    case Bool:
                    case Complex: {
                        setState(484);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                    case T__0: {
                        setState(485);
                        match(T__0);
                        setState(486);
                        match(LeftParen);
                        setState(487);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(488);
                        match(RightParen);
                    }
                    break;
                    case Atomic: {
                        setState(489);
                        atomicTypeSpecifier();
                    }
                    break;
                    case Struct:
                    case Union: {
                        setState(490);
                        structOrUnionSpecifier();
                    }
                    break;
                    case Enum: {
                        setState(491);
                        enumSpecifier();
                    }
                    break;
                    case Identifier: {
                        setState(492);
                        typedefName();
                    }
                    break;
                    case T__6: {
                        setState(493);
                        match(T__6);
                        setState(494);
                        match(LeftParen);
                        setState(495);
                        constantExpression();
                        setState(496);
                        match(RightParen);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(504);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TypeSpecifierContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
                                setState(500);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(501);
                                pointer();
                            }
                        }
                    }
                    setState(506);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
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
        enterRule(_localctx, 74, RULE_structOrUnionSpecifier);
        int _la;
        try {
            setState(518);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(507);
                    structOrUnion();
                    setState(509);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(508);
                            match(Identifier);
                        }
                    }

                    setState(511);
                    match(LeftBrace);
                    setState(512);
                    structDeclarationList();
                    setState(513);
                    match(RightBrace);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(515);
                    structOrUnion();
                    setState(516);
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
        enterRule(_localctx, 76, RULE_structOrUnion);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(520);
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
        enterRule(_localctx, 78, RULE_structDeclarationList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(523);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(522);
                            structDeclaration();
                        }
                    }
                    setState(525);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la == Identifier);
            }
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

        public StaticAssertDeclarationContext staticAssertDeclaration() {
            return getRuleContext(StaticAssertDeclarationContext.class, 0);
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
        enterRule(_localctx, 80, RULE_structDeclaration);
        int _la;
        try {
            setState(534);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case Char:
                case Const:
                case Double:
                case Enum:
                case Float:
                case Int:
                case Long:
                case Restrict:
                case Short:
                case Signed:
                case Struct:
                case Union:
                case Unsigned:
                case Void:
                case Volatile:
                case Atomic:
                case Bool:
                case Complex:
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(527);
                    specifierQualifierList();
                    setState(529);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)) | (1L << (Colon - 59)) | (1L << (Identifier - 59)))) != 0)) {
                        {
                            setState(528);
                            structDeclaratorList();
                        }
                    }

                    setState(531);
                    match(Semi);
                }
                break;
                case StaticAssert:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(533);
                    staticAssertDeclaration();
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
        enterRule(_localctx, 82, RULE_specifierQualifierList);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(538);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                    case 1: {
                        setState(536);
                        typeSpecifier(0);
                    }
                    break;
                    case 2: {
                        setState(537);
                        typeQualifier();
                    }
                    break;
                }
                setState(541);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                    case 1: {
                        setState(540);
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
        enterRule(_localctx, 84, RULE_structDeclaratorList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(543);
                structDeclarator();
                setState(548);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(544);
                            match(Comma);
                            setState(545);
                            structDeclarator();
                        }
                    }
                    setState(550);
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
        enterRule(_localctx, 86, RULE_structDeclarator);
        int _la;
        try {
            setState(557);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(551);
                    declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(553);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)) | (1L << (Identifier - 59)))) != 0)) {
                        {
                            setState(552);
                            declarator();
                        }
                    }

                    setState(555);
                    match(Colon);
                    setState(556);
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
        enterRule(_localctx, 88, RULE_enumSpecifier);
        int _la;
        try {
            setState(572);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(559);
                    match(Enum);
                    setState(561);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Identifier) {
                        {
                            setState(560);
                            match(Identifier);
                        }
                    }

                    setState(563);
                    match(LeftBrace);
                    setState(564);
                    enumeratorList();
                    setState(566);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Comma) {
                        {
                            setState(565);
                            match(Comma);
                        }
                    }

                    setState(568);
                    match(RightBrace);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(570);
                    match(Enum);
                    setState(571);
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
        enterRule(_localctx, 90, RULE_enumeratorList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(574);
                enumerator();
                setState(579);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(575);
                                match(Comma);
                                setState(576);
                                enumerator();
                            }
                        }
                    }
                    setState(581);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
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
        enterRule(_localctx, 92, RULE_enumerator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(582);
                enumerationConstant();
                setState(585);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Assign) {
                    {
                        setState(583);
                        match(Assign);
                        setState(584);
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
        enterRule(_localctx, 94, RULE_enumerationConstant);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(587);
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

    public static class AtomicTypeSpecifierContext extends ParserRuleContext {
        public TerminalNode Atomic() {
            return getToken(ArgCParser.Atomic, 0);
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

        public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atomicTypeSpecifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAtomicTypeSpecifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAtomicTypeSpecifier(this);
        }
    }

    public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
        AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_atomicTypeSpecifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(589);
                match(Atomic);
                setState(590);
                match(LeftParen);
                setState(591);
                typeName();
                setState(592);
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

    public static class TypeQualifierContext extends ParserRuleContext {
        public TerminalNode Const() {
            return getToken(ArgCParser.Const, 0);
        }

        public TerminalNode Restrict() {
            return getToken(ArgCParser.Restrict, 0);
        }

        public TerminalNode Volatile() {
            return getToken(ArgCParser.Volatile, 0);
        }

        public TerminalNode Atomic() {
            return getToken(ArgCParser.Atomic, 0);
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
        enterRule(_localctx, 98, RULE_typeQualifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(594);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0))) {
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

    public static class FunctionSpecifierContext extends ParserRuleContext {
        public TerminalNode Inline() {
            return getToken(ArgCParser.Inline, 0);
        }

        public TerminalNode Noreturn() {
            return getToken(ArgCParser.Noreturn, 0);
        }

        public GccAttributeSpecifierContext gccAttributeSpecifier() {
            return getRuleContext(GccAttributeSpecifierContext.class, 0);
        }

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TerminalNode Identifier() {
            return getToken(ArgCParser.Identifier, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionSpecifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterFunctionSpecifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitFunctionSpecifier(this);
        }
    }

    public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
        FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_functionSpecifier);
        int _la;
        try {
            setState(602);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__7:
                case T__8:
                case Inline:
                case Noreturn:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(596);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Inline) | (1L << Noreturn))) != 0))) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case T__11:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(597);
                    gccAttributeSpecifier();
                }
                break;
                case T__9:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(598);
                    match(T__9);
                    setState(599);
                    match(LeftParen);
                    setState(600);
                    match(Identifier);
                    setState(601);
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

    public static class AlignmentSpecifierContext extends ParserRuleContext {
        public TerminalNode Alignas() {
            return getToken(ArgCParser.Alignas, 0);
        }

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public TypeNameContext typeName() {
            return getRuleContext(TypeNameContext.class, 0);
        }

        public ConstantExpressionContext constantExpression() {
            return getRuleContext(ConstantExpressionContext.class, 0);
        }

        public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alignmentSpecifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAlignmentSpecifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAlignmentSpecifier(this);
        }
    }

    public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
        AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_alignmentSpecifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(604);
                match(Alignas);
                setState(605);
                match(LeftParen);
                setState(608);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 60, _ctx)) {
                    case 1: {
                        setState(606);
                        typeName();
                    }
                    break;
                    case 2: {
                        setState(607);
                        constantExpression();
                    }
                    break;
                }
                setState(610);
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

    public static class DeclaratorContext extends ParserRuleContext {
        public DirectDeclaratorContext directDeclarator() {
            return getRuleContext(DirectDeclaratorContext.class, 0);
        }

        public PointerContext pointer() {
            return getRuleContext(PointerContext.class, 0);
        }

        public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
            return getRuleContexts(GccDeclaratorExtensionContext.class);
        }

        public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
            return getRuleContext(GccDeclaratorExtensionContext.class, i);
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
        enterRule(_localctx, 104, RULE_declarator);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(613);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Star || _la == Caret) {
                    {
                        setState(612);
                        pointer();
                    }
                }

                setState(615);
                directDeclarator(0);
                setState(619);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(616);
                                gccDeclaratorExtension();
                            }
                        }
                    }
                    setState(621);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
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

        public PointerContext pointer() {
            return getRuleContext(PointerContext.class, 0);
        }

        public DirectDeclaratorContext directDeclarator() {
            return getRuleContext(DirectDeclaratorContext.class, 0);
        }

        public TypeSpecifierContext typeSpecifier() {
            return getRuleContext(TypeSpecifierContext.class, 0);
        }

        public TerminalNode LeftBracket() {
            return getToken(ArgCParser.LeftBracket, 0);
        }

        public TerminalNode RightBracket() {
            return getToken(ArgCParser.RightBracket, 0);
        }

        public TypeQualifierListContext typeQualifierList() {
            return getRuleContext(TypeQualifierListContext.class, 0);
        }

        public AssignmentExpressionContext assignmentExpression() {
            return getRuleContext(AssignmentExpressionContext.class, 0);
        }

        public TerminalNode Static() {
            return getToken(ArgCParser.Static, 0);
        }

        public TerminalNode Star() {
            return getToken(ArgCParser.Star, 0);
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
        int _startState = 106;
        enterRecursionRule(_localctx, 106, RULE_directDeclarator, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(639);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                    case 1: {
                        setState(623);
                        match(Identifier);
                    }
                    break;
                    case 2: {
                        setState(624);
                        match(LeftParen);
                        setState(625);
                        declarator();
                        setState(626);
                        match(RightParen);
                    }
                    break;
                    case 3: {
                        setState(628);
                        match(Identifier);
                        setState(629);
                        match(Colon);
                        setState(630);
                        match(DigitSequence);
                    }
                    break;
                    case 4: {
                        setState(631);
                        match(LeftParen);
                        setState(633);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la == Identifier) {
                            {
                                setState(632);
                                typeSpecifier(0);
                            }
                        }

                        setState(635);
                        pointer();
                        setState(636);
                        directDeclarator(0);
                        setState(637);
                        match(RightParen);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(686);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(684);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
                                case 1: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(641);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(642);
                                    match(LeftBracket);
                                    setState(644);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                                        {
                                            setState(643);
                                            typeQualifierList();
                                        }
                                    }

                                    setState(647);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                                        {
                                            setState(646);
                                            assignmentExpression();
                                        }
                                    }

                                    setState(649);
                                    match(RightBracket);
                                }
                                break;
                                case 2: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(650);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(651);
                                    match(LeftBracket);
                                    setState(652);
                                    match(Static);
                                    setState(654);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                                        {
                                            setState(653);
                                            typeQualifierList();
                                        }
                                    }

                                    setState(656);
                                    assignmentExpression();
                                    setState(657);
                                    match(RightBracket);
                                }
                                break;
                                case 3: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(659);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(660);
                                    match(LeftBracket);
                                    setState(661);
                                    typeQualifierList();
                                    setState(662);
                                    match(Static);
                                    setState(663);
                                    assignmentExpression();
                                    setState(664);
                                    match(RightBracket);
                                }
                                break;
                                case 4: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(666);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(667);
                                    match(LeftBracket);
                                    setState(669);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                                        {
                                            setState(668);
                                            typeQualifierList();
                                        }
                                    }

                                    setState(671);
                                    match(Star);
                                    setState(672);
                                    match(RightBracket);
                                }
                                break;
                                case 5: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(673);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(674);
                                    match(LeftParen);
                                    setState(675);
                                    parameterTypeList();
                                    setState(676);
                                    match(RightParen);
                                }
                                break;
                                case 6: {
                                    _localctx = new DirectDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
                                    setState(678);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(679);
                                    match(LeftParen);
                                    setState(681);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == Identifier) {
                                        {
                                            setState(680);
                                            identifierList();
                                        }
                                    }

                                    setState(683);
                                    match(RightParen);
                                }
                                break;
                            }
                        }
                    }
                    setState(688);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
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

    public static class GccDeclaratorExtensionContext extends ParserRuleContext {
        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public List<TerminalNode> StringLiteral() {
            return getTokens(ArgCParser.StringLiteral);
        }

        public TerminalNode StringLiteral(int i) {
            return getToken(ArgCParser.StringLiteral, i);
        }

        public GccAttributeSpecifierContext gccAttributeSpecifier() {
            return getRuleContext(GccAttributeSpecifierContext.class, 0);
        }

        public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gccDeclaratorExtension;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGccDeclaratorExtension(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGccDeclaratorExtension(this);
        }
    }

    public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
        GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_gccDeclaratorExtension);
        int _la;
        try {
            setState(698);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__10:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(689);
                    match(T__10);
                    setState(690);
                    match(LeftParen);
                    setState(692);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(691);
                                match(StringLiteral);
                            }
                        }
                        setState(694);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == StringLiteral);
                    setState(696);
                    match(RightParen);
                }
                break;
                case T__11:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(697);
                    gccAttributeSpecifier();
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

    public static class GccAttributeSpecifierContext extends ParserRuleContext {
        public List<TerminalNode> LeftParen() {
            return getTokens(ArgCParser.LeftParen);
        }

        public TerminalNode LeftParen(int i) {
            return getToken(ArgCParser.LeftParen, i);
        }

        public GccAttributeListContext gccAttributeList() {
            return getRuleContext(GccAttributeListContext.class, 0);
        }

        public List<TerminalNode> RightParen() {
            return getTokens(ArgCParser.RightParen);
        }

        public TerminalNode RightParen(int i) {
            return getToken(ArgCParser.RightParen, i);
        }

        public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gccAttributeSpecifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGccAttributeSpecifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGccAttributeSpecifier(this);
        }
    }

    public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
        GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_gccAttributeSpecifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(700);
                match(T__11);
                setState(701);
                match(LeftParen);
                setState(702);
                match(LeftParen);
                setState(703);
                gccAttributeList();
                setState(704);
                match(RightParen);
                setState(705);
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

    public static class GccAttributeListContext extends ParserRuleContext {
        public List<GccAttributeContext> gccAttribute() {
            return getRuleContexts(GccAttributeContext.class);
        }

        public GccAttributeContext gccAttribute(int i) {
            return getRuleContext(GccAttributeContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ArgCParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ArgCParser.Comma, i);
        }

        public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gccAttributeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGccAttributeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGccAttributeList(this);
        }
    }

    public final GccAttributeListContext gccAttributeList() throws RecognitionException {
        GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_gccAttributeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(708);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
                    {
                        setState(707);
                        gccAttribute();
                    }
                }

                setState(716);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(710);
                            match(Comma);
                            setState(712);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
                                {
                                    setState(711);
                                    gccAttribute();
                                }
                            }

                        }
                    }
                    setState(718);
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

    public static class GccAttributeContext extends ParserRuleContext {
        public TerminalNode Comma() {
            return getToken(ArgCParser.Comma, 0);
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

        public ArgumentExpressionListContext argumentExpressionList() {
            return getRuleContext(ArgumentExpressionListContext.class, 0);
        }

        public GccAttributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gccAttribute;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterGccAttribute(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitGccAttribute(this);
        }
    }

    public final GccAttributeContext gccAttribute() throws RecognitionException {
        GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_gccAttribute);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(719);
                _la = _input.LA(1);
                if (_la <= 0 || (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (RightParen - 59)) | (1L << (Comma - 59)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(725);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LeftParen) {
                    {
                        setState(720);
                        match(LeftParen);
                        setState(722);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                            {
                                setState(721);
                                argumentExpressionList();
                            }
                        }

                        setState(724);
                        match(RightParen);
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
        enterRule(_localctx, 116, RULE_nestedParenthesesBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(734);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
                    {
                        setState(732);
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
                            case T__11:
                            case T__12:
                            case T__13:
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
                                setState(727);
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
                                setState(728);
                                match(LeftParen);
                                setState(729);
                                nestedParenthesesBlock();
                                setState(730);
                                match(RightParen);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(736);
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

    public static class PointerContext extends ParserRuleContext {
        public List<TerminalNode> Star() {
            return getTokens(ArgCParser.Star);
        }

        public TerminalNode Star(int i) {
            return getToken(ArgCParser.Star, i);
        }

        public List<TerminalNode> Caret() {
            return getTokens(ArgCParser.Caret);
        }

        public TerminalNode Caret(int i) {
            return getToken(ArgCParser.Caret, i);
        }

        public List<TypeQualifierListContext> typeQualifierList() {
            return getRuleContexts(TypeQualifierListContext.class);
        }

        public TypeQualifierListContext typeQualifierList(int i) {
            return getRuleContext(TypeQualifierListContext.class, i);
        }

        public PointerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pointer;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterPointer(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitPointer(this);
        }
    }

    public final PointerContext pointer() throws RecognitionException {
        PointerContext _localctx = new PointerContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_pointer);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(741);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(737);
                                _la = _input.LA(1);
                                if (!(_la == Star || _la == Caret)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(739);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 81, _ctx)) {
                                    case 1: {
                                        setState(738);
                                        typeQualifierList();
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(743);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 82, _ctx);
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
        enterRule(_localctx, 120, RULE_typeQualifierList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(746);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(745);
                                typeQualifier();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(748);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 83, _ctx);
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
        enterRule(_localctx, 122, RULE_parameterTypeList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(750);
                parameterList();
                setState(753);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Comma) {
                    {
                        setState(751);
                        match(Comma);
                        setState(752);
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
        enterRule(_localctx, 124, RULE_parameterList);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(755);
                parameterDeclaration();
                setState(760);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(756);
                                match(Comma);
                                setState(757);
                                parameterDeclaration();
                            }
                        }
                    }
                    setState(762);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
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

        public DeclarationSpecifiers2Context declarationSpecifiers2() {
            return getRuleContext(DeclarationSpecifiers2Context.class, 0);
        }

        public AbstractDeclaratorContext abstractDeclarator() {
            return getRuleContext(AbstractDeclaratorContext.class, 0);
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
        enterRule(_localctx, 126, RULE_parameterDeclaration);
        int _la;
        try {
            setState(770);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(763);
                    declarationSpecifiers();
                    setState(764);
                    declarator();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(766);
                    declarationSpecifiers2();
                    setState(768);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (LeftBracket - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)))) != 0)) {
                        {
                            setState(767);
                            abstractDeclarator();
                        }
                    }

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
        enterRule(_localctx, 128, RULE_identifierList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(772);
                match(Identifier);
                setState(777);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(773);
                            match(Comma);
                            setState(774);
                            match(Identifier);
                        }
                    }
                    setState(779);
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

        public AbstractDeclaratorContext abstractDeclarator() {
            return getRuleContext(AbstractDeclaratorContext.class, 0);
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
        enterRule(_localctx, 130, RULE_typeName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(780);
                specifierQualifierList();
                setState(782);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (LeftBracket - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)))) != 0)) {
                    {
                        setState(781);
                        abstractDeclarator();
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

    public static class AbstractDeclaratorContext extends ParserRuleContext {
        public PointerContext pointer() {
            return getRuleContext(PointerContext.class, 0);
        }

        public DirectAbstractDeclaratorContext directAbstractDeclarator() {
            return getRuleContext(DirectAbstractDeclaratorContext.class, 0);
        }

        public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
            return getRuleContexts(GccDeclaratorExtensionContext.class);
        }

        public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
            return getRuleContext(GccDeclaratorExtensionContext.class, i);
        }

        public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_abstractDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterAbstractDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitAbstractDeclarator(this);
        }
    }

    public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
        AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_abstractDeclarator);
        int _la;
        try {
            setState(795);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(784);
                    pointer();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(786);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Star || _la == Caret) {
                        {
                            setState(785);
                            pointer();
                        }
                    }

                    setState(788);
                    directAbstractDeclarator(0);
                    setState(792);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__10 || _la == T__11) {
                        {
                            {
                                setState(789);
                                gccDeclaratorExtension();
                            }
                        }
                        setState(794);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
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

    public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public AbstractDeclaratorContext abstractDeclarator() {
            return getRuleContext(AbstractDeclaratorContext.class, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
            return getRuleContexts(GccDeclaratorExtensionContext.class);
        }

        public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
            return getRuleContext(GccDeclaratorExtensionContext.class, i);
        }

        public TerminalNode LeftBracket() {
            return getToken(ArgCParser.LeftBracket, 0);
        }

        public TerminalNode RightBracket() {
            return getToken(ArgCParser.RightBracket, 0);
        }

        public TypeQualifierListContext typeQualifierList() {
            return getRuleContext(TypeQualifierListContext.class, 0);
        }

        public AssignmentExpressionContext assignmentExpression() {
            return getRuleContext(AssignmentExpressionContext.class, 0);
        }

        public TerminalNode Static() {
            return getToken(ArgCParser.Static, 0);
        }

        public TerminalNode Star() {
            return getToken(ArgCParser.Star, 0);
        }

        public ParameterTypeListContext parameterTypeList() {
            return getRuleContext(ParameterTypeListContext.class, 0);
        }

        public DirectAbstractDeclaratorContext directAbstractDeclarator() {
            return getRuleContext(DirectAbstractDeclaratorContext.class, 0);
        }

        public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_directAbstractDeclarator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterDirectAbstractDeclarator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitDirectAbstractDeclarator(this);
        }
    }

    public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
        return directAbstractDeclarator(0);
    }

    private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
        DirectAbstractDeclaratorContext _prevctx = _localctx;
        int _startState = 134;
        enterRecursionRule(_localctx, 134, RULE_directAbstractDeclarator, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(843);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
                    case 1: {
                        setState(798);
                        match(LeftParen);
                        setState(799);
                        abstractDeclarator();
                        setState(800);
                        match(RightParen);
                        setState(804);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(801);
                                        gccDeclaratorExtension();
                                    }
                                }
                            }
                            setState(806);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
                        }
                    }
                    break;
                    case 2: {
                        setState(807);
                        match(LeftBracket);
                        setState(809);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                            {
                                setState(808);
                                typeQualifierList();
                            }
                        }

                        setState(812);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                            {
                                setState(811);
                                assignmentExpression();
                            }
                        }

                        setState(814);
                        match(RightBracket);
                    }
                    break;
                    case 3: {
                        setState(815);
                        match(LeftBracket);
                        setState(816);
                        match(Static);
                        setState(818);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                            {
                                setState(817);
                                typeQualifierList();
                            }
                        }

                        setState(820);
                        assignmentExpression();
                        setState(821);
                        match(RightBracket);
                    }
                    break;
                    case 4: {
                        setState(823);
                        match(LeftBracket);
                        setState(824);
                        typeQualifierList();
                        setState(825);
                        match(Static);
                        setState(826);
                        assignmentExpression();
                        setState(827);
                        match(RightBracket);
                    }
                    break;
                    case 5: {
                        setState(829);
                        match(LeftBracket);
                        setState(830);
                        match(Star);
                        setState(831);
                        match(RightBracket);
                    }
                    break;
                    case 6: {
                        setState(832);
                        match(LeftParen);
                        setState(834);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la == Identifier) {
                            {
                                setState(833);
                                parameterTypeList();
                            }
                        }

                        setState(836);
                        match(RightParen);
                        setState(840);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 98, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(837);
                                        gccDeclaratorExtension();
                                    }
                                }
                            }
                            setState(842);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 98, _ctx);
                        }
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(888);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 106, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(886);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 105, _ctx)) {
                                case 1: {
                                    _localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
                                    setState(845);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(846);
                                    match(LeftBracket);
                                    setState(848);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                                        {
                                            setState(847);
                                            typeQualifierList();
                                        }
                                    }

                                    setState(851);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                                        {
                                            setState(850);
                                            assignmentExpression();
                                        }
                                    }

                                    setState(853);
                                    match(RightBracket);
                                }
                                break;
                                case 2: {
                                    _localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
                                    setState(854);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(855);
                                    match(LeftBracket);
                                    setState(856);
                                    match(Static);
                                    setState(858);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
                                        {
                                            setState(857);
                                            typeQualifierList();
                                        }
                                    }

                                    setState(860);
                                    assignmentExpression();
                                    setState(861);
                                    match(RightBracket);
                                }
                                break;
                                case 3: {
                                    _localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
                                    setState(863);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(864);
                                    match(LeftBracket);
                                    setState(865);
                                    typeQualifierList();
                                    setState(866);
                                    match(Static);
                                    setState(867);
                                    assignmentExpression();
                                    setState(868);
                                    match(RightBracket);
                                }
                                break;
                                case 4: {
                                    _localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
                                    setState(870);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(871);
                                    match(LeftBracket);
                                    setState(872);
                                    match(Star);
                                    setState(873);
                                    match(RightBracket);
                                }
                                break;
                                case 5: {
                                    _localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
                                    setState(874);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(875);
                                    match(LeftParen);
                                    setState(877);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la == Identifier) {
                                        {
                                            setState(876);
                                            parameterTypeList();
                                        }
                                    }

                                    setState(879);
                                    match(RightParen);
                                    setState(883);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                        if (_alt == 1) {
                                            {
                                                {
                                                    setState(880);
                                                    gccDeclaratorExtension();
                                                }
                                            }
                                        }
                                        setState(885);
                                        _errHandler.sync(this);
                                        _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    setState(890);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 106, _ctx);
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
        enterRule(_localctx, 136, RULE_typedefName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(891);
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
        enterRule(_localctx, 138, RULE_initializer);
        int _la;
        try {
            setState(901);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                case T__1:
                case T__2:
                case Sizeof:
                case Alignof:
                case Generic:
                case LeftParen:
                case Plus:
                case PlusPlus:
                case Minus:
                case MinusMinus:
                case Star:
                case And:
                case AndAnd:
                case Not:
                case Tilde:
                case Identifier:
                case Constant:
                case DigitSequence:
                case StringLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(893);
                    assignmentExpression();
                }
                break;
                case LeftBrace:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(894);
                    match(LeftBrace);
                    setState(895);
                    initializerList();
                    setState(897);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Comma) {
                        {
                            setState(896);
                            match(Comma);
                        }
                    }

                    setState(899);
                    match(RightBrace);
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
        enterRule(_localctx, 140, RULE_initializerList);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(904);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LeftBracket || _la == Dot) {
                    {
                        setState(903);
                        designation();
                    }
                }

                setState(906);
                initializer();
                setState(914);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 111, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(907);
                                match(Comma);
                                setState(909);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == LeftBracket || _la == Dot) {
                                    {
                                        setState(908);
                                        designation();
                                    }
                                }

                                setState(911);
                                initializer();
                            }
                        }
                    }
                    setState(916);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 111, _ctx);
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
        enterRule(_localctx, 142, RULE_designation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(917);
                designatorList();
                setState(918);
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
        enterRule(_localctx, 144, RULE_designatorList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(921);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(920);
                            designator();
                        }
                    }
                    setState(923);
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
        enterRule(_localctx, 146, RULE_designator);
        try {
            setState(931);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case LeftBracket:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(925);
                    match(LeftBracket);
                    setState(926);
                    constantExpression();
                    setState(927);
                    match(RightBracket);
                }
                break;
                case Dot:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(929);
                    match(Dot);
                    setState(930);
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

    public static class StaticAssertDeclarationContext extends ParserRuleContext {
        public TerminalNode StaticAssert() {
            return getToken(ArgCParser.StaticAssert, 0);
        }

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public ConstantExpressionContext constantExpression() {
            return getRuleContext(ConstantExpressionContext.class, 0);
        }

        public TerminalNode Comma() {
            return getToken(ArgCParser.Comma, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public TerminalNode Semi() {
            return getToken(ArgCParser.Semi, 0);
        }

        public List<TerminalNode> StringLiteral() {
            return getTokens(ArgCParser.StringLiteral);
        }

        public TerminalNode StringLiteral(int i) {
            return getToken(ArgCParser.StringLiteral, i);
        }

        public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_staticAssertDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).enterStaticAssertDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ArgCListener) ((ArgCListener) listener).exitStaticAssertDeclaration(this);
        }
    }

    public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
        StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_staticAssertDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(933);
                match(StaticAssert);
                setState(934);
                match(LeftParen);
                setState(935);
                constantExpression();
                setState(936);
                match(Comma);
                setState(938);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(937);
                            match(StringLiteral);
                        }
                    }
                    setState(940);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == StringLiteral);
                setState(942);
                match(RightParen);
                setState(943);
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

        public TerminalNode LeftParen() {
            return getToken(ArgCParser.LeftParen, 0);
        }

        public TerminalNode RightParen() {
            return getToken(ArgCParser.RightParen, 0);
        }

        public TerminalNode Semi() {
            return getToken(ArgCParser.Semi, 0);
        }

        public TerminalNode Volatile() {
            return getToken(ArgCParser.Volatile, 0);
        }

        public List<LogicalOrExpressionContext> logicalOrExpression() {
            return getRuleContexts(LogicalOrExpressionContext.class);
        }

        public LogicalOrExpressionContext logicalOrExpression(int i) {
            return getRuleContext(LogicalOrExpressionContext.class, i);
        }

        public List<TerminalNode> Colon() {
            return getTokens(ArgCParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(ArgCParser.Colon, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ArgCParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ArgCParser.Comma, i);
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
        enterRule(_localctx, 150, RULE_statement);
        int _la;
        try {
            setState(982);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(945);
                    labeledStatement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(946);
                    compoundStatement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(947);
                    expressionStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(948);
                    selectionStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(949);
                    iterationStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(950);
                    jumpStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(951);
                    _la = _input.LA(1);
                    if (!(_la == T__10 || _la == T__12)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(952);
                    _la = _input.LA(1);
                    if (!(_la == T__13 || _la == Volatile)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(953);
                    match(LeftParen);
                    setState(962);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                        {
                            setState(954);
                            logicalOrExpression();
                            setState(959);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == Comma) {
                                {
                                    {
                                        setState(955);
                                        match(Comma);
                                        setState(956);
                                        logicalOrExpression();
                                    }
                                }
                                setState(961);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(977);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == Colon) {
                        {
                            {
                                setState(964);
                                match(Colon);
                                setState(973);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                                    {
                                        setState(965);
                                        logicalOrExpression();
                                        setState(970);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        while (_la == Comma) {
                                            {
                                                {
                                                    setState(966);
                                                    match(Comma);
                                                    setState(967);
                                                    logicalOrExpression();
                                                }
                                            }
                                            setState(972);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                        }
                                    }
                                }

                            }
                        }
                        setState(979);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(980);
                    match(RightParen);
                    setState(981);
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
        enterRule(_localctx, 152, RULE_labeledStatement);
        try {
            setState(995);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(984);
                    match(Identifier);
                    setState(985);
                    match(Colon);
                    setState(986);
                    statement();
                }
                break;
                case Case:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(987);
                    match(Case);
                    setState(988);
                    constantExpression();
                    setState(989);
                    match(Colon);
                    setState(990);
                    statement();
                }
                break;
                case Default:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(992);
                    match(Default);
                    setState(993);
                    match(Colon);
                    setState(994);
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
        enterRule(_localctx, 154, RULE_compoundStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(997);
                match(LeftBrace);
                setState(999);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Semi - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                    {
                        setState(998);
                        blockItemList();
                    }
                }

                setState(1001);
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
        enterRule(_localctx, 156, RULE_blockItemList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1004);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(1003);
                            blockItem();
                        }
                    }
                    setState(1006);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Semi - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0));
            }
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
        enterRule(_localctx, 158, RULE_blockItem);
        try {
            setState(1010);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 124, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1008);
                    statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1009);
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
        enterRule(_localctx, 160, RULE_expressionStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1013);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                    {
                        setState(1012);
                        expression();
                    }
                }

                setState(1015);
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
        enterRule(_localctx, 162, RULE_selectionStatement);
        try {
            setState(1032);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case If:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1017);
                    match(If);
                    setState(1018);
                    match(LeftParen);
                    setState(1019);
                    expression();
                    setState(1020);
                    match(RightParen);
                    setState(1021);
                    statement();
                    setState(1024);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                        case 1: {
                            setState(1022);
                            match(Else);
                            setState(1023);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case Switch:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1026);
                    match(Switch);
                    setState(1027);
                    match(LeftParen);
                    setState(1028);
                    expression();
                    setState(1029);
                    match(RightParen);
                    setState(1030);
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
        enterRule(_localctx, 164, RULE_iterationStatement);
        try {
            setState(1054);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case While:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1034);
                    match(While);
                    setState(1035);
                    match(LeftParen);
                    setState(1036);
                    expression();
                    setState(1037);
                    match(RightParen);
                    setState(1038);
                    statement();
                }
                break;
                case Do:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1040);
                    match(Do);
                    setState(1041);
                    statement();
                    setState(1042);
                    match(While);
                    setState(1043);
                    match(LeftParen);
                    setState(1044);
                    expression();
                    setState(1045);
                    match(RightParen);
                    setState(1046);
                    match(Semi);
                }
                break;
                case For:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1048);
                    match(For);
                    setState(1049);
                    match(LeftParen);
                    setState(1050);
                    forCondition();
                    setState(1051);
                    match(RightParen);
                    setState(1052);
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
        enterRule(_localctx, 166, RULE_forCondition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1060);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 130, _ctx)) {
                    case 1: {
                        setState(1056);
                        forDeclaration();
                    }
                    break;
                    case 2: {
                        setState(1058);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                            {
                                setState(1057);
                                expression();
                            }
                        }

                    }
                    break;
                }
                setState(1062);
                match(Semi);
                setState(1064);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                    {
                        setState(1063);
                        forExpression();
                    }
                }

                setState(1066);
                match(Semi);
                setState(1068);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                    {
                        setState(1067);
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
        enterRule(_localctx, 168, RULE_forDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1070);
                declarationSpecifiers();
                setState(1072);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LeftParen - 59)) | (1L << (Star - 59)) | (1L << (Caret - 59)) | (1L << (Identifier - 59)))) != 0)) {
                    {
                        setState(1071);
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
        enterRule(_localctx, 170, RULE_forExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1074);
                assignmentExpression();
                setState(1079);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(1075);
                            match(Comma);
                            setState(1076);
                            assignmentExpression();
                        }
                    }
                    setState(1081);
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

        public TerminalNode Goto() {
            return getToken(ArgCParser.Goto, 0);
        }

        public TerminalNode Identifier() {
            return getToken(ArgCParser.Identifier, 0);
        }

        public TerminalNode Return() {
            return getToken(ArgCParser.Return, 0);
        }

        public UnaryExpressionContext unaryExpression() {
            return getRuleContext(UnaryExpressionContext.class, 0);
        }

        public TerminalNode Continue() {
            return getToken(ArgCParser.Continue, 0);
        }

        public TerminalNode Break() {
            return getToken(ArgCParser.Break, 0);
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
        enterRule(_localctx, 172, RULE_jumpStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1091);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 136, _ctx)) {
                    case 1: {
                        setState(1082);
                        match(Goto);
                        setState(1083);
                        match(Identifier);
                    }
                    break;
                    case 2: {
                        setState(1084);
                        _la = _input.LA(1);
                        if (!(_la == Break || _la == Continue)) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                    case 3: {
                        setState(1085);
                        match(Return);
                        setState(1087);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (Plus - 71)) | (1L << (PlusPlus - 71)) | (1L << (Minus - 71)) | (1L << (MinusMinus - 71)) | (1L << (Star - 71)) | (1L << (And - 71)) | (1L << (AndAnd - 71)) | (1L << (Not - 71)) | (1L << (Tilde - 71)) | (1L << (Identifier - 71)) | (1L << (Constant - 71)) | (1L << (DigitSequence - 71)) | (1L << (StringLiteral - 71)))) != 0)) {
                            {
                                setState(1086);
                                expression();
                            }
                        }

                    }
                    break;
                    case 4: {
                        setState(1089);
                        match(Goto);
                        setState(1090);
                        unaryExpression();
                    }
                    break;
                }
                setState(1093);
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
            case 36:
                return typeSpecifier_sempred((TypeSpecifierContext) _localctx, predIndex);
            case 53:
                return directDeclarator_sempred((DirectDeclaratorContext) _localctx, predIndex);
            case 67:
                return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 8);
            case 2:
                return precpred(_ctx, 7);
            case 3:
                return precpred(_ctx, 6);
            case 4:
                return precpred(_ctx, 5);
            case 5:
                return precpred(_ctx, 4);
            case 6:
                return precpred(_ctx, 3);
        }
        return true;
    }

    private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
        switch (predIndex) {
            case 7:
                return precpred(_ctx, 5);
            case 8:
                return precpred(_ctx, 4);
            case 9:
                return precpred(_ctx, 3);
            case 10:
                return precpred(_ctx, 2);
            case 11:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u044a\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\3\2\5\2\u00b2\n\2\3\2\3\2\3\3\6\3\u00b7\n\3\r" +
                    "\3\16\3\u00b8\3\4\3\4\3\4\5\4\u00be\n\4\3\5\5\5\u00c1\n\5\3\5\3\5\5\5" +
                    "\u00c5\n\5\3\5\3\5\3\6\6\6\u00ca\n\6\r\6\16\6\u00cb\3\7\3\7\3\7\6\7\u00d1" +
                    "\n\7\r\7\16\7\u00d2\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00db\n\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ef" +
                    "\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00fb\n\t\f\t\16\t\u00fe" +
                    "\13\t\3\n\3\n\5\n\u0102\n\n\3\n\3\n\3\n\3\13\3\13\5\13\u0109\n\13\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\5\13\u0111\n\13\3\13\3\13\5\13\u0115\n\13\3" +
                    "\13\3\13\3\13\3\13\3\13\3\13\5\13\u011d\n\13\3\13\3\13\3\13\3\13\7\13" +
                    "\u0123\n\13\f\13\16\13\u0126\13\13\3\f\3\f\3\f\7\f\u012b\n\f\f\f\16\f" +
                    "\u012e\13\f\3\r\7\r\u0131\n\r\f\r\16\r\u0134\13\r\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0141\n\r\3\16\3\16\3\17\5\17\u0146\n\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014f\n\17\3\20\3\20\3\20\7\20" +
                    "\u0154\n\20\f\20\16\20\u0157\13\20\3\21\3\21\3\21\7\21\u015c\n\21\f\21" +
                    "\16\21\u015f\13\21\3\22\3\22\3\22\7\22\u0164\n\22\f\22\16\22\u0167\13" +
                    "\22\3\23\3\23\3\23\7\23\u016c\n\23\f\23\16\23\u016f\13\23\3\24\3\24\3" +
                    "\24\7\24\u0174\n\24\f\24\16\24\u0177\13\24\3\25\3\25\3\25\7\25\u017c\n" +
                    "\25\f\25\16\25\u017f\13\25\3\26\3\26\3\26\7\26\u0184\n\26\f\26\16\26\u0187" +
                    "\13\26\3\27\3\27\3\27\7\27\u018c\n\27\f\27\16\27\u018f\13\27\3\30\3\30" +
                    "\3\30\7\30\u0194\n\30\f\30\16\30\u0197\13\30\3\31\3\31\3\31\7\31\u019c" +
                    "\n\31\f\31\16\31\u019f\13\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a7" +
                    "\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01af\n\33\3\34\3\34\3\35\3\35" +
                    "\3\35\7\35\u01b6\n\35\f\35\16\35\u01b9\13\35\3\36\3\36\3\37\3\37\5\37" +
                    "\u01bf\n\37\3\37\3\37\3\37\5\37\u01c4\n\37\3 \6 \u01c7\n \r \16 \u01c8" +
                    "\3!\6!\u01cc\n!\r!\16!\u01cd\3\"\3\"\3\"\3\"\3\"\5\"\u01d5\n\"\3#\3#\3" +
                    "#\7#\u01da\n#\f#\16#\u01dd\13#\3$\3$\3$\5$\u01e2\n$\3%\3%\3&\3&\3&\3&" +
                    "\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01f5\n&\3&\3&\7&\u01f9\n&\f&\16" +
                    "&\u01fc\13&\3\'\3\'\5\'\u0200\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0209" +
                    "\n\'\3(\3(\3)\6)\u020e\n)\r)\16)\u020f\3*\3*\5*\u0214\n*\3*\3*\3*\5*\u0219" +
                    "\n*\3+\3+\5+\u021d\n+\3+\5+\u0220\n+\3,\3,\3,\7,\u0225\n,\f,\16,\u0228" +
                    "\13,\3-\3-\5-\u022c\n-\3-\3-\5-\u0230\n-\3.\3.\5.\u0234\n.\3.\3.\3.\5" +
                    ".\u0239\n.\3.\3.\3.\3.\5.\u023f\n.\3/\3/\3/\7/\u0244\n/\f/\16/\u0247\13" +
                    "/\3\60\3\60\3\60\5\60\u024c\n\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3" +
                    "\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u025d\n\64\3\65\3\65\3\65" +
                    "\3\65\5\65\u0263\n\65\3\65\3\65\3\66\5\66\u0268\n\66\3\66\3\66\7\66\u026c" +
                    "\n\66\f\66\16\66\u026f\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3" +
                    "\67\3\67\3\67\5\67\u027c\n\67\3\67\3\67\3\67\3\67\5\67\u0282\n\67\3\67" +
                    "\3\67\3\67\5\67\u0287\n\67\3\67\5\67\u028a\n\67\3\67\3\67\3\67\3\67\3" +
                    "\67\5\67\u0291\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
                    "\3\67\3\67\3\67\5\67\u02a0\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
                    "\3\67\3\67\5\67\u02ac\n\67\3\67\7\67\u02af\n\67\f\67\16\67\u02b2\13\67" +
                    "\38\38\38\68\u02b7\n8\r8\168\u02b8\38\38\58\u02bd\n8\39\39\39\39\39\3" +
                    "9\39\3:\5:\u02c7\n:\3:\3:\5:\u02cb\n:\7:\u02cd\n:\f:\16:\u02d0\13:\3;" +
                    "\3;\3;\5;\u02d5\n;\3;\5;\u02d8\n;\3<\3<\3<\3<\3<\7<\u02df\n<\f<\16<\u02e2" +
                    "\13<\3=\3=\5=\u02e6\n=\6=\u02e8\n=\r=\16=\u02e9\3>\6>\u02ed\n>\r>\16>" +
                    "\u02ee\3?\3?\3?\5?\u02f4\n?\3@\3@\3@\7@\u02f9\n@\f@\16@\u02fc\13@\3A\3" +
                    "A\3A\3A\3A\5A\u0303\nA\5A\u0305\nA\3B\3B\3B\7B\u030a\nB\fB\16B\u030d\13" +
                    "B\3C\3C\5C\u0311\nC\3D\3D\5D\u0315\nD\3D\3D\7D\u0319\nD\fD\16D\u031c\13" +
                    "D\5D\u031e\nD\3E\3E\3E\3E\3E\7E\u0325\nE\fE\16E\u0328\13E\3E\3E\5E\u032c" +
                    "\nE\3E\5E\u032f\nE\3E\3E\3E\3E\5E\u0335\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E" +
                    "\3E\3E\3E\3E\3E\5E\u0345\nE\3E\3E\7E\u0349\nE\fE\16E\u034c\13E\5E\u034e" +
                    "\nE\3E\3E\3E\5E\u0353\nE\3E\5E\u0356\nE\3E\3E\3E\3E\3E\5E\u035d\nE\3E" +
                    "\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0370\nE\3E\3E\7E" +
                    "\u0374\nE\fE\16E\u0377\13E\7E\u0379\nE\fE\16E\u037c\13E\3F\3F\3G\3G\3" +
                    "G\3G\5G\u0384\nG\3G\3G\5G\u0388\nG\3H\5H\u038b\nH\3H\3H\3H\5H\u0390\n" +
                    "H\3H\7H\u0393\nH\fH\16H\u0396\13H\3I\3I\3I\3J\6J\u039c\nJ\rJ\16J\u039d" +
                    "\3K\3K\3K\3K\3K\3K\5K\u03a6\nK\3L\3L\3L\3L\3L\6L\u03ad\nL\rL\16L\u03ae" +
                    "\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u03c0\nM\fM\16M\u03c3" +
                    "\13M\5M\u03c5\nM\3M\3M\3M\3M\7M\u03cb\nM\fM\16M\u03ce\13M\5M\u03d0\nM" +
                    "\7M\u03d2\nM\fM\16M\u03d5\13M\3M\3M\5M\u03d9\nM\3N\3N\3N\3N\3N\3N\3N\3" +
                    "N\3N\3N\3N\5N\u03e6\nN\3O\3O\5O\u03ea\nO\3O\3O\3P\6P\u03ef\nP\rP\16P\u03f0" +
                    "\3Q\3Q\5Q\u03f5\nQ\3R\5R\u03f8\nR\3R\3R\3S\3S\3S\3S\3S\3S\3S\5S\u0403" +
                    "\nS\3S\3S\3S\3S\3S\3S\5S\u040b\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T" +
                    "\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0421\nT\3U\3U\5U\u0425\nU\5U\u0427\nU\3U" +
                    "\3U\5U\u042b\nU\3U\3U\5U\u042f\nU\3V\3V\5V\u0433\nV\3W\3W\3W\7W\u0438" +
                    "\nW\fW\16W\u043b\13W\3X\3X\3X\3X\3X\5X\u0442\nX\3X\3X\5X\u0446\nX\3X\3" +
                    "X\3X\2\5Jl\u0088Y\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62" +
                    "\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088" +
                    "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0" +
                    "\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\31\3\2hi\4\2JJLL\5\2))JJ" +
                    "LL\4\2))\64\64\7\2IIKKMMPPUV\3\2MO\4\2IIKK\3\2GH\3\2CF\3\2fg\3\2[e\b\2" +
                    "\21\21\34\34$$**--<<\n\2\6\b\24\24\31\31\35\35\"#\'(/\60\66\67\3\2\6\b" +
                    "\4\2++..\6\2\25\25%%\61\61\65\65\5\2\n\13!!::\4\2=>ZZ\3\2=>\4\2MMTT\4" +
                    "\2\r\r\17\17\4\2\20\20\61\61\4\2\22\22\26\26\2\u04a7\2\u00b1\3\2\2\2\4" +
                    "\u00b6\3\2\2\2\6\u00bd\3\2\2\2\b\u00c0\3\2\2\2\n\u00c9\3\2\2\2\f\u00ee" +
                    "\3\2\2\2\16\u00f0\3\2\2\2\20\u00f7\3\2\2\2\22\u0101\3\2\2\2\24\u0114\3" +
                    "\2\2\2\26\u0127\3\2\2\2\30\u0132\3\2\2\2\32\u0142\3\2\2\2\34\u014e\3\2" +
                    "\2\2\36\u0150\3\2\2\2 \u0158\3\2\2\2\"\u0160\3\2\2\2$\u0168\3\2\2\2&\u0170" +
                    "\3\2\2\2(\u0178\3\2\2\2*\u0180\3\2\2\2,\u0188\3\2\2\2.\u0190\3\2\2\2\60" +
                    "\u0198\3\2\2\2\62\u01a0\3\2\2\2\64\u01ae\3\2\2\2\66\u01b0\3\2\2\28\u01b2" +
                    "\3\2\2\2:\u01ba\3\2\2\2<\u01c3\3\2\2\2>\u01c6\3\2\2\2@\u01cb\3\2\2\2B" +
                    "\u01d4\3\2\2\2D\u01d6\3\2\2\2F\u01de\3\2\2\2H\u01e3\3\2\2\2J\u01f4\3\2" +
                    "\2\2L\u0208\3\2\2\2N\u020a\3\2\2\2P\u020d\3\2\2\2R\u0218\3\2\2\2T\u021c" +
                    "\3\2\2\2V\u0221\3\2\2\2X\u022f\3\2\2\2Z\u023e\3\2\2\2\\\u0240\3\2\2\2" +
                    "^\u0248\3\2\2\2`\u024d\3\2\2\2b\u024f\3\2\2\2d\u0254\3\2\2\2f\u025c\3" +
                    "\2\2\2h\u025e\3\2\2\2j\u0267\3\2\2\2l\u0281\3\2\2\2n\u02bc\3\2\2\2p\u02be" +
                    "\3\2\2\2r\u02c6\3\2\2\2t\u02d1\3\2\2\2v\u02e0\3\2\2\2x\u02e7\3\2\2\2z" +
                    "\u02ec\3\2\2\2|\u02f0\3\2\2\2~\u02f5\3\2\2\2\u0080\u0304\3\2\2\2\u0082" +
                    "\u0306\3\2\2\2\u0084\u030e\3\2\2\2\u0086\u031d\3\2\2\2\u0088\u034d\3\2" +
                    "\2\2\u008a\u037d\3\2\2\2\u008c\u0387\3\2\2\2\u008e\u038a\3\2\2\2\u0090" +
                    "\u0397\3\2\2\2\u0092\u039b\3\2\2\2\u0094\u03a5\3\2\2\2\u0096\u03a7\3\2" +
                    "\2\2\u0098\u03d8\3\2\2\2\u009a\u03e5\3\2\2\2\u009c\u03e7\3\2\2\2\u009e" +
                    "\u03ee\3\2\2\2\u00a0\u03f4\3\2\2\2\u00a2\u03f7\3\2\2\2\u00a4\u040a\3\2" +
                    "\2\2\u00a6\u0420\3\2\2\2\u00a8\u0426\3\2\2\2\u00aa\u0430\3\2\2\2\u00ac" +
                    "\u0434\3\2\2\2\u00ae\u0445\3\2\2\2\u00b0\u00b2\5\4\3\2\u00b1\u00b0\3\2" +
                    "\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\2\2\3\u00b4" +
                    "\3\3\2\2\2\u00b5\u00b7\5\6\4\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2" +
                    "\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\5\3\2\2\2\u00ba\u00be\5" +
                    "\b\5\2\u00bb\u00be\5<\37\2\u00bc\u00be\7Y\2\2\u00bd\u00ba\3\2\2\2\u00bd" +
                    "\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\7\3\2\2\2\u00bf\u00c1\5> \2\u00c0" +
                    "\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5j" +
                    "\66\2\u00c3\u00c5\5\n\6\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5" +
                    "\u00c6\3\2\2\2\u00c6\u00c7\5\u009cO\2\u00c7\t\3\2\2\2\u00c8\u00ca\5<\37" +
                    "\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc" +
                    "\3\2\2\2\u00cc\13\3\2\2\2\u00cd\u00ef\7k\2\2\u00ce\u00ef\7l\2\2\u00cf" +
                    "\u00d1\7n\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2" +
                    "\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00ef\3\2\2\2\u00d4\u00d5\7=\2\2\u00d5" +
                    "\u00d6\58\35\2\u00d6\u00d7\7>\2\2\u00d7\u00ef\3\2\2\2\u00d8\u00ef\5\16" +
                    "\b\2\u00d9\u00db\7\3\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db" +
                    "\u00dc\3\2\2\2\u00dc\u00dd\7=\2\2\u00dd\u00de\5\u009cO\2\u00de\u00df\7" +
                    ">\2\2\u00df\u00ef\3\2\2\2\u00e0\u00e1\7\4\2\2\u00e1\u00e2\7=\2\2\u00e2" +
                    "\u00e3\5\30\r\2\u00e3\u00e4\7Z\2\2\u00e4\u00e5\5\u0084C\2\u00e5\u00e6" +
                    "\7>\2\2\u00e6\u00ef\3\2\2\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\7=\2\2\u00e9" +
                    "\u00ea\5\u0084C\2\u00ea\u00eb\7Z\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed" +
                    "\7>\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00cd\3\2\2\2\u00ee\u00ce\3\2\2\2\u00ee" +
                    "\u00d0\3\2\2\2\u00ee\u00d4\3\2\2\2\u00ee\u00d8\3\2\2\2\u00ee\u00da\3\2" +
                    "\2\2\u00ee\u00e0\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef\r\3\2\2\2\u00f0\u00f1" +
                    "\78\2\2\u00f1\u00f2\7=\2\2\u00f2\u00f3\5\64\33\2\u00f3\u00f4\7Z\2\2\u00f4" +
                    "\u00f5\5\20\t\2\u00f5\u00f6\7>\2\2\u00f6\17\3\2\2\2\u00f7\u00fc\5\22\n" +
                    "\2\u00f8\u00f9\7Z\2\2\u00f9\u00fb\5\22\n\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe" +
                    "\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\21\3\2\2\2\u00fe" +
                    "\u00fc\3\2\2\2\u00ff\u0102\5\u0084C\2\u0100\u0102\7\27\2\2\u0101\u00ff" +
                    "\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7X\2\2\u0104" +
                    "\u0105\5\64\33\2\u0105\23\3\2\2\2\u0106\u0115\5\f\7\2\u0107\u0109\7\3" +
                    "\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a" +
                    "\u010b\7=\2\2\u010b\u010c\5\u0084C\2\u010c\u010d\7>\2\2\u010d\u010e\7" +
                    "A\2\2\u010e\u0110\5\u008eH\2\u010f\u0111\7Z\2\2\u0110\u010f\3\2\2\2\u0110" +
                    "\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7B\2\2\u0113\u0115\3\2" +
                    "\2\2\u0114\u0106\3\2\2\2\u0114\u0108\3\2\2\2\u0115\u0124\3\2\2\2\u0116" +
                    "\u0117\7?\2\2\u0117\u0118\58\35\2\u0118\u0119\7@\2\2\u0119\u0123\3\2\2" +
                    "\2\u011a\u011c\7=\2\2\u011b\u011d\5\26\f\2\u011c\u011b\3\2\2\2\u011c\u011d" +
                    "\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0123\7>\2\2\u011f\u0120\t\2\2\2\u0120" +
                    "\u0123\7k\2\2\u0121\u0123\t\3\2\2\u0122\u0116\3\2\2\2\u0122\u011a\3\2" +
                    "\2\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124" +
                    "\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\25\3\2\2\2\u0126\u0124\3\2\2" +
                    "\2\u0127\u012c\5\64\33\2\u0128\u0129\7Z\2\2\u0129\u012b\5\64\33\2\u012a" +
                    "\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2" +
                    "\2\2\u012d\27\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\t\4\2\2\u0130\u012f" +
                    "\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133" +
                    "\u0140\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0141\5\24\13\2\u0136\u0137\5" +
                    "\32\16\2\u0137\u0138\5\34\17\2\u0138\u0141\3\2\2\2\u0139\u013a\t\5\2\2" +
                    "\u013a\u013b\7=\2\2\u013b\u013c\5\u0084C\2\u013c\u013d\7>\2\2\u013d\u0141" +
                    "\3\2\2\2\u013e\u013f\7R\2\2\u013f\u0141\7k\2\2\u0140\u0135\3\2\2\2\u0140" +
                    "\u0136\3\2\2\2\u0140\u0139\3\2\2\2\u0140\u013e\3\2\2\2\u0141\31\3\2\2" +
                    "\2\u0142\u0143\t\6\2\2\u0143\33\3\2\2\2\u0144\u0146\7\3\2\2\u0145\u0144" +
                    "\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7=\2\2\u0148" +
                    "\u0149\5\u0084C\2\u0149\u014a\7>\2\2\u014a\u014b\5\34\17\2\u014b\u014f" +
                    "\3\2\2\2\u014c\u014f\5\30\r\2\u014d\u014f\7m\2\2\u014e\u0145\3\2\2\2\u014e" +
                    "\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\35\3\2\2\2\u0150\u0155\5\34\17" +
                    "\2\u0151\u0152\t\7\2\2\u0152\u0154\5\34\17\2\u0153\u0151\3\2\2\2\u0154" +
                    "\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\37\3\2\2" +
                    "\2\u0157\u0155\3\2\2\2\u0158\u015d\5\36\20\2\u0159\u015a\t\b\2\2\u015a" +
                    "\u015c\5\36\20\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3" +
                    "\2\2\2\u015d\u015e\3\2\2\2\u015e!\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0165" +
                    "\5 \21\2\u0161\u0162\t\t\2\2\u0162\u0164\5 \21\2\u0163\u0161\3\2\2\2\u0164" +
                    "\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166#\3\2\2\2" +
                    "\u0167\u0165\3\2\2\2\u0168\u016d\5\"\22\2\u0169\u016a\t\n\2\2\u016a\u016c" +
                    "\5\"\22\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2" +
                    "\u016d\u016e\3\2\2\2\u016e%\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0175\5" +
                    "$\23\2\u0171\u0172\t\13\2\2\u0172\u0174\5$\23\2\u0173\u0171\3\2\2\2\u0174" +
                    "\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\'\3\2\2\2" +
                    "\u0177\u0175\3\2\2\2\u0178\u017d\5&\24\2\u0179\u017a\7P\2\2\u017a\u017c" +
                    "\5&\24\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d" +
                    "\u017e\3\2\2\2\u017e)\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0185\5(\25\2" +
                    "\u0181\u0182\7T\2\2\u0182\u0184\5(\25\2\u0183\u0181\3\2\2\2\u0184\u0187" +
                    "\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186+\3\2\2\2\u0187" +
                    "\u0185\3\2\2\2\u0188\u018d\5*\26\2\u0189\u018a\7Q\2\2\u018a\u018c\5*\26" +
                    "\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e" +
                    "\3\2\2\2\u018e-\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0195\5,\27\2\u0191" +
                    "\u0192\7R\2\2\u0192\u0194\5,\27\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2" +
                    "\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196/\3\2\2\2\u0197\u0195" +
                    "\3\2\2\2\u0198\u019d\5.\30\2\u0199\u019a\7S\2\2\u019a\u019c\5.\30\2\u019b" +
                    "\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2" +
                    "\2\2\u019e\61\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a6\5\60\31\2\u01a1" +
                    "\u01a2\7W\2\2\u01a2\u01a3\58\35\2\u01a3\u01a4\7X\2\2\u01a4\u01a5\5\62" +
                    "\32\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7" +
                    "\63\3\2\2\2\u01a8\u01af\5\62\32\2\u01a9\u01aa\5\30\r\2\u01aa\u01ab\5\66" +
                    "\34\2\u01ab\u01ac\5\64\33\2\u01ac\u01af\3\2\2\2\u01ad\u01af\7m\2\2\u01ae" +
                    "\u01a8\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\65\3\2\2" +
                    "\2\u01b0\u01b1\t\f\2\2\u01b1\67\3\2\2\2\u01b2\u01b7\5\64\33\2\u01b3\u01b4" +
                    "\7Z\2\2\u01b4\u01b6\5\64\33\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2" +
                    "\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b89\3\2\2\2\u01b9\u01b7\3" +
                    "\2\2\2\u01ba\u01bb\5\62\32\2\u01bb;\3\2\2\2\u01bc\u01be\5> \2\u01bd\u01bf" +
                    "\5D#\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0" +
                    "\u01c1\7Y\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c4\5\u0096L\2\u01c3\u01bc\3" +
                    "\2\2\2\u01c3\u01c2\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01c7\5B\"\2\u01c6\u01c5" +
                    "\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9" +
                    "?\3\2\2\2\u01ca\u01cc\5B\"\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd" +
                    "\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceA\3\2\2\2\u01cf\u01d5\5H%\2\u01d0" +
                    "\u01d5\5J&\2\u01d1\u01d5\5d\63\2\u01d2\u01d5\5f\64\2\u01d3\u01d5\5h\65" +
                    "\2\u01d4\u01cf\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2" +
                    "\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5C\3\2\2\2\u01d6\u01db\5F$\2\u01d7\u01d8" +
                    "\7Z\2\2\u01d8\u01da\5F$\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db" +
                    "\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01db\3\2\2\2" +
                    "\u01de\u01e1\5j\66\2\u01df\u01e0\7[\2\2\u01e0\u01e2\5\u008cG\2\u01e1\u01df" +
                    "\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2G\3\2\2\2\u01e3\u01e4\t\r\2\2\u01e4" +
                    "I\3\2\2\2\u01e5\u01e6\b&\1\2\u01e6\u01f5\t\16\2\2\u01e7\u01e8\7\3\2\2" +
                    "\u01e8\u01e9\7=\2\2\u01e9\u01ea\t\17\2\2\u01ea\u01f5\7>\2\2\u01eb\u01f5" +
                    "\5b\62\2\u01ec\u01f5\5L\'\2\u01ed\u01f5\5Z.\2\u01ee\u01f5\5\u008aF\2\u01ef" +
                    "\u01f0\7\t\2\2\u01f0\u01f1\7=\2\2\u01f1\u01f2\5:\36\2\u01f2\u01f3\7>\2" +
                    "\2\u01f3\u01f5\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f4\u01e7\3\2\2\2\u01f4\u01eb" +
                    "\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01ed\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4" +
                    "\u01ef\3\2\2\2\u01f5\u01fa\3\2\2\2\u01f6\u01f7\f\3\2\2\u01f7\u01f9\5x" +
                    "=\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa" +
                    "\u01fb\3\2\2\2\u01fbK\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\5N(\2\u01fe" +
                    "\u0200\7k\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2" +
                    "\2\2\u0201\u0202\7A\2\2\u0202\u0203\5P)\2\u0203\u0204\7B\2\2\u0204\u0209" +
                    "\3\2\2\2\u0205\u0206\5N(\2\u0206\u0207\7k\2\2\u0207\u0209\3\2\2\2\u0208" +
                    "\u01fd\3\2\2\2\u0208\u0205\3\2\2\2\u0209M\3\2\2\2\u020a\u020b\t\20\2\2" +
                    "\u020bO\3\2\2\2\u020c\u020e\5R*\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2" +
                    "\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210Q\3\2\2\2\u0211\u0213" +
                    "\5T+\2\u0212\u0214\5V,\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214" +
                    "\u0215\3\2\2\2\u0215\u0216\7Y\2\2\u0216\u0219\3\2\2\2\u0217\u0219\5\u0096" +
                    "L\2\u0218\u0211\3\2\2\2\u0218\u0217\3\2\2\2\u0219S\3\2\2\2\u021a\u021d" +
                    "\5J&\2\u021b\u021d\5d\63\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d" +
                    "\u021f\3\2\2\2\u021e\u0220\5T+\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2" +
                    "\2\u0220U\3\2\2\2\u0221\u0226\5X-\2\u0222\u0223\7Z\2\2\u0223\u0225\5X" +
                    "-\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226" +
                    "\u0227\3\2\2\2\u0227W\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u0230\5j\66\2" +
                    "\u022a\u022c\5j\66\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d" +
                    "\3\2\2\2\u022d\u022e\7X\2\2\u022e\u0230\5:\36\2\u022f\u0229\3\2\2\2\u022f" +
                    "\u022b\3\2\2\2\u0230Y\3\2\2\2\u0231\u0233\7\33\2\2\u0232\u0234\7k\2\2" +
                    "\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236" +
                    "\7A\2\2\u0236\u0238\5\\/\2\u0237\u0239\7Z\2\2\u0238\u0237\3\2\2\2\u0238" +
                    "\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7B\2\2\u023b\u023f\3\2" +
                    "\2\2\u023c\u023d\7\33\2\2\u023d\u023f\7k\2\2\u023e\u0231\3\2\2\2\u023e" +
                    "\u023c\3\2\2\2\u023f[\3\2\2\2\u0240\u0245\5^\60\2\u0241\u0242\7Z\2\2\u0242" +
                    "\u0244\5^\60\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2" +
                    "\2\2\u0245\u0246\3\2\2\2\u0246]\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024b" +
                    "\5`\61\2\u0249\u024a\7[\2\2\u024a\u024c\5:\36\2\u024b\u0249\3\2\2\2\u024b" +
                    "\u024c\3\2\2\2\u024c_\3\2\2\2\u024d\u024e\7k\2\2\u024ea\3\2\2\2\u024f" +
                    "\u0250\7\65\2\2\u0250\u0251\7=\2\2\u0251\u0252\5\u0084C\2\u0252\u0253" +
                    "\7>\2\2\u0253c\3\2\2\2\u0254\u0255\t\21\2\2\u0255e\3\2\2\2\u0256\u025d" +
                    "\t\22\2\2\u0257\u025d\5p9\2\u0258\u0259\7\f\2\2\u0259\u025a\7=\2\2\u025a" +
                    "\u025b\7k\2\2\u025b\u025d\7>\2\2\u025c\u0256\3\2\2\2\u025c\u0257\3\2\2" +
                    "\2\u025c\u0258\3\2\2\2\u025dg\3\2\2\2\u025e\u025f\7\63\2\2\u025f\u0262" +
                    "\7=\2\2\u0260\u0263\5\u0084C\2\u0261\u0263\5:\36\2\u0262\u0260\3\2\2\2" +
                    "\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7>\2\2\u0265i\3\2" +
                    "\2\2\u0266\u0268\5x=\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269" +
                    "\3\2\2\2\u0269\u026d\5l\67\2\u026a\u026c\5n8\2\u026b\u026a\3\2\2\2\u026c" +
                    "\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026ek\3\2\2\2" +
                    "\u026f\u026d\3\2\2\2\u0270\u0271\b\67\1\2\u0271\u0282\7k\2\2\u0272\u0273" +
                    "\7=\2\2\u0273\u0274\5j\66\2\u0274\u0275\7>\2\2\u0275\u0282\3\2\2\2\u0276" +
                    "\u0277\7k\2\2\u0277\u0278\7X\2\2\u0278\u0282\7m\2\2\u0279\u027b\7=\2\2" +
                    "\u027a\u027c\5J&\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d" +
                    "\3\2\2\2\u027d\u027e\5x=\2\u027e\u027f\5l\67\2\u027f\u0280\7>\2\2\u0280" +
                    "\u0282\3\2\2\2\u0281\u0270\3\2\2\2\u0281\u0272\3\2\2\2\u0281\u0276\3\2" +
                    "\2\2\u0281\u0279\3\2\2\2\u0282\u02b0\3\2\2\2\u0283\u0284\f\n\2\2\u0284" +
                    "\u0286\7?\2\2\u0285\u0287\5z>\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2" +
                    "\2\u0287\u0289\3\2\2\2\u0288\u028a\5\64\33\2\u0289\u0288\3\2\2\2\u0289" +
                    "\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u02af\7@\2\2\u028c\u028d\f\t" +
                    "\2\2\u028d\u028e\7?\2\2\u028e\u0290\7*\2\2\u028f\u0291\5z>\2\u0290\u028f" +
                    "\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\5\64\33\2" +
                    "\u0293\u0294\7@\2\2\u0294\u02af\3\2\2\2\u0295\u0296\f\b\2\2\u0296\u0297" +
                    "\7?\2\2\u0297\u0298\5z>\2\u0298\u0299\7*\2\2\u0299\u029a\5\64\33\2\u029a" +
                    "\u029b\7@\2\2\u029b\u02af\3\2\2\2\u029c\u029d\f\7\2\2\u029d\u029f\7?\2" +
                    "\2\u029e\u02a0\5z>\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1" +
                    "\3\2\2\2\u02a1\u02a2\7M\2\2\u02a2\u02af\7@\2\2\u02a3\u02a4\f\6\2\2\u02a4" +
                    "\u02a5\7=\2\2\u02a5\u02a6\5|?\2\u02a6\u02a7\7>\2\2\u02a7\u02af\3\2\2\2" +
                    "\u02a8\u02a9\f\5\2\2\u02a9\u02ab\7=\2\2\u02aa\u02ac\5\u0082B\2\u02ab\u02aa" +
                    "\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\7>\2\2\u02ae" +
                    "\u0283\3\2\2\2\u02ae\u028c\3\2\2\2\u02ae\u0295\3\2\2\2\u02ae\u029c\3\2" +
                    "\2\2\u02ae\u02a3\3\2\2\2\u02ae\u02a8\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0" +
                    "\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1m\3\2\2\2\u02b2\u02b0\3\2\2\2" +
                    "\u02b3\u02b4\7\r\2\2\u02b4\u02b6\7=\2\2\u02b5\u02b7\7n\2\2\u02b6\u02b5" +
                    "\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9" +
                    "\u02ba\3\2\2\2\u02ba\u02bd\7>\2\2\u02bb\u02bd\5p9\2\u02bc\u02b3\3\2\2" +
                    "\2\u02bc\u02bb\3\2\2\2\u02bdo\3\2\2\2\u02be\u02bf\7\16\2\2\u02bf\u02c0" +
                    "\7=\2\2\u02c0\u02c1\7=\2\2\u02c1\u02c2\5r:\2\u02c2\u02c3\7>\2\2\u02c3" +
                    "\u02c4\7>\2\2\u02c4q\3\2\2\2\u02c5\u02c7\5t;\2\u02c6\u02c5\3\2\2\2\u02c6" +
                    "\u02c7\3\2\2\2\u02c7\u02ce\3\2\2\2\u02c8\u02ca\7Z\2\2\u02c9\u02cb\5t;" +
                    "\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c8" +
                    "\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf" +
                    "s\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d7\n\23\2\2\u02d2\u02d4\7=\2\2" +
                    "\u02d3\u02d5\5\26\f\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6" +
                    "\3\2\2\2\u02d6\u02d8\7>\2\2\u02d7\u02d2\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8" +
                    "u\3\2\2\2\u02d9\u02df\n\24\2\2\u02da\u02db\7=\2\2\u02db\u02dc\5v<\2\u02dc" +
                    "\u02dd\7>\2\2\u02dd\u02df\3\2\2\2\u02de\u02d9\3\2\2\2\u02de\u02da\3\2" +
                    "\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1" +
                    "w\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e5\t\25\2\2\u02e4\u02e6\5z>\2\u02e5" +
                    "\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e3\3\2" +
                    "\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea" +
                    "y\3\2\2\2\u02eb\u02ed\5d\63\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2" +
                    "\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef{\3\2\2\2\u02f0\u02f3\5" +
                    "~@\2\u02f1\u02f2\7Z\2\2\u02f2\u02f4\7j\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4" +
                    "\3\2\2\2\u02f4}\3\2\2\2\u02f5\u02fa\5\u0080A\2\u02f6\u02f7\7Z\2\2\u02f7" +
                    "\u02f9\5\u0080A\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8" +
                    "\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\177\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd" +
                    "\u02fe\5> \2\u02fe\u02ff\5j\66\2\u02ff\u0305\3\2\2\2\u0300\u0302\5@!\2" +
                    "\u0301\u0303\5\u0086D\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303" +
                    "\u0305\3\2\2\2\u0304\u02fd\3\2\2\2\u0304\u0300\3\2\2\2\u0305\u0081\3\2" +
                    "\2\2\u0306\u030b\7k\2\2\u0307\u0308\7Z\2\2\u0308\u030a\7k\2\2\u0309\u0307" +
                    "\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c" +
                    "\u0083\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\5T+\2\u030f\u0311\5\u0086" +
                    "D\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0085\3\2\2\2\u0312" +
                    "\u031e\5x=\2\u0313\u0315\5x=\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2" +
                    "\u0315\u0316\3\2\2\2\u0316\u031a\5\u0088E\2\u0317\u0319\5n8\2\u0318\u0317" +
                    "\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b" +
                    "\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0312\3\2\2\2\u031d\u0314\3\2" +
                    "\2\2\u031e\u0087\3\2\2\2\u031f\u0320\bE\1\2\u0320\u0321\7=\2\2\u0321\u0322" +
                    "\5\u0086D\2\u0322\u0326\7>\2\2\u0323\u0325\5n8\2\u0324\u0323\3\2\2\2\u0325" +
                    "\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u034e\3\2" +
                    "\2\2\u0328\u0326\3\2\2\2\u0329\u032b\7?\2\2\u032a\u032c\5z>\2\u032b\u032a" +
                    "\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032f\5\64\33\2" +
                    "\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u034e" +
                    "\7@\2\2\u0331\u0332\7?\2\2\u0332\u0334\7*\2\2\u0333\u0335\5z>\2\u0334" +
                    "\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\5\64" +
                    "\33\2\u0337\u0338\7@\2\2\u0338\u034e\3\2\2\2\u0339\u033a\7?\2\2\u033a" +
                    "\u033b\5z>\2\u033b\u033c\7*\2\2\u033c\u033d\5\64\33\2\u033d\u033e\7@\2" +
                    "\2\u033e\u034e\3\2\2\2\u033f\u0340\7?\2\2\u0340\u0341\7M\2\2\u0341\u034e" +
                    "\7@\2\2\u0342\u0344\7=\2\2\u0343\u0345\5|?\2\u0344\u0343\3\2\2\2\u0344" +
                    "\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034a\7>\2\2\u0347\u0349\5n8" +
                    "\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b" +
                    "\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u031f\3\2\2\2\u034d" +
                    "\u0329\3\2\2\2\u034d\u0331\3\2\2\2\u034d\u0339\3\2\2\2\u034d\u033f\3\2" +
                    "\2\2\u034d\u0342\3\2\2\2\u034e\u037a\3\2\2\2\u034f\u0350\f\7\2\2\u0350" +
                    "\u0352\7?\2\2\u0351\u0353\5z>\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2" +
                    "\2\u0353\u0355\3\2\2\2\u0354\u0356\5\64\33\2\u0355\u0354\3\2\2\2\u0355" +
                    "\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0379\7@\2\2\u0358\u0359\f\6" +
                    "\2\2\u0359\u035a\7?\2\2\u035a\u035c\7*\2\2\u035b\u035d\5z>\2\u035c\u035b" +
                    "\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\5\64\33\2" +
                    "\u035f\u0360\7@\2\2\u0360\u0379\3\2\2\2\u0361\u0362\f\5\2\2\u0362\u0363" +
                    "\7?\2\2\u0363\u0364\5z>\2\u0364\u0365\7*\2\2\u0365\u0366\5\64\33\2\u0366" +
                    "\u0367\7@\2\2\u0367\u0379\3\2\2\2\u0368\u0369\f\4\2\2\u0369\u036a\7?\2" +
                    "\2\u036a\u036b\7M\2\2\u036b\u0379\7@\2\2\u036c\u036d\f\3\2\2\u036d\u036f" +
                    "\7=\2\2\u036e\u0370\5|?\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370" +
                    "\u0371\3\2\2\2\u0371\u0375\7>\2\2\u0372\u0374\5n8\2\u0373\u0372\3\2\2" +
                    "\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0379" +
                    "\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u034f\3\2\2\2\u0378\u0358\3\2\2\2\u0378" +
                    "\u0361\3\2\2\2\u0378\u0368\3\2\2\2\u0378\u036c\3\2\2\2\u0379\u037c\3\2" +
                    "\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0089\3\2\2\2\u037c" +
                    "\u037a\3\2\2\2\u037d\u037e\7k\2\2\u037e\u008b\3\2\2\2\u037f\u0388\5\64" +
                    "\33\2\u0380\u0381\7A\2\2\u0381\u0383\5\u008eH\2\u0382\u0384\7Z\2\2\u0383" +
                    "\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7B" +
                    "\2\2\u0386\u0388\3\2\2\2\u0387\u037f\3\2\2\2\u0387\u0380\3\2\2\2\u0388" +
                    "\u008d\3\2\2\2\u0389\u038b\5\u0090I\2\u038a\u0389\3\2\2\2\u038a\u038b" +
                    "\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0394\5\u008cG\2\u038d\u038f\7Z\2\2" +
                    "\u038e\u0390\5\u0090I\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390" +
                    "\u0391\3\2\2\2\u0391\u0393\5\u008cG\2\u0392\u038d\3\2\2\2\u0393\u0396" +
                    "\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u008f\3\2\2\2\u0396" +
                    "\u0394\3\2\2\2\u0397\u0398\5\u0092J\2\u0398\u0399\7[\2\2\u0399\u0091\3" +
                    "\2\2\2\u039a\u039c\5\u0094K\2\u039b\u039a\3\2\2\2\u039c\u039d\3\2\2\2" +
                    "\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u0093\3\2\2\2\u039f\u03a0" +
                    "\7?\2\2\u03a0\u03a1\5:\36\2\u03a1\u03a2\7@\2\2\u03a2\u03a6\3\2\2\2\u03a3" +
                    "\u03a4\7i\2\2\u03a4\u03a6\7k\2\2\u03a5\u039f\3\2\2\2\u03a5\u03a3\3\2\2" +
                    "\2\u03a6\u0095\3\2\2\2\u03a7\u03a8\7;\2\2\u03a8\u03a9\7=\2\2\u03a9\u03aa" +
                    "\5:\36\2\u03aa\u03ac\7Z\2\2\u03ab\u03ad\7n\2\2\u03ac\u03ab\3\2\2\2\u03ad" +
                    "\u03ae\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2" +
                    "\2\2\u03b0\u03b1\7>\2\2\u03b1\u03b2\7Y\2\2\u03b2\u0097\3\2\2\2\u03b3\u03d9" +
                    "\5\u009aN\2\u03b4\u03d9\5\u009cO\2\u03b5\u03d9\5\u00a2R\2\u03b6\u03d9" +
                    "\5\u00a4S\2\u03b7\u03d9\5\u00a6T\2\u03b8\u03d9\5\u00aeX\2\u03b9\u03ba" +
                    "\t\26\2\2\u03ba\u03bb\t\27\2\2\u03bb\u03c4\7=\2\2\u03bc\u03c1\5\60\31" +
                    "\2\u03bd\u03be\7Z\2\2\u03be\u03c0\5\60\31\2\u03bf\u03bd\3\2\2\2\u03c0" +
                    "\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c5\3\2" +
                    "\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03bc\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5" +
                    "\u03d3\3\2\2\2\u03c6\u03cf\7X\2\2\u03c7\u03cc\5\60\31\2\u03c8\u03c9\7" +
                    "Z\2\2\u03c9\u03cb\5\60\31\2\u03ca\u03c8\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc" +
                    "\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2" +
                    "\2\2\u03cf\u03c7\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1" +
                    "\u03c6\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2" +
                    "\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\7>\2\2\u03d7" +
                    "\u03d9\7Y\2\2\u03d8\u03b3\3\2\2\2\u03d8\u03b4\3\2\2\2\u03d8\u03b5\3\2" +
                    "\2\2\u03d8\u03b6\3\2\2\2\u03d8\u03b7\3\2\2\2\u03d8\u03b8\3\2\2\2\u03d8" +
                    "\u03b9\3\2\2\2\u03d9\u0099\3\2\2\2\u03da\u03db\7k\2\2\u03db\u03dc\7X\2" +
                    "\2\u03dc\u03e6\5\u0098M\2\u03dd\u03de\7\23\2\2\u03de\u03df\5:\36\2\u03df" +
                    "\u03e0\7X\2\2\u03e0\u03e1\5\u0098M\2\u03e1\u03e6\3\2\2\2\u03e2\u03e3\7" +
                    "\27\2\2\u03e3\u03e4\7X\2\2\u03e4\u03e6\5\u0098M\2\u03e5\u03da\3\2\2\2" +
                    "\u03e5\u03dd\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e6\u009b\3\2\2\2\u03e7\u03e9" +
                    "\7A\2\2\u03e8\u03ea\5\u009eP\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2" +
                    "\u03ea\u03eb\3\2\2\2\u03eb\u03ec\7B\2\2\u03ec\u009d\3\2\2\2\u03ed\u03ef" +
                    "\5\u00a0Q\2\u03ee\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2" +
                    "\2\u03f0\u03f1\3\2\2\2\u03f1\u009f\3\2\2\2\u03f2\u03f5\5\u0098M\2\u03f3" +
                    "\u03f5\5<\37\2\u03f4\u03f2\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5\u00a1\3\2" +
                    "\2\2\u03f6\u03f8\58\35\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8" +
                    "\u03f9\3\2\2\2\u03f9\u03fa\7Y\2\2\u03fa\u00a3\3\2\2\2\u03fb\u03fc\7 \2" +
                    "\2\u03fc\u03fd\7=\2\2\u03fd\u03fe\58\35\2\u03fe\u03ff\7>\2\2\u03ff\u0402" +
                    "\5\u0098M\2\u0400\u0401\7\32\2\2\u0401\u0403\5\u0098M\2\u0402\u0400\3" +
                    "\2\2\2\u0402\u0403\3\2\2\2\u0403\u040b\3\2\2\2\u0404\u0405\7,\2\2\u0405" +
                    "\u0406\7=\2\2\u0406\u0407\58\35\2\u0407\u0408\7>\2\2\u0408\u0409\5\u0098" +
                    "M\2\u0409\u040b\3\2\2\2\u040a\u03fb\3\2\2\2\u040a\u0404\3\2\2\2\u040b" +
                    "\u00a5\3\2\2\2\u040c\u040d\7\62\2\2\u040d\u040e\7=\2\2\u040e\u040f\58" +
                    "\35\2\u040f\u0410\7>\2\2\u0410\u0411\5\u0098M\2\u0411\u0421\3\2\2\2\u0412" +
                    "\u0413\7\30\2\2\u0413\u0414\5\u0098M\2\u0414\u0415\7\62\2\2\u0415\u0416" +
                    "\7=\2\2\u0416\u0417\58\35\2\u0417\u0418\7>\2\2\u0418\u0419\7Y\2\2\u0419" +
                    "\u0421\3\2\2\2\u041a\u041b\7\36\2\2\u041b\u041c\7=\2\2\u041c\u041d\5\u00a8" +
                    "U\2\u041d\u041e\7>\2\2\u041e\u041f\5\u0098M\2\u041f\u0421\3\2\2\2\u0420" +
                    "\u040c\3\2\2\2\u0420\u0412\3\2\2\2\u0420\u041a\3\2\2\2\u0421\u00a7\3\2" +
                    "\2\2\u0422\u0427\5\u00aaV\2\u0423\u0425\58\35\2\u0424\u0423\3\2\2\2\u0424" +
                    "\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0422\3\2\2\2\u0426\u0424\3\2" +
                    "\2\2\u0427\u0428\3\2\2\2\u0428\u042a\7Y\2\2\u0429\u042b\5\u00acW\2\u042a" +
                    "\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\7Y" +
                    "\2\2\u042d\u042f\5\u00acW\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f" +
                    "\u00a9\3\2\2\2\u0430\u0432\5> \2\u0431\u0433\5D#\2\u0432\u0431\3\2\2\2" +
                    "\u0432\u0433\3\2\2\2\u0433\u00ab\3\2\2\2\u0434\u0439\5\64\33\2\u0435\u0436" +
                    "\7Z\2\2\u0436\u0438\5\64\33\2\u0437\u0435\3\2\2\2\u0438\u043b\3\2\2\2" +
                    "\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u00ad\3\2\2\2\u043b\u0439" +
                    "\3\2\2\2\u043c\u043d\7\37\2\2\u043d\u0446\7k\2\2\u043e\u0446\t\30\2\2" +
                    "\u043f\u0441\7&\2\2\u0440\u0442\58\35\2\u0441\u0440\3\2\2\2\u0441\u0442" +
                    "\3\2\2\2\u0442\u0446\3\2\2\2\u0443\u0444\7\37\2\2\u0444\u0446\5\30\r\2" +
                    "\u0445\u043c\3\2\2\2\u0445\u043e\3\2\2\2\u0445\u043f\3\2\2\2\u0445\u0443" +
                    "\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\7Y\2\2\u0448\u00af\3\2\2\2\u008b" +
                    "\u00b1\u00b8\u00bd\u00c0\u00c4\u00cb\u00d2\u00da\u00ee\u00fc\u0101\u0108" +
                    "\u0110\u0114\u011c\u0122\u0124\u012c\u0132\u0140\u0145\u014e\u0155\u015d" +
                    "\u0165\u016d\u0175\u017d\u0185\u018d\u0195\u019d\u01a6\u01ae\u01b7\u01be" +
                    "\u01c3\u01c8\u01cd\u01d4\u01db\u01e1\u01f4\u01fa\u01ff\u0208\u020f\u0213" +
                    "\u0218\u021c\u021f\u0226\u022b\u022f\u0233\u0238\u023e\u0245\u024b\u025c" +
                    "\u0262\u0267\u026d\u027b\u0281\u0286\u0289\u0290\u029f\u02ab\u02ae\u02b0" +
                    "\u02b8\u02bc\u02c6\u02ca\u02ce\u02d4\u02d7\u02de\u02e0\u02e5\u02e9\u02ee" +
                    "\u02f3\u02fa\u0302\u0304\u030b\u0310\u0314\u031a\u031d\u0326\u032b\u032e" +
                    "\u0334\u0344\u034a\u034d\u0352\u0355\u035c\u036f\u0375\u0378\u037a\u0383" +
                    "\u0387\u038a\u038f\u0394\u039d\u03a5\u03ae\u03c1\u03c4\u03cc\u03cf\u03d3" +
                    "\u03d8\u03e5\u03e9\u03f0\u03f4\u03f7\u0402\u040a\u0420\u0424\u0426\u042a" +
                    "\u042e\u0432\u0439\u0441\u0445";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}