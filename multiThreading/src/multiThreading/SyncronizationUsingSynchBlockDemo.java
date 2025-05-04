package multiThreading;

class Table2{
	void display(int n) {
		
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(i*n+" "+Thread.currentThread().getName());
			}
		}
	}
	
}

class Thread11 extends Thread{
	
	Table2 tb;
	
	Thread11(Table2 tb){
		this.tb = tb;
	}
	public void run() {
		tb.display(5);
	}
}


class Thread12 extends Thread{
	Table2 tb;
	
	Thread12(Table2 tb){
		this.tb = tb;
	}
	
	public void run() {
		tb.display(6);
	}
}

public class SyncronizationUsingSynchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table2 tb = new Table2();
		
		Thread11 t1 = new Thread11(tb);
		Thread12 t2 = new Thread12(tb);
		
		t1.start();
		t2.start();
	}

}
