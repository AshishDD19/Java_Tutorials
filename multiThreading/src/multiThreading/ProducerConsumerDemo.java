package multiThreading;


class SharedData{
	int data;
	boolean writable = true;
	
	synchronized void produce(int x) {
		if(writable == false) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		data = x;
		System.out.println("Produced "+x);
		writable = false;
		notify();
		
	}
	
	
	synchronized int consume() {
		if(writable == true){
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		writable = true;
		notify();
		
		return data;
	}
	
}

class Producer extends Thread{
	
	SharedData sd;
	
	Producer(SharedData sd){
		this.sd = sd;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			sd.produce(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	SharedData sd;
	
	Consumer(SharedData sd){
		this.sd = sd;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Consumed value is: "+sd.consume());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedData sd = new SharedData();
		
		Producer p = new Producer(sd);
		Consumer c = new Consumer(sd);
		
		p.start();
		c.start();

	}

}
