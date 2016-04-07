package patterns;


public class Aa {
	public static void main(String[] args) {
		int a[] = { 1, 100, 25, 333, 4, 5, 62, 7, 8, 8, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] % 2 == 0) {
					if (a[i] % 2 == 0) {
						if (a[i] < a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					} else {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				} else if (a[j] % 2 != 0 && a[i] % 2 != 0) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
