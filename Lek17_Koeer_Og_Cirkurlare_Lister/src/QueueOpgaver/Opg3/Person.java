package QueueOpgaver.Opg3;

public class Person {
    private String navn;
    private int age;

    public Person(String navn, int age) {
        this.navn = navn;
        this.age = age;
    }

    public String getNavn() {
        return navn;
    }

    public int getAge() {
        return age;
    }
}