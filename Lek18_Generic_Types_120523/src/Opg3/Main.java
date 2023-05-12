package Opg3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Navn navn1 = new Navn("Mathias ", "Sode");
        Navn navn2 = new Navn("Celina ", "Kristensen");
        Navn navn3 = new Navn("Laurits ", "Sode");
        Navn navn4 = new Navn("Laurits ", "Gotfred");
        Navn navn5 = new Navn("Mathias ", "Soode");

        ArrayList<Person<Navn>> personArrayList = new ArrayList<>();
        Person<Navn> person1 = new Person<>(navn1);
        personArrayList.add(person1);
        Person<Navn> person2 = new Person<>(navn2);
        personArrayList.add(person2);
        Person<Navn> person3 = new Person<>(navn3);
        personArrayList.add(person3);
        Person<Navn> person4 = new Person<>(navn4);
        personArrayList.add(person4);
        Person<Navn> person5 = new Person<>(navn5);
        personArrayList.add(person5);

        System.out.println(personArrayList);
        System.out.println();
        Collections.sort(personArrayList);
        System.out.println(personArrayList);
    }
}
