package Opg3;

import java.util.ArrayList;

public class CompositeFigur extends Figur {
    ArrayList<Figur> figure = new ArrayList<>();

    public CompositeFigur() {
    }

    @Override
    public void tegn() {
        for (Figur f : figure) {
            f.tegn();
        }
        System.out.println();
    }

    @Override
    public double areal() {
        double totalAreal = 0;
        for (Figur f : figure) {
            totalAreal += f.areal();
        }
        return totalAreal;
    }

    @Override
    public void add(Figur figur) {
        figure.add(figur);
    }

    @Override
    public void remove(Figur figur) {
        figure.remove(figur);
    }

    @Override
    public Figur getChild(int i) {
        return figure.get(i);
    }
}
