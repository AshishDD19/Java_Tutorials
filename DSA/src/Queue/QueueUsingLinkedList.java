package Queue;


class Node{
	int data;
	Node next;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}

public class QueueUsingLinkedList {
	Node front;
	Node rear;
	
	
	public void enqueue(int ele) {
		Node temp = new Node(ele);
		if(rear == null) {
			rear = front = temp;
		}
		else {
			rear.next = temp;
			rear = temp;
		}
		System.out.println(ele+" is added to queue");
	}
	
	
	public int dequeue() {
		if(front == null) {
			System.out.println("Queue is empty..!");
			return -1;
		}
		int first = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return first;
	}
	
	
	public int peek() {
		if(front == null) {
			System.out.println("Queue is empty..!");
			return -1;
		}
		return front.data;
	}
	
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}
	
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is empty..!");
		}
		else {
			Node curr = front;
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		
		q.print();
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.print();
		
		System.out.println(q.peek());
	}

}
