package com.programs.numbers;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);integers.add(7);integers.add(5);integers.add(9);integers.add(2);integers.add(1);integers.add(18);integers.add(2);
		System.out.println(integers);
		for (int i = 0; i < integers.size(); i++) {
			for (int j = i+1; j < integers.size(); j++) {
				if(integers.get(i) > integers.get(j)){
					int num = integers.get(i);
					integers.set(i, integers.get(j));
					integers.set(j, num);
				}
			}
		}
		System.out.println(integers);
	}
}
