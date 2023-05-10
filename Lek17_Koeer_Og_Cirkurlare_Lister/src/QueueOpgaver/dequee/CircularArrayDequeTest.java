package QueueOpgaver.dequee;

import QueueOpgaver.bryghus.Produkt;
import QueueOpgaver.bryghus.Salg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayDequeTest {

    private DequeI queue;

    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setUp() throws Exception {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.queue = new CircularArrayDeque();

        Produkt kloster = new Produkt("Klosterbryg");
        Produkt sweet = new Produkt("Sweet Georgia Brown");
        Produkt extra = new Produkt("Extra Pilsner");
        Produkt classic = new Produkt("Classic Jazz");
        Produkt klippekort10 = new Produkt("Klippekort 10 klip");
        Produkt klippekort6 = new Produkt("Klippekort 6 klip");

        this.salg1 = new Salg(1);
        this.salg1.createSalgsLinje(kloster, 2, 40);

        this.salg2 = new Salg(2);
        this.salg2.createSalgsLinje(sweet, 3, 60);

        this.salg3 = new Salg(3);
        this.salg3.createSalgsLinje(extra, 2, 40);

        this.salg4 = new Salg(4);
        this.salg4.createSalgsLinje(classic, 3, 60);

        this.salg5 = new Salg(5);
        this.salg5.createSalgsLinje(klippekort10, 1, 160);

        this.salg6 = new Salg(6);
        this.salg6.createSalgsLinje(klippekort6, 2, 200);
    }

    @Test
    void addFirst() {
        //Act      //Arrange
        queue.addFirst(salg1);

        //Assert
        assertEquals(this.salg1, queue.getFirst());
    }

    @Test
    void addLast() {
        //Act & Arrange
        queue.addLast(salg6);

        //Assert
        assertEquals(this.salg6, queue.getLast());
    }

    @Test
    void removeFirst() {
        //Act && arrange
        queue.addFirst(salg1);
        queue.addFirst(salg2);
        queue.removeFirst();


        //Assert
        assertEquals(salg1, queue.getFirst());
    }

    @Test
    void removeLast() {
        //Act && arrange
        queue.addFirst(salg1);
        queue.addFirst(salg2);
        queue.removeLast();


        //Assert
        assertEquals(salg2, queue.getFirst());
    }

    @Test
    void getFirst() {
        //act arrance
        queue.addFirst(salg1);

        //assert
        assertEquals(salg1, queue.getFirst());
    }

    @Test
    void getLast() {
        queue.addFirst(salg1);
        queue.addFirst(salg2);

        assertEquals(salg1, queue.getLast());
    }

    @Test
    void size() {
        assertEquals(0, queue.size());

        queue.addFirst(salg1);
        assertEquals(1, queue.size());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
        queue.addFirst(salg1);
        assertFalse(queue.isEmpty());

    }
}