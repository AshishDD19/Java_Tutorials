package streamAPI;

import java.util.Arrays;
import java.util.List;

class Emp{
	String name;
	String branch;
	
	
	public Emp(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}
	
	
}
public class MatchMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new  Emp("Ashish","India");
		Emp e2 = new  Emp("Marry","Japan");
		Emp e3 = new  Emp("Bob","UK");
		Emp e4 = new  Emp("Vinay","US");
		
		List<Emp> empL = Arrays.asList(e1,e2,e3,e4);
		
		boolean s1 =  empL.stream().allMatch( s -> s.equals("India"));
		System.out.println(s1);
		boolean s2 =  empL.stream().anyMatch( s -> s.equals("UK"));
		System.out.println(s2);
		boolean s3 =  empL.stream().noneMatch( s -> s.equals("Canada"));
		System.out.println(s3);
	}

}
