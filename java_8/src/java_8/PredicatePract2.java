package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//Print emp details who as salary more than 50000
class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name,int age,double salary) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class PredicatePract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ashish", 22, 55000.33);
		Employee e2 = new Employee("Vinay", 24, 45000.13);
		Employee e3 = new Employee("Amith", 25, 51000.23);
		Employee e4 = new Employee("Bob", 25, 35000.33);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p = emp -> emp.salary >= 50000;
		
		for(Employee emp : empList) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
	}

}
