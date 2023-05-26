package dictionaryelev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DictionarTest {
    Dictionary<Bil, Integer> dictionary;
   

    @BeforeEach
    public void setUp() throws Exception {
        // dictionary = new DictionaryHashMap<>();
        dictionary = new DictionaryLinked<>();
        
    }
    
    /*@Test
    public void test() {
        assertTrue(dictionary.isEmpty());
        assertEquals(0, dictionary.size());

        dictionary.put(8, "hans");
        dictionary.put(3, "viggo");
        
        assertFalse(dictionary.isEmpty());
        assertEquals(2, dictionary.size());

        assertEquals("hans", dictionary.get(8));

        dictionary.put(7, "bent");
        dictionary.put(2, "lene");
        
        assertFalse(dictionary.isEmpty());
        assertEquals(4, dictionary.size());
        
        assertEquals("viggo", dictionary.remove(3));

        assertEquals(3, dictionary.size());
        
        assertEquals("hans", dictionary.put(8, "Ida"));
        assertEquals("Ida", dictionary.get(8));

    }*/

    @Test
    public void testBilKey() {
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        Bil bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        Bil bil3 = new Bil("YD 83 201", "Peugeot", "203", "Grå");
        Bil bil4 = new Bil("OL 12 912", "Tesla", "Speedster", "Hvid");

        assertTrue(dictionary.isEmpty());
        assertEquals(0, dictionary.size());

        dictionary.put(bil1, 5);
        dictionary.put(bil2, 2);

        assertFalse(dictionary.isEmpty());
        assertEquals(2, dictionary.size());

        assertEquals(5, dictionary.get(bil1));

        dictionary.put(bil3, 1);
        dictionary.put(bil4, 7);

        assertFalse(dictionary.isEmpty());
        assertEquals(4, dictionary.size());

        assertEquals(2, dictionary.remove(bil2));

        assertEquals(3, dictionary.size());

        assertEquals(5, dictionary.put(bil1, 6));
        assertEquals(6, dictionary.get(bil1));
    }

    @Test
    public void getTest() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");

        //ACT
        dictionary.put(bil1, 2);

        //ASSERT
        assertEquals(2, dictionary.get(bil1));
    }

    @Test
    public void putTest() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");

        //ACT
        dictionary.put(bil1, 2);

        //ASSERT
        assertEquals(2, dictionary.get(bil1));
    }

    @Test
    public void putTest2() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        NullPointerException e = new NullPointerException();

        //ACT && ASSERT
        Exception forventet = assertThrows(NullPointerException.class, () -> {
            dictionary.put(bil1, null);
        });
        assertEquals(forventet.getMessage(), e.getMessage());
    }

    @Test
    public void sizeTest() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        Bil bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        //ACT
        dictionary.put(bil1, 2);

        //ASSERT
        assertEquals(1, dictionary.size());

        dictionary.put(bil2, 1);

        assertEquals(2, dictionary.size());
    }

    @Test
    public void removeTest1() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        NullPointerException e = new NullPointerException();

        //ACT && ASSERT
        Exception forventet = assertThrows(NullPointerException.class, () -> {
            dictionary.remove(bil1);
        });
        assertEquals(forventet.getMessage(), e.getMessage());
    }

    @Test
    public void removeTest2() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        Bil bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        //ACT
        dictionary.put(bil1, 2);
        dictionary.put(bil2, 5);

        //ASSERT
        assertEquals(2, dictionary.size());

        dictionary.remove(bil1);

        assertEquals(1, dictionary.size());

    }

    @Test
    public void removeTest3() {
        //ARRANGE
        Bil bil1 = new Bil("BT 78 821", "Audi", "A3", "Sort");
        Bil bil2 = new Bil("AB 13 567", "Opel", "O3", "Blå");
        Bil bil3 = new Bil("YD 83 201", "Peugeot", "203", "Grå");
        Bil bil4 = new Bil("OL 12 912", "Tesla", "Speedster", "Hvid");

        //ACT
        dictionary.put(bil1, 2);
        dictionary.put(bil2, 5);
        dictionary.put(bil3, 7);
        dictionary.put(bil4, 9);

        //ASSERT
        assertEquals(4, dictionary.size());

        dictionary.remove(bil1);

        assertEquals(3, dictionary.size());
    }
}
