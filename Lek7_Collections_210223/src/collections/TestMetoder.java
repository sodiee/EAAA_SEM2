package collections;

import java.util.*;

public class TestMetoder {

    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        // Set<String> s = new TreeSet<>();
        s.add("Jan");
        s.add("Jens");
        s.add("Keld");
        s.add("Børge");
        s.add("Henry");
        s.add("Frank");
        System.out.println(s);
        System.out.println(s.size());
        s.add("Keld");
        System.out.println(s.size());
        System.out.println(s.contains("Jauns"));
        System.out.println(s.contains("Jan"));
        s.remove("Jan");
        System.out.println(Metoder.count(s, 5));
        System.out.println(Metoder.count2(s, 5));


        //     List<String> l = new ArrayList<String>();
        List<String> l = new LinkedList<String>();
        l.add("Jan");
        l.add("Jensen");
        l.add("Keld");
        l.add(1, "Børge");
        l.add("Baerge");
        l.add("Henry");
        l.set(0, "Frank");
//        System.out.println(l);
//        System.out.println();
//        System.out.println(Metoder.found(l, "Jens"));
//        System.out.println(Metoder.found(l, "Janus"));


         Map<Character, Integer> m = new TreeMap<Character, Integer>();
        //Map<Character, Integer> m = new HashMap<>();

        String tekst = "margrethe mosbaek dybdahl";
        for (int i = 0; i < tekst.length(); i++) {
            char key = tekst.charAt(i);
            int value = 0;
            if (m.containsKey(key)) {
                value = m.get(key);
            }
            value++;
            m.put(key, value);
        }

       // System.out.println(m);
//
        //

    }

}
