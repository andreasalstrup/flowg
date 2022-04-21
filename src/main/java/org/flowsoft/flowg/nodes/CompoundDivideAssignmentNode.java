package org.flowsoft.flowg.nodes;

import org.flowsoft.flowg.visitors.IVisitor;

public class CompoundDivideAssignmentNode extends CompoundAssignmentNode implements StatementNode{

    public CompoundDivideAssignmentNode(IdentifierNode identifierNode, ExpressionNode expressionNode) {
        super(identifierNode, expressionNode);
    }
    @Override
    public <T, TException extends Exception> T Accept(IVisitor<T, TException> visitor) throws TException {
        return visitor.Visit(this);
    }
}