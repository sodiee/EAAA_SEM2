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
        observableBag.removeString("Æble");
        observableBag.removeString("Æble");
        observableBag.removeString("Æble");
        observableBag.removeString("Æble");
        System.out.println();
        System.out.println(observableBag.getCount("Æble"));
        System.out.println();
        observableBag.forEach(s -> System.out.println("I posen er der: " + s));
    }
}
