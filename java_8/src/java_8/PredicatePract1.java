package java_8;

import java.util.function.Predicate;

public class PredicatePract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Ashish","Kiran","Amith","Arun","Vinay"};
		Predicate<String> p = (str) -> str.toLowerCase().charAt(0) == 'a';
		
		for(String s : names) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}

}
