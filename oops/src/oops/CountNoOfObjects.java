package oops;

class Demo1{
	static int count;

	Demo1(){
		
	}
	Demo1(int a){
		
	}
	Demo1(int a,int b){
		
	}
	
	//Non-static block , executed every time an object is created
	{
		count++;
	}

}

public class CountNoOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1();
		Demo1 d4 = new Demo1(10);
		Demo1 d5 = new Demo1(10,20);
		
		System.out.println("No. of Object created is: "+Demo1.count);

	}

}
