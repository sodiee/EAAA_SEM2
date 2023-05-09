package Opg4.LinkedList;

import Opg1.IStack;

import java.util.NoSuchElementException;

public class DropoutLinkedList implements IStack {
    private Node first;

    private Node next;

    private int numberOfElements;

    private int resetCounter = 0;

    public DropoutLinkedList() {
        this.first = null;
        this.next = null;
        numberOfElements = 0;
    }

    @Override
    public void push(Object element) {
        resetNOEVarPush();
        if (resetCounter != 0) {
            Node newNode = new Node();
            newNode.data = element;

            Node prev = first;
            Node curr = first.next;
            boolean found = false;
            while (!found) {
                if (curr.next == null) {
                    found = true;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            curr.data = null;
            curr = null;
            prev.next = null;
            newNode.next = first;
            first = newNode;
            numberOfElements++;
            return;
        }

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        numberOfElements++;
    }

    @Override
    public Object pop() {
        resetNOEVarPop();
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        numberOfElements--;
        return element;
    }

    @Override
    public Object peek() {
        Node prev = first;
        Node curr = first.next;
        while (curr != null) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    public void udskrivElements() {
        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void resetNOEVarPush() {
        if (numberOfElements == 5) {
            numberOfElements = 0;
            resetCounter++;
        }
    }

    public void resetNOEVarPop() {
        if (numberOfElements == 0) {
            numberOfElements = 5;
        }
    }

    class Node {
        public Object data;
        public Node next;

        @Override
        public String toString() {
            return data + "";
        }
    }
}

