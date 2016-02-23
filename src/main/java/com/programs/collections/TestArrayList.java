package com.programs.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		Collection<String> readOnlyCollection = Collections.unmodifiableCollection(new ArrayList<String>());
		readOnlyCollection.add("sss");

		list.add("Ajeet");
		list.add("Harry");
		list.add("Chaitanya");
		list.add(null);
		list.add("Anuj");
		System.out.println("the array has following elements:" + list);

		list.add(0, "Rahul");
		list.add(1, "Justin");
		System.out.println("Current array list is 1 :" + list);
		List<String> list1 = Collections.unmodifiableList(list);
		list1.remove(null);
		list1.remove("Harry");
		System.out.println("Current array list is 2 :" + list);

		list.remove(1);
		System.out.println("Current array list is 3 :" + list);

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		// comment this to avoid ConcurrentModificationException
		/*for (String str : list) {
			if (true) {
				list.remove(str);
			}
		}*/
		System.out.println("Current array list is 4 :" + list);

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);
		}
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.println(string);
		}
	}
}