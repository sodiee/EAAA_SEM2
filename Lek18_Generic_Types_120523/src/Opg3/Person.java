package Opg3;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
    private T navn;

    public Person(T navn) {
        this.navn = navn;
    }

    public T getNavn() {
        return navn;
    }

    @Override
    public int compareTo(Person<T> o) {
        return this.getNavn().compareTo(o.getNavn());
    }

    @Override
    public String toString() {
        return "" + navn;
    }
}
