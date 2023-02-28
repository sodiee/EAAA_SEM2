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
    
    public void udskriv1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
    }
    
    public void udskriv2(int n) {
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i = i / 2;
        }
    }
    
    public int method3(int n) {
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
        return resultat;
    }
    
    public int method4(int n) {
        for (int i = n; i >= 1; i = i / 2) {
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
    }
    
    public int method5(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        int resultat = 0;
        for (int i = 0; i <= n; i++) {
            resultat = resultat + i;
        }
        return resultat;
    }
    
    public int method6(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j = j / 2) {
                System.out.println(j);
                resultat = resultat + j;
            }
            System.out.println(i);
        }
        return resultat;
    }
    
    public int method7(int n) {
        int resultat = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println(k);
                    resultat = resultat + k;
                }
            }
            
        }
        return resultat;
    }
    
   
}
