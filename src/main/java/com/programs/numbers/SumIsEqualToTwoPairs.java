package com.programs.numbers;

import java.util.HashMap;
import java.util.Map;

public class SumIsEqualToTwoPairs {
	class Pairs{
		int first;
		int second;
		public Pairs(int f,int s){
			first = f;
			second = s;
		}
	}
	public static void main(String[] args) {
		int[] array = {1,4,3,7,5,2};
		findPairs(array);
	}
	private static void findPairs(int[] array) {
		Map<Integer, Pairs> hashMap = new HashMap<Integer, Pairs>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				int sum = array[i]+array[j];
				if(!hashMap.containsKey(sum)){
					hashMap.put(sum, new SumIsEqualToTwoPairs().new Pairs(i,j));
				}else{
					Pairs pairs = hashMap.get(sum);
					System.out.println(array[i]+", "+array[j]+" and "+array[pairs.first]+", "+array[pairs.second]+" produces the same sum : "+sum);
				}
			}
		}
	}
}
