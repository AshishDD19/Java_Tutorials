package java8features;

interface Employee3{
	public String getSalary();
	
	public String getName();
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 emp = new Employee3(){
			
			@Override
			public String getSalary() {
				// TODO Auto-generated method stub
				return "10000";
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "SDE";
			}
		}; 
		
		System.out.println(emp.getSalary());
		System.out.println(emp.getName());
	}

}
