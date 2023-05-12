package bagopgave;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedBagTest {
    private LinkedBag<String> bag;

    @Before
    public void setUp() {
        bag = new LinkedBag<>(10);
        bag.add("Jan");
        bag.add("Per");
        bag.add("Hans");
    }

    @Test
    public void testGetCurrentSize()
    {
        assertEquals(3, bag.getCurrentSize());
        bag.add("Lis");
        assertEquals(4, bag.getCurrentSize());
    }


    @Test
    public void testIsFull()
    {
        bag.clear();
        assertTrue(bag.isEmpty());
        assertFalse(bag.isFull());
        for (int i = 0; i < 22; i++) {
            bag.add("ny " + 1);
        }
        assertTrue(bag.isFull());
    }

    @Test
    public void testIsEmpty()
    {
        assertFalse(bag.isEmpty());
        bag.clear();
        assertTrue(bag.isEmpty());
    }

    @Test
    public void testAdd()
    {
        assertFalse(bag.contains("Lis"));
        bag.add("Lis");
        assertTrue(bag.contains("Lis"));
    }

    @Test
    public void testRemove()
    {
        Object s = bag.remove();
        assertFalse(bag.contains(s));
        assertEquals(2, bag.getCurrentSize());
    }

    @Test
    public void testRemoveT()
    {
        assertTrue(bag.contains("Per"));
        bag.remove("Per");
        assertFalse(bag.contains("Per"));
        assertEquals(2, bag.getCurrentSize());
    }

    @Test
    public void testClear()
    {
        bag.clear();
        assertEquals(0, bag.getCurrentSize());
        assertTrue(bag.isEmpty());
    }

    @Test
    public void testGetFrequencyOf()
    {
        assertEquals(1, bag.getFrequencyOf("Per"));
        bag.add("Per");
        assertEquals(2, bag.getFrequencyOf("Per"));
    }

    @Test
    public void testContains()
    {
        assertTrue(bag.contains("Per"));
        assertFalse(bag.contains("Pia"));
    }

    @Test
    public void testToArray()
    {
        Object[] arr = bag.toArray();
        assertEquals(3, arr.length);
    }

}
