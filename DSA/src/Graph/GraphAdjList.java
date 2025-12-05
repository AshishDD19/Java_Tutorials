package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class AdjList{
	int nodes;
	List<List<Integer>> list;
	
	public AdjList(int nodes) {
		// TODO Auto-generated constructor stub
		this.nodes = nodes;
		list = new ArrayList<>();
		for(int i=0;i<nodes;i++) {
			list.add(new ArrayList<>());
		}
	}
	
	public void addEdges(int src, int des) {
		list.get(src).add(des);
		list.get(des).add(src);
	}
	
	
	public void print_list() {
		for(int i=0;i<nodes;i++) {
			System.out.print(i+"--->");
			for(int val : list.get(i)) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	
	
	public void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new  boolean[list.size()];
		
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			
			int val = q.poll();
			System.out.print(val+" ");
			
			for(int neighbor : list.get(val)) {
				if(visited[neighbor] == false) {
					visited[neighbor] = true;
					q.add(neighbor);
				}
			}
		}
	}
	
	public void dfs(int start) {
		Stack<Integer> s = new Stack<>();
		boolean[] visited = new  boolean[list.size()];
		
		s.push(start);
		visited[start] = true;
		
		while(!s.isEmpty()) {
			
			int val = s.pop();
			System.out.print(val+" ");
			
			for(int neighbor : list.get(val)) {
				if(visited[neighbor] == false) {
					visited[neighbor] = true;
					s.add(neighbor);
				}
			}
		}
	}
	
	
}



public class GraphAdjList {
	public static void main(String[] args) {
		
		AdjList al = new AdjList(6);
		
		al.addEdges(0, 1);
		al.addEdges(0, 2);
		al.addEdges(1, 2);
		al.addEdges(1, 3);
		al.addEdges(1, 4);
		al.addEdges(2, 5);
		al.addEdges(4, 5);
		
		al.print_list();
		
		al.bfs(0);
		System.out.println();
		al.dfs(0);
		

		
	}
}
