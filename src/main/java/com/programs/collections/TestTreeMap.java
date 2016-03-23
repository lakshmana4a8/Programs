package com.programs.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public String name;
	public int age;
	
	public static void main(String[] args) {
		Map<TestTreeMap,TestTreeMap> treeMap = new TreeMap<TestTreeMap, TestTreeMap>(new Comparator<TestTreeMap>() {
			public int compare(TestTreeMap paramT1, TestTreeMap paramT2) {
				return paramT1.name.compareTo(paramT2.name);
			}
		});
		treeMap.put(new TestTreeMap("name3", 23),new TestTreeMap("name3", 23));
		treeMap.put(new TestTreeMap("name1", 21),new TestTreeMap("name1", 21));
		treeMap.put(new TestTreeMap("name2", 22),new TestTreeMap("name2", 22));
		treeMap.put(new TestTreeMap("name1", 25),new TestTreeMap("name1", 25));
		System.out.println(treeMap);
	}

	public TestTreeMap(String name, int age) {
		this.name =  name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestTreeMap [name=" + name + ", age=" + age + "]";
	}
}
