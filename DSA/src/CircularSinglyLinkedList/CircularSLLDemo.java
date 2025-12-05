package CircularSinglyLinkedList;


class Node{
	int data;
	Node next;
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	
}

class CircularLL{
	Node head;
	
	public void print() {
		if(head == null) {
			System.out.println("LL is empty!");

		}
		else {
			Node curr = head;
			
			do {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}while(curr != head);
			System.out.println();
			
		}
		
	}
	
	
	public void add_last(int ele) {
		Node temp = new Node(ele);
		if(head == null) {//LL is empty
			head = temp;
			temp.next = head;
		}
		
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
	}
	
	
	public void add_first(int ele) {
		Node temp = new Node(ele);
		if(head == null) {//LL is empty
			head = temp;
			temp.next = head;
		}
		
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
			head = temp;
		}
	}
	
	public void delete_last() {
		if(head == null) {
			System.out.println("LL is empty!");
		}
		else if(head.next == head) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next.next != head) {
				curr = curr.next;
			}
			curr.next = head;
		}
	}
	
	public void delete_first() {
		if(head == null) {
			System.out.println("LL is empty!");
		}
		else if(head.next == head) {
			head = null;
		}
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			head = head.next;
			curr.next = head;
		}
	}
	
	
	
}
public class CircularSLLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL ll = new CircularLL();
		
		ll.add_last(10);
		ll.add_last(20);
		ll.add_last(30);
		ll.add_last(40);
		ll.print();
		
		ll.add_first(22);
		ll.add_first(11);
		ll.print();
		
		
		ll.delete_last();
		ll.print();
		
		ll.delete_first();
		ll.delete_first();
		ll.delete_first();
		ll.delete_first();
//		ll.delete_first();
		ll.print();
	}

}
