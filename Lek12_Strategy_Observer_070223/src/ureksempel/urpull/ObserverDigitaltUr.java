package ureksempel.urpull;

public class ObserverDigitaltUr implements Observer {
	/**
	 * ObserverDigitaltUr constructor comment.
	 */
	public ObserverDigitaltUr(Subject o) {
		o.registerObserver(this);
	}

	public void update(Subject o) {
		int g = ((SubjectUr) o).getTid();
		System.out.println("Digitalt " + g);
	}

}
