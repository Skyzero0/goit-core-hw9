package Task_2_LinkedList;

public class MyNode<T> {
    private T node;
    private MyNode<T> next;
    private MyNode<T> prev;

    public MyNode() {
    }

    public T getNode() {
        return this.node;
    }

    public void setNode(T node) {
        this.node = node;
    }

    public MyNode<T> getNext() {
        return this.next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public MyNode<T> getPrev() {
        return this.prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }
}
