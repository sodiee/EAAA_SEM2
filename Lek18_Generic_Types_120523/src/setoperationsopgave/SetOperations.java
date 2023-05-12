package setoperationsopgave;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> set = new HashSet<T>();
        set.addAll(s1);
        set.addAll(s2);
        return set;
    }

    public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
        Set<T> set = new HashSet<T>();

        for (T e : s1) {
            if (!s2.contains(e)) {
                set.add(e);
            }
        }

        for (T e : s2) {
            if (!s1.contains(e)) {
                set.add(e);
            }
        }
        return set;

}

    public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
        Set<T> set = new HashSet<T>();

        for (T e : s1) {
            for (T f : s2) {
                if (e == f) {
                    set.add(e);
                }
            }
        }

        return set;

    }

}
