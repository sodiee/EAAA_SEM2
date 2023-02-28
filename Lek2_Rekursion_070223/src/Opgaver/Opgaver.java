package Opgaver;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgaver {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 9, 11, 15, 16};
        System.out.println(ackermann(1, 3));
    }

    // OPG1 A
    public static int ligeTal(ArrayList<Integer> list) {
        int result = 0;

        if (list.size() == 0) {
            result = 0;
        } else {
            if (list.get(0) % 2 == 0) {
                list.remove(0);
                result += 1 + ligeTal(list);
            } else {
                list.remove(0);
                result += ligeTal(list);
            }
        }
        return result;
    }

    //OPG1 B
    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    // Rekursiv hjælpemetode med de nødvendige parametre

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index % 2) + sum(list, index + 1);
        }
        return result;
    }

    //OPG 2
    public static boolean palindrom(String tekst) {
        if (tekst.length() <= 1) {
            return true;
        } else if (tekst.charAt(0) == tekst.charAt(tekst.length() - 1)) {
            return palindrom(tekst.substring(1, tekst.length() - 1));
        } else {
            return false;
        }
    }

    public static boolean palindromHjælp(String tekst) {
        return palindromIndex(tekst, 0, tekst.length() - 1);
    }

    private static boolean palindromIndex(String tekst, int start, int slut) {

        if (start >= slut) {
            return true;
        } else if (tekst.charAt(start) == tekst.charAt(slut)) {
            return palindromIndex(tekst, start + 1, slut - 1);
        } else {
            return false;
        }
    }

    //OPG 3
    public static boolean finHelTal(int[] array, int target, int start, int slut) {
        return findHelTalHjælp(array, target, start, slut);
    }

    private static boolean findHelTalHjælp(int[] array, int target, int start, int slut) {
        if (slut >= start && slut <= array.length - 1) {

            int midten = start + (slut - start) / 2;

            if (target == array[midten]) {
                return true;
            } else if (target < array[midten]) {
                return findHelTalHjælp(array, target, start, midten - 1);
            } else {
                return findHelTalHjælp(array, target, midten + 1, slut);
            }
        }
        return false;
    }

    //OPG 4
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1;
        }
        else if (y == 0) {
            return ackermann(x - 1, 1);
        } else {
            return ackermann(x - 1, ackermann(x, y - 1));
        }
    }
    /*
    A(1, 3)
    A(1 - 1, A(0, 3-1))
    A(0, 2)
     */
}

