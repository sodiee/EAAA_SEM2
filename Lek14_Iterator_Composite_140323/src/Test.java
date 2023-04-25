import personcollection.Person;
import personcollection.PersonCollection;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        PersonCollection personCollection = new PersonCollection();
        Person person = new Person("Mikkel");
        Person person1 = new Person("Kamilla");
        Person person2 = new Person("Lucas");
        Person person3 = new Person("Mig");
        personCollection.add(person);
        personCollection.add(person1);
        personCollection.add(person2);
        personCollection.add(person3);
        Iterator<Person> iterator = personCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
