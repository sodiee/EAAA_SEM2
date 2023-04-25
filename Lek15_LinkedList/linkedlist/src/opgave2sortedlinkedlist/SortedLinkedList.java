package opgave2sortedlinkedlist;

import java.util.Currency;
import java.util.NoSuchElementException;

public class SortedLinkedList {
    private Node first;
    private Node next;

    public SortedLinkedList() {
        this.first = null;
        this.next = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node node = new Node();
        if (first == null) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = first;
            first = newNode;
            return;
        } else if (e.compareTo(first.data) < 0) {
            node.data = e;
            node.next = first;
            first = node;
            return;
        } else {
            node.data = e;
            Node curr = first.next;
            Node prev = first;
            boolean found = false;
            while (curr != null && !found) {
                if (e.compareTo(curr.data) > 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    found = true;
                }
            }
            node.next = prev.next;
            prev.next = node;
            return;
        }
    }

    public void addAll(SortedLinkedList list) {
        Node nodeToAdd = list.first;

        while (nodeToAdd != null) {
            Node prev = first;
            Node curr = first.next;
            Node newNode = new Node();
            newNode.data = nodeToAdd.data;

            // Find position to insert new node
            while (curr != null && newNode.data.compareTo(curr.data) > 0) {
                prev = curr;
                curr = curr.next;
            }

            // Insert new node
            if (prev == null) { // newNode should be inserted at the beginning of the list
                newNode.next = first;
                first = newNode;
            } else { // newNode should be inserted in the middle or at the end of the list
                prev.next = newNode;
                newNode.next = curr;
            }

            nodeToAdd = nodeToAdd.next;
        }
    }


    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        Node curr = first;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public int countElementsRecursive() {
        if (first.next == null) {
            return 1;
        } else {
            first = first.next;
            int count = 1;
            return count + countElementsRecursive();
        }
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() {
        if (first == null) {
            return false;
        } else if (first.next == null) {
            first = null;
            return false;
        } else {
            Node curr = first.next;
            Node prev = first;
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            return true;
        }
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        Node prev = first;
        Node curr = prev.next;
        while (curr != null) {
            if (curr.data.equals(e)) {
                prev.next = curr.next;
                return true;
            }
            prev = prev.next;
        }
        return false;
    }


    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
