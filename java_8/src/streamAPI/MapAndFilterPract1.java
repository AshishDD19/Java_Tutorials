package streamAPI;

import java.util.stream.Stream;

class Employee1{
	String name;
	int age;
	double salary;
	
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
	
}
public class MapAndFilterPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1("Ashish", 22, 15000.0);
		Employee1 e2 = new Employee1("Kiran", 24, 10000.0);
		Employee1 e3 = new Employee1("Vinay", 21, 9000.0);
		Employee1 e4 = new Employee1("Arya", 25, 12000.0);
		
		Stream<Employee1> stream = Stream.of(e1,e2,e3,e4);
		
		stream.filter(x -> x.salary >10000.0)
		.map(x -> x.name+"-"+x.age)
		.forEach(System.out::println);
		
//		or
		System.out.println("---------------------");
		Stream<Employee1> stream1 = Stream.of(e1,e2,e3,e4);
		
		stream1.filter(x -> x.salary >10000.0)
		.forEach(x -> System.out.println(x.name+"-"+x.age));
	}

}
