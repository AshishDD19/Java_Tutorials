package oops;

class ParentCon{
	ParentCon(){
		System.out.println("Parent cons");
	}
}

class ChildCon extends ParentCon{
	ChildCon(){
		this(10);
		System.out.println("Child 0 para");
	}
	
	ChildCon(int a){
		this(10,20);
		System.out.println("Child 1 para");
	}
	
	ChildCon(int a,int b){
		System.out.println("Child 2 para");
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCon c = new ChildCon();
	}

}
