package com.programs.strings;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(findPossibles(s));
	}

	private static Set<String> findPossibles(String s) {
		Set<String> stringsList = new HashSet<String>();
		if(s == null){
			return null;
		}else if(s.length() == 0){
			stringsList.add("");
			return stringsList;
		}
		
		char c = s.charAt(0);
		String rem = s.substring(1);
		
		Set<String> strings = findPossibles(rem);
		
		for (String newString : strings) {
			for (int i = 0; i <= newString.length(); i++) {
				stringsList.add(addStrings(newString,c,i));
			}
		}
		return stringsList;
	}

	private static String addStrings(String s, char c, int i) {
		String first = s.substring(0,i);
		String last = s.substring(i);
		return first + c + last;
	}
}
