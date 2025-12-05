package Stack;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}


public class StackUsingLinkedList {
	Node head;
	
	public void push(int ele) {
		Node temp = new Node(ele);
		
		if(head == null) {
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
		System.out.println(ele+" is added to stack");
	}
	
	public int pop() {
		int last = -1;
		if(head == null) {
			System.out.println("Stack is empty");
			
		}
		else {
			last = head.data;
			head = head.next;
		
		}
		return last;
	}
	
	public int peek() {
		if(head == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		return head.data;
	}
	
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		if(!isEmpty()) {
			Node curr = head;
			while(curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
		else {
			System.out.println("Stack is empty..!");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.print();
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println();
		
		s.print();

	}

}
