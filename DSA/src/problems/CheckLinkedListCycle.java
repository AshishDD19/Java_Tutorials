package problems;

import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class CheckLinkedListCycle {
	
	//using set 
    static boolean detectLoop(Node head) {
        HashSet<Node> st = new HashSet<>();
        Node curr = head;
        while (curr != null) {

            // if this node is already present
            // in hashmap it means there is a cycle
            if (st.contains(curr))
                return true;

            // if we are seeing the node for
            // the first time, insert it in hash
            st.add(curr);

            curr = curr.next;
        }
        return false;
    }
    
    
    //using fast and slow pointer
    
    public static boolean checkCycle(Node head) {
    	Node slow = head;
    	Node fast = head;
    	
    	while(slow != null && fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		
    		if(slow == fast) {
    			return true;
    		}
    		
    	}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next;

//        if (detectLoop(head))
//            System.out.println("true");
//        else
//            System.out.println("false");

        if (checkCycle(head))
            System.out.println("true");
        else
            System.out.println("false");
	}

}








