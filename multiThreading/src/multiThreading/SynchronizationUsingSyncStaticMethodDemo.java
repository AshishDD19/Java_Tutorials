package multiThreading;

class Table3{
	synchronized static void display(int n) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i*n+" "+Thread.currentThread().getName());
		}
		
	}
	
}

class Thread13 extends Thread{
	
	public void run() {
		Table3.display(5);
	}
}


class Thread14 extends Thread{
	
	public void run() {
		Table3.display(6);
	}
}


public class SynchronizationUsingSyncStaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread13 t1 = new Thread13();
		Thread14 t2 = new Thread14();
		
		t1.start();
		t2.start();
	}

}
