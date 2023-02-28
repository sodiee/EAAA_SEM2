package BilForsikring.model;

public class BilForsikring {
    private double grundPraemie;

    public double getGrundPraemie() {
        return grundPraemie;
    }

    public void setGrundpaemie(double grundPr) {
        if (grundPr <= 0) {
            throw new RuntimeException("grundPr skal vaere positiv");
        }
        grundPraemie = grundPr;
    }

    public double beregnPraemie(int alder, boolean isKvinde, int skadeFrieaer) {
        double praemie = grundPraemie;
        if (praemie == 0) {
            throw new RuntimeException("GrundPraemie har ikke faeet en vaerdi");
        }
        if (alder < 18) {
            throw new RuntimeException("Du er for ung til at tegne en forsikring");
        }
        if (alder - skadeFrieaer < 18) {
            throw new RuntimeException("Du kan ikke have kaert skadefri saelaenge");
        }
        if (skadeFrieaer < 0) {
            throw new RuntimeException("Antal skade frie aer skal vaere positiv");
        }
        if (alder < 25) {
            praemie = 1.25 * grundPraemie;
        }
        if (isKvinde) {
            praemie = praemie * 0.95;
        }
        if (skadeFrieaer < 3) {
        } else if (skadeFrieaer < 6) {
            praemie = praemie * 0.85;
        } else if (skadeFrieaer < 9) {
            praemie = praemie * 0.75;
        } else {
            praemie = praemie * 0.65;
        }
        return praemie;

    }

}
