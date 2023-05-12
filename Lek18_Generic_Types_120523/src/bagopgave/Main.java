package bagopgave;

public class Main {
    public static void main(String[] args) {
        LinkedBag<Integer> linkedBag = new LinkedBag<>(5);
        linkedBag.add(4);
        linkedBag.add(5);
        linkedBag.add(3);
        linkedBag.remove();
        System.out.println(linkedBag.getCurrentSize());
    }
}
