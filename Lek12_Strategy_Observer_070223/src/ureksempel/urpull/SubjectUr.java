package ureksempel.urpull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SubjectUr implements Subject {

	private Set<Observer> observers;

	private int tid;

	public SubjectUr() {
		observers = new HashSet<Observer>();
		tid = 0;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public int getTid() {
		return tid;
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	private void notifyObservers() {
		Iterator<Observer> itr = observers.iterator();
		while (itr.hasNext()) {
			Observer o = itr.next();
			o.update(this);
		}
	}

	public void tiktak() {
		tid++;
		notifyObservers();
	}
}
