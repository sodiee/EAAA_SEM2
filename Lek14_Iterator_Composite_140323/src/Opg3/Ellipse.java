package Opg3;

public class Ellipse extends Figur {
    private String navn;
    private int radius1;
    private int radius2;

    public Ellipse(String navn, int radius1, int radius2) {
        this.navn = navn;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public double areal() {
        double areal = 0;
        areal = radius1 * radius2 * Math.PI;
        return areal;
    }

    @Override
    public void tegn() {
        System.out.println(navn);
    }


}
