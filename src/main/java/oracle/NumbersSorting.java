package oracle;

import java.util.ArrayList;
import java.util.List;

public class NumbersSorting {
	public static void main(String[] args) {
		/**
		 * sort list of integers as below
		 * [20, 3, 15, 5, 10, 6, 10, 7, 9, 8] 1st big, 1st small, 2nd big, 2nd small, 3rd big, 3rd small
		 */
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10); integers.add(5);
		integers.add(15); integers.add(4);
		integers.add(10); integers.add(8);
		integers.add(12); integers.add(2);
		integers.add(8); integers.add(7);
		integers.add(7); integers.add(7);
		System.out.println(integers);
		for (int i = 0; i < integers.size(); i++) {
			for (int j = i + 1; j < integers.size(); j++) {
				int num = integers.get(i);
				if (i % 2 == 0) {
					if (num < integers.get(j)) {
						integers.set(i, integers.get(j));
						integers.set(j, num);
					}
				} else {
					if (num > integers.get(j)) {
						integers.set(i, integers.get(j));
						integers.set(j, num);
					}
				}
			}
		}
		System.out.println(integers);
	}
}