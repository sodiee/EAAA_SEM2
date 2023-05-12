package QueueOpgaver.dequee;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI {


    Object[] arr;
    private int first;
    private int last;
    private int currentSize;

    public CircularArrayDeque(int size) {
        arr = new Object[size];
        first = 0;
        last = 0;
        currentSize = 0;
    }

    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        currentSize++;
        if (first == 0) {
            arr[first] = element;
            arr[last] = element;
            first = (first + 1) % arr.length;
            last = (last + 1) % arr.length;
        } else {

            arr[first + 1] = arr[first];
            arr[last] = arr[first - 1];
            arr[first] = element;
            first = (first + 1) % arr.length;
        }
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        currentSize++;
        arr[last] = element;
        last = (last + 1) % arr.length;
    }

    @Override
    public Object removeFirst() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        Object deleted = arr[first];
        first = (first + 1) % arr.length;
        currentSize--;
        return deleted;
    }

    @Override
    public Object removeLast() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        Object deleted = arr[last];
        last = (last + 1) % arr.length;
        currentSize--;
        return deleted;
    }

    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public Object getLast() {
        return last;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void udskrivElements() {
        int current = 0;
        while (current != currentSize) {
            System.out.println(arr[current]);
            current++;
        }
    }

    /**
     * Grows the element array if the current size equals the capacity.
     */
    private void growIfNecessary()
    {
        if (currentSize == arr.length)
        {
            Object[] newElements = new Object[2 * arr.length];
            for (int i = 0; i < arr.length; i++)
            {
                newElements[i] = arr[(first + i) % arr.length];
            }
            arr = newElements;
            first = 0;
            last = currentSize;
        }
    }
}
