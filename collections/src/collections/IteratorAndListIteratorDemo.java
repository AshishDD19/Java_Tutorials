package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();
		l1.add(12);
		l1.add(99);
		l1.add(15);
		l1.add(42);
		l1.add(25);
		
		
		Iterator<Integer> itr = l1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasNext()) {
			int n = itr.next();
			if(n == 15) {
				itr.remove();
			}
		}
		
		System.out.println(l1);
		
		
		ListIterator<Integer> i = l1.listIterator();
		
		System.out.println("Forward direction: ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		System.out.println("Backword direction: ");
		while(i.hasPrevious()) {
			System.out.print(i.previous()+" ");
		}
	}

}
