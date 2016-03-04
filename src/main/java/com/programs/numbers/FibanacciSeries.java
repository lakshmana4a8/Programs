package com.programs.numbers;

public class FibanacciSeries {
	public void fibanci(int n1, int n2) {
		int sum = 0;
		if (n1 == 0) {
			System.out.print(n1 + " " + n2+ " ");
		}
		sum = n1 + n2;
		if (sum <= 100) {
			System.out.print(sum+" ");
			n1 = n2;
			n2 = sum;
			fibanci(n1, n2);
		}
	}

	public static void main(String[] args) {
		FibanacciSeries fb = new FibanacciSeries();
		fb.fibanci(0, 1);
		int n1 = 0, n2 = 1;
		System.out.println();
		System.out.print(n1+" "+n2+" ");
		while (true) {
			int sum = n1 + n2;
			if (sum <= 100) {
				n1 = n2;
				n2 = sum;
				System.out.print(sum+" ");
			}else{
				break;
			}
		}
	}
}
