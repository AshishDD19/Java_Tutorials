package java_8;

import java.util.Optional;
import java.util.Scanner;

class Penta{
	public String getMockStatusById(Integer id) {
		if(id == 10) {
			return "cleared";
		}
		else if(id == 11) {
			return "not cleared";
		}
		else {
			return null;
		}
	}
	
	public Optional<String> getStudentName(Integer id){
		String name = null;
		if(id == 10) {
			name = "Ashish";
		}
		else if(id == 11){
			name = "Bob";
		}
		return Optional.ofNullable(name);
	}
	
	
}
public class OptionalPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = sc.nextInt();
		Penta p = new Penta();
		
//		String s1 = p.getMockStatusById(id);
//		String msg = s1.toUpperCase()+",Welcome to pentagon";
//		System.out.println(msg);
		
		Optional<String> name = p.getStudentName(id);
		if(name.isPresent()) {
			System.out.println("Welcome "+name.get().toUpperCase());
		}
		else {
			System.err.println("Data not found");
		}
	}

}
