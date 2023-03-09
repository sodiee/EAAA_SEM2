package Opg4;


public class Indkoeber implements Observer {
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;
        if (((BogTitel) s).getAntal() < 6) {
            System.out.println();
            System.out.println("Indkøber");
            System.out.println("Der er under 6 bøger på lager af bogen: " + ((BogTitel) s).getTitel());
            ((BogTitel) s).indkoebTilLager(10);
            System.out.println("Der er indkøbet 10 nye bøger af: " + ((BogTitel) s).getTitel());
            System.out.println();
        }
    }
}
