package Task_5_HashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private NodeMap<K, V> head;
    private int size = 0;

    public void put(K key, V value) {
        NodeMap<K, V> myNodeMap = new NodeMap<>();
        myNodeMap.setKey(key);
        myNodeMap.setValue(value);
        if (head == null) {
            head = myNodeMap;
            size++;
        } else {
            NodeMap<K, V> myNextNodeMap = head;

            while (myNextNodeMap != null) {
                if (myNextNodeMap.getKey().equals(key)) {
                    myNextNodeMap.setValue(value);
                    return;
                }
                if (myNextNodeMap.getNextNode() == null) {
                    myNextNodeMap.setNextNode(myNodeMap);
                    size++;
                }
                myNextNodeMap = myNextNodeMap.getNextNode();
            }
        }
    }

    public void remove(K key) {
        NodeMap<K, V> removeNode = head;
        boolean b = false;
        if (head == null) {
            System.out.println("There aren't elements");
        } else if (key.equals(head.getKey())) {
            head = head.getNextNode();
            size--;
            b=true;
        } else {
            while (removeNode.getNextNode() != null) {
                if (removeNode.getNextNode().getNextNode() == null && removeNode.getNextNode().getKey().equals(key)) {
                    removeNode.setNextNode(null);
                    size--;
                    break;
                }

                if (removeNode.getNextNode().getKey().equals(key)) {
                    removeNode.setNextNode(removeNode.getNextNode().getNextNode());
                    size--;

                }
                removeNode = removeNode.getNextNode();
                b = true;
            }
        }
        if (b){
            System.out.println(key+" Incorrect key to remove");
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        if (head == null) {
            System.out.println("There are no elements in map");
        } else {
            NodeMap<K, V> getNodeMap = this.head;
            while (getNodeMap != null) {
                if (getNodeMap.getKey().equals(key)) {
                    return getNodeMap.getValue();
                }
                getNodeMap = getNodeMap.getNextNode();
            }
        }
        System.out.println("Incorrect key");
        return null;
    }

    public String toString() {
        if (head == null) {
            return "HashMap is empty";
        } else {
            String[] arr = new String[size];
            NodeMap<K, V> myNextNodeMap = head;
            int i = 0;
            while (myNextNodeMap != null){
                arr[i++] = (String) myNextNodeMap.getValue();
                myNextNodeMap = myNextNodeMap.getNextNode();
            }
            return Arrays.toString(arr);
        }
    }
}
