package Opg5;

public class ObserverKlasse implements Observer{
    @Override
    public void update(String s, int antal) {
        System.out.println("Der er : " + antal + " " + s);
    }
}
