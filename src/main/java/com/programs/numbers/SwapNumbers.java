package com.programs.numbers;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping number a is "+a);
		System.out.println("before swapping number b is "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\n");
		System.out.println("after swapping number a is "+a);
		System.out.println("after swapping number b is "+b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("\n");
		System.out.println("after swapping number a is "+a);
		System.out.println("after swapping number b is "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("\n");
		System.out.println("after swapping number a is "+a);
		System.out.println("after swapping number b is "+b);
	}
}
