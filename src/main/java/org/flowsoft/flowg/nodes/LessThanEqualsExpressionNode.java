package org.flowsoft.flowg.nodes;

import org.flowsoft.flowg.visitors.IVisitor;

public class LessThanEqualsExpressionNode extends BinaryNode<ExpressionNode, ExpressionNode> implements ExpressionNode{
    public LessThanEqualsExpressionNode(ExpressionNode leftChild, ExpressionNode rightChild) { super(leftChild, rightChild); }

    @Override
    public <T, TException extends Exception> T Accept(IVisitor<T, TException> visitor) throws TException {
        return visitor.Visit(this);
    }
}
