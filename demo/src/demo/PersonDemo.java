package demo;

class Person
{
	String name;
	int age;
	void works(){
		System.out.println(name + " is working.");
	}
}


class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Vishal";
		p1.age = 27;
		
		p2.name = "Raj";
		p2.age = 36;
		
		Person p3,p4;
		
		p3 = p2;
		p4 = p2;
		
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(p4.age);
		
		p3.age = 60;
		System.out.println("");
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(p4.age);
		
		p1 = p2;
		System.out.println("");
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(p4.age);
	}
}
