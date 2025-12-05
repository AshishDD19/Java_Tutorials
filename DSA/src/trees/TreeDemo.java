package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeDemo {
	Node root;

	public static void pre_order(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		pre_order(root.left);
		pre_order(root.right);
	}

	public static void in_order(Node root) {
		if (root == null) {
			return;
		}
		in_order(root.left);
		System.out.print(root.data + " ");
		in_order(root.right);

	}

	public static void post_order(Node root) {
		if (root == null) {
			return;
		}
		post_order(root.left);
		post_order(root.right);
		System.out.print(root.data + " ");
	}

	public static void level_order(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.poll();

			System.out.print(temp.data + " ");

			if (temp.left != null) {
				q.add(temp.left);
			}

			if (temp.right != null) {
				q.add(temp.right);
			}
		}
	}

	public static void level_order_1(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 1; i <= size; i++) {

				Node temp = q.poll();
				System.out.print(temp.data + " ");

				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}

			}
			System.out.println();

		}
	}

	public static void level_order_2(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node temp = q.poll();

			if (temp == null) {
				System.out.println();

				if (!q.isEmpty()) {
					q.add(null);
				}

			} else {
				System.out.print(temp.data + " ");
				
				if (temp.left != null) {
					q.add(temp.left);
				}

				if (temp.right != null) {
					q.add(temp.right);
				}

			}

		}
	}
	
	
	public static void zigzag_level_order(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean l_r = true;
		
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> list  = new  ArrayList<>();
			

			for (int i = 1; i <= size; i++) {

				Node temp = q.poll();
				list.add(temp.data);

				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}

			}
			
			if(!l_r) {
				Collections.reverse(list);
			}
			
			for(int i : list) {
				System.out.print(i+" ");
			}
			  
			if(l_r) {
				l_r = false;
			}
			else {
				l_r = true;
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.left.right = new Node(7);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right = new Node(3);
		root.right.left = new Node(9);

		System.out.print("Pre-order: ");
		pre_order(root);
		System.out.println();

		System.out.print("In-order: ");
		in_order(root);
		System.out.println();

		System.out.print("Post-order: ");
		post_order(root);
		System.out.println();

		System.out.println("Level-order: ");
		level_order(root);
		System.out.println();

		level_order_1(root);
		System.out.println();

		level_order_2(root);
		System.out.println();
		
		zigzag_level_order(root);
		System.out.println();
	}

}
