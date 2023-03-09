package ureksempel.urobservablejava;

import java.util.Observable;
import java.util.Observer;

public class ObserverAnalogtUr implements Observer {
	private Observable subject;
	public ObserverAnalogtUr(Observable o) {
		o.addObserver(this);
		this.subject = o;
	}
	public void update(Observable o, Object arg1) {
		int tid = ((SubjectUr) o).getTid();
		System.out.println("Analogt " + tid);
	
	}
}
