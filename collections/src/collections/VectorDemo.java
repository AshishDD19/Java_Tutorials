package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1 = new Vector(6);
				
				a1.add(10);
				a1.add(20);
				a1.add(30);
				a1.add(40);
				a1.add(50);
				a1.add(60);
				
				System.out.println("Size: "+a1.size());
				System.out.println("Capacity:"+a1.capacity());
				
				System.out.println();
				a1.add(70);
				System.out.println("Size: "+a1.size());
				System.out.println("Capacity:"+a1.capacity());
				System.out.println(a1);
				
				Vector a2 = new Vector(4,6);
				a2.add(11);
				a2.add(12);
				a2.add(13);
				a2.add(14);
				
				System.out.println("Size: "+a2.size());
				System.out.println("Capacity:"+a2.capacity());
				
				System.out.println();
				a2.add(17);
				System.out.println("Size: "+a2.size());
				System.out.println("Capacity:"+a2.capacity());
				System.out.println(a2);
				
				a2.remove(2);
				System.out.println("Size: "+a2.size());
				System.out.println("Capacity:"+a2.capacity());
				System.out.println(a2);
				
				a1.addAll(3, a2);
				System.out.println(a1);
	}

}
