package com.programs.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public String name;
	public int age;
	
	public static void main(String[] args) {
		Set<TestTreeSet> treeSet = new TreeSet<TestTreeSet>(new Comparator<TestTreeSet>() {
			public int compare(TestTreeSet paramT1, TestTreeSet paramT2) {
				return paramT1.name.compareTo(paramT2.name);
			}
		});
		treeSet.add(new TestTreeSet("name1", 21));
		treeSet.add(new TestTreeSet("name2", 22));
		treeSet.add(new TestTreeSet("name3", 23));
		System.out.println(treeSet);
	}

	public TestTreeSet(String name, int age) {
		this.name =  name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestTreeSet [name=" + name + ", age=" + age + "]";
	}
}
