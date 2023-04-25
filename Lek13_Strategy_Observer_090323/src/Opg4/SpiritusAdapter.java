package Opg4;

public class SpiritusAdapter extends Vare {

    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus) {
        super(spiritus.getPris(), spiritus.getBetegnelse());
        this.spiritus = spiritus;
    }

    @Override
    public int getPris() {
        return spiritus.getPris();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPris(pris);
    }

    @Override
    public String getNavn() {
        return spiritus.getBetegnelse();
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetegnelse(navn);
    }

    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }
}
