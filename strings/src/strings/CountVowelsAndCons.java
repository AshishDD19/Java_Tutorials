package strings;

public class CountVowelsAndCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "pentagon space ";
		int vowels = 0;
		int cons = 0;
		int space  = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
			else if(ch == ' ') {
				space++;
			}
			else {
				cons++;
			}
		}
		
		System.out.println("Vowels count is :"+vowels);
		System.out.println("Consonents count is :"+cons);
		System.out.println("Space count is :"+space);
	}

}
