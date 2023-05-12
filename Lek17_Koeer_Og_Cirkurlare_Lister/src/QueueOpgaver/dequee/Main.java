package QueueOpgaver.dequee;

public class Main {
    public static void main(String[] args) {
        CircularArrayDeque circularArrayDeque = new CircularArrayDeque(5);
        int i = 1;
        int j = 2;
        int k = 3;
        circularArrayDeque.addFirst(i);
        circularArrayDeque.addFirst(j);
        circularArrayDeque.addFirst(k);
        circularArrayDeque.addFirst(4);
        circularArrayDeque.addFirst(5);
        circularArrayDeque.udskrivElements();
        System.out.println("first:" + circularArrayDeque.getFirst());
        System.out.println("last:" + circularArrayDeque.getLast());

        /*int h = 4;
        int f = 5;
        circularArrayDeque.addLast(h);
        circularArrayDeque.addLast(f);
        System.out.println();
        circularArrayDeque.udskrivElements();

         */
    }
}
