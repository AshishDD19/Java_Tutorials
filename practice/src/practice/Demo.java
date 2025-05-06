package practice;

import java.util.Arrays;

public class Demo {

	public static String rev(String str) {
		String res = "";
		for(int i = str.length()-1;i>=0;i--) {
			res += str.charAt(i);
		}
		
		return res;
	}
	
	public static String palliLong(String str) {
		
		String longStr = "";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String res = str.substring(i, j+1);
				if(res.equals(rev(res))) {
					if(res.length() > longStr.length()) {
						longStr = res;
					}
					System.out.println(res);
				}
				
			}
		}
		return longStr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "malayalamu";
		System.out.println(palliLong(str));
		
		
		
		
		
		
		
		
		
		
	}

}
