package lambda.Opg3;

import java.util.*;

public class Opg3 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(5);
        intList.add(7);
        intList.add(10);
        intList.add(1);
        intList.add(7);
        intList.add(9);
        intList.add(19);

        ListIterator<Integer> integerListIterator = intList.listIterator();
        while (integerListIterator.hasNext()) {
            int next = integerListIterator.next();
            System.out.println(next);
        }

        Map<Integer, Integer> intMap = new HashMap<>();
        intMap.put(2, 4);
        intMap.put(3, 9);
        intMap.put(4, 16);
        intMap.put(5, 25);
        intMap.put(6, 36);

        Iterator<Map.Entry<Integer, Integer>> entries = intMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
