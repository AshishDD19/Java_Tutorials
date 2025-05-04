package collections;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection a1 = new ArrayList();
		a1.add(12);
		a1.add(71);
		a1.add(452);
		a1.add(32);
		System.out.println(a1);
		
		Collection a2 = new ArrayList();
		a2.add("Hi");
		a2.add("How");
		a2.add("Are");
		a2.add("You");
		System.out.println(a2);
		
		a2.remove("Hi");
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		System.out.println(a1.containsAll(a2));
		
		a2.clear();
		System.out.println(a2);
		
		a2.add("Hi");
		a2.add("How");
		a2.add("Are");
		a2.add("You");
		System.out.println(a2);
		
		a1.retainAll(a2);
		System.out.println(a1);
		
	}

}
