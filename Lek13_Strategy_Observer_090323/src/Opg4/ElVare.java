package Opg4;

public class ElVare extends Vare{
    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double moms = 0;
        if (getPris() > 3) {
            moms = getPris() * 1.3;
            return moms;
        }
        return moms;
    }
}
