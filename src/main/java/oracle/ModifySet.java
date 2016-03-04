package oracle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ModifySet {
	public static void main(String[] args) {
		Set<Integer> integers1 = new HashSet<Integer>();
		integers1.add(1);integers1.add(2);integers1.add(3);integers1.add(4);
		
		Set<Integer> integers2 = new HashSet<Integer>();
		integers2.add(3);integers2.add(4);integers2.add(5);integers2.add(6);
		
		Set<Integer> duplicateElements = new HashSet<Integer>();
		Set<Integer> uniqueElements = new HashSet<Integer>();
		
		Iterator<Integer> iterator1 = integers1.iterator();
		while (iterator1.hasNext()) {
			Integer integer = (Integer) iterator1.next();
			if(integers2.contains(integer)){
				duplicateElements.add(integer);
			}else{
				uniqueElements.add(integer);
			}
		}
		Iterator<Integer> iterator2 = integers2.iterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();
			if(integers1.contains(integer)){
				duplicateElements.add(integer);
			}else{
				uniqueElements.add(integer);
			}
		}
		System.out.println(duplicateElements);
		System.out.println(uniqueElements);
	}
}
