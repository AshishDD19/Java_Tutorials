package multiThreading;

class ThreadB implements Runnable{
	
	ThreadB(){
		 new Thread(this).start();
		
		
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}

public class UsingRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadB th = new ThreadB();
		


	}

}
