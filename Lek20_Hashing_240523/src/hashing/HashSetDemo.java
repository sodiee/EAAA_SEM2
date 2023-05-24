package hashing;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSetChaining names = new HashSetChaining(13);
		//HashSetLinearProbing names = new HashSetLinearProbing(13);

		names.add("Harry");
		names.add("Sue");
		names.add("Nina");
		names.add("Susannah");
		names.add("Larry");
		names.add("Eve");
		names.add("Sarah");
		names.add("Adam");
		names.add("Tony");
		names.add("Katherine");
		names.add("Juliet");
		names.add("Romeo");
		names.add("Peter");
		names.writeOut();
		System.out.println();

		System.out.println("size: " + names.size());
		System.out.println("contains romeo: " + names.contains("Romeo"));

		names.remove("Romeo");
		System.out.println("contains romeo: " + names.contains("Romeo"));
		System.out.println("contains george: " + names.contains("George"));
		names.remove("George");
		System.out.println("size: " + names.size());
		System.out.println();
		names.writeOut();
		System.out.println();
		System.out.println(names.size());
	}
}
