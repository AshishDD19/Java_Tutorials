package SinglyLinkedList;

//Node creation
class Node {
	int data;
	Node next;

	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	static Node head;
	Node rev;

	public static int size() {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public void print() {
		Node curr = head;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
	}

	public void add_last(int ele) {
		Node temp = new Node(ele);

		if (head == null) { // ll is empty
			head = temp;
		} else {
			Node curr = head;

			while (curr.next != null) {
				curr = curr.next;

			}

			curr.next = temp;

		}

	}

	public void add_first(int ele) {
		Node temp = new Node(ele);

		if (head == null) {
			head = temp;
		} else {
			temp.next = head;

			head = temp;

		}
	}

	public void delete_last() {

		if (head == null) {
			System.out.println("Linked List is empty!");
		} else if (head.next == null) {
			head = null;
		} else {
			Node curr = head;
			while (curr.next.next != null) {
				curr = curr.next;
			}

			curr.next = null;
		}

	}

	public void delete_first() {
		if (head == null) {
			System.out.println("Linked List is empty!");
		} else if (head.next == null) {
			head = null;
		} else {
			Node curr = head;
			head = head.next;
			curr.next = null;

		}
	}

	public void add_at_index(int index, int ele) {
		if (index < 0 || index > size()) {
			System.out.println("invalid index!");
			return;
		}
		if (index == 0) {
			add_first(ele);
		} else if (index == size()) {
			add_last(ele);
		} else {
			Node curr = head;
			Node temp = new Node(ele);
			for (int i = 0; i < index-1; i++) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}

	}

	public void del_at_index(int index) {
		if (index < 0 || index > size()) {
			System.out.println("invalid index!");
			return;
		}
		if (index == size() - 1) {
			delete_last();
		} else if (index == 0) {
			delete_first();
		}
		Node curr = head;
		for (int i = 0; i < index-1; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
	}

	
	public  int get_first() {
		if(head == null) {
			System.out.println("LL is empty!");
		}
		return head.data;
	}

	
	public int get_last() {
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		return curr.data;
	}
	
	public int get_ele_at_index(int index) {
		if (index < 0 || index > size()) {
			System.out.println("invalid index");
			return -1;
		}
		if (index == size() - 1) {
			return get_last();
		} else if (index == 0) {
			return get_first();
		}
		else {
			Node curr = head;
			for (int i = 0; i < index; i++) {
				curr = curr.next;
			}
			return curr.data;
		}
	}
	
	
	public void add_after_ele(int ele, int newEle) {

		Node curr = head;
		Node temp = new Node(newEle);
		while (curr.next != null) {

			if (curr.data == ele) {

				temp.next = curr.next;
				curr.next = temp;
				return;
			}
			curr = curr.next;

		}
		if (curr.data == ele) {// if ele is at last
			curr.next = temp;
			return;
		}
		System.out.println("No such element found!");

	}


	
	public void reverse() {
		if(head == null) {
			System.out.println("linked list is empty..!");
			return;
		}
		
		if(head.next == null) {
			rev = head;
		}
		else {
			Node curr = head;
			
			while(curr != null) {
				Node temp = new  Node(curr.data);
				temp.next = rev;
				rev = temp;
				curr = curr.next;
			}
		}
		Node currrev = rev;
		
		while(currrev != null) {
			System.out.print(currrev.data+"->");
			currrev = currrev.next;
		}
		System.out.println();
		
		
	}
	
	public boolean isPallindrome() {
		Node curr = head;
		Node revcurr = rev;
		
		while(curr != null) {
			if(curr.data != revcurr.data) {
				return false;
			}
			curr = curr.next;
			revcurr = revcurr.next; 
		}
		
		return true;
	}

}

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();

		System.out.println("Add last");
		ll.add_last(10);
		ll.add_last(20);
		ll.add_last(30);
		ll.add_last(20);
		ll.add_last(10);
		ll.print();

//		System.out.println();
//		System.out.println("Add first");
//		ll.add_first(99);
//		ll.add_first(59);
//		ll.add_first(67);
//		ll.print();

//		System.out.println();
//		System.out.println("Delete last");
//		ll.delete_last();
//		ll.delete_last();		
//		ll.print();
//		
//		System.out.println();
//		System.out.println("Delete first");
//		ll.delete_first();
//		ll.delete_first();
//		ll.print();

//		System.out.println();
//		ll.add_after_ele(50, 25);
//		ll.print();
//
//		System.out.println();
//		System.out.println(LinkedList.size());
//		
//		System.out.println(ll.get_first());
//		System.out.println(ll.get_last());
//		System.out.println(ll.get_ele_at_index(5));
//		
//		ll.add_at_index(3, 22);
//		ll.print();
//		
//		System.out.println();
//		ll.del_at_index(4);
//		ll.print();
		
		System.out.println();
		ll.reverse();
		
		if(ll.isPallindrome()) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not pallindrome..!");
		}
	}

}
