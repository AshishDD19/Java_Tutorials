package problems;


class LNode {
    int data;
    LNode next;

    LNode(int x) {
        this.data = x;
        this.next = null;
    }
}


public class SortLinkedList {

	public static LNode mergeLL(LNode list1, LNode list2) {
		
		
		LNode dummy = new LNode(-1);
		LNode temp = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.data <= list2.data) {
				temp.next = list1;
				list1 = list1.next; 
			}
			else {
				temp.next = list2;
				list2 = list2.next;
			}
			
			temp = temp.next;
		}
		
		while(list1 != null) {
			temp.next = list1;
			list1 = list1.next;
			temp = temp.next;
		}
		
		while(list2 != null) {
			temp.next = list2;
			list2 = list2.next;
			temp = temp.next;
		}
		
		
		//because first node has -1
		return dummy.next;
		
		
	}
	
	public static LNode findMiddle(LNode head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		LNode slow = head;
		LNode fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static LNode sortLL(LNode head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		//find middle
		LNode middle = findMiddle(head);
		
		//split the LL
		LNode left = middle.next;
		middle.next = null;
		LNode right = head;
		
		left = sortLL(left);
		right = sortLL(right);
		
		
		return mergeLL(left, right);
	}
	
	
    static void printLinkedList(LNode head) {
        // Temp pointer to traverse
        LNode temp = head;

        // Traverse and print nodes
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create linked list: 3 -> 2 -> 5 -> 4 -> 1
        LNode head = new LNode(3);
        head.next = new LNode(2);
        head.next.next = new LNode(5);
        head.next.next.next = new LNode(4);
        head.next.next.next.next = new LNode(1);

        // Print original list
        System.out.print("Original Linked List: ");
        printLinkedList(head);


        // Sort the linked list
        head = sortLL(head);

        // Print sorted list
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);

	}

}
