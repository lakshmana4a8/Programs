package com.programs.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String a[]){
		Vector<String> lang = new Vector<String>();
		Enumeration<String> en = null;
		lang.add("JAVA");
		lang.add("JSP");
		lang.add("SERVLET");
		lang.add("EJB");
		lang.add("PHP");
		lang.add("PERL");
		en = lang.elements();
//		en = Collections.enumeration(lang);
		System.out.println(lang.get(4));
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
