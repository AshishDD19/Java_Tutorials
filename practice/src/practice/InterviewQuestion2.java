package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Employee1 implements Comparator<Employee1>{
	int empId;
	String firstName;
	String lastName;
	int age;
	double salary;
	
	
	public Employee1() {
		
	}
	public Employee1(int empId, String firstName, String lastName, int age, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return firstName+" "+lastName+","+age;
	}


	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		
		int nameCompare = o1.firstName.compareTo(o2.firstName);
		if(nameCompare != 0) {
			return nameCompare;
		}
		else {
			return Integer.compare(o1.age, o2.age);
		}
		
	}
		
	
}

public class InterviewQuestion2 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> emp = new ArrayList<Employee1>();
		File file = new File("D:\\java-files\\practice\\src\\practice\\employee_data.txt");		
		try {
			
			Scanner reader = new Scanner(file);
			String data = reader.nextLine();//to skip the header
			
			System.out.println(data);
			while(reader.hasNext()) {
				data = reader.nextLine();
				String[] parts = data.split(",");
				int id = Integer.parseInt(parts[0]);
				String fname = parts[1];
				String lname = parts[2];
				int age = Integer.parseInt(parts[3]);
				double sal = Double.parseDouble(parts[4]);
				
				emp.add(new Employee1(id, fname, lname, age, sal));
				
//				System.out.println(data);
			}
			
			Collections.sort(emp, new Employee1());

			System.out.println("Name,Age");
			for(Employee1 e : emp) {
				System.out.println(e);
			}
			
			
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
