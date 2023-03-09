package Opg3;

public class Person {
    private String navn;
    private int alder;
    private boolean dreng;

    public Person(String navn, int alder, boolean dreng) {
        this.navn = navn;
        this.alder = alder;
        this.dreng = dreng;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", alder=" + alder +
                ", dreng=" + dreng +
                '}';
    }
}
