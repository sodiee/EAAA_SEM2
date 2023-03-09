package Opg4;

public class FoedeVare extends Vare{
    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return getPris() * 1.05;
    }
}
