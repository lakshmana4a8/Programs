package com.programs.numbers;

public class FibanacciSeries {
	public void fibanci(int n1, int n2) {
		int sum = 0;
		if (n1 == 0) {
			System.out.println(n1 + "\n" + n2);
		}
		sum = n1 + n2;
		if (sum <= 100) {
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			fibanci(n1, n2);
		}
	}

	public static void main(String[] args) {
		FibanacciSeries fb = new FibanacciSeries();
		fb.fibanci(0, 1);
		int n1 = 0, n2 = 1;
		for (int i = 0; i <= 100; i++) {
			int sum = n1 + n2;
			if (sum <= 100) {
				n1 = n2;
				n2 = sum;
				System.out.println(sum);
			}
		}
	}
}
