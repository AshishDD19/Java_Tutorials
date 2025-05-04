package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr = new TreeSet();
		
		tr.add(11);
		tr.add(22);
		tr.add(9);
		tr.add(45);
		tr.add(77);
		tr.add(22);
		
		System.out.println(tr);
		
		System.out.println("First element: "+tr.first());
		System.out.println("Last element: "+tr.last());
		
		int n = 33;
		System.out.println("Higher than "+n+": "+tr.higher(n));
		System.out.println("Lower than "+n+": "+tr.lower(n));
		
		System.out.println("Floor value to "+n+" is: "+tr.floor(n));
		
		
		
		tr.remove(9);
		
		System.out.println(tr);
		
		System.out.println("removed first element: "+tr.pollFirst());
		
		System.out.println("removed last element: "+tr.pollLast());
		
		System.out.println(tr);
		
		
		
//		
//		tr.addFirst(11);
//		tr.addLast(66);
//		
		System.out.println(tr);
		
		
	}

}
