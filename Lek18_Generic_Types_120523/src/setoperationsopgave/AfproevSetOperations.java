package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class AfproevSetOperations {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		for (int i = 1; i <= 10; i++) {
			s1.add(i);
			s2.add(2 * i);
		}
		System.out.println("Mængde1:  " + s1);
		System.out.println("Mængde 2:  " + s2);
		System.out.println("Forening:  " + SetOperations.union(s1, s2));
		System.out.println("Differens: " + SetOperations.differens(s1, s2));
		System.out.println("Fælles:    " + SetOperations.intesection(s1, s2));

	}

}
