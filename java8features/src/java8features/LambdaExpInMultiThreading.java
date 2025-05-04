package java8features;

public class LambdaExpInMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		
		Thread th = new Thread(runnable);
		
		th.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
