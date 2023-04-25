package opgave2sortedlinkedlist;

public class SortedLinkedList {

	// TODO hvilke feltvariable skal klassen have

	public SortedLinkedList() {
		// TODO
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		// TODO
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		// TODO
	}
	
	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		// TODO
		return -1;
	}

	
	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		// TODO
		return false;
	}
	
	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		// TODO
		return false;
	}

	
	
	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
