package java_8;

import java.util.function.BiFunction;

//calculate the salary of the employee based on days


class Employee2{
	String name;
	Integer days;
	String branch;
	
	public Employee2(String name, Integer days, String branch) {
		super();
		this.name = name;
		this.days = days;
		this.branch = branch;
	}
	
	
}

public class BiFunctionPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Employee2, Double, Double> calcSal = (emp,sal) -> emp.days * sal;
		
		Employee2 emp = new Employee2("Ashish", 30, "Bengaluru");
		
		double res = calcSal.apply(emp, 5000.75);
		System.out.println(res);
	}

}
