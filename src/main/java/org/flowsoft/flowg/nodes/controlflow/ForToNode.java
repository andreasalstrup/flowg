package org.flowsoft.flowg.nodes.controlflow;

import org.flowsoft.flowg.nodes.*;
import org.flowsoft.flowg.nodes.base.ExpressionNode;
import org.flowsoft.flowg.nodes.base.StatementNode;
import org.flowsoft.flowg.nodes.base.TernaryNode;
import org.flowsoft.flowg.visitors.IVisitor;

public class ForToNode extends TernaryNode<DeclarationNode, ExpressionNode, StatementListNode> implements StatementNode {

    public ForToNode(DeclarationNode declarationNode, ExpressionNode expressionNode, StatementListNode statementListNode) {
        super(declarationNode, expressionNode, statementListNode);
    }

    @Override
    public <T, TException extends Exception> T Accept(IVisitor<T, TException> visitor) throws TException {
        return visitor.Visit(this);
    }
}