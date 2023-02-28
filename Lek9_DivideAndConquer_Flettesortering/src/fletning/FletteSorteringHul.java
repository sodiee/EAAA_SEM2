package fletning;

import java.awt.*;
import java.util.ArrayList;

public class FletteSorteringHul {

    // den metode der saetter fletningen i gang
    public void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // den rekursive metode der implementere del-loes og kombiner skabelonen
    private void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // kombiner er realiseret ved fletteskabelonen
	/*
    Opgave 3
    I klassen FletteSorteringHul kan det meste af koden til flettesortering findes.
    Dog mangler implementationen af metoden merge.
    Programmer denne som en konkretisering af fletteskabelonen.
    Afprøv dernæst flettesortering på eksemplet [8, 56, 45, 34, 15, 12, 34, 44].
     */
    private void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        ArrayList<Integer> sub1;
        ArrayList<Integer> sub2;

        sub1 = new ArrayList<>(list.subList(low, middle + 1));
        sub2 = new ArrayList<>(list.subList(middle + 1, high + 1));

        int i1 = 0;
        int i2 = 0;

        while (i1 < sub1.size() && i2 < sub2.size()) {
            if (sub1.get(i1).compareTo((sub2.get(i2))) <= 0) {
                // s1's første tal er mindst
                temp.add(sub1.get(i1));
                i1++;
            } else {
                // s2's første tal er mindst
                temp.add(sub2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < sub1.size()) {
            temp.add(sub1.get(i1));
            i1++;
        }
        while (i2 < sub2.size()) {
            temp.add(sub2.get(i2));
            i2++;
        }

        for (int i = 0; i < temp.size(); i++) {
            list.set(low + i, temp.get(i));
        }
    }
}
