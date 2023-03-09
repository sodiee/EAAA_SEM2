package ureksempel.urpull;

public class ObserverAnalogtUr implements Observer {

	public ObserverAnalogtUr(Subject o) {
		o.registerObserver(this);
	}

	public void update(Subject o) {
		int g = ((SubjectUr) o).getTid();
		System.out.println("Analogt " + g);
	}
}
