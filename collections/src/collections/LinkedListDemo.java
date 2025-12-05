package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new LinkedList();
		
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(2,32);
		
		System.out.println(l1);
		
		List l2 = new LinkedList<>();
		
		l2.add(21);
		l2.add(22);
		l2.add(32);
		l2.add(25);
		l2.add(25);
		
		
		System.out.println(l2);
		
		l1.addAll(3, l2);
		System.out.println(l1);
		
		System.out.println(l1.set(3, 99));
		System.out.println(l1);
		
		System.out.println(l1.indexOf(32));
		
		System.out.println(l1.lastIndexOf(32));
		
		System.out.println(l1.get(4));
		
		List l3 = l1.subList(2, 6);
		System.out.println(l3);
		
		l3.remove(2);
		System.out.println(l3);
		
		
	}

}
