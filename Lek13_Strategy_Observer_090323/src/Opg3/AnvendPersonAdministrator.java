package Opg3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        Person person = new Person("Lucas", 24, true);
        Person person1 = new Person("Mikkel", 27, true);
        Person person2 = new Person("Kamilla", 28, false);
        Person person3 = new Person("Mathias", 22, true);
        PersonAdministrator personAdministrator = PersonAdministrator.getInstance();

        personAdministrator.addPerson(person);
        personAdministrator.addPerson(person1);
        personAdministrator.addPerson(person2);
        personAdministrator.addPerson(person3);
        System.out.println(personAdministrator.getPersoner());
        personAdministrator.remove(person);
        System.out.println(personAdministrator.getPersoner());
    }
}
