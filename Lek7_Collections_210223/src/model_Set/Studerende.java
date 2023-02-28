package model_Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Studerende {
    private int studieNr;
    private String navn;
    private Set<Integer> karakterer;

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
        karakterer = new HashSet<>();
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

    public Set<Integer> getKaraterer() {
        return karakterer;
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }
}
