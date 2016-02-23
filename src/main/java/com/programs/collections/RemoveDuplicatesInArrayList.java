package com.programs.collections;

import java.util.ArrayList;

public class RemoveDuplicatesInArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajeet");
		list.add("jeetA");
		list.add("Harry");
		list.add("Chaitanya");
		list.add("Ajeet");
		list.add("Ajeet");
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) < 0) {
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		if(list.contains("Ajeet")){
			System.out.println("sssssss");
		}
		System.out.println(list);
		
		for (int j = 1; j < list.size(); j++) {
			System.out.println("OUT : "+j);
			if (list.get(j).compareTo(list.get(j - 1)) == 0) {
				list.remove(j);
				System.out.println("IN : "+j);
				j = 0;
			}
		}

		System.out.println(list);
	}
}
