package ureksempel.urobservablejava;

import java.util.Observable;
import java.util.Observer;

public class ObserverDigitaltUr implements Observer {
	/**
	 * ObserverDigitaltUr constructor comment.
	 */
	public ObserverDigitaltUr(Observable o) {
		o.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		int tid = ((SubjectUr) o).getTid();
		System.out.println("Digitalt " + tid);
		
	}

}
