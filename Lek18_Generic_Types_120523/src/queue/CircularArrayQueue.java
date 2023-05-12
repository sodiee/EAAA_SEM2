package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayQueue<E> implements QueueI {
	private E[] elements;
	private int currentSize;
	private int head;
	private int tail;

	/**
	 * Constructs an empty queue.
	 */
	public CircularArrayQueue() {
		final int INITIAL_SIZE = 5;
		elements = (E[]) new Object[INITIAL_SIZE];
		currentSize = 0;
		head = 0;
		tail = 0;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public void enqueue(Object newElement) {
		growIfNecessary();
		currentSize++;
		elements[tail] = (E) newElement;
		tail = (tail + 1) % elements.length;
	}


	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public E dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		E removed = elements[head];
		head = (head + 1) % elements.length;
		currentSize--;
		return removed;
	}

	/**
	 * Grows the element array if the current size equals the capacity.
	 */
	private void growIfNecessary() {
		if (currentSize == elements.length) {
			Object[] newElements = new Object[2 * elements.length];
			for (int i = 0; i < elements.length; i++) {
				newElements[i] = elements[(head + i) % elements.length];
			}
			elements = (E[]) newElements;
			head = 0;
			tail = currentSize;
		}
	}

	@Override
	public Object getFront() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		return elements[head];
	}

	@Override
	public int size() {
		return currentSize;
	}
}
