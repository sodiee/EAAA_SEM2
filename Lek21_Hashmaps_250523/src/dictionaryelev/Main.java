package dictionaryelev;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Opg1
        HashSet<Bil> biler = new HashSet<>();
        Bil bil1 = new Bil("AB54931", "Citroën", "C1", "Grå" );
        Bil bil2 = new Bil("HD21943", "Toyota", "Aygo", "Blå");
        Bil bil3 = new Bil("KJ40184", "Fiat", "Punto", "Gul");
        Bil bil4 = new Bil("KA05194", "Opel", "Astra", "Rød");
        Bil bil5 = new Bil("KA05194", "Opel", "Astra", "Rød");
        biler.add(bil1);
        biler.add(bil2);
        biler.add(bil3);
        biler.add(bil4);
        biler.add(bil5);

        Iterator<Bil> iterator = biler.iterator();
        while (iterator.hasNext()) {
            Bil bil = iterator.next();
            System.out.println(bil);
        }
    }
}
