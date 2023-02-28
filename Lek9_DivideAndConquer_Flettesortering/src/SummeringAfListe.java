import java.util.ArrayList;
import java.util.List;

public class SummeringAfListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(7);
        list.add(9);
        list.add(11);

        System.out.println(summeringAfListe(list));
        System.out.println(nullerIEnListe(list));
    }

    public static int nullerIEnListe(ArrayList<Integer> list) {
        return nullerIEnListe(list, 0, list.size() - 1);
    }

    public static int nullerIEnListe(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int sum1 = nullerIEnListe(list, l, m);
            int sum2 = nullerIEnListe(list, m + 1, h);
            return sum1 + sum2;
        }
    }

    public static int summeringAfListe(ArrayList<Integer> list) {
        return summeringAfListe(list, 0, list.size() - 1);
    }
    private static int summeringAfListe(ArrayList<Integer> list, int i, int j) {
        int result = 0;
        if (i == j) {
            return list.get(i);
        } else {
            int m = (i + j) / 2;
            int sum1 = summeringAfListe(list, i, m);
            int sum2 = summeringAfListe(list, m + 1, j);
            result = sum1 + sum2;
        }
        return result;
    }




}