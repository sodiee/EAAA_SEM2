package QueueOpgaver.dequee;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI {

    Object[] arr;
    private Node first;
    private Node last;
    private int currentSize;

    public CircularArrayDeque() {
        arr = new Object[5];
        first = null;
        last = null;
        currentSize = 0;
    }

    @Override
    public void addFirst(Object element) {
        Node newNode = new Node();
        newNode.data = element;

        if (first == null) {
            first = newNode;
            last = newNode;
            currentSize++;
        } else {
            Node prev = first;
            Node curr = prev.next;

            if (curr == null) {
                //rykker den første node
                curr = first;
                //sætter den nye node til at være first
                first = newNode;
                //sætter den node first til at være first.next
                first.next = curr;
                //sætter den gamle first til at være last.
                last = curr;
                currentSize++;
            } else {
                //sætter curr til at være den gamle first
                curr = first;
                //sætter den nye first til at være first
                first = newNode;
                //sætter first.next til at være den gamle first
                first.next = curr;
                currentSize++;
            }
        }
    }

    @Override
    public void addLast(Object element) {
        Node newNode = new Node();
        newNode.data = element;

        if (first == null) {
            first = newNode;
            last = newNode;
            last.next = first;
            currentSize++;
        } else {
            Node prev = first;
            Node curr = prev.next;
            boolean found = false;

            while (!found) {
                if (curr == null) {
                    curr = newNode;
                    last.next = first;
                    last = curr;


                    found = true;
                } else {
                    prev = curr;
                    curr = prev.next;
                }
            }
        }
    }

    @Override
    public Object removeFirst() {
        Object deleted = null;

        if (first != null) {
            deleted = first;
            first = first.next;
            last.next = first;
        } else {
            throw new NoSuchElementException();
        }
        return deleted;
    }

    @Override
    public Object removeLast() {
        Object deleted = null;
        Node prev = first;
        Node curr = prev.next;
        boolean found = false;

        while (!found) {
            if (curr.next == null) {
                //opdaterer deleted variable med sidste;
                deleted = last;
                //sætter last til at være næstsidste
                last = prev;
                //opdatere sidste med null, så den sidste node bliver glemt
                last.next = first;

                found = true;
            } else {
                prev = curr;
                curr = prev.next;
            }
        }
        return deleted;
    }

    @Override
    public Object getFirst() {
        return first.data;
    }

    @Override
    public Object getLast() {
        return last.data;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    class Node {
        private Object data;
        private Node next;
        }
}
