package Opg3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private static PersonAdministrator uniqueInstance;
    private Set<Person> personer;

    private PersonAdministrator(){
        this.personer = new HashSet<>();
    }

    public static PersonAdministrator getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PersonAdministrator();
        }
        return uniqueInstance;
    }

    public void addPerson(Person person) {
        personer.add(person);
    }

    public void remove(Person person) {
        personer.remove(person);
    }

    public Set<Person> getPersoner() {
        return personer;
    }
}
