package Opg3;

import java.util.Comparator;

public class Navn implements Comparator<Kunde> {
    @Override
    public int compare(Kunde o1, Kunde o2) {
        return o1.getNavn().compareTo(o2.getNavn());
    }

    @Override
    public String toString() {
        return "Nummercomparator";
    }
}
