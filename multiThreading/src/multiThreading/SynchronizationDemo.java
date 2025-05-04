package multiThreading;


class Table{
	synchronized void display(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n+" "+Thread.currentThread().getName());
		}
	}
}

class ThreadX extends Thread{
	
	Table tb;
	
	ThreadX(Table tb){
		this.tb = tb;
	}
	public void run() {
		tb.display(5);
	}
}


class ThreadY extends Thread{
	Table tb;
	
	ThreadY(Table tb){
		this.tb = tb;
	}
	
	public void run() {
		tb.display(6);
	}
}


public class SynchronizationDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table tb = new Table();
		 
		ThreadX t1 = new ThreadX(tb);
		ThreadY t2 = new ThreadY(tb);
		
		t1.start();
		t2.start();
	}

}
