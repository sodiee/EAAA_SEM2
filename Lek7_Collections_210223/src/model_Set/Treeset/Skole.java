package model_Set.Treeset;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studerendes;

    public Skole(String navn) {
        this.navn = navn;
        studerendes = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!studerendes.contains(studerende)) {
            studerendes.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studerendes.contains(studerende)) {
            studerendes.remove(studerende);
        }
    }

    public double gennemsnit() {
        double result = 0;
        int count = 0;
        for (Studerende s : studerendes) {
            for (int k : s.getKaraterer()) {
                result += k;
                count++;
            }
        }
        return result / count;
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende s : studerendes) {
            if (s.getStudieNr() == studieNr) {
                return s;
            }
        }
        return null;
    }

    public String toString() {
        return "Skole: " + navn;
    }
}
