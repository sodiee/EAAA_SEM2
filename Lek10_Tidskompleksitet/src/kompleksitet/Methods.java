package kompleksitet;



public class Methods {
    
    public int sum(int n) {
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
    }
    
    public int findMin(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    //n^2
    public void udskriv1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
    }

    //f(n) = log(n)
    public void udskriv2(int n) {
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i = i / 2; //log(n)
        }
    }

    //f(n) = n^2 + n
    //sig kun n^2, da vi kun er ude efter størrelsesordnen.
    public int method3(int n) {
        int resultat = 0;
        for (int i = 0; i <= n; i++) { //n
            resultat = resultat + i;
        }
        for (int i = 0; i < n; i++) { //n^2
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
        return resultat;
    }

    //log(n) + n
    public int method4(int n) {
        for(int i = n; i >= 1; i = i / 2/*log(n)*/) {
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) { //n
            resultat = resultat + i;
        }
        return resultat;
    }

    // O = n
    public int method5(int n) {
        for (int i = 1; i <= n; i++) { //n
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) { //n
            resultat = resultat + i;
        }
        return resultat;
    }

    //O = n Log(n)
    public int method6(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) { //n
            for (int j = n; j >= 1; j = j / 2) { //log n
                System.out.println(j);
                resultat = resultat + j;
            }
            System.out.println(i);
        }
        return resultat;
    }

    //n^3, kubisk tid
    public int method7(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) { //n
            for (int j = 1; j <= n; j++) { //n^2
                for (int k = 1; k <= n; k++) { //n^3
                    System.out.println(k);
                    resultat = resultat + k;
                }
            }
            
        }
        return resultat;
    }
    
   
}
