package Opg3;

public class Test {
    public static void main(String[] args) {
        Figur trekant = new Trekant("Trekant", 5, 3);
        Figur rektangel = new Rektangel("Rektangel", 10, 7);
        Figur ellipse = new Ellipse("Ellipse", 2, 4);

        Figur trekantRektangel = new CompositeFigur();
        trekantRektangel.add(trekant);
        trekantRektangel.add(rektangel);
        System.out.println(trekantRektangel.areal());
        trekantRektangel.tegn();

        Figur rektangelEllipse = new CompositeFigur();
        rektangelEllipse.add(rektangel);
        rektangelEllipse.add(ellipse);
        System.out.println(rektangelEllipse.areal());
        rektangelEllipse.tegn();
    }
}
