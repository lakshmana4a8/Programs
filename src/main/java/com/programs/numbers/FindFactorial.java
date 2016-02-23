package com.programs.numbers;

public class FindFactorial {
	public static void main(String[] args) {
		int num = 4;
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = (i * sum);
		}
		System.out.println("factorial is " + sum);
		int tot = findFactorial(num);
		System.out.println("factorial is " + tot);
	}

	private static int findFactorial(int num) {
		if (num == 0 || num == 1)
			return 1;
		return findFactorial(num - 1) * num;
	}
}
