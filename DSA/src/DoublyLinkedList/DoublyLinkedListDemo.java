package DoublyLinkedList;

class Node{
	int data;
	Node next;
	Node prev;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	
}


class DoublyLinkedList{
	static Node head;
	Node tail;
	Node rev;
	
	public static int size() {
		Node curr = head;
		int count = 0;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		
		return count;
	}
	
	
	public void print() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public void print_rev() {
		Node curr = tail;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.prev;
		}
		System.out.println();
	}
	
	public void add_last(int ele) {
		Node temp = new Node(ele);
		
		if(tail == null ) {
			head = temp;
			tail = temp;
		}
		else {
			 
			temp.prev = tail;
			tail.next = temp;
			tail = tail.next; //tail = temp
		}
	}
	
	public void add_fisrt(int ele) {
		Node temp = new Node(ele);
		
		if(head == null ) {
			head = temp;
			tail = temp;
		}
		else {
			temp.next = head;
			head.prev = temp;
			head = temp;//head = head.prev
		}
	}
	
	public void delete_first() {
		if(head == null) {
			System.out.println("Linked List is empty!");
		}
		else if(head.next == null) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}
	
	
	public void delete_last() {
		if(head == null) {
			System.out.println("Linked List is empty!");

		}
		else if(head.next == null) {
			tail = null;
			head = null;
		}
		else {
			
			tail = tail.prev;
			tail.next = null;
			
		}
		
	}
	
	public void add_at_index(int index, int ele) {
		if(index < 0 || index > size()) {
			System.out.println("invalid index!");
			return;
		}
		if(index == 0) {
			add_fisrt(ele);
		}
		else if(index == size()) {
			add_last(ele);
		}
		else {
			Node temp = new Node(ele);
			Node curr = head;
			
			for(int i=0;i < index-1 ;i++) {
				curr = curr.next;
			}
			
			temp.next = curr.next;
			temp.prev = curr;
			temp.next.prev = temp;
			curr.next = temp;
			
		}
	}
	
	
	public void delete_at_index(int index) {
		if(index < 0 || index > size()) {
			System.out.println("invalid index!");
			return;
		}
		if(index == 0) {
			delete_first();
		}
		else if(index == size()) {
			delete_last();
		}
		else {
			Node curr = head;
			
			for(int i=0 ;i < index-1;i++) {
				curr = curr.next;
			}
			
			curr.next = curr.next.next;
			curr.next.prev = curr;
			
			
		}
		
	}
	
	
	public void get_first() {
		if(head == null) {
			System.out.println("LL is empty!");
		}
		else {
			System.out.println(head.data);
		}
	}
	
	public void get_last() {
		if(tail == null) {
			System.out.println("LL is empty!");
		}
		else {
			System.out.println(tail.data);
		}
	}
	
	public void get_at_index(int index) {
		if(index < 0 || index > size()) {
			System.out.println("invalid index!");
			return;
		}
		
		if(index == 0) {
			get_first();
		}
		else if(index == size()) {
			get_last();
		}
		else {
			Node curr = head;
			
			for(int i=0;i<index;i++) {
				curr = curr.next;
			}
			System.out.println(curr.data);
			
		}
	}
	
	
	public void reverse() {
		if(head == null) {
			System.out.println("LL is empty..!");
			return;
		}
		if(head.next == null) {
			rev = head;
		}else {
			Node curr = head;
			Node first = null;
			
			while(curr != null) {
				first = curr.prev;
				curr.prev = curr.next;
				curr.next = first;
				
				curr = curr.prev;
			}
			
			head = first.prev;
			
			
		}
		
		rev = head;
		while(rev != null) {
			System.out.print(rev.data+"<->");
			rev = rev.next;
		}
		System.out.println();
		
		
	}
	
	
	
	
}

public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add_last(10);
		dll.add_last(20);
		dll.add_last(30);
		dll.add_last(40);
		dll.print();
		dll.print_rev();
		
		dll.add_fisrt(33);
		dll.add_fisrt(22);
		dll.print();
		dll.print_rev();
		
		
//		dll.delete_last();
//		dll.delete_last();
//		dll.print();
//		dll.print_rev();
//		
//		dll.delete_first();
//		dll.print();
//		dll.print_rev();
		
		
		dll.add_at_index(3,88);
		dll.print();
		dll.print_rev();
		
		dll.delete_at_index(3);
		dll.print();
		dll.print_rev();
		
		dll.get_first();
		dll.get_last();
		
		dll.get_at_index(3);
		
		dll.reverse();
		
		
		
	}

}
