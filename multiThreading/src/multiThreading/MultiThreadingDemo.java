package multiThreading;

import java.util.Scanner;

class Task1 extends Thread{
	
	Task1(){
		start();
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


class Task2 extends Thread{
	Task2(){
		start();
	}
	
	public void run() {
		int a = 10, b = 20;
		System.out.println(a+b);
	}
}

class Task3 extends Thread{
	Task3(){
		start();
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

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		
	}

}
