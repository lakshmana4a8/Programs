package com.programs.strings;

public class StringReverse {
	public static void main(String[] args) {
		String val = "lakshman";
		String temp = "";
		for (int i = (val.length() - 1); i >= 0; i--) {
			temp += val.charAt(i);
		}
		System.out.println(temp);
		int left = 0;
		int right = temp.length() - 1;
		char[] temparray = temp.toCharArray();
		for (left = 0; left < right; left++, right--) {
			char character = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = character;
		}
		for (char chars : temparray) {
			System.out.println(chars);
		}
		System.out.println(reverseRecursively(val));
	}

	public static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}
}
