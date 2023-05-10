package QueueOpgaver.Opg3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularCannibalMealTest {

    CircularCannibalMeal circularCannibalMeal;
    Person person1;
    Person person2;
    Person person3;

    @BeforeEach
    void setUp() {
        circularCannibalMeal = new CircularCannibalMeal();
        person1 = new Person("Mathias", 22);
        person2 = new Person("Hans", 19);
        person3 = new Person("Karen", 23);
    }

    @Test
    void addPersoner() {
        //Act && arrange
        circularCannibalMeal.addPersoner(person1);
        circularCannibalMeal.addPersoner(person2);
        circularCannibalMeal.addPersoner(person3);

        //assert
        assertEquals(person3, circularCannibalMeal.getFirst());
    }

    @Test
    void eatRandomPerson() {
        //Act && arrange
        circularCannibalMeal.eatRandomPerson();

        //assert
    }

    @Test
    void eatNextPerson() {
    }

    @Test
    void printPersons() {
    }
}