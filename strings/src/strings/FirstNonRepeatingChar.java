package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static char nonRepeat(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else {
				map.put(ch, 1);
			}
		}
		for(char ch : map.keySet()) {
			if(map.get(ch) == 1) {
				return ch;
			}
		}
		
		return '\0';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required String:");
		String res = sc.next();
		
		if(nonRepeat(res) != '\0') {
			System.out.println("First non-repeating character: "+nonRepeat(res));
		}
		else {
			System.out.println("First non-repeating character: -1");
		}
	
	}

}
