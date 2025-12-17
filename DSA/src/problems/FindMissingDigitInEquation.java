package problems;

public class FindMissingDigitInEquation {

	
	public static boolean evaluate(int a,int b, int c,char op) {
		switch (op) {
        case '+': return a + b == c;
        case '-': return a - b == c;
        case '*': return a * b == c;
        case '/': return b != 0 && a / b == c;
    }
    return false;
	}
	
	public static int findDigit(String equation) {

	

	        equation = equation.replaceAll(" ", "");

	        for (int digit = 0; digit <= 9; digit++) {

	            String exp = equation.replace("X", String.valueOf(digit))
	                                 .replace("?", String.valueOf(digit));

	            String[] parts = exp.split("=");

	            String left = parts[0];
	            int right = Integer.parseInt(parts[1]);

	            char operator = 0;
	            int opIndex = 0;

	            for (int i = 0; i < left.length(); i++) {
	                char ch = left.charAt(i);
	                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                    operator = ch;
	                    opIndex = i;
	                    break;
	                }
	            }

	            int num1 = Integer.parseInt(left.substring(0, opIndex));
	            int num2 = Integer.parseInt(left.substring(opIndex + 1));

	            if (evaluate(num1, num2, right, operator)) {
	                return digit;
	            }
	        }

	        return -1;
	    }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String eq = "1X + 23 = 35";
		String eq = "? * 13 = 39";
		System.out.println(findDigit(eq));

	}
	
//	public static int findDigit(String eq) {
//
//	    for (int digit = 0; digit <= 9; digit++) {
//
//	        String s = eq.replace("X", String.valueOf(digit))
//	                     .replace("?", String.valueOf(digit))
//	                     .replaceAll(" ", "");
//
//	        String[] str = s.split("=");
//	        int res = Integer.parseInt(str[1]);
//
//	        String left = str[0];
//
//	        int opIn = -1;
//	        char opCh = 0;
//
//	        // find operator (skip index 0 to avoid negative sign)
//	        for (int j = 1; j < left.length(); j++) {
//	            char ch = left.charAt(j);
//	            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//	                opIn = j;
//	                opCh = ch;
//	                break;
//	            }
//	        }
//
//	        if (opIn == -1) continue;
//
//	        String n1 = left.substring(0, opIn);
//	        String n2 = left.substring(opIn + 1);
//
//	        // avoid leading zero numbers
//	        if ((n1.length() > 1 && n1.startsWith("0")) ||
//	            (n2.length() > 1 && n2.startsWith("0"))) {
//	            continue;
//	        }
//
//	        int num1 = Integer.parseInt(n1);
//	        int num2 = Integer.parseInt(n2);
//
//	        if (evaluate(num1, num2, res, opCh)) {
//	            return digit;
//	        }
//	    }
//	    return -1;
//	}


}
