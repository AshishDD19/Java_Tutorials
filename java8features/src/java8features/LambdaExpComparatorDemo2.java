package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student2 {
	String name;
	int percent;
	
	Student2(String name, int percent){
		this.name = name;
		this.percent = percent;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" "+" Percentage: "+percent;
	}
	
}

public class LambdaExpComparatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2("Bob",99);
		Student2 s2 = new Student2("Cacey",66);
		Student2 s3 = new Student2("Virat",78);
		Student2 s4 = new Student2("Tim",90);
		Student2 s5 = new Student2("Rita",45);
	
		List<Student2> l = new ArrayList<Student2>();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		System.out.println(l);
		
		System.out.println("After sorting ascending: ");
		Collections.sort(l, (a,b) -> a.percent - b.percent);
		System.out.println(l);
		
		System.out.println("After sorting descending: ");
		Collections.sort(l, (a,b) -> b.percent - a.percent);
		System.out.println(l);
		
	}

}
