package com.programs.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ajeet");
		list.add("jeetA");
		list.add("Harry");
		list.add("Chaitanya");
		list.add("Ajeet");
		list.add("Ajeet");
//		Collections.sort(list);
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
			if (list.get(j).compareTo(list.get(j - 1)) == 0) {
				list.remove(j);
				j = 0;
			}
		}

		System.out.println(list);
	}
}
