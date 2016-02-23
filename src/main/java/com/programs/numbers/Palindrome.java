package com.programs.numbers;

public class Palindrome {
	public static void main(String[] args) {
		int a = 15351;
		int temp = a;
		int rev = 0;
		while(a != 0){
			rev = (rev * 10) + a%10;
			a = a/10;
		}
		if(rev == temp){
			System.out.println(rev+" is palindrome number");
		}else{
			System.out.println("not palindrome");
		}
	}
}
