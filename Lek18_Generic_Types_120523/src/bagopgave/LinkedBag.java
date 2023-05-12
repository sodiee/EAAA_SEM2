package bagopgave;

import com.sun.source.tree.NewClassTree;

public class LinkedBag<E> implements Bag<E> {
    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> first = null;

    private int currentSize;

    private int maxSize;

    public LinkedBag(int maxSize) {
        first = null;
        currentSize = 0;
        this.maxSize = maxSize;
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        if (currentSize == 22) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (!isFull()) {
            first = new Node<>(newEntry, first);
            currentSize++;
            return true;
        }
        return false;
    }


    @Override
    public E remove() {
        E removed = null;
        Node<E> prev = first;
        Node<E> curr = prev.next;

        if (!isEmpty()) {
            while (curr != null) {
                if (curr.next == null) {
                    currentSize--;
                    removed = (E) curr;
                    curr = null;
                    prev.next = null;

                } else {
                    prev = curr;
                    curr = prev.next;
                }
            }
        }
        return removed;
    }

    @Override
    public boolean remove(Object anEntry) {
        E removed = null;
        Node<E> prev = first;
        Node<E> curr = prev;

        if (!isEmpty()) {
            while (curr != null) {
                if (curr.data == anEntry) {
                    currentSize--;
                    removed = (E) curr;
                    prev.next = curr.next;
                    curr = null;

                } else {
                    prev = curr;
                    curr = prev.next;
                }
            }
        }
        return contains(anEntry);
    }

    @Override
    public void clear() {
        first = null;
        currentSize = 0;
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        Node<E> curr = first;
        int found = 0;

        while (curr != null) {
            if (curr.data == anEntry) {
                found++;
            }
            curr = curr.next;
        }
        return found;
    }

    @Override
    public boolean contains(Object anEntry) {
        Node<E> prev = first;
        Node<E> curr = prev;
        boolean found = false;

        while (curr != null) {
            if (prev.data == anEntry) {
                found = true;
                break;
            } else {
                prev = curr;
                curr = prev.next;
            }
        }
        return found;
    }

    @Override
    public E[] toArray() {
        return (E[]) new Object[currentSize];
    }
}
