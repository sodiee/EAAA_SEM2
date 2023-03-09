package Opg2;

public class Counter {
    private static Counter uniqueInstance;
    private int value = 0;

    private Counter(){
    }

    public static Counter getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Counter();
        }
        return uniqueInstance;
    }

    public void count(){
        value++;
    }

    public void times2() {
        value = value * 2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
