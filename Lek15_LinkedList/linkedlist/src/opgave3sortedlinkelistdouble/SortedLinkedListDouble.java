package opgave3sortedlinkelistdouble;

import opgave2sortedlinkedlist.SortedLinkedList;

public class SortedLinkedListDouble {

	private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = null;
		last = null;
		/*
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;

		 */
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		Node node = new Node();
		node.data = e;

		if (first == null) {
			first = node;
			last = node;
			return;
		}

		if (e.compareTo(first.data) < 0) {
			node.next = first;
			first.prev = node;
			first = node;
			return;
		}

		Node curr = first.next;
		Node prev = first;

		while (curr != null && e.compareTo(curr.data) > 0) {
			prev = curr;
			curr = curr.next;
		}

		node.next = curr;
		node.prev = prev;
		prev.next = node;

		if (curr != null) {
			curr.prev = node;
		} else {
			last = node;
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

	if (prev.data.equals(e)) {
		first = curr;
		curr.prev = null;
		return true;
	}

	//hvis det er en af de midterste
	while (curr != null) {
		if (curr.data.equals(e)) {
			Node toBeDeleted = curr;
			prev.next = curr.next;
			curr.prev = toBeDeleted.prev;
			return true;
		}
		prev = prev.next;
		curr = curr.next;
	}
		return false;
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
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		Node current = last;
		while (current.prev != null) {
			System.out.println(current);
			current = current.prev;
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

	public void printPointers() {
		Node curr = first;

		while (curr != null) {
			System.out.print("Node: " + curr.data + ", ");
			System.out.print("prev: " + (curr.prev != null ? curr.prev.data : "null") + ", ");
			System.out.println("next: " + (curr.next != null ? curr.next.data : "null"));

			curr = curr.next;
		}
	}


	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;

		@Override
		public String toString() {
			return "Node{" +
					"data='" + data + '\'' +
					'}';
		}
	}
}
