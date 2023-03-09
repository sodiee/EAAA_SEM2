package Opg3;

import java.util.Comparator;

public class Nummer implements Comparator<Kunde> {

    @Override
    public int compare(Kunde o1, Kunde o2) {
        return o1.getNummer() - o2.getNummer();
    }

    @Override
    public String toString() {
        return "Nummercomparator";
    }
}
