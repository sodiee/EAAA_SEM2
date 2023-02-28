package quicksort;

import java.util.ArrayList;

public class AnvendQuickSort {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(0);
        
        QuickSort quick = new QuickSort();
        System.out.println(list);
        quick.quickSorting(list);
        System.out.println(list);
        
    }
    
}
