package multiThreading;


class Thread4 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting");
		
		//using lambda Expression
		Thread t = new Thread(() -> {
			for(int i=0;i<6;i++) {
				System.out.println(Thread.currentThread()+" "+i);
			}
		},"thread3");
		
		t.start();
		
		System.out.println("Main thread exiting");
	}

}
