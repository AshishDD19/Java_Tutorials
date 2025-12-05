package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//1. Print emp names who are in dev dept;
//2. Print emp names who are in dev dept and working in Banglore Location

class Employee1{
	int id;
	String name;
	String location;
	String dept;
	
	public Employee1(int id, String name, String location, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
	
	
}
public class PredicateJoiningPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(101, "Ashish", "Banglore", "dev");
		Employee1 e2 = new Employee1(102, "Vinay", "Manglore", "devOps");
		Employee1 e3 = new Employee1(103, "Virat", "Chennai", "dev");
		Employee1 e4 = new Employee1(104, "Naman", "Mysuru", "testing");
		Employee1 e5 = new Employee1(105, "Bob", "Banglore", "dev");
		
		List<Employee1> empList = Arrays.asList(e1,e2,e3,e4,e5);
		
		Predicate<Employee1> p1 = emp -> emp.dept.equals("dev");
		Predicate<Employee1> p2 = emp -> emp.location.equals("Banglore");
		
		Predicate<Employee1> p = p1.and(p2);
		
		
		//1. Print emp names who are in dev dept;
		
		for(Employee1 emp : empList) {
			if(p1.test(emp)) {
				System.out.println(emp.name);
			}
		}
		
		System.out.println("----------------------------");
		//2. Print emp names who are in dev dept and working in Banglore Location
		
		for(Employee1 emp : empList) {
			if(p.test(emp)) {
				System.out.println(emp.name);
			}
		}

	}

}
