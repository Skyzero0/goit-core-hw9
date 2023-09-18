package Task_4_Stack.myStack_Nodes;

import java.util.Arrays;

public class MyStack_Nodes<E> {
    private NodeS<E> head;
    private int size;

    public void push(E value) {
        NodeS<E> nodeS = new NodeS<>();
        nodeS.setNode(value);
        if (head == null) {
            head = nodeS;
//            System.out.println(head.getNode());
            size++;
        } else {
            NodeS <E> nextNodeS = head;
            while (nextNodeS.getNextNode() != null){
                nextNodeS = nextNodeS.getNextNode();
            }
            size++;
            nextNodeS.setNextNode(nodeS);
//            System.out.println(nextNodeS.getNextNode().getNode());
        }
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("Stack is empty");
        } else if (index < 1 || index > size) {
            System.out.println("Wrong index");
        } else {
            NodeS<E> nn = head;
            if (head.getNextNode()==null&&index==1) {
                head = null;
                return;
            } else if (index != size) {
                for (int i = 1; i < index; i++) {
                    nn = nn.getNextNode();
                }
                nn.setNode(nn.getNextNode().getNode());
                nn.setNextNode(nn.getNextNode().getNextNode());
            } else {
                while(nn.getNextNode().getNextNode() != null) {
                    nn = nn.getNextNode();
                }
            }
            size--;
        }
    }

    public int size() {
//        System.out.println(this.size);
        return this.size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public E peek() {
        NodeS<E> ns = head;
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            while(ns.getNextNode() != null) {
                ns = ns.getNextNode();
            }
            return ns.getNode();
        }
    }

    public E poll() {
        NodeS<E> ns = head;
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            for(int i = 1; i <= size; i++) {
                if (size == 1) {
                    head = null;
                    size--;
//                    System.out.println(ns.getNode());
                    return ns.getNode();
                }

                if (ns.getNextNode().getNextNode() == null) {
                    NodeS <E> nodeDel = ns.getNextNode();
                    ns.setNextNode(null);
                    size--;
//                    System.out.println(nodeDel.getNode());
                    return nodeDel.getNode();
                }
                ns = ns.getNextNode();
            }
        }
        return null;
    }

    public String toString() {
        NodeS<E> ns = head;
        String[] arr = new String[size];

        if (head==null){
            return  "Stack is empty";
        } else {
            for(int j = 0; j < size; ++j) {
                arr[j] = (String)ns.getNode();
                ns = ns.getNextNode();
            }
        }
        return Arrays.toString(arr);
    }
}
