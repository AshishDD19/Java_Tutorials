package java_8;


class MethodRef1{
	public MethodRef1() {
		// TODO Auto-generated constructor stub
		System.out.println("Construtor called using method reference");
	}
}

interface MethodRefConst{
	void func1();
}

public class MethodRefernceForConstructor { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRefConst mr = MethodRef1 :: new;   //Class name :: new
		mr.func1();
	}

}
