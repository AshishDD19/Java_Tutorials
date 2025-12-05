package Graph;


class AdjMatrix{
	
	int Nodes;
	int [][] arr;
	
	public AdjMatrix(int Nodes) {
		// TODO Auto-generated constructor stub
		this.Nodes = Nodes;
		arr = new int [Nodes][Nodes];
	}
	
	
	public void addEdges(int src,int des) {
		arr[src][des] = 1;
		arr[des][src] = 1;
	}
	
	
	public void print_matrix() {
		for(int i=0;i<Nodes;i++) {
			for(int j=0;j<Nodes;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
public class GraphAdjMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjMatrix am = new AdjMatrix(6);
		
		am.addEdges(0, 1);
		am.addEdges(0, 2);
		am.addEdges(1, 2);
		am.addEdges(1, 3);
		am.addEdges(1, 4);
		am.addEdges(2, 5);
		am.addEdges(4, 5);
		
		am.print_matrix();

	}

}
