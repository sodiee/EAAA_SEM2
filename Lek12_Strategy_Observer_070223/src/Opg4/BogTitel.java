package Opg4;


import java.util.ArrayList;
import java.util.Iterator;

public class BogTitel implements Subject {
    private String titel;
    private int antal;
    private ArrayList<Kunde> kunder;
    private ArrayList<Opg4.Observer> observers;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        kunder = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        k.addBog(this);
        kunder.add(k);
        antal--;
        notifyObservers();
    }

    public void notifyObservers() {
        System.out.println("##Observers notified##");
        Iterator<Opg4.Observer> itr = observers.iterator();
        while (itr.hasNext()) {
            Observer o = itr.next();
            o.update(this);
        }
    }


    @Override
    public void addObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public String toString() {
        return titel;
    }
}
