package Task_2_LinkedList;

import java.util.Arrays;

public class MyLinkedList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size = 0;

    public void add(T some) {
        MyNode<T> myNode = new MyNode<>();
        myNode.setNode(some);
        if (head == null) {
            head = myNode;
            tail = myNode;
        } else {
            MyNode <T> nextNode=head;

            while (nextNode.getNext() != null){
                nextNode = nextNode.getNext();
            }
            tail = myNode;
            tail.setPrev(nextNode);
            nextNode.setNext(tail);
        }
        size++;
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("List is empty, there aren't elements to delete");
        } else if (index <= size && index >= 1) {
            MyNode<T> search = head;
            if (index == 1) {
                size--;
                head = search.getNext();
            } else if (index == size) {
                size--;
                tail.getPrev().setNext((null));
            } else {
                int i;
                if (index <= size / 2) {
                    for(i = 1; i < index; ++i) {
                        search = search.getNext();
                    }
                } else if (index > size / 2) {
                    search = tail;

                    for(i = size; i > index; --i) {
                        search = search.getPrev();
                    }
                }

                search.getPrev().setNext(search.getNext());
                search.getNext().setPrev(search.getPrev().getPrev());
                size--;
            }

        } else {
            throw new IndexOutOfBoundsException("" + index + " invalid index");
//            System.err.println("can't remove, "+index+" is invalid index");
        }
    }

    public void clear() {
        if (head != null) {
            head = null;
            size = 0;
        }
    }

    public void size() {
        if (head == null) {
            System.out.println("Size is: 0");
        } else {
            int count = 1;
            MyNode<T> nextNode = head;
            while (nextNode.getNext() != null) {
                nextNode = nextNode.getNext();
                count++;
            }
            System.out.println("Size is: " + count);
        }
    }

    public T get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        } else if (index >= 1 && index <= this.size) {
            MyNode<T> search = head;
            int i;
            if (index <= size / 2) {
                if (index == 1) {
                    return head.getNode();
                }
                for(i = 1; i < index; ++i) {
                    search = search.getNext();
                }
            } else if (index > size / 2) {
                search = tail;
                if (index == size) {
                    return this.tail.getNode();
                }
                for(i = this.size; i > index; --i) {
                    search = search.getPrev();
                }
            }
            return search.getNode();
        } else {
            throw new IndexOutOfBoundsException("" + index + " invalid index");
        }
    }

    public String toString() {
        String[] arr = new String[size];
        int i = 0;
        if (head != null) {
            arr = new String[size];
            for (MyNode<T> node = head; i < size; ++i) {
                arr[i] = (String) node.getNode();
                node = node.getNext();
            }
        }
        return Arrays.toString(arr);
    }
}
