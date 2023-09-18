package Task_3_Queue.myQueue_Nodes;

public class NodeQ<E> {
    private E node;
    private NodeQ<E> nextNode;

    public NodeQ() {
    }

    public E getNode() {
        return this.node;
    }

    public void setNode(E node) {
        this.node = node;
    }

    public NodeQ<E> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(NodeQ<E> nextNode) {
        this.nextNode = nextNode;
    }
}
