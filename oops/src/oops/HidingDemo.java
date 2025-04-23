package oops;

class X{
	int i;
}

class Y extends X{
	int i;//name clash btw parent and child class's variable
	
	Y(int x,int y){
		i = x; //X's i
		i = y; //Y's i
	}
	
	void disp() {
		System.out.println("X's i = "+i);
		System.out.println("Y's i = "+i);
	}
}


class Z extends X{
	int i;
	
	Z(int x, int y){
		super.i = x; // X's i
		i = y;  //Z's i
	}
	
	void disp() {
		System.out.println("X's i = "+super.i);
		System.out.println("Z's i = "+i);
	}
}


public class HidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y(10,20);
		y.disp();
		
		Z z  =new Z(10,20);
		z.disp();
	}

}
