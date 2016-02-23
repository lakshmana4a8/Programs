package com.programs.numbers;

public class FindEvenOrOdd {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		if(a%2 == 0){
			System.out.println(a+" is even number");
		}else{
			System.out.println(a+" is odd number");
		}
		if(b%2 == 0){
			System.out.println(b+" is even number");
		}else{
			System.out.println(b+" is odd number");
		}
		if((a & 1) == 0){
			System.out.println(a+" is even number");
		}else{
			System.out.println(a+" is odd number");
		}
		if((b & 1) == 0){
			System.out.println(b+" is odd number");
		}else{
			System.out.println(b+" is odd number");
		}
		if(((a >> 1)<<1) == a){
			System.out.println(a+" is even number");
		}else{
			System.out.println(a+" is odd number");
		}
		if(((b >> 1)<<1) == b){
			System.out.println(b+" is odd number");
		}else{
			System.out.println(b+" is odd number");
		}
	}
}
