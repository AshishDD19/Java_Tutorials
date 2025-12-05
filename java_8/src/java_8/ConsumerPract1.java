package java_8;

import java.util.function.Consumer;

class PS{
	String name;
	String mock;
	
	public PS(String name) {
		
		this.name = name;
		System.out.println("Hi "+name+" Have u cleared the mock?");
		mock = "no";
	}
	
	public void took_mock() {
		mock = "cleared";
		System.out.println(name+", Welcome to PS placement!!");
	}
	
	
}
public class ConsumerPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PS ps1 = new PS("Ashish");
		
		Consumer<PS> c = (ps) -> ps.took_mock();
		c.accept(ps1);
		
	}

}
