package model_map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studerendes;

    public Skole(String navn) {
        this.navn = navn;
        studerendes = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!studerendes.containsValue(studerende)) {
            studerendes.put(studerende.getStudieNr(), studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studerendes.containsValue(studerende)) {
            studerendes.remove(studerende.getStudieNr(), studerende);
        }
    }

    public double gennemsnit() {
        double result = 0;
        int count = 0;
        for (int i = 0; i < studerendes.size(); i++) {
            for (int j = 0; j < studerendes.get(i).getKaraterer().size(); j++) {
                result += studerendes.get(i).getKaraterer().get(j);
                count++;
            }
        }
        return result / count;
    }

    public Studerende findStuderende(int studieNr) {
        if (studerendes.containsKey(studieNr)) {
            return studerendes.get(studieNr);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", studerendes=" + studerendes +
                '}';
    }
}
