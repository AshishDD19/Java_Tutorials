package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.push(55);
		System.out.println(s);
		
		System.out.println("top element: "+s.peek());
		
		s.pop();
		
		System.out.println(s);
		System.out.println("top element: "+s.peek());
		
		System.out.println(s.search(11));
		
		System.out.println("Size: "+s.size());
		System.out.println("Capacity: "+s.capacity());
	}

}
