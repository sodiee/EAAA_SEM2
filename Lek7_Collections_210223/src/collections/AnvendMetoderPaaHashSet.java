package collections;

import java.util.HashSet;
import java.util.Set;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        //Opg1
        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(12);
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(34);
        set.add(98);
        System.out.println(set);
        set.add(23);
        System.out.println(set);
        set.remove(67);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.size());
    }
}
