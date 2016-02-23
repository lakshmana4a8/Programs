package miscillineous;

import java.util.Arrays;
import java.util.Comparator;

public class Questions {
	public static void main(String[] args) {
		String[] s = { "map", "pen", "marble", "key" };
		System.out.println(Arrays.binarySearch(s, "key"));
		Othello o = new Othello();
		Arrays.sort(s, o);
		for (String s2 : s)
			System.out.print(s2 + " ");
		System.out.println(Arrays.binarySearch(s, "key",o));
	}

	static class Othello implements Comparator<String> {
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	}
}