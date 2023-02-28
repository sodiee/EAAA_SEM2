import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LæsFilOgBeregnKarakter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Lek7_Collections_210223/res/FilmOgKarakterer");
        Scanner sc = new Scanner(file);
        List<Map<String, Integer>> maps = new ArrayList<>();
        maps.add(new HashMap<>());

        while (sc.hasNext()) {
            String name = sc.nextLine();
            int score = Integer.parseInt(sc.nextLine());
            boolean inputSet = false;
            for (int i = 0; i < maps.size(); i++) {
                if (!maps.get(i).containsKey(name) && !inputSet) {
                    maps.get(i).put(name, score);
                    inputSet = true;
                }
            }
            if (!inputSet) {
                maps.add(new HashMap<>());
                maps.get(maps.size() - 1).put(name, score);
            }
        }
        for (Map.Entry<String, Integer> pair : maps.get(0).entrySet()) {
            int antalKarakterer = 1;
            int samletKarakterer = pair.getValue();
            for (int i = 1; i < maps.size(); i++) {
                for (Map.Entry<String, Integer> pair2 : maps.get(i).entrySet()) {
                    if (pair.getKey().equals(pair2.getKey())) {
                        samletKarakterer += pair2.getValue();
                        antalKarakterer++;
                    }
                }
            }
            System.out.println(antalKarakterer);
            System.out.println(samletKarakterer);
            double gennemsnit = (double)samletKarakterer/(double)antalKarakterer;
            System.out.println(pair.getKey() + ": " + antalKarakterer + " karakter" + ", " + "gennemsnit " + gennemsnit);
        }
    }
}
