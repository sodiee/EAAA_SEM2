package Opg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Navn navnComparator = new Navn();
        Nummer nummerComparator = new Nummer();
        Kunde mikkel = new Kunde("Mikkel", 43728194);
        Kunde kamilla = new Kunde("Kamilla", 00000001);
        Kunde lucas = new Kunde("Lucas", 10010010);
        Kunde mathias = new Kunde("Mathias", 10101010);
        ArrayList<Kunde> kunder = new ArrayList<>(List.of(mikkel, kamilla, lucas, mathias));

        //System.out.println(kunder);
        //Collections.sort(kunder);
        //System.out.println(kunder);

        for (Kunde kunde : kunder) {
            kunde.setKundeComparator(nummerComparator);
        }

        System.out.println(kunder);
        Collections.sort(kunder);
        System.out.println(kunder);
    }
}
