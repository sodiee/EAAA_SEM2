package Opg5;

public class Main {
    public static void main(String[] args) {
        ObservableBag observableBag = new ObservableBag();
        ObserverKlasse observerKlasse = new ObserverKlasse();
        observableBag.registerObserver(observerKlasse);
        observableBag.addString("Æble");
        observableBag.addString("Pære");
        observableBag.addString("Banan");
        observableBag.addString("Æble");
        observableBag.addString("Æble");
        observableBag.addString("Æble");
        System.out.println(observableBag.getCount("Æble"));
    }
}
