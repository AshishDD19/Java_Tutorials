package Stack;

import java.util.Stack;

public class ParenthesesValidation {

	public static boolean validParentheses(String str) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				
				char top = st.pop();
				if((ch == '}' && top != '{' ) || (ch == ']' && top != '[') || (ch == ')' && top != '(') ) {
					return false;
				}
			}
			
		}
		
		if(st.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{{[]}}()";
		
		if(validParentheses(str)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid..!");
		}
	}

}
