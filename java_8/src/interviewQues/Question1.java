package interviewQues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private	int age;
	private String gender;
	private String department;
	private	int yearOfJoining;
	private	double salary;
	
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(10, "Ashish", 22, "male", "Devloper", 2012, 50000.0));
		empList.add(new Employee(11, "Marry", 32, "female", "HR", 2015, 23000.0));
		empList.add(new Employee(12, "Bob", 35, "male", "Sales and Marketing", 2015, 15000.0));
		empList.add(new Employee(13, "Kiran", 26, "male", "Product development", 2014, 55000.0));
		empList.add(new Employee(14, "Punit", 34, "male", "Devloper", 2016, 56000.0));
		empList.add(new Employee(15, "Alice", 28, "female", "HR", 2012, 25000.0));
		empList.add(new Employee(16, "Tina", 22, "female", "Devloper", 2011, 70000.0));
		empList.add(new Employee(17, "Tarun", 26, "male", "HR", 2017, 15000.0));
		empList.add(new Employee(18, "Karthik", 35, "male", "Product development", 2012, 50000.0));
		empList.add(new Employee(19, "Rathan", 29, "male", "Sales and Marketing", 2015, 30000.0));
		empList.add(new Employee(20, "Rajath", 24, "male", "Devloper", 2013, 34000.0));
		
//		1. How many males and female emps?

		Map<String, Long> res = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(res);
		System.out.println("-------------------------");
		
		
//		2.Print name of the dept
		empList.stream().map(x -> x.getDepartment()).distinct().forEach(System.out::println);
		
		System.out.println("-----------------------");
		
//		3. Avg age male and female emp
		
		Map<String, Double> avg = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avg);
		System.out.println("-----------------------");
		
//		4. Highest paid emp
		String highPaid = empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getName();
		System.out.println(highPaid);
		
//		or
		Optional<Employee> hp = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(hp.get().getName());
		
		
//		5.Get emp who joined after 2015
		System.out.println("--------------------------");
		empList.stream().filter(x -> x.getYearOfJoining() > 2015).forEach(x -> System.out.println(x.getName()));
		
//		6.Count no. of emp in each dept
		System.out.println("--------------------------");
		Map<String, Long> countEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(countEmp);
		
//		7.Avg salary of each dept
		System.out.println("--------------------------");
		Map<String, Double> avgSal = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSal);
		
//		8. Youngest male emp of HR dept
		System.out.println("-------------------------");
		Optional<Employee> minemp =  empList.stream().filter(x -> x.getDepartment()=="HR" && x.getGender()=="male").min(Comparator.comparingInt(Employee::getAge));
		System.out.println(minemp.get().getName());
		
//		9.Who has more experience in the organisation
		System.out.println("-------------------------");
		Optional<Employee> moreExp =  empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(moreExp.get().getName());
		
//		or
		
		Optional<Employee> moreExp1 = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(moreExp1.get().getId()+" "+moreExp1.get().getName());
		
//		10.how many male and female are in HR dept
		System.out.println("-------------------------");
		Map<String, Long> hrDept =  empList.stream().filter(x -> x.getDepartment() == "HR").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(hrDept);
		
//		11. Avg salary of male and female
		
		Map<String, Double> avgSalary = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		
//		12 List of all emp in each dept
		System.out.println("-------------------------");
		Map<String,List<Employee>> ed=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(ed);
		
		System.out.println("-------------------------");
		
//		
		DoubleSummaryStatistics d=empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("count = "+d.getCount());
		System.out.println("Sum = "+d.getSum());
		System.out.println("Average = "+d.getAverage());
		System.out.println("Min = "+d.getMin());
		System.out.println("Max ="+d.getMax());

		
//		14.Dept with highest number of emp
		System.out.println("-------------------------");
		Map<String, Long> dc = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Optional<Map.Entry<String,Long>> maxDept=dc.entrySet().stream().max(Map.Entry.comparingByValue());
		if(maxDept.isPresent()) {
			System.out.println("Dept : "+maxDept.get().getKey() + " - "+maxDept.get().getValue()+" employees");
		}
		else {
		System.out.println("No department found");
	  }
		
//		second Highest salary of EMP
		System.out.println("-------------------------");
		Double sh=empList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0);
		System.out.println(sh);
	}
	
}
