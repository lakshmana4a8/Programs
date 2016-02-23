package com.programs.numbers;

import java.util.ArrayList;
import java.util.List;

public class FindMaxDifferenceBWNumbers {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);integers.add(7);integers.add(8);integers.add(1);integers.add(4);integers.add(7);integers.add(9);
		System.out.println(integers);
		int start = 0;
		int end = 0;
		int diff = 0;
		for (int i = 0; i < integers.size(); i++) {
			for (int j = i+1; j < integers.size(); j++) {
				if((integers.get(j) - integers.get(i)) > 0 && ((integers.get(j) - integers.get(i)) > diff || (integers.get(j) - integers.get(i)) == diff)){
					diff = integers.get(j) - integers.get(i);
					start = i;
					end = j;
					System.out.println(start+" :::::: "+end+" : "+diff);
					for (int k = start; k <= end; k++) {
						System.out.print(integers.get(k)+" ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("=============");
		System.out.println(start+" :::::: "+end+" : "+diff);
		for (int k = start; k <= end; k++) {
			System.out.print(integers.get(k)+" ");
		}
		System.out.println();
		System.out.println("=============");  
	}
}
