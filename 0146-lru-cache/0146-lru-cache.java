class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // dummy nodes (to avoid null checks)
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // remove node from list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // insert node right after head (most recent)
    private void insert(Node node) {
        node.next = head.next;
        head.next.prev = node;

        head.next = node;
        node.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);

        // move to front (recently used)
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            // remove old node
            remove(map.get(key));
        }

        Node newNode = new Node(key, value);
        insert(newNode);
        map.put(key, newNode);

        if (map.size() > capacity) {
            // remove LRU (last node)
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
}

// HashMap and doubly LinkedList

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
ashMap and doubly LinkedList

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */