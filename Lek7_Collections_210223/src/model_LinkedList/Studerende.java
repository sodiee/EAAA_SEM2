package model_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
        karakterer = new LinkedList<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
            karakterer.add(karakter);
    }

    public List<Integer> getKaraterer() {
        return karakterer;
    }

    public String toString() {
        return "Studerende: " + navn + " Studienummer: " + studieNr;
    }

    @Override
    public int compareTo(Studerende other) {
        if (this.getStudieNr() > other.getStudieNr()) {
            return 1;
        } else if (this.getStudieNr() < other.getStudieNr()) {
            return -1;
        } else {
            return 0;
        }
    }
}
