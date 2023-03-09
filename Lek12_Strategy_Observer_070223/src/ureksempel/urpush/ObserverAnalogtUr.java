package ureksempel.urpush;

public class ObserverAnalogtUr implements Observer {
	private Subject subject;
	public ObserverAnalogtUr(Subject o) {
		o.registerObserver(this);
		this.subject = o;
	}

	public void update(int tid) {
//		int g = ((SubjectUr) o).getTid();
		System.out.println("Analogt " + tid);
	}
}
