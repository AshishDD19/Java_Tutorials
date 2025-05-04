package java8features;

interface Employee4{
	public String getSalary();
}

public class AnonymousInnerClassVSLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Employee4 emp1 = () -> {
//			 a = 10;
			System.out.println(a);
			return "2000";
		};
		
		Employee4 emp = new Employee4() {

			int  a = 10;
			@Override
			public String getSalary() {
				// TODO Auto-generated method stub
				System.out.println(this.a);
				return "1000";
			}
			
		};
		
		System.out.println(emp1.getSalary());
		System.out.println(emp.getSalary());
	}

}
