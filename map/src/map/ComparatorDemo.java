package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student1 implements Comparator<Student1>{
	String name;
	int percent;
	
	
	Student1(){
		
	}
	
	Student1(String name, int percent){
		this.name = name;
		this.percent = percent;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" "+" Percentage: "+percent;
	}
	
	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
//		if(o1.percent > o2.percent) {
//			return 1;
//		}
		return o2.percent - o1.percent ;
	} 
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add(new Student1("Bob",99));
		l.add(new Student1("Cacey",66));
		l.add(new Student1("Virat",78));
		l.add(new Student1("Tim",90));
		l.add(new Student1("Rita",45));
		
		System.out.println(l);
		
		Comparator c = new Student1();
		
		
		Collections.sort(l, c);
		
		System.out.println("After sorting decending : ");
		System.out.println(l);
		

	}

}
