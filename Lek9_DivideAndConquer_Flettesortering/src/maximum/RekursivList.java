package maximum;

import java.util.ArrayList;
import java.util.List;

public class RekursivList {

	public int max(ArrayList<Integer> list) {

		return maximum(list, 0, list.size() - 1);
	}

	private int maximum(ArrayList<Integer> list, int l, int h) {
		if (l == h) {
			return list.get(l);
		} else {
			int m = (l + h) / 2;
			int max1 = maximum(list, l, m);
			int max2 = maximum(list, m + 1, h);
			if (max1 > max2) {
				return max1;
			} else {
				return max2;
			}
		}
	}
}
