package Opg2;

import Opg1.IStack;

import java.util.NoSuchElementException;

public class NodeStack implements IStack {

    private Node first;

    private Node next;

    private int numbersOfElements;

    public NodeStack() {
        this.first = null;
        this.next = null;
    }
    @Override
    public void push(Object element) {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
            first = newNode;
            numbersOfElements++;
    }

    @Override
    public Object pop() {
        if (first == null) { throw new NoSuchElementException(); }
        Object element = first.data;
        first = first.next;
        numbersOfElements--;
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
        return numbersOfElements;
    }

    public void udskrivElements() {
        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
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
