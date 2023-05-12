package QueueOpgaver.dequee;

import QueueOpgaver.bryghus.Produkt;
import QueueOpgaver.bryghus.Salg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayDequeTest {

    private DequeI queue = new CircularArrayDeque(5);

    private int i = 1;
    private int j = 2;
    private int k = 3;
    private int h = 4;
    private int f = 5;
    private int d = 6;

    @Test
    void addFirst() {
        //Act      //Arrange
        queue.addFirst(i);

        //Assert
        assertTrue(queue.getFirst().equals(i));
    }

    @Test
    void addLast() {
        //Act & Arrange
        queue.addLast(i);
        queue.addLast(d);

        //Assert
        assertEquals(2, queue.getLast());
    }

    @Test
    void removeFirst() {
        //Act && arrange
        queue.addFirst(i);
        queue.addFirst(j);

        //Assert
        assertFalse(queue.isEmpty());
        assertEquals(j, queue.getFirst());
    }

    @Test
    void removeLast() {
        //Act && arrange
        queue.addFirst(i);
        queue.addFirst(j);
        queue.removeLast();


        //Assert
        assertEquals(j, queue.getFirst());
    }

    @Test
    void getFirst() {
        //act arrance
        queue.addFirst(i);

        //assert
        assertEquals(i, queue.getFirst());
    }

    @Test
    void getLast() {
        queue.addFirst(i);
        queue.addFirst(j);

        assertEquals(i, queue.getLast());
    }

    @Test
    void size() {
        assertEquals(0, queue.size());

        queue.addFirst(i);
        assertEquals(1, queue.size());

        queue.addFirst(j);
        assertEquals(2, queue.size());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
        queue.addFirst(i);
        assertFalse(queue.isEmpty());

    }
}