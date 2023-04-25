package opgave3sortedlinkelistdouble;

import opgave2sortedlinkedlist.SortedLinkedList;

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

        SortedLinkedListDouble list = new SortedLinkedListDouble();
        list.addElement(a);
        list.addElement(d);
        list.addElement(c);
        list.addElement(e);
        list.addElement(b);

        list.udskrivElements();

        list.removeElement("elefant");
        System.out.println();
        list.udskrivElements();
        System.out.println();

        list.removeElement("abe");
        System.out.println();
        list.udskrivElements();
        System.out.println();


        list.printPointers();
        System.out.println(list.countElements());

        list.udskrivBagfra();

    }
}
