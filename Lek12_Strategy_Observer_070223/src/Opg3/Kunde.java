package Opg3;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {
    private String navn;
    private int nummer;
    private Comparator<Kunde> kundeComparator;

    public Kunde(String navn, int nummer) {
        this.navn = navn;
        this.nummer = nummer;
        this.kundeComparator = new Navn();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setKundeComparator(Comparator<Kunde> comparator) {
        this.kundeComparator = comparator;
    }

    public Comparator<Kunde> getKundeComparator() {
        return kundeComparator;
    }

    @Override
    public int compareTo(Kunde o) {
        return kundeComparator.compare(this, o);
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", nummer: " + nummer + ", comparator: " + kundeComparator + "\n";
    }
}
