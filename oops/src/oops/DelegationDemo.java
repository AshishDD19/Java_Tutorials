package oops;

class OS{
	
	OS(){
		System.out.println("OS installed");
	}
	
	void osCheck() {
		System.out.println("OS working");
	}
}

class Charger{
	Charger(){
		System.out.println("Charger ready");
	}
	
	void chargerCheck() {
		System.out.println("Charger working");
	}
}

class Mobile{
	OS s = new OS();
	
	
	Mobile(){
		System.out.println("Mobile ready to use");
	}
	
	void mobileCheck() {
		System.out.println("Mobile working");
	}
	
	void hasA(Charger c) {
		System.out.println("Charger connected");
	}
	
}

public class DelegationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile();
		Charger c = new Charger();
		
		m.hasA(c);
		m.mobileCheck();
		c.chargerCheck();
		m.s.osCheck();
		
		m = null;
		
//		m.mobileCheck();// error
		c.chargerCheck();//works
//		m.s.osCheck();//error
		

	}

}
