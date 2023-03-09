package model;

public class Nedboer {
    private int[] nedboerPrUge = { 20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
        15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
        0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
        19, 21, 32, 24, 13 };

    /**
     *Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     *hvis man ønsker den minimale nedbørsmængde i de tre uger
     *@return
     */
    public int bedsteTreFerieUger() {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int resultUge = 0;
        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
                sum = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
            if (sum < result) {
                result = sum;
                resultUge = i + 1;
            }
        }
        return resultUge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     * @param antal
     * @return resultUge
     * 0 = n
     */
    public int bedsteFerieUgerStart(int antal) {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int resultUge = 0;
        for (int i = 0; i < nedboerPrUge.length - antal; i++) {
            sum = 0;
            for (int j = 0; j < antal; j++) {
                sum += nedboerPrUge[i + j];
            }
            if (sum < result) {
                result = sum;
                resultUge = i + 1;
            }
        }
        return resultUge;
    }
    
    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        int sum = 0;
        int result = 1000;
        int resultUge = -1;
        int counter = 0;
        for (int i = 1; i < nedboerPrUge.length; i++) {
                if (nedboerPrUge[i - 1] == nedboerPrUge[i]) {
                    counter++;
                    resultUge = i;
                } if (counter > result) {
                    result = counter;
                    resultUge = i;
                } else {
                    counter = 0;
            }
        }
        return resultUge - 2;
    }

    public static void main(String[] args) {
        Nedboer nedboer = new Nedboer();
        //System.out.println(nedboer.bedsteTreFerieUger());
        //System.out.println(nedboer.bedsteFerieUgerStart(3));
        System.out.println(nedboer.ensNedboer());
    }
}
