package com.programs.strings;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Pe ek";
		String s2 = "Ke ep";
		anagramMethodSortAndEqualsMethod(s1,s2);
		anagramMethodByIteration(s1,s2);
		usingStringBuilder(s1,s2);
		usingHashMap(s1,s2);
	}

	private static void usingHashMap(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
        boolean status = true;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < copyOfs1.length(); i++) {
            char charAsKey = copyOfs1.charAt(i);
            int charCountAsValue = 0;
            if(map.containsKey(charAsKey)) {
                charCountAsValue = map.get(charAsKey);
            }
            map.put(charAsKey, ++charCountAsValue);
            charAsKey = copyOfs2.charAt(i);
            charCountAsValue = 0;
            if(map.containsKey(charAsKey)) {
                charCountAsValue = map.get(charAsKey);
            }
            map.put(charAsKey, --charCountAsValue);
        }
        for (int value : map.values()) {
            if(value != 0) {
                status = false;
            }
        }
        if(status) {
            System.out.println("usingHashMap : "+s1+" and "+s2+" are anagrams");
        } else {
            System.out.println("usingHashMap : "+s1+" and "+s2+" are not anagrams");
        }
	}

	private static void usingStringBuilder(String s1, String s2) {
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
        boolean status = true;
        char[] s1Array = copyOfs1.toCharArray();
        StringBuilder sb = new StringBuilder(copyOfs2);
        for (char c : s1Array) {
            int index = sb.indexOf(""+c);
            if (index != -1) {
                sb = sb.deleteCharAt(index);
            } else {
                status = false;
                break;
            }
        }
        if(status) {
            System.out.println("usingStringBuilder : "+s1+" and "+s2+" are anagrams");
        } else {
            System.out.println("usingStringBuilder : "+s1+" and "+s2+" are not anagrams");
        }
    }

	private static void anagramMethodByIteration(String s1, String s2) {
		char[] c1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		String c2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		for (char c : c1) {
			int index = c2.indexOf(c);
			if(index != -1){
				c2 = c2.substring(0,index)+c2.substring(index+1,c2.length());
			}else{
				status = false;
				break;
			}
		}
		if(status){
			System.out.println("anagramMethodByIteration : "+s1+" and "+s2+" are anagrams");
		}else{
			System.out.println("anagramMethodByIteration : "+s1+" and "+s2+" are anagrams");
		}
	}

	private static void anagramMethodSortAndEqualsMethod(String s1, String s2) {
		char[] c1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] c2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("anagramMethodSortAndEqualsMethod : "+Arrays.equals(c1, c2));
	}
}
