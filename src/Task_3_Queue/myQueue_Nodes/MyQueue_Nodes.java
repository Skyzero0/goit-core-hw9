package Task_3_Queue.myQueue_Nodes;

import java.util.Arrays;

public class MyQueue_Nodes<E> {
    private NodeQ<E> head;
    private int size;

    public void add (E item) {
        NodeQ<E> myNodeQ = new NodeQ<>();
        myNodeQ.setNode(item);
        if (head == null) {
            head = myNodeQ;
        } else {
            NodeQ <E> next;
            next = head;
            while (next.getNextNode() != null) {
                next = next.getNextNode();
            }
            next.setNextNode(myNodeQ);
        }
        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        return head.getNode();
    }

    public E poll() {
        NodeQ<E> nodePoll = head;
        if (head==null){
            return null;
        }
        head = head.getNextNode();
        size--;
        return nodePoll.getNode();
    }

    public String toString() {
        String[] arr = new String[size];
        NodeQ <E> mn = head;
        int i = 0;
        if (head==null){
            return "Queue is empty";
        } else if (head.getNextNode()==null){
            arr[i] = (String) head.getNode();
        } else {
            while (mn.getNextNode()!=null){
                arr[i++]= (String)mn.getNode();
                mn = mn.getNextNode();
                if(mn.getNextNode()==null){
                    arr[i++] = (String) mn.getNode();
                }
            }
        }
        return Arrays.toString(arr);
    }
}
