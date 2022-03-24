package org.flowsoft.flowg.visitors;

import org.flowsoft.flowg.NoException;
import org.flowsoft.flowg.TypeHelper;
import org.flowsoft.flowg.nodes.*;

public class PrettyPrintingVisitor implements IVisitor<String, NoException> {
    @Override
    public String Visit(StatementListNode statementListNode) throws NoException {
        var statement = statementListNode.GetLeftChild();
        var statementList = statementListNode.GetRightChild();

        return statement.Accept(this) + ";\n"
                + (statementList == null ? "" : statementList.Accept(this));
    }

    @Override
    public String Visit(DeclarationNode declarationNode) throws NoException {
        return declarationNode.GetTypeChild().Accept(this)
                + " " + declarationNode.GetIdentifierChild().Accept(this)
                + " ="
                + " " + declarationNode.GetExpressionChild().Accept(this);
    }

    @Override
    public String Visit(TypeNode typeNode) {
        return TypeHelper.TypeToString(typeNode.GetValue());
    }

    @Override
    public String Visit(IdentifierNode identifierNode) {
        return identifierNode.GetValue();
    }

    @Override
    public String Visit(NumberLiteralNode numberLiteralNode) {
        return numberLiteralNode.GetValue().toString();
    }

    @Override
    public String Visit(BooleanLiteralNode booleanLiteralNode) {
        return booleanLiteralNode.GetValue().toString();
    }
}