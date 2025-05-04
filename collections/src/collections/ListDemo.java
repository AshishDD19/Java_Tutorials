package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();
		l1.add(12);
		l1.add(99);
		l1.add(15);
		l1.add(42);
		
		System.out.println(l1);
		
		l1.add(2,32);
		System.out.println(l1);
		
		List l2 = new ArrayList();
		l2.add(66);
		l2.add(55);
		l2.add(77);
		l2.add(88);
		System.out.println(l2);
		
		l1.addAll(3, l2);
		System.out.println(l1);
		
		System.out.println(l1.set(3, 99));
		System.out.println(l1);
		
		System.out.println(l1.indexOf(55));
		
		System.out.println(l1.lastIndexOf(99));
		
		System.out.println(l1.get(4));
		
		List l3 = l1.subList(2, 6);
		System.out.println(l3);
		
		l3.remove(2);
		System.out.println(l3);
	}

}
