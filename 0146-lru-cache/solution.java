class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    private int capacity;
    private HashMap<Integer, Node> keyMap;
    private Node last = new Node(0, 0);;
    private Node first = new Node(0, 0);;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.keyMap = new HashMap<>();
        this.first.next = this.last;
        this.last.prev = this.first;
    }

    public int get(int key) {
        Node node = this.keyMap.get(key);
        if (node == null) return -1;
        this.remove(node);
        this.insertFront(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node currNode = this.keyMap.get(key);
    
        if (currNode != null) {
            currNode.val = value;
            remove(currNode);
            insertFront(currNode);
        }
        else if (this.keyMap.size() == this.capacity) {
            Node lru = this.last.prev;
            remove(this.last.prev);
            this.keyMap.remove(lru.key);
            Node newNode = new Node(key, value);
            insertFront(newNode);
            this.keyMap.put(key, newNode);
        }
        else {
            Node newNode = new Node(key, value);
            insertFront(newNode);
            this.keyMap.put(key, newNode);
        }
    }

    private void insertFront(Node n) {
        n.next = this.first.next;
        n.prev = this.first;
        first.next.prev = n;
        first.next = n;
    }

    private void remove(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
