package com.programs.strings;

public class SortingString {
	public static void main(String[] args) {
		String original = "seeeeeeeeeedcbaeda";
		int j = 0;
		char temp = 0;
		char[] chars = original.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (j = 0; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		String val = String.valueOf(chars);
		System.out.println(val);
	}
}
