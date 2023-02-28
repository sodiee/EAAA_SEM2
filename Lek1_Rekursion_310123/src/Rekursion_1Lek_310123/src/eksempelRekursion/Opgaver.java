package Rekursion_1Lek_310123.src.eksempelRekursion;

public class Opgaver {

    //Opgave 1
    public static int factorial(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            System.out.println(result = n + factorial(n - 1));
        }
        return result;
    }

    //Opgave 2a
    public static int power(int n, int p) {
        int result = 0;
        if (p <= 0) {
            result = 1;
        } else {
            result = n * power(n, p - 1);
            System.out.println("n :" + n);
            System.out.println("p : " + p);
            System.out.println("result : " + result);
        }
        return result;
    }

    //Opgave 2b
    public static int power2(int n, int p) {
        int result = 0;
        if (p <= 0) {
            result = 1;
        } else if (p % 2 == 1) {
                    result = n * power2(n, p - 1);
                } else {
                    result = power2(n * n , (p / 2));
                }

        return result;
        }
    /*vores egen gange
    for hver omkring plusser den bare b til.
     */
    public static int product(int a, int b) {
        int result = 0;
        int i = 0;
        if (a == 0) {
            result = 0;
            i++;
        } else {
            result = product(a - 1, b) + b;
            i++;
        }
        System.out.println(i);
        return result;
    }
/*
samme som ovenover, bare b bliver fordoblet og a bliver halveret.
det er væsentlig hurtigere end den ovenover, da der kommer færre regnestykker.
 */
    public static int productRus(int a, int b) {
        int result = 0;
        int i = 0;
        if (a == 0) {
            result = 0;
            i++;
        } else if (a % 2 == 1) {
            result = productRus(a - 1, b) + b;
            i++;
        } else {
            result = productRus(a / 2, 2 * b);
            i++;
        }
        System.out.println(i);
        return result;
    }

    public static String reverse(String s) {
        String res = "";
        if (s.length() == 1) {
            return s;
        } else {
            String letter = String.valueOf(s.charAt(0));
            String reverseS = s.substring(1);
            return res = reverse(reverseS) + letter;
        }
    }

    public static int sfd(int a, int b) {
        int res;
        if (b <= a && a%b == 0) {
            res = 0;
        } else if (a < b) {
            res = sfd(b, a);
        } else {
            res = sfd(b, a % b);
        }
        return res;
    }


    public static void main(String[] args) {
        //factorial(5);
        //System.out.println(power(2, 5));
        //System.out.println(power2(2, 3));
        //System.out.println(product(19, 3));
        //System.out.println(productRus(19, 3));
        ///System.out.println(reverse("hallo"));
        System.out.println(sfd(3, 6));
    }
}
