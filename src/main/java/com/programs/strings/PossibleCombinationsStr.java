package com.programs.strings;

import java.util.HashSet;
import java.util.Set;

public class PossibleCombinationsStr {
	public static void main(final String[] args) {
		Set<String> strings = new HashSet<String>();
		System.out.println(permutation("", "acb",strings));
	    Set<String> strings1 = new HashSet<String>();
		System.out.println(permutation("", "yahoo",strings1));
	  }

	private static Set<String> permutation(final String prefix, final String str, Set<String> strings) {
	    int n = str.length();
		if (n == 0) {
	      strings.add(prefix);
	    } else {
	        for (int i = 0; i < n; i++){
	        	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), strings);
	        }
	    }
	    return strings;
	} 
}
