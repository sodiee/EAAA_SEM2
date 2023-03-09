package Opg4;

public class App {
    public static void main(String[] args) {
        BogTitel bogTitel1 = new BogTitel("Anders And", 6);
        BogTitel bogTitel2 = new BogTitel("Java", 8);
        Saelger saelger1 = new Saelger("Hansen");
        Indkoeber indkoeber1 = new Indkoeber("Jensen");
        bogTitel1.addObserver(saelger1);
        bogTitel1.addObserver(indkoeber1);
        bogTitel2.addObserver(saelger1);
        bogTitel2.addObserver(indkoeber1);
        Kunde kunde1 = new Kunde("Læsehest1");
        Kunde kunde2 = new Kunde("Læsehest2");
        Kunde kunde3 = new Kunde("Læsehest3");

        bogTitel2.etKoeb(kunde1);
        bogTitel2.etKoeb(kunde2);
        bogTitel2.etKoeb(kunde3);
        bogTitel1.etKoeb(kunde1);
        bogTitel1.etKoeb(kunde2);
        bogTitel1.etKoeb(kunde3);
    }
}
