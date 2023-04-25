package personcollection;

import java.util.Iterator;

public class PersonCollection implements Iterable<Person> {
    // array to store the persons in;
    // persons have indices in [0, size-1]
    private Person[] persons;
    // number of entries in the list;
    // index of the first empty slot in items
    private int size;


    /**
     * Creates an Collection with capacity 16.
     */
    public PersonCollection() {
        this(16);
    }

    /**
     * Creates an Collection. Requires: capacity >= 1.
     */
    public PersonCollection(int capacity) {

        Person[] temp = new Person[capacity];
        this.persons = temp;
        this.size = 0;
    }

    /**
     * Adds the entry at the end of this list.
     */
    public void add(Person person) {
        if (this.size == this.persons.length) {
            throw new RuntimeException("Collection is full");
        }

        this.persons[this.size] = person;
        this.size++;
    }

    /**
     * Adds the person at the index. Throws IndexOutOfBoundsException if index is
     * not in [0, size()].
     */
    public void add(int index, Person person) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = this.size; i > index; i--) {
            this.persons[i] = this.persons[i - 1];
        }
        this.persons[index] = person;
        this.size++;

    }

    /**
     * Removes and returns the person at the index. Throws IndexOutOfBoundsException
     * if this list is empty or index is not in [0, size()-1].
     */
    public Person remove(int index) {
        if (index < 0 || index > this.size - 1 /* || size == 0 */) {
            throw new IndexOutOfBoundsException();
        }

        Person person = this.persons[index];
        for (int i = index; i < this.size - 1; i++) {
            this.persons[i] = this.persons[i + 1];
        }
        this.persons[this.size - 1] = null;
        this.size--;
        return person;
    }

    /**
     * Returns the person at the index. Throws IndexOutOfBoundsException if this
     * list is empty or index is not in [0, size()-1].
     */
    public Person get(int index) {
        if (index < 0 || index > this.size - 1 /* || this.size == 0 */) {
            throw new IndexOutOfBoundsException();
        }

        Person person = this.persons[index];
        return person;
    }

    /**
     * Return true if the entry is in this list.
     */
    public boolean contains(Person person) {
        boolean found = false;
        int i = 0;
        while (!found && i < this.size) {
            if (this.persons[i].equals(person)) {
                found = true;
            }
            i++;
        }
        return found;
    }

    /**
     * Returns the number of entries in this list.
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns true if this list is empty.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Removes all entries from this list.
     */
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.persons[i] = null;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("[]");
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(", " + this.persons[i]);
        }
        sb.append("]");
        sb.delete(1, 3);
        return sb.toString();
    }


    @Override
    public Iterator<Person> iterator() {
        return new PersonCollectionIterator();
    }


    // -------------------------------------------------------------------------
    // Ex. 2

    class PersonCollectionIterator implements Iterator<Person> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            if (position >= persons.length || persons[position] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Person next() {
            Person person = persons[position];
            position = position + 1;
            return person;
        }
    }

}
