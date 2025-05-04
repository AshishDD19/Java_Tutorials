package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m1 = new HashMap();
		
		m1.put(11, "Abby");
		m1.put(12, "Bob");
		m1.put(15, "Virat");
		m1.put(17, "Sanjay");
		m1.put(9, "Cacey");
		
		System.out.println(m1);
		
		Map m2 = new HashMap();
		
		m2.put(101, "HI");
		m2.put(102, "How");
		m2.put(103, "are");
		m2.put(104, "You");
		
		System.out.println(m2);
		
		System.out.println();
		System.out.println("Keys: ");
		Set s = m1.keySet();
		
		for(Object i : s) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Key and Values:");
		
		Set<Entry<Integer,String>> m = m1.entrySet();
		
		for(Entry<Integer, String> i : m) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		System.out.println();
		m1.putAll(m2);
		
		System.out.println(m1);
		
		System.out.println();
		System.out.println("Values: "+m1.values());
		
		System.out.println();
		System.out.println(m1.containsKey(11));
		System.out.println(m1.containsValue("Bob"));
		System.out.println(m1.get(9));
		System.out.println(m1.isEmpty());
		
		System.out.println(m1.remove(104));
		m1.remove(11, "Abby");
		System.out.println(m1);
		

	}

}
