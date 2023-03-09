package ureksempel.urpush;

public class TestObserverUr {

public TestObserverUr() {
	super();
}
public static void main(String[] args) {
	SubjectUr ur = new SubjectUr();
	Observer analog = new ObserverAnalogtUr(ur);
	Observer digital = new ObserverDigitaltUr(ur);
	for (int i = 0; i < 4; i++)
	   ur.tiktak();
}
}
