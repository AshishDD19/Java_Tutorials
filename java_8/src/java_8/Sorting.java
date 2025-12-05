package java_8;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(12);
		al.add(9);
		al.add(45);
		
		System.out.println("Before sorting:"+al);
		Collections.sort(al, (a,b)-> (a<b) ? -1 : 1);
		System.out.println("Ascending sorting:"+al);
		
		Collections.sort(al, (a,b)-> (a>b) ? -1 : 1);
		System.out.println("Descending sorting:"+al);
	}

}
