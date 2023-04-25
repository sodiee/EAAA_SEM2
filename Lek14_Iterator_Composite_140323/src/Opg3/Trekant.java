package Opg3;

import java.util.ArrayList;

public class Trekant extends Figur {

    private String navn;
    private int højde;
    private int grundlinje;

    public Trekant(String navn, int højde, int grundlinje) {
        this.navn = navn;
        this.højde = højde;
        this.grundlinje = grundlinje;
    }


    @Override
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getHøjde() {
        return højde;
    }

    public void setHøjde(int højde) {
        this.højde = højde;
    }

    public int getGrundlinje() {
        return grundlinje;
    }

    public void setGrundlinje(int grundlinje) {
        this.grundlinje = grundlinje;
    }

    @Override
    public double areal() {
        double areal = 0;
        areal = 0.5 * højde * grundlinje;
        return areal;
    }

    @Override
    public void tegn() {
        System.out.println(navn);
    }
}
