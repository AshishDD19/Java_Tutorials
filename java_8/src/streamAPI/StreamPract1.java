package streamAPI;

import java.util.stream.Stream;

//Display details of the user whose age > 22 and name starts with k
//using stream and lambda


class User{
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
public class StreamPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("Ashish",24);
		User u2 = new User("Karan",23);
		User u3 = new User("Vinay",22);
		User u4 = new User("Kiran",21);
		User u5 = new User("Kavya",25);
		User u6 = new User("Bob",24);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		
		stream.filter( x -> x.age > 22 && x.name.startsWith("K")).forEach(System.out::println);

	}

}
