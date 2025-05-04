package multiThreading;

class Thread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.println("Thread "+i);
		}
	}
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting");
		
		Thread2 t1 = new Thread2();
		t1.setDaemon(true);
		t1.start();
	
		System.out.println("Main thread exit");
		
	}

}
