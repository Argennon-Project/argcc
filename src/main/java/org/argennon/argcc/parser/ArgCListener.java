// Generated from /home/aybehrouz/IdeaProjects/argcc/src/main/java/org/argennon/argcc/grammar/ArgC.g4 by ANTLR 4.9.2
package org.argennon.argcc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArgCParser}.
 */
public interface ArgCListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ArgCParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilationUnit(ArgCParser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilationUnit(ArgCParser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#translationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterTranslationUnit(ArgCParser.TranslationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#translationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitTranslationUnit(ArgCParser.TranslationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#externalDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterExternalDeclaration(ArgCParser.ExternalDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#externalDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitExternalDeclaration(ArgCParser.ExternalDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#functionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionDefinition(ArgCParser.FunctionDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#functionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionDefinition(ArgCParser.FunctionDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#declarationList}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarationList(ArgCParser.DeclarationListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#declarationList}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarationList(ArgCParser.DeclarationListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryExpression(ArgCParser.PrimaryExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#primaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryExpression(ArgCParser.PrimaryExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostfixExpression(ArgCParser.PostfixExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostfixExpression(ArgCParser.PostfixExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#argumentExpressionList}.
     *
     * @param ctx the parse tree
     */
    void enterArgumentExpressionList(ArgCParser.ArgumentExpressionListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#argumentExpressionList}.
     *
     * @param ctx the parse tree
     */
    void exitArgumentExpressionList(ArgCParser.ArgumentExpressionListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#unaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryExpression(ArgCParser.UnaryExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#unaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryExpression(ArgCParser.UnaryExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#unaryOperator}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryOperator(ArgCParser.UnaryOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#unaryOperator}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryOperator(ArgCParser.UnaryOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#simpleExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleExpression(ArgCParser.SimpleExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#simpleExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleExpression(ArgCParser.SimpleExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#multiplicativeExpression}.
     *
     * @param ctx the parse tree
     */
    void enterMultiplicativeExpression(ArgCParser.MultiplicativeExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#multiplicativeExpression}.
     *
     * @param ctx the parse tree
     */
    void exitMultiplicativeExpression(ArgCParser.MultiplicativeExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#additiveExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAdditiveExpression(ArgCParser.AdditiveExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#additiveExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAdditiveExpression(ArgCParser.AdditiveExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#shiftExpression}.
     *
     * @param ctx the parse tree
     */
    void enterShiftExpression(ArgCParser.ShiftExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#shiftExpression}.
     *
     * @param ctx the parse tree
     */
    void exitShiftExpression(ArgCParser.ShiftExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#relationalExpression}.
     *
     * @param ctx the parse tree
     */
    void enterRelationalExpression(ArgCParser.RelationalExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#relationalExpression}.
     *
     * @param ctx the parse tree
     */
    void exitRelationalExpression(ArgCParser.RelationalExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#equalityExpression}.
     *
     * @param ctx the parse tree
     */
    void enterEqualityExpression(ArgCParser.EqualityExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#equalityExpression}.
     *
     * @param ctx the parse tree
     */
    void exitEqualityExpression(ArgCParser.EqualityExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#andExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpression(ArgCParser.AndExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#andExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpression(ArgCParser.AndExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#exclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterExclusiveOrExpression(ArgCParser.ExclusiveOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#exclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitExclusiveOrExpression(ArgCParser.ExclusiveOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#inclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterInclusiveOrExpression(ArgCParser.InclusiveOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#inclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitInclusiveOrExpression(ArgCParser.InclusiveOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#logicalAndExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalAndExpression(ArgCParser.LogicalAndExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#logicalAndExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalAndExpression(ArgCParser.LogicalAndExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#logicalOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalOrExpression(ArgCParser.LogicalOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#logicalOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalOrExpression(ArgCParser.LogicalOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#conditionalExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConditionalExpression(ArgCParser.ConditionalExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#conditionalExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConditionalExpression(ArgCParser.ConditionalExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#assignmentExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentExpression(ArgCParser.AssignmentExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#assignmentExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentExpression(ArgCParser.AssignmentExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#assignmentOperator}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentOperator(ArgCParser.AssignmentOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#assignmentOperator}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentOperator(ArgCParser.AssignmentOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(ArgCParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(ArgCParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConstantExpression(ArgCParser.ConstantExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConstantExpression(ArgCParser.ConstantExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void enterDeclaration(ArgCParser.DeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#declaration}.
     *
     * @param ctx the parse tree
     */
    void exitDeclaration(ArgCParser.DeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#declarationSpecifier}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarationSpecifier(ArgCParser.DeclarationSpecifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#declarationSpecifier}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarationSpecifier(ArgCParser.DeclarationSpecifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#initDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void enterInitDeclaratorList(ArgCParser.InitDeclaratorListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#initDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void exitInitDeclaratorList(ArgCParser.InitDeclaratorListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#initDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterInitDeclarator(ArgCParser.InitDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#initDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitInitDeclarator(ArgCParser.InitDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveType(ArgCParser.PrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveType(ArgCParser.PrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#classType}.
     *
     * @param ctx the parse tree
     */
    void enterClassType(ArgCParser.ClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#classType}.
     *
     * @param ctx the parse tree
     */
    void exitClassType(ArgCParser.ClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#typeSpecifier}.
     *
     * @param ctx the parse tree
     */
    void enterTypeSpecifier(ArgCParser.TypeSpecifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#typeSpecifier}.
     *
     * @param ctx the parse tree
     */
    void exitTypeSpecifier(ArgCParser.TypeSpecifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structOrUnionSpecifier}.
     *
     * @param ctx the parse tree
     */
    void enterStructOrUnionSpecifier(ArgCParser.StructOrUnionSpecifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structOrUnionSpecifier}.
     *
     * @param ctx the parse tree
     */
    void exitStructOrUnionSpecifier(ArgCParser.StructOrUnionSpecifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structOrUnion}.
     *
     * @param ctx the parse tree
     */
    void enterStructOrUnion(ArgCParser.StructOrUnionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structOrUnion}.
     *
     * @param ctx the parse tree
     */
    void exitStructOrUnion(ArgCParser.StructOrUnionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structDeclarationList}.
     *
     * @param ctx the parse tree
     */
    void enterStructDeclarationList(ArgCParser.StructDeclarationListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structDeclarationList}.
     *
     * @param ctx the parse tree
     */
    void exitStructDeclarationList(ArgCParser.StructDeclarationListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterStructDeclaration(ArgCParser.StructDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitStructDeclaration(ArgCParser.StructDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#specifierQualifierList}.
     *
     * @param ctx the parse tree
     */
    void enterSpecifierQualifierList(ArgCParser.SpecifierQualifierListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#specifierQualifierList}.
     *
     * @param ctx the parse tree
     */
    void exitSpecifierQualifierList(ArgCParser.SpecifierQualifierListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void enterStructDeclaratorList(ArgCParser.StructDeclaratorListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void exitStructDeclaratorList(ArgCParser.StructDeclaratorListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#structDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterStructDeclarator(ArgCParser.StructDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#structDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitStructDeclarator(ArgCParser.StructDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#enumSpecifier}.
     *
     * @param ctx the parse tree
     */
    void enterEnumSpecifier(ArgCParser.EnumSpecifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#enumSpecifier}.
     *
     * @param ctx the parse tree
     */
    void exitEnumSpecifier(ArgCParser.EnumSpecifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#enumeratorList}.
     *
     * @param ctx the parse tree
     */
    void enterEnumeratorList(ArgCParser.EnumeratorListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#enumeratorList}.
     *
     * @param ctx the parse tree
     */
    void exitEnumeratorList(ArgCParser.EnumeratorListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#enumerator}.
     *
     * @param ctx the parse tree
     */
    void enterEnumerator(ArgCParser.EnumeratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#enumerator}.
     *
     * @param ctx the parse tree
     */
    void exitEnumerator(ArgCParser.EnumeratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#enumerationConstant}.
     *
     * @param ctx the parse tree
     */
    void enterEnumerationConstant(ArgCParser.EnumerationConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#enumerationConstant}.
     *
     * @param ctx the parse tree
     */
    void exitEnumerationConstant(ArgCParser.EnumerationConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#typeQualifier}.
     *
     * @param ctx the parse tree
     */
    void enterTypeQualifier(ArgCParser.TypeQualifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#typeQualifier}.
     *
     * @param ctx the parse tree
     */
    void exitTypeQualifier(ArgCParser.TypeQualifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#declarator}.
     *
     * @param ctx the parse tree
     */
    void enterDeclarator(ArgCParser.DeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#declarator}.
     *
     * @param ctx the parse tree
     */
    void exitDeclarator(ArgCParser.DeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#directDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterDirectDeclarator(ArgCParser.DirectDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#directDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitDirectDeclarator(ArgCParser.DirectDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#nestedParenthesesBlock}.
     *
     * @param ctx the parse tree
     */
    void enterNestedParenthesesBlock(ArgCParser.NestedParenthesesBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#nestedParenthesesBlock}.
     *
     * @param ctx the parse tree
     */
    void exitNestedParenthesesBlock(ArgCParser.NestedParenthesesBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#parameterTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterParameterTypeList(ArgCParser.ParameterTypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#parameterTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitParameterTypeList(ArgCParser.ParameterTypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#parameterList}.
     *
     * @param ctx the parse tree
     */
    void enterParameterList(ArgCParser.ParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#parameterList}.
     *
     * @param ctx the parse tree
     */
    void exitParameterList(ArgCParser.ParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#parameterDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterParameterDeclaration(ArgCParser.ParameterDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#parameterDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitParameterDeclaration(ArgCParser.ParameterDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#identifierList}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierList(ArgCParser.IdentifierListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#identifierList}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierList(ArgCParser.IdentifierListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#typeName}.
     *
     * @param ctx the parse tree
     */
    void enterTypeName(ArgCParser.TypeNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#typeName}.
     *
     * @param ctx the parse tree
     */
    void exitTypeName(ArgCParser.TypeNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#initializer}.
     *
     * @param ctx the parse tree
     */
    void enterInitializer(ArgCParser.InitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#initializer}.
     *
     * @param ctx the parse tree
     */
    void exitInitializer(ArgCParser.InitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#initializerList}.
     *
     * @param ctx the parse tree
     */
    void enterInitializerList(ArgCParser.InitializerListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#initializerList}.
     *
     * @param ctx the parse tree
     */
    void exitInitializerList(ArgCParser.InitializerListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#designation}.
     *
     * @param ctx the parse tree
     */
    void enterDesignation(ArgCParser.DesignationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#designation}.
     *
     * @param ctx the parse tree
     */
    void exitDesignation(ArgCParser.DesignationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#designatorList}.
     *
     * @param ctx the parse tree
     */
    void enterDesignatorList(ArgCParser.DesignatorListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#designatorList}.
     *
     * @param ctx the parse tree
     */
    void exitDesignatorList(ArgCParser.DesignatorListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#designator}.
     *
     * @param ctx the parse tree
     */
    void enterDesignator(ArgCParser.DesignatorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#designator}.
     *
     * @param ctx the parse tree
     */
    void exitDesignator(ArgCParser.DesignatorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(ArgCParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(ArgCParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#labeledStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLabeledStatement(ArgCParser.LabeledStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#labeledStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLabeledStatement(ArgCParser.LabeledStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#compoundStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCompoundStatement(ArgCParser.CompoundStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#compoundStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCompoundStatement(ArgCParser.CompoundStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#blockItemList}.
     *
     * @param ctx the parse tree
     */
    void enterBlockItemList(ArgCParser.BlockItemListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#blockItemList}.
     *
     * @param ctx the parse tree
     */
    void exitBlockItemList(ArgCParser.BlockItemListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#blockItem}.
     *
     * @param ctx the parse tree
     */
    void enterBlockItem(ArgCParser.BlockItemContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#blockItem}.
     *
     * @param ctx the parse tree
     */
    void exitBlockItem(ArgCParser.BlockItemContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#expressionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionStatement(ArgCParser.ExpressionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#expressionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionStatement(ArgCParser.ExpressionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#selectionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectionStatement(ArgCParser.SelectionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#selectionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectionStatement(ArgCParser.SelectionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#iterationStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIterationStatement(ArgCParser.IterationStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#iterationStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIterationStatement(ArgCParser.IterationStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#forCondition}.
     *
     * @param ctx the parse tree
     */
    void enterForCondition(ArgCParser.ForConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#forCondition}.
     *
     * @param ctx the parse tree
     */
    void exitForCondition(ArgCParser.ForConditionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#forDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterForDeclaration(ArgCParser.ForDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#forDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitForDeclaration(ArgCParser.ForDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#forExpression}.
     *
     * @param ctx the parse tree
     */
    void enterForExpression(ArgCParser.ForExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#forExpression}.
     *
     * @param ctx the parse tree
     */
    void exitForExpression(ArgCParser.ForExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgCParser#jumpStatement}.
     *
     * @param ctx the parse tree
     */
    void enterJumpStatement(ArgCParser.JumpStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgCParser#jumpStatement}.
     *
     * @param ctx the parse tree
     */
    void exitJumpStatement(ArgCParser.JumpStatementContext ctx);
}