package genericseksempel;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Object> navne = new ArrayList<Object>();
		navne.add("Kurt");
		navne.add("Henning");
		navne.add(4);

		String s = "";

		// for (Object o : navne) {
		// s = s + ((String) o).charAt(0);
		// }
		// System.out.println(s);

		List<String> navneListe = new ArrayList<String>();
		navneListe.add("Kurt");
		navneListe.add("Viggo");
		navneListe.add("Mads");
		// navneListe.add(4);

		s = "";

		// for (String o : navneListe) {
		// s = s + o.charAt(0);
		// }
		// System.out.println(s);

		List<Ansat> ansatte = new ArrayList<Ansat>();
		ansatte.add(new Ansat("Hans", 220));
		ansatte.add(new Ansat("Anders", 230));

		List<Mekaniker> mekanikerer = new ArrayList<Mekaniker>();
		mekanikerer.add(new Mekaniker("Mads", 250, "1997"));
		mekanikerer.add(new Mekaniker("Keld", 255, "1996"));

		// ansatte.addAll(mekanikerer);
		// ansatte.addAll(navneListe);

		Ansat a = new Ansat("", 2);
		Mekaniker m = new Mekaniker("", 3, "");
		// a = m; // må jeg
		// m = a; // må jeg

		ansatte.clear();
		ansatte.add(new Ansat("Hans", 220));
		ansatte.add(new Ansat("Anders", 230));
		// ansatte = mekanikerer; //må jeg dette
		// print1(ansatte);
		// print1(mekanikerer);
		// print2(ansatte);
		// print2(mekanikerer);
		// print3(ansatte);
		// print3(mekanikerer);
		// print4(ansatte);
		// print4(mekanikerer);
		// print5(ansatte);
		// print5(mekanikerer);

		System.out.println(max1("Ib", "Ulla", "Per"));
		System.out.println(max1(2, 7, 4));
		// System.out.println(max1(1.1, 2, 3.0));
		// System.out.println(max1("Ib", 4, "Ulla"));

		System.out.println(max2("Ib", "Ulla", "Per"));
		System.out.println(max2(2, 7, 4));
		// System.out.println(max2(1.1, 2, 3.0));
		// System.out.println(max2("Ib", 4, "Ulla"));

		// List<String> navneListe = new ArrayList<String>();
		// navneListe.add("Kurt");
		// navneListe.add("Viggo");
		// navneListe.add("Mads");
		//
		List<Integer> talliste = new ArrayList<Integer>();
		talliste.add(1);
		talliste.add(2);

		// System.out.println(talliste.getClass() == navneListe.getClass());

	}

	public static void print1(List<Ansat> list) {
		for (Ansat a : list) {
			System.out.println(a.getNavn() + " " + a.getTimeloen());
		}
	}

	public static void print2(List<Mekaniker> list) {
		for (Ansat a : list) {
			System.out.println(a.getNavn() + " " + a.getTimeloen());
		}
	}

	public static void print3(List<Object> list) {
		for (Object o : list) {
			Ansat a = (Ansat) o;
			System.out.println(a.getNavn() + " " + a.getTimeloen());
		}
	}

	public static void print4(List<? extends Ansat> list) {
		for (Ansat a : list) {
			System.out.println(a.getNavn() + " " + a.getTimeloen());
		}
	}

	public static void print5(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static Comparable max1(Comparable x, Comparable y, Comparable z) {
		Comparable result = x;
		if (y.compareTo(result) > 0) {
			result = y;
		}
		if (z.compareTo(result) > 0) {
			result = z;
		}
		return result;
	}

	public static <T extends Comparable<T>> T max2(T x, T y, T z) {
		T result = x;
		if (y.compareTo(result) > 0) {
			result = y;
		}
		if (z.compareTo(result) > 0) {
			result = z;
		}
		return result;
	}

}
