package QueueOpgaver.deque;

public class Main {
    public static void main(String[] args) {
        CircularArrayDeque circularArrayDeque = new CircularArrayDeque();
        int i = 1;
        int j = 2;
        int k = 3;
        circularArrayDeque.addFirst(i);
        circularArrayDeque.addFirst(j);
        circularArrayDeque.addFirst(k);
        System.out.println("last: " + circularArrayDeque.getLast());
        circularArrayDeque.removeLast();
        System.out.println("last: " + circularArrayDeque.getLast());

        /*int h = 4;
        int f = 5;
        circularArrayDeque.addLast(h);
        circularArrayDeque.addLast(f);
        System.out.println();
        circularArrayDeque.udskrivElements();

         */
    }
}
