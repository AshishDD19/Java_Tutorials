package multiThreading;

import java.util.Scanner;

class Task4 extends Thread{
	
	Task4(String name){
		super(name);
//		start();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter password");
		int pwd = sc.nextInt();
		System.out.println("Login Successfull");
	}
}


class Task5 extends Thread{
	Task5(){
//		start();
	}
	
	public void run() {
		int a = 10, b = 20;
		System.out.println(a+b);
	}
}

class Task6 extends Thread{
	Task6(){
//		start();
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("HI HELLO!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class NamingThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 t4 = new Task4("Login");// naming using constructor
		Task5 t5 = new Task5();
		Task6 t6 = new Task6();
		
		//using method
		t6.setName("Printing");
		System.out.println(t4.getName());
		System.out.println("Default name: "+t5.getName());
		System.out.println(t6.getName());
	}

}
