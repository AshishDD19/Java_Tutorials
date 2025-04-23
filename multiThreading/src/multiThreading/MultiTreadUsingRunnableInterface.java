package multiThreading;

class Test6 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("HI HELLO");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiTreadUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = new Test6();
		
		//invoking start() method using Thread class
		Thread th = new Thread(t);
		th.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("YO!");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
