package Task_5_HashMap;

public class NodeMap<K, V> {
    private K key;
    private V value;
    private NodeMap<K, V> nextNode;

    public NodeMap() {
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodeMap<K, V> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(NodeMap<K, V> nextNode) {
        this.nextNode = nextNode;
    }
}
