package multiThreading;


class ThreadA extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}

public class JoinMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA th1 = new ThreadA();
		
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		
		}
	}

}
