package org.flowsoft.flowg.nodes;

import org.flowsoft.flowg.visitors.IVisitor;

public class CompoundAssignmentNode extends TernaryNode<IdentifierNode, UnaryNode, ExpressionNode> implements StatementNode {

    public CompoundAssignmentNode(IdentifierNode identifierNode, UnaryNode operator, ExpressionNode expressionNode) {
        super(identifierNode, operator, expressionNode);
    }

    @Override
    public <T, TException extends Exception> T Accept(IVisitor<T, TException> visitor) throws TException {
        return visitor.Visit(this);
    }
}
