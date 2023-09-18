//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Task_4_Stack.myStack_Nodes;

public class NodeS<E> {
    private E node;
    private NodeS<E> nextNode;

    public NodeS() {
    }

    public E getNode() {
        return this.node;
    }

    public void setNode(E node) {
        this.node = node;
    }

    public NodeS<E> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(NodeS<E> nextNode) {
        this.nextNode = nextNode;
    }
}
