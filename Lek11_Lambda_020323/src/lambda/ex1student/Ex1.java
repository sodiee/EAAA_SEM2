package lambda.ex1student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Bent", 25), new Person("Susan", 34),
                new Person("Mikael", 60), new Person("Klaus", 44),
                new Person("Birgitte", 17), new Person("Liselotte", 9));
        List<Person> persons = new ArrayList<Person>(list);
        System.out.println(persons);
        System.out.println();


//		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
        System.out.println("1a, personer i listen med alderen 44: " + findFirst(persons, p -> p.getAge() == 44));
        System.out.println("1b, Starter med 'S': " + findFirst(persons, p -> p.getName().startsWith("S")));
        System.out.println("1c, første person i lsiten hvis navn indebærer et 'i': " + findFirst(persons, p -> p.getName().chars().filter(ch -> ch == 'i').count() > 1));
        System.out.println("1d, første person i listen med en alder, som er lig med længden på deres navn: " + findFirst(persons, p -> p.getName().length() == p.getAge()));
        System.out.println("1e," + findAll(persons, p -> p.getAge() < 30));
        System.out.println("1f, alle personer hvis navn indeholder et 'i': " + findAll(persons, p -> p.getName().contains("i")));
        System.out.println("1g, alle personer med et navn der starter med 'S': " + findAll(persons, p -> p.getName().startsWith("S")));
        System.out.println("1h, alle personer der har et navn med længde 5" + findAll(persons, p -> p.getName().length() == 5));
        System.out.println("1i, alle personer der har et navn med længde 6 og en alder under 40: " + findAll(persons, p -> p.getName().length() >= 6 && p.getAge() < 40));
    }


    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}
