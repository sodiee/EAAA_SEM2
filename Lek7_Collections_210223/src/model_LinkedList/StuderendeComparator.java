package model_LinkedList;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {
    @Override
    public int compare(Studerende o1, Studerende o2) {
        if ((o1.getNavn().compareTo(o2.getNavn()) > 1)) {
            return 1;
        } else if ((o1.getNavn().compareTo(o2.getNavn()) < 1)) {
            return -1;
        } else {
            return 0;
        }
    }
}
