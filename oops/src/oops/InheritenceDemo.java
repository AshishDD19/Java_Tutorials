package oops;

class Plane{
	
	void takeOff() {
		System.out.println("Plane took off");
	}
	
	void land() {
		System.out.println("Plane has landed");
	}
	
	void fly() {
		System.out.println("Plane is flying");
	}
}

class Cargo extends Plane{
	  
	void fly() {
		System.out.println("Plane is flying with goods");
	}
}

class Passenger extends Plane{
	//method overriding
	void fly() {
		System.out.println("Plane is flying with people");
	}
}

class Fighter extends Plane{
	//method overriding
	void fly() {
		System.out.println("Plane is flying with weapons");
	}
	
//	specialized method
	void shoot() {
		System.out.println("Plane is firing bullets");
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f = new Fighter();
		c.takeOff();
		c.fly();
		c.land();
		p.takeOff();
		p.fly();
		p.land();
		f.takeOff();
		f.fly();
		f.shoot();
		f.land();

	}

}
