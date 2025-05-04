package multiThreading;

class Table1{
	synchronized void display(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n+" "+Thread.currentThread().getName());
		}
	}
}

class ThreadM extends Thread{
	

	public void run() {
		Table tb = new Table();
		tb.display(5);
	}
}


class ThreadN extends Thread{

	
	public void run() {
		Table tb = new Table();
		tb.display(6);
	}
}

public class SynchronizationNotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadM t1 = new ThreadM();
		ThreadN t2 = new ThreadN();
		
		t1.start();
		t2.start();

	}

}
