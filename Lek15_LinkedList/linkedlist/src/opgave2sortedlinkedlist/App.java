package opgave2sortedlinkedlist;

import citylinkedlist.City;
import citylinkedlist.CityList;

public class App {
    public static void main(String[] args) {
        String a = "abe";
        String a1 = "and";
        String b = "bil";
        String b1 = "bus";
        String c = "cirkus";
        String c1 = "cykel";
        String d = "dej";
        String d1 = "du";
        String e = "elefant";
        String e1 = "ellers";

        SortedLinkedList list = new SortedLinkedList();
        list.addElement(a);
        list.addElement(d);
        list.addElement(c);
        list.addElement(e);
        list.addElement(b);

        SortedLinkedList list1 = new SortedLinkedList();
        list1.addElement(a1);
        list1.addElement(b1);
        list1.addElement(c1);
        list1.addElement(d1);
        list1.addElement(e1);

        System.out.println();
        list.udskrivElements();
        System.out.println(list.countElements());
/*
        list.removeLast();
        list.udskrivElements();
        System.out.println();
        list.removeElement("bil");
        list.udskrivElements(); */

        list.addAll(list1);
        list.udskrivElements();
        System.out.println(list.countElements());
        System.out.println(list.countElementsRecursive());
    }
}


