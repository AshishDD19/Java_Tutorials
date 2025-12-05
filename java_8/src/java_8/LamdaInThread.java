package java_8;

public class LamdaInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable t = new Runnable(); cannot create an object
		
//		using anonymous inner function
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous.");
				
			}
		};
		
		new Thread(t1).start();
		
		
//		using lambda expression
		
		Runnable t2 = () -> System.out.println("Lambda expression");
		new Thread(t2).start();
	}

}
