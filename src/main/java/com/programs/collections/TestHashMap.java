package com.programs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("1", 11);
		map.put("2", 55);
		map.put("3", 33);
		map.put("4", 1);
		map.put("5", 1);
		System.out.println(map);
		System.out.println(MapUtil.sortByValue(map));
		System.out.println(MapUtil.sortByKey(map));
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
