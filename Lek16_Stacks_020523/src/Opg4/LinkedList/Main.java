package Opg4.LinkedList;

public class Main {
    public static void main(String[] args) {
        DropoutLinkedList doll = new DropoutLinkedList();
        doll.push(1);
        doll.push(2);
        doll.push(3);
        doll.push(4);
        doll.push(5);
        doll.udskrivElements();
        System.out.println();
        doll.push(6);
        doll.udskrivElements();

        doll.push(7);
        System.out.println();
        doll.udskrivElements();
    }
}
