package collections;

import java.util.ArrayList;
import java.util.LinkedList;

class Employee{
	int employeeId;
	String employeeName;
	String address;
	
	public Employee(int employeeId,String employeeName, String address) {
		// TODO Auto-generated constructor stub
		this.employeeId = employeeId;
		this.employeeName  = employeeName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address + "]";
	}
	
	
}

class Department{
	int departmentId;
	String departmentName;
	String managerName;
	
	public Department(int departmentId,String departmentName,String managerName) {
		// TODO Auto-generated constructor stub
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerName = managerName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerName=" + managerName + "]";
	}
	
}


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Adam", "Banglore");
		Employee e2 = new Employee(2, "Bob", "Mumbai");
		Employee e3 = new Employee(3, "Cacey", "Hydrabad");
		Employee e4 = new Employee(4, "Varun", "Chennai");
		
		Department d1 = new Department(101, "R & D", "Suraj");
		Department d2 = new Department(102, "Developers", "Tom");
		Department d3 = new Department(103, "Embedded", "Larry");
		Department d4 = new Department(104, "HR", "Riya");
	
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		for(Employee e : emp) {
			System.out.println(e.toString());
		}
		System.out.println();
		
		ArrayList<Department> dep = new ArrayList<>();
		dep.add(d1);
		dep.add(d2);
		dep.add(d3);
		dep.add(d4);
		
		for(Department d : dep) {
			System.out.println(d.toString());
		}
		System.out.println();
		
		LinkedList <Employee> emp1 = new LinkedList<>();
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		emp1.add(e4);

		for(Employee e : emp1) {
			System.out.println(e.employeeId+" "+e.employeeName+" "+e.address);
		}
		System.out.println();
		
		LinkedList<Department> dep1 = new LinkedList<>();
		dep1.add(d1);
		dep1.add(d2);
		dep1.add(d3);
		dep1.add(d4);
		
		for(Department d : dep1) {
			System.out.println(d.departmentId+" "+d.departmentName+" "+d.managerName);
		}
	
		
		
		
	}

}
