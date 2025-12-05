package Queue;

public class QueueUsingArray {
	
	int queue[];
	int size;
	int front;
	int rear;
	int capacity;
	
	public QueueUsingArray(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.size = 0;
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = -1;
	}
	
	
	
	public void enqueue(int ele) {
		if(isFull()) {
			System.out.println("Queue is full..!");
			return;
		}
		
		queue[++rear] = ele;
		size++;
		System.out.println(ele+" is added to queue");
	}
	
	
	
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty..!");
			return -1;
		}
		
		int first = queue[front];
		front++;
		size--;
		return first;
	}
	
	
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty..!");
			return -1;
		}
		return queue[front];
		
	}
	
	
	
	public void print() {
		if(!isEmpty()) {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
		else {
			System.out.println("Queue is empty..!");
		}
		System.out.println();
	}
	
	
	
	public boolean isEmpty() {
		if(size == 0) {//size == 0;
			return true;
		}
		return false;
	}
	
	
	public boolean isFull() {
		if(rear == capacity-1) {//size == capacity
			return true;
		}
		return false;
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray q = new  QueueUsingArray(5);
		
		q.enqueue(11);
		q.enqueue(22);
		q.enqueue(33);
		q.enqueue(44);

		
		q.print();
		
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
