package dictionaryelev;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {
    private Node head;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        head = new Node();
        size = 0;
    }

    @Override
    public V get(K key) {
        Node curr = head.next;
        V res = null;

        while (curr != null) {
            if (curr.key == key) {
                res = curr.value;
                return res;
            } else {
                curr = curr.next;
            }
        }
        return res;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        if (key == null || value == null) {
            throw new NullPointerException();
        }
        if (get(key) != null) {
            Node curr = head;
            V res = null;
            while (curr.next != null) {
                if (curr.next.key == key) {
                    res = curr.next.value;
                    curr.next.value = value;
                    return res;
                } else {
                    curr = curr.next;
                }
            }
        }
        Node newNode = new Node();
        newNode.key = key;
        newNode.value = value;

        Node prev = head;
        Node curr = prev.next;

        if (curr != null) {
            prev.next = newNode;
            newNode.next = curr;
            size++;
        } else {
            prev.next = newNode;
            newNode.next = null;
            size++;
        }
        return (V) newNode;
    }

    @Override
    public V remove(K key) {
        V removed = null;

        if (size() == 0) {
            throw new NullPointerException();
        } else {
            if (this.get(key) != null) {
                Node prev = head;
                Node curr = prev.next;
                boolean found = false;

                while (!found) {
                    if (curr.key == key) {
                        removed = curr.value;
                        prev.next = curr.next;
                        size--;

                        found = true;
                    } else {
                        prev = curr;
                        curr = prev.next;
                    }
                }
            }
        }
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    public void udskrivElements() {
        Node current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    private class Node {
        Node next;
        K key;
        V value;

        @Override
        public String toString() {
            return key + ", " + value + "";
        }
    }

}
