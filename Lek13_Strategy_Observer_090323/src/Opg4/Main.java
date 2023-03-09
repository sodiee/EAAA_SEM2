package Opg4;

public class Main {
    public static void main(String[] args) {
        ElVare elVare = new ElVare(100, "Stikkontakt");
        System.out.println(elVare.beregnMoms());
        FoedeVare foedeVare = new FoedeVare(100, "Kat");
        System.out.println(foedeVare.beregnMoms());
        Spiritus spiritus = new Spiritus(100, "Vodka");
        SpiritusAdapter spiritusAdapter = new SpiritusAdapter(spiritus);
        System.out.println(spiritusAdapter.beregnMoms());
    }
}
