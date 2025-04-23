package oops;

class Room{
	int l,b;
	Room(int l,int b){
//		super();
		this.l = l;
		this.b = b;
	}
	
	void area() {
		System.out.println("Area = "+(l*b));
	}
}

class LivingRoom extends Room{
	int h;
	LivingRoom(int l,int b, int h){
		super(l,b);
		this.h = h;
	}
	
	void volume() {
		System.out.println("Volume = "+(l*b*h));
	}
}

public class UseOfSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivingRoom lr = new LivingRoom(10,20,30);
		
		lr.area();
		lr.volume();
		
	}

}
