package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User1{
	
	private String user;
	
	private String phone;
	private List<String> email;
	
	public User1(String user, String phone, List<String> email) {
		super();
		this.user = user;
		this.phone = phone;
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	
}

public class CollectorsPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <User1> u = Stream.of(new User1("karthik","1234", Arrays.asList("ka@gmail.com","kk5@gmail.com")),
				new User1("karthik","1234", Arrays.asList("ka12@gmail.com","kk2@gmail.com"))).collect(Collectors.toList());
		
		
		
//		List<String> pno = u.stream().map(user::getPhone).collect(Collectors.toList());
//		
//		System.out.println(pno);
		
		
//		List<List<String>> em = u.stream().map(user::getEmail).collect(Collectors.toList());
//		
//		System.out.println(em);
		
		
		List<String> email = u.stream().flatMap(k1->k1.getEmail().stream()).collect(Collectors.toList());
		
		System.out.println(email);
		
		
		
		
		
		
		
		
		
	

	}

}
