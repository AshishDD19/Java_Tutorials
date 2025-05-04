package multiThreading;


//using Thread class
class Thread1 extends Thread{
	
	Thread1(String threadName){
		super(threadName);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<6;i++) {
			System.out.println("Thread "+Thread.currentThread().getName()+" "+i);
		}
	}
}


//using Runnable interface
class Thread3 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread()+" "+Thread.currentThread().getName()+" "+i);
		}
	}
}

public class MTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting");
		
		Thread t1 = new Thread1("thread1");
		t1.start();
		
//		Runnable t = new Thread3();
		Thread t2 = new Thread(new Thread3(), "thread2");
		t2.start();
		System.out.println(t2.getName());
	
		System.out.println("Main thread exit");
		
	}

}
