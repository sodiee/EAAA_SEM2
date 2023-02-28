package model_LinkedList;

import model_Set.Skole;
import model_Set.Studerende;

public class Main {
    public static void main(String[] args) {
        Skole skole = new Skole("EAAA");
        Studerende studerende = new Studerende(1, "Lucas");
        skole.addStuderende(studerende);
        studerende.addKarakter(7);
        studerende.addKarakter(4);
        studerende.addKarakter(10);
        Studerende studerende1 = new Studerende(2, "Kamilla");
        skole.addStuderende(studerende1);
        studerende1.addKarakter(10);
        studerende1.addKarakter(7);
        studerende1.addKarakter(12);
        Studerende studerende2 = new Studerende(3, "Mikkel");
        skole.addStuderende(studerende2);
        studerende2.addKarakter(12);
        studerende2.addKarakter(12);
        studerende2.addKarakter(12);

        System.out.println(skole.findStuderende(1));
        System.out.println(skole.gennemsnit());
    }
}
