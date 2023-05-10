package QueueOpgaver.queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
    private Node first;
    private Node last;
    private Object[] arr;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public NodeQueue() {
        arr = new Object[5];
        first = null;
        last = null;
        size = 0;
        // TODO: Assignment 1: Implement this constructor...
    }

    @Override
    public void enqueue(Object element) {
        if (first == null) {
            Node newNode = new Node();
            newNode.data = element;

            first = newNode;
            first.next = null;
            last = newNode;
            size++;
        } else {
            Node prev = first;
            Node curr = first.next;
            boolean found = false;

            while (!found) {
                if (curr == null) {
                    Node newNode = new Node();
                    newNode.data = element;

                    prev.next = newNode;
                    this.last = newNode;
                    size++;
                    found = true;
                } else {
                    prev = curr;
                    curr = prev.next;
                }
            }
        }
        // TODO: Assignment 1: Implement this method...
    }

    @Override
    public Object dequeue() {
        Node deleted;

        if (first == null) {
            throw new NoSuchElementException();
        } else {
            Node prev = first;
            Node curr = prev.next;

            if (curr == null) {
                deleted = first;
                first = null;
                last = null;
                size--;
            } else {
                deleted = first;
                first = curr;
                first.next = curr.next;
                size--;
            }
        }
        // TODO: Assignment 1: Implement this method...
        return deleted.data;
    }

    @Override
    public int size() {
        return size;
        // TODO: Assignment 1: Implement this method...
    }

    @Override
    public boolean isEmpty() {
        return first == null;
        // TODO: Assignment 1: Implement this method...
    }

    class Node {
        public Object data;
        public Node next;
    }
}
