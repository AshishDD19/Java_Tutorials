package practice;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital h1 = new Hospital();
		
		h1.setPid(1);
		h1.setName("Raj");
		h1.setGender('M');
		h1.setAge(34);
		h1.setBloodGroup("O+");
		h1.setDiabetes(128);
		System.out.println(h1.getDiagnosis());
		
		h1.setPid(2);
		h1.setName("Neha");
		h1.setGender('F');
		h1.setAge(25);
		h1.setBloodGroup("A+");
		h1.setDiabetes(101);
		System.out.println(h1.getDiagnosis());
		
		
		
	}

}
