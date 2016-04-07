package linkedlist;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.add(2);
		integers.add(21);
		integers.add(12);
		integers.add(22);
		integers.add(2);
		System.out.println(integers);
		Integer aa = integers.element();
		System.out.println(aa);
	}
}
