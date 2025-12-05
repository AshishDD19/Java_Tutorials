package java_8;

interface Family{
	void pocket_money();
	
}

public class LambdaPract2 {
	int mother = 2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int father = 1000;
		
		LambdaPract2 l = new LambdaPract2();
		
		Family f = () -> {
			l.mother += father;
			System.out.println("Tot money"+l.mother);
		};
		
		f.pocket_money();
		
		l.mother += 500;
		System.out.println("Final amount: "+l.mother);
	}

}
