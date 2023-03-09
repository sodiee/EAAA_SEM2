package Opg4;

public class Spiritus {
    private int pris;
    private String betegnelse;

    public Spiritus(int pris, String betegnelse) {
        this.pris = pris;
        this.betegnelse = betegnelse;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public void setBetegnelse(String betegnelse) {
        this.betegnelse = betegnelse;
    }

    public double hentMoms() {
        double momsPris = 0;
        if (this.pris <= 90) {
            momsPris = this.pris * 1.8;
        } else {
            momsPris = this.pris * 2.2;
        }
        return momsPris;
    }

}
