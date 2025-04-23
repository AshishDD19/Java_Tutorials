package oops;


abstract class Plane2{
	abstract void takeOff();
	abstract void land();
}

class Cargo2 extends Plane2{
	void takeOff() {
		System.out.println("cargo tookoff");
	}
	void land() {
		System.out.println("cargo land");
	}
}

class Passenger2 extends Plane2{
	void takeOff() {
		System.out.println("Passenger tookoff");
	}
	void land() {
		System.out.println("Passenger land");
	}
}

class Airport1{
	void allowPlane(Plane2 ref) {
		ref.takeOff();
		ref.land();
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo2 c = new Cargo2();
		Passenger2 p =new Passenger2();
		
		Airport1 a = new Airport1();
		
		a.allowPlane(c);
		a.allowPlane(p);
	}

}
