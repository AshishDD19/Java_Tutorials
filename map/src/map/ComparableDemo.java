package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	String name;
	int percent;
	
	Student(String name, int percent){
		this.name = name;
		this.percent = percent;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" "+"Percentage :"+percent;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.percent > o.percent) {
			return 1;
		}
		return -1;
	}
}


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add(new Student("Bob",99));
		l.add(new Student("Cacey",66));
		l.add(new Student("Virat",78));
		l.add(new Student("Tim",90));
		l.add(new Student("Rita",45));
		
		System.out.println(l);
		System.out.println();
		
		Collections.sort(l);
		
		System.out.println("After sorting: ");
		System.out.println(l);
	}

}
