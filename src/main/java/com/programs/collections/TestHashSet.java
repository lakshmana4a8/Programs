package com.programs.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {

		Customer customer1 = new Customer("lakshman", 25, "hyd");
		Customer customer2 = new Customer("lakshman", 25, "sec");
		Customer customer3 = new Customer("lakshman", 25, "ban");

		Set<Customer> set = new HashSet<Customer>();
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);

		Customer customer4 = new Customer("lakshman", 25, "hyd");
		Customer customer5 = new Customer("lakshman", 10, "sec");
		Customer customer6 = new Customer("lakshman", 25, "ban");

		Set<Customer> set1 = new HashSet<Customer>();
		set1.retainAll(set1);
		set1.add(customer4);
		set1.add(customer5);
		set1.add(customer6);

		System.out.println(set);
		System.out.println(set1);

		Iterator<Customer> a = set.iterator();
		while (a.hasNext()) {
			Customer num = a.next();
			System.out.println(num);
		}
	}
}
