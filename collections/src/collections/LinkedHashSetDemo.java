package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1 = new  LinkedHashSet();
		l1.add(12);
		l1.add(34);
		l1.add(45);
		l1.add(11);
		l1.add(56);
		l1.add(11);
		System.out.println(l1);
		
		System.out.println("Size: "+l1.size());
		
		System.out.println("Hash code: "+l1.hashCode());
		
		LinkedHashSet l2 = new LinkedHashSet();
		l2 = (LinkedHashSet)l1.clone();  
		System.out.println("Cloned copy: "+l2);
		
		LinkedHashSet l3 = new LinkedHashSet(4,2);

		
		l3.add("hi");
		l3.add("hello");
		l3.add("welcome");
		
		l1.addAll(l3);
		System.out.println(l1);
		
		l1.remove(12);
		System.out.println(l1.contains(11));
		System.out.println(l1.containsAll(l3));
		
		
		l1.retainAll(l3);
		System.out.println(l1);
	}

}
