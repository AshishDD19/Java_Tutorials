package java8features;

import java.util.function.Predicate;

class StudentA{
	String name;
	int id;
	
	public StudentA(String name, int id) {
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
		return "StudentA [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentA s1 = new StudentA("Bob", 1);
		StudentA s2 = new StudentA("Tim", 2);
		
		Predicate<StudentA> stud = x -> x.getId() > 1;
		System.out.println(stud.test(s2));
		

	}

}
