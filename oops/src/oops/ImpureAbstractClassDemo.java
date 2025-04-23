package oops;

import java.util.Scanner;

abstract class Shapes{
	float area;
	//abstract method
	abstract void input();
	
	abstract void calcArea();
	
	//concrete method
	void disp() {
		System.out.println("Area = "+area);
	}
}

class Square extends Shapes{
	float l;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextFloat();
	}
	
	void calcArea() {
		area = l*l;
	}
	
}

class Rectangle extends Shapes{
	float l,b;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextFloat();
		System.out.println("Enter the breadth: ");
		b = sc.nextFloat();
	}
	
	void calcArea() {
		area = l*b;
	}
}

class Circle extends Shapes{
	float r;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextFloat();
	}
	
	void calcArea() {
		area = 3.14f * r * r;
	}
}

class Geometry{
	void allowShapes(Shapes ref) {
		ref.input();
		ref.calcArea();
		ref.disp();
	}
}

public class ImpureAbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		
		g.allowShapes(s);
		g.allowShapes(r);
		g.allowShapes(c);
	}

}
