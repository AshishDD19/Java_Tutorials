package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet(6);
		
		h.add(12);
		h.add(34);
		h.add(45);
		h.add(11);
		h.add(56);
		h.add(11);
		System.out.println(h);
		
		System.out.println("Size: "+h.size());
		
		System.out.println("Hash code: "+h.hashCode());
		
		HashSet h1 = new HashSet();
		h1 = (HashSet)h.clone();  
		System.out.println("Cloned copy: "+h1);
		
		HashSet h2 = new HashSet(4,2);
		
		
		
		
	}

}
