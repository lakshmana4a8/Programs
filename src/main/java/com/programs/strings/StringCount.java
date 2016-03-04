package com.programs.strings;

public class StringCount {
	public static void main(String[] args) {
		String str = "abcdcabcdacbdadbca";
		String findStr = "ab";
		int lastIndex = 0;
		int count = 0;
		while (lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}
		System.out.println(count);
		char[] aa = str.toCharArray();
		System.out.println(aa.length);
	}
}
