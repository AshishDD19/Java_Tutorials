package oops;

class Student{
	String name;
	int age;
	float height;
	
	//Default zero parameter constructor
	public Student() {
		// TODO Auto-generated constructor stub
		name = null;
		age = 0;
		height = 0.0f;
	}
	
	//Parameterized Constructor
	Student(String name, int age, float height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void setData(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("John", 25, 6.2f);
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
		
		
	}

}
