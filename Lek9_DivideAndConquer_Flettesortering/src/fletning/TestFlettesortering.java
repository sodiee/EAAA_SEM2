package fletning;

import java.util.ArrayList;

public class TestFlettesortering {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(56);
        list.add(45);
        list.add(34);
        list.add(15);
        list.add(12);
        list.add(34);
        list.add(44);
        System.out.println(list);
        
        FletteSorteringHul sort = new FletteSorteringHul();
        sort.fletteSort(list);
        System.out.println();
        System.out.println(list);
    }
    
}
