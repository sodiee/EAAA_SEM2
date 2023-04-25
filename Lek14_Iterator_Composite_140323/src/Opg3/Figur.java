package Opg3;

public abstract class Figur {
    public abstract void tegn();

    public abstract double areal();

    public Figur getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void add(Figur figur) {
        throw new UnsupportedOperationException();
    }
    public void remove(Figur figur) {
        throw new UnsupportedOperationException();
    }

    public String getNavn() {return "";}


}
