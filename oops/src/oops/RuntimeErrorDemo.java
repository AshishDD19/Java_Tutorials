package oops;


class Test4{
	void func1(){
		func2();
	}
	
	void func2() {
		func1();
	}
}

public class RuntimeErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long arr[] = new long[999999999]; //OutOfMemoryError
		
		Test4 t = new Test4();
		
		t.func1();//StackOverFlowError 
	}

}
