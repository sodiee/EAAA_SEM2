package Opg4;

public class Saelger implements Observer {

    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;
        System.out.println();
        System.out.println("Sælger: ");
        System.out.println("Bogen " + ((BogTitel) s).getTitel() + " er blevet købt");
        System.out.println();
        System.out.println("\nAndre kunder har også købt disse bøger: ");

            System.out.println(((BogTitel) s).getKunder().get(((BogTitel) s).getKunder().size() - 1).getBogTitels());
        System.out.println();
    }
}

    /*

   at metoden update(Subject s): void på Saelger har følgende specifikation:
Der er udskrevet en liste på skærmen med titlen på de bøger, der er købt af andre kunder,
der også har købt den netop solgte bog s.
Listen må ikke indeholde den samme titel flere gange.
Endvidere skal listen ikke indeholde titlen på den aktuelle bog.
     */
