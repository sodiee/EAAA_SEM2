package Opg3;

public class Rektangel extends Figur{
    private String navn;
    private int længde;
    private int bredde;

    public Rektangel(String navn, int længde, int bredde) {
        this.navn = navn;
        this.længde = længde;
        this.bredde = bredde;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    @Override
    public double areal() {
        double areal = 0;
        areal = længde * bredde;
        return areal;
    }

    @Override
    public void tegn() {
        System.out.println(navn);
    }
}
