package hashing;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
    private Object[] buckets;
    private int currentSize;

    private static final String DELETED = "DELETED";

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSetLinearProbing(int bucketsLength) {
        buckets = new Object[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = hashValue(x);
        boolean found = false;
        int temp = 0;

        while (!found) {
            if (buckets[h] == x) {
                found = true;
            } else {
                h++;
                temp++;
                if (h == buckets.length) {
                    h = h % buckets.length + 1;
                } else if (temp == buckets.length - 1) {
                    break;
                }
            }
        }

        return found;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        int h = hashValue(x);
        boolean placed = false;

        if (currentSize == buckets.length) {
            rehash();
        }

        while (!placed) {
            if (buckets[h] == null) {
                buckets[h] = x;
                placed = true;
                currentSize++;
            } else {
                for (int i = 1; i < buckets.length; i++) {
                    if (buckets[h + i] == null) {
                        buckets[h + i] = x;
                        currentSize++;
                        placed = true;
                        break;
                    } else if ((h + i) == buckets.length - 1) {
                        h = (h + i) % (buckets.length - 1);
                        i = -1;
                    }
                }
            }
        }

        return placed;
    }

    private void rehash() {
        int size = currentSize;
        currentSize = 0;
        Object[] newBuckets = new Object[buckets.length * 2];
        Object[] prevBuckets = buckets;

        this.buckets = newBuckets;

        for (int i = 0; i < size; i++) {
            add(prevBuckets[i]);
        }
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false if x was not an
     * element of this set
     */
    public boolean remove(Object x) {
        int h = hashValue(x);
        boolean removed = false;
        int i = 1;
        if (buckets[h] == x) {
            buckets[h] = DELETED;
            currentSize--;
        } else if (contains(x)) {
            while (!removed) {
                if (buckets[h + i] == x) {
                    buckets[h + i] = DELETED;
                    currentSize--;
                    removed = true;
                } else {
                    i++;
                    if ((h + i) == buckets.length - 1) {
                        i = 1;
                        h = 0;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    private int hashValue(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;
        return h;
    }

    // method only for test purpose
    public void writeOut() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println(i + "\t" + buckets[i]);
        }
    }

}
