package com.programs.numbers;

import java.io.IOException;

public class FindPrime {
	public static void main(String[] args) throws IOException {
		int num = 22;
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num - ((num / i) * i) == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}
}
