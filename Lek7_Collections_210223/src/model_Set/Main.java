package model_Set;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Studerende> treeSet = new TreeSet<>(new StuderendeComparator());

        Studerende studerende = new Studerende(1, "Mathias");
        treeSet.add(studerende);
        Studerende studerende1 = new Studerende(2, "Lucas");
        treeSet.add(studerende1);
        Studerende studerende2 = new Studerende(3, "Kamilla");
        treeSet.add(studerende2);
        Studerende studerende3 = new Studerende(4, "Mikkel");
        treeSet.add(studerende3);

        System.out.println(treeSet);
    }
}
