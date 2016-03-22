package com.programs.numbers;

import java.util.ArrayList;
import java.util.List;

public class SortArrayListEvenOddBased {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(22);integers.add(21);integers.add(13);
		integers.add(8);integers.add(5);integers.add(18);
		integers.add(9);integers.add(8);integers.add(1);integers.add(19);
		System.out.println(integers);
		for (int i = 0; i < integers.size(); i++) {
			for (int j = i+1; j < integers.size(); j++) {
				if(((integers.get(j) >> 1) << 1) == integers.get(j)){
					if(((integers.get(i) >> 1) << 1) == integers.get(i)){
						if(integers.get(i) < integers.get(j)){
							int num = integers.get(i);
							integers.set(i, integers.get(j));
							integers.set(j, num);
						}
					}else{
						int num = integers.get(i);
						integers.set(i, integers.get(j));
						integers.set(j, num);
					}
				}
				if(((integers.get(j) >> 1) << 1) != integers.get(j) && ((integers.get(i) >> 1) << 1) != integers.get(i)){
					if(integers.get(i) > integers.get(j)){
						int num = integers.get(i);
						integers.set(i, integers.get(j));
						integers.set(j, num);
					}
				}
			}
		}
		System.out.println(integers);
	}
}
