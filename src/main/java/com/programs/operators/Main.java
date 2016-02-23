package com.programs.operators;

public class Main {
	public static void main(String[] args) {
		int y = 5;
		int x = ((5 - (y * 2)) > 0) ? y : (2 * y);
		System.out.println(x);
		short a = 5;
		short b = 5;
		a += a + b;
		System.out.println(a);
		b += a;
		System.out.println(b);
	}
}
