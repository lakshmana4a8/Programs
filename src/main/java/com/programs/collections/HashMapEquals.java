package com.programs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEquals {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("lakshman",25,"hyd");
		Customer customer2 = new Customer("lakshman",25,"sec");
		Customer customer3 = new Customer("lakshman",25,"ban");
		
		Map<Customer, String> map = new HashMap<Customer, String>();
		map.put(customer1, "1");
		map.put(customer2, "2");
		map.put(customer3, "3");
		
		Customer customer4 = new Customer("lakshman",25,"hyd");
		Customer customer5 = new Customer("lakshman",10,"sec");
		Customer customer6 = new Customer("lakshman",25,"ban");
		
		Map<Customer, String> map1 = new HashMap<Customer, String>();
		map1.put(customer4, "1");
		map1.put(customer5, "2");
		map1.put(customer6, "3");
		
		System.out.println(map);
		System.out.println(map1);
		
		Iterator<Entry<Customer, String>> a = map.entrySet().iterator();
		while (a.hasNext()) {
			Entry<Customer, String> num = a.next();
			System.out.println(num.getValue()+" "+num.getKey().getName());
		}
		Set<Customer> aa = map.keySet();
		for (Customer customer : aa) {
			System.out.println(customer);
		}
	}
}
