package com.programs.strings;

public class LongestPalindrome {
	public static void main(String[] args) {
		System.out.println("aaaaaa : "+longestPalindrome1("assddfkfddssgssddffddss"));
	}
	public static String longestPalindrome1(String s) {
		 
		int maxPalinLength = 0;
		String longestPalindrome = null;
		int length = s.length();
	 
		// check all possible sub strings
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int len = j - i;
				String curr = s.substring(i, j + 1);
				if (isPalindrome(curr)) {
					if (len > maxPalinLength) {
						longestPalindrome = curr;
						maxPalinLength = len;
					}
				}
			}
		}
	 
		return longestPalindrome;
	}
	 
	public static boolean isPalindrome(String s) {
		@SuppressWarnings("unused")
		String str = reverseStrig(s);
		return new StringBuilder(s).reverse().toString().equals(s);
//		return s.equalsIgnoreCase(str);
	}
	private static String reverseStrig(String s) {
		if(s.length() < 2){
			return s;
		}
		return reverseStrig(s.substring(1))+s.charAt(0);
	}
}
