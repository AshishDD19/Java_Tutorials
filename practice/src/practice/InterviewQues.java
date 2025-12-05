package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Employee{
	private String employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String managerEmployeeId;
	
	public Employee(String employeeId, String employeeName, String employeeDesignation, String managerEmployeeId) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerEmployeeId = managerEmployeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public String getManagerEmployeeId() {
		return managerEmployeeId;
	}
	
	
}

public class InterviewQues {
	
	public static List<String> printHierarchy(String empId, Map<String,Employee> mp){
		List<String> hierarchy = new ArrayList<>();
		
		while(empId != null) {
			Employee emp = mp.get(empId);
			String info = emp.getEmployeeName()+"("+emp.getEmployeeDesignation()+"-"+emp.getEmployeeId()+")";
			hierarchy.add(info);
			empId = emp.getManagerEmployeeId();
		}
		Collections.reverse(hierarchy);
		return hierarchy;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
			    new Employee("X7F3", "John Doe", "CEO", null),
			    new Employee("P0R4", "Jane Smith", "CTO", "X7F3"),
			    new Employee("K2B9", "David Lee", "CFO", "X7F3"),
			    new Employee("L8M5", "Michael Brown", "VP Eng", "P0R4"),
			    new Employee("A3N6", "Sara Jones", "VP Mkt", "X7F3"),
			    new Employee("B9Q7", "Emily Davis", "SE", "L8M5"),
			    new Employee("CSR1", "James Wilson", "MS", "A3N6"),
			    new Employee("D1S2", "Christopher Martinez", "SE", "L8M5"),
			    new Employee("E6T0", "Nancy Rodriguez", "MS", "CSR1"),
			    new Employee("F4U8", "Patricia Walker", "MS", "CSR1")
			);

		Map<String, Employee> mp = new HashMap<>();
		
		for(Employee emp : employees) {
			mp.put(emp.getEmployeeId(), emp);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		String id = sc.next();
		System.out.println("Hierarcy is: ");
		String res = String.join(", ", printHierarchy(id, mp));
		System.out.println(res);
		
	}

}
