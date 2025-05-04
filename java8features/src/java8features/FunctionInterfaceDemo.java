package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
 
class StudentB{
	String name;
	int id;
	
	public StudentB(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
		@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}


public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> fun1 = x -> x.length();
		System.out.println(fun1.apply("Ashish"));
		
		Function<String, String> fun2 = x -> x.substring(0, 2);
		System.out.println(fun2.apply("How are you?"));
		

		
		Function<List<StudentB>, List<StudentB> > printNameContainingVI = x -> {
			List<StudentB> result = new ArrayList<>();
			
			for(StudentB s : x) {
				if(fun2.apply(s.getName()).equalsIgnoreCase("vi")) {
					result.add(s);
				}
			}
			return result;
		};
		
		StudentB s1 = new StudentB("Vim", 1);
		StudentB s2 = new StudentB("Virat", 2);
		StudentB s3 = new StudentB("Tim", 3);
		StudentB s4 = new StudentB("Vijay", 4);
		
		List<StudentB> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		System.out.println(li);
		List<StudentB> filteredlist = printNameContainingVI.apply(li);
		System.out.println("Name containing 'vi': ");
		System.out.println(filteredlist);
		
	}

}
