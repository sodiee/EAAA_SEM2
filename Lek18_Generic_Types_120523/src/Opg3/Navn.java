package Opg3;

public class Navn implements Comparable<Navn> {
    private String fornavn;
    private String efternavn;

    public Navn(String fornavn, String efternavn) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    @Override
    public int compareTo(Navn o) {
        if (this.getFornavn().compareTo(o.getFornavn()) == 0) {
            return this.getEfternavn().compareTo(o.getEfternavn());
        } else {
            return this.getFornavn().compareTo(o.getFornavn());
        }
    }

    @Override
    public String toString() {
        return fornavn + efternavn;
    }
}
