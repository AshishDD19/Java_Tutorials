package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaExpComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using List
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(22);
		l.add(55);
		l.add(77);
		l.add(11);
		l.add(9);
		System.out.println(l);
		
		System.out.println("After sorting descending: ");
		Collections.sort(l, (a,b) -> b - a);
		System.out.println(l);
		
		
		//Using treeSet
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(10);
		tree.add(56);
		tree.add(42);
		tree.add(19);
		System.out.println("Before manual soring: "+tree);
		
		Set<Integer> s = new TreeSet<Integer>((a,b) -> b - a);
		s.add(33);
		s.add(12);
		s.add(90);
		s.add(67);
		System.out.println("After manual sorting desc: "+s);
		
		
		//Using treeMap
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(22, "bob");
		tm.put(32, "cacey");
		tm.put(65, "tim");
		tm.put(8, "jim");
		System.out.println("Before manual soring: "+tm);
		
		Map<Integer, String> m = new TreeMap<>( (a,b) -> b - a);
		m.put(22, "ben");
		m.put(32, "kim");
		m.put(65, "pope");
		m.put(8, "yen");
		System.out.println("After manual sorting desc: "+m);
		

		
		
	
	}

}
