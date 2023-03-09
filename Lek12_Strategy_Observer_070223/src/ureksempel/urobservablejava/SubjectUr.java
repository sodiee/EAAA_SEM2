package ureksempel.urobservablejava;

import java.util.Observable;

public class SubjectUr extends Observable {


	private int tid;

	public SubjectUr() {
		tid = 0;
	}
	
	public int getTid() {
		return tid;
	}

	public void tiktak() {
		tid++;
		setChanged();
		notifyObservers();
	}
}
