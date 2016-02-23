package com.programs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> myEmptyList = Collections.<String>emptyList();
		List<String> myEmptyList1 = new ArrayList<String>();
        System.out.println("Empty list: "+myEmptyList);
        System.out.println("Empty list: "+myEmptyList1);
        
        List<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        Enumeration<String> enm = Collections.enumeration(ls);
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
        
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("jdbc");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add("servlets");
        List<String> subList = new ArrayList<String>();
        subList.add("php");
        subList.add("javascript");
        subList.add("ruby");
        System.out.println("Index of sublist: "+Collections.indexOfSubList(list, subList));
        System.out.println("Last index of sublist: "+Collections.lastIndexOfSubList(list, subList));
        
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        
        System.out.println("Maximum element from the list: "+Collections.max(li));
        System.out.println("Minimum element from the list: "+Collections.min(li));
        
        String temp = "JAVA2NOVICE";
        List<String> tempCopies = Collections.nCopies(5, temp);
        System.out.println(tempCopies);
        
        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println("List after rotation:");
        System.out.println(list);
	}
}
