package quicksort;

import java.util.ArrayList;

public class QuickSort {
    
    // den metode der sætter sorteringen i gang
    public void quickSorting(ArrayList<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }
    
    // den rekursive metode der implementere del-løs og kombiner skabelonen
    private void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int p = partition(list, low, high);
            quickSort(list, low, p - 1);
            quickSort(list, p + 1, high);
            
        }
    }
    
    private int partition(ArrayList<Integer> list, int low, int high) {
        int e = list.get(low);
        int i = low + 1;
        int j = high;
        while (i <= j) {
            if (list.get(i) <= e) {
                i++;
            }
            else if (list.get(j) > e) {
                j--;
            }
            else {
                swap(list, i, j);
                i++;
                j--;
            }
        }
        swap(list, low, j);
        return j;
        
    }
    
    // Bytter om på indholdet af plads i og j i listen
    private void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
