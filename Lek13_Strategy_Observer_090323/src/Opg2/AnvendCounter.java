package Opg2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        System.out.println(counter.getValue());
        counter.count();
        System.out.println(counter.getValue());
        counter.times2();
        System.out.println(counter.getValue());
        counter.times2();
        System.out.println(counter.getValue());
        counter.times2();
        System.out.println(counter.getValue());
        counter.zero();
        System.out.println(counter.getValue());
    }
}
