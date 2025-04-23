package oops;

class Books{
	
	private int pages;
	
	//Setters or Mutators
	public void setData(int x) { 
		if(x>0) {
			pages = x;
		}
	}
	
	//Getters or Accessers
	public int getData() {
		return pages;
		
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books bk = new Books();
//		bk.pages = 100   cannot be accessed
		bk.setData(100);
//		System.out.println(bk.pages);  cannot be accessed
		
		System.out.println(bk.getData());
		bk.setData(-100);
		System.out.println(bk.getData());
	}

}
