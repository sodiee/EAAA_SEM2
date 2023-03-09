package Opg4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kunde {
    private String navn;
    private Set<BogTitel> bogTitels;

    public Kunde(String navn) {
        this.navn = navn;
        bogTitels = new HashSet<>();
    }

    public void addBog(BogTitel bogTitel) {
        bogTitels.add(bogTitel);
    }
    public Set<BogTitel> getBogTitels() {
        return bogTitels;
    }
}
