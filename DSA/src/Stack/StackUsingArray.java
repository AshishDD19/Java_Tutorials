 package Stack;

public class StackUsingArray {
	
	int [] stack;
	int size;
	int top;
	
	public StackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.top = -1;
		this.stack = new int[size];
	}
	
	
	public void push(int ele) {
		if(top == size - 1) {
			System.out.println("Stack overflow..!");
			return;
		}
		stack[++top] = ele;
		System.out.println(ele+" is added to stack");
	}
	
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack underflow..!");
			return -1;
		}
		int last = stack[top];
		top--;
		return last;
	}
	
	
	public int peek() {
		if(top == -1) {
			System.out.println("Stack underflow..!");
			return -1;
		}
		return stack[top];
	}
	
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top == size - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		if(!isEmpty()) {
			for(int i= top;i>=0;i--) {
				System.out.println(stack[i]);
			}
			System.out.println();
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray s = new StackUsingArray(5);
		
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.push(55);
		s.push(66);
		
//		System.out.println(s.peek());
		
		
		s.print();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
