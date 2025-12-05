package SinglyLinkedList;


class Node1{
	int data;
	Node1 next;
	
	public Node1(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}
public class Demo {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 n1 = new Node1(10);
		Node1 n2 = new Node1(20);
		Node1 n3 = new Node1(30);
		Node1 n4 = new Node1(40);
		

		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n1.next.next.data);
		System.out.println(n1.next.next.next.data);
//		System.out.println(n1.next.next.next.next.data);  gives NullPointerException
	}

}
