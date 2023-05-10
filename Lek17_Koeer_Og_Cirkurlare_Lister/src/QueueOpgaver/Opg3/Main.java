package QueueOpgaver.Opg3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mathias", 22);
        Person person1 = new Person("Silas", 22);
        Person person2 = new Person("Jacob", 22);
        Person person3 = new Person("Lucas", 24);
        CircularCannibalMeal circularCannibalMeal = new CircularCannibalMeal();

        circularCannibalMeal.addPersoner(person);
        circularCannibalMeal.addPersoner(person1);
        circularCannibalMeal.addPersoner(person2);
        circularCannibalMeal.addPersoner(person3);
        circularCannibalMeal.printPersons();

        System.out.println();
        System.out.println("Spist: " + circularCannibalMeal.eatRandomPerson());
        System.out.println();
        circularCannibalMeal.printPersons();

        System.out.println();
        System.out.println("Spist: " + circularCannibalMeal.eatNextPerson(3));
        System.out.println();
        circularCannibalMeal.printPersons();

    }
}
