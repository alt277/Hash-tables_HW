import java.util.LinkedList;

public class ChainingHashMap<Key, Value> {
    private int capacity = 7;
    private int size = 0;

    private LinkedList<Node>[] st;

    public ChainingHashMap() {
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key null");
        }
        return true;
    }

    public boolean contains(Key key){
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));

        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    public void delete(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                st[i].remove(node);
                size--;
                return;
            }
        }

    }
    public Value delete2(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
            Value temp= node.value;
                st[i].remove(node);
                size--;
                return temp;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                sb.append(node.key + "=" + node.value+", ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }


    public void display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                sb.append(node.key + "=" + node.value+", ");
            }
            sb.append(" ");
        }
        System.out.println( sb.toString());
    }


}
