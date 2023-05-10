package QueueOpgaver.Opg3;

import java.util.Random;

public class CircularCannibalMeal {

    private Node first;
    private Node last;
    private Node lastEaten;
    private int currentSize;

    public CircularCannibalMeal() {
        first = null;
        last = null;
        lastEaten = null;
        currentSize = 0;
    }

    // Adds person to the cannibal dance meal
    public void addPersoner (Person p) {
        Node newNode = new Node();
        newNode.data = p;

        if (first == null) {
            first = newNode;
            first.next = null;
            last = first;
            currentSize++;
        } else {
            Node prev = first;
            Node curr = prev.next;
            Node temp = null;

            temp = first;
            first = newNode;
            newNode.next = temp;
            currentSize++;

            last.next = first;
        }
    }

    // Removes random person from the cannibal dance
    public Person eatRandomPerson(){
        Node prev = first;
        Node curr = prev.next;
        Random ran = new Random();
        int x = ran.nextInt(currentSize);

        for (int i = 0; i < x; i++) {
            prev = curr;
            curr = prev.next;
        }

        currentSize--;
        prev.next = curr.next;

        this.lastEaten = curr;

        return (Person) curr.data;
    }

    // Removes person "count" places from the last eaten
    public Person eatNextPerson(int count) {
        Node prev = lastEaten;
        Node curr = lastEaten.next;

        for (int i = 0; i < count; i++) {
            prev = curr;
            curr = prev.next;
        }

        currentSize--;
        prev.next = curr.next;

        this.lastEaten = curr;

        return (Person) curr.data;
    }

    // Prints all persons waiting to be served
    public void printPersons() {
        Node current = first;
        for (int i = 0; i < currentSize; i++) {
            System.out.println(current);
            current = current.next;
        }
    }

    public Object getFirst() {
        return first.data;
    }

    public Object getlastEaten() {
        return lastEaten.data;
    }

    class Node {
        private Object data;
        private Node next;

        @Override
        public String toString() {
            return data + "";
        }
    }
}
