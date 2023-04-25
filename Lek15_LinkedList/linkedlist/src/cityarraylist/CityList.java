package cityarraylist;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * A linked list of cities
 */
public class CityList {
	private City[] cities;
	private int countCities;

	/**
	 * Constructs an empty array.
	 */
	public CityList() {
		cities = new City[10];
		countCities = 0;
	}

	/**
	 * Returns the first element in the array.
	 *
	 * @return the first element in the array
	 */
	public City getFirst() {
		if (countCities==0) {
			throw new NoSuchElementException();
		}
		return cities[0];
	}

	/**
	 * Removes the first element in the array.
	 *
	 * @return the removed element
	 */
	public City removeFirst() {
		if (countCities == 0) {
			throw new NoSuchElementException();
		}
		City element = cities[0];
		for (int i = 1; i < countCities; i++) {
			cities[i-1] = cities[i];
		}
		countCities--;
		cities[countCities] = null; // Help garbage collector 
		return element;
	}

	/**
	 * Adds an element to index 0 int the array.
	 *
	 * @param element
	 *            the element to add
	 */
	public void addFirst(City element) {
		if (countCities == cities.length) {
			throw new RuntimeException("Listen er fyldt op");
		}
		for (int i = countCities; i>0; i--) {
			cities[i] = cities[i-1];
		}
		cities[0] = element;
		countCities++;
		
	}

	/**
	 * Returns the number af cities in the list
	 *
	 */
	public int countCities() {
		return countCities;

	}

	public void removeCity(City city) {
		boolean found = false;
		int i = 0;
		while (!found && i<countCities) {
			if (cities[i].equals(city)) {
				found = true;
			}
			else {
				i++;
			}
		}
		if (found) {
			while (i<countCities-1) {
				cities[i] = cities[i+1];
				i++;
			}
			
			countCities--;
			cities[countCities] = null;
		}
	}

	
}
