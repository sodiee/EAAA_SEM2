package model_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studerendes;

    public Skole(String navn) {
        this.navn = navn;
        studerendes = new LinkedList<>();
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
        for (int i = 0; i < studerendes.size(); i++) {
            result += studerendes.get(i).getKaraterer().get(i);
        }
        return result;
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
