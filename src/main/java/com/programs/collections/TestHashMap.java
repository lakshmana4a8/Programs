package com.programs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "11");
		
		String aa = map.put("2", "22");
		System.out.println(aa);
		String aa1 = map.put("2", "22");
		System.out.println(aa1);
		
		map.put("3", "33");
		map.put("3", "44");
		
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
