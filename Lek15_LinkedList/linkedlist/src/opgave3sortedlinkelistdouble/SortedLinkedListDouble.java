package opgave3sortedlinkelistdouble;

public class SortedLinkedListDouble {

	private Node head;
	private Node tail;
	private int size;

	public SortedLinkedListDouble() {
		head = null;
		tail = null;
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

		if (head == null) {
			head = node;
			tail = node;
			return;
		}

		if (e.compareTo(head.data) < 0) {
			node.next = head;
			head.prev = node;
			head = node;
			return;
		}

		Node curr = head.next;
		Node prev = head;

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
			tail = node;
		}
	}



	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
	Node prev = head;
	Node curr = prev.next;

	if (prev.data.equals(e)) {
		head = curr;
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
		Node current = head;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		Node current = tail;
		while (current.prev != null) {
			System.out.println(current);
			current = current.prev;
		}
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public void printPointers() {
		Node curr = head;

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
