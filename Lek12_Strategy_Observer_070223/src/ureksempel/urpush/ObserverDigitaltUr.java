package ureksempel.urpush;

public class ObserverDigitaltUr implements Observer {
	/**
	 * ObserverDigitaltUr constructor comment.
	 */
	public ObserverDigitaltUr(Subject o) {
		o.registerObserver(this);
	}

	public void update(int tid) {
	//	int g = ((SubjectUr) o).getTid();
		System.out.println("Digitalt " + tid);
	}

}
