package strings;

public class CapitalizeFirstLetterEachWord {

	public static String toUpper(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(i == 0 || i == str.length()-1) {
				res = res + (char)(ch - 32);
			}
			else {
				res = res + ch;
			}
		}
		return res;
	}
	
    static String cap(String str){
        String[] arr = str.split(" ");
        String res = "";
        for(int i=0;i<arr.length;i++){
            String r = "";
            for(int j=0;j<arr[i].length();j++){
                char ch = arr[i].charAt(j);
                if(j == 0 && (ch >=97 && ch <= 122)){
                    r += (char)(ch - 32);
                }
                else{
                    r += ch;
                }
            }
            res = res + r +" ";
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi how are you";
		System.out.println(str);
		String arr[] = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(toUpper(arr[i]) + " ");
		}
		System.out.println();
		System.out.println(cap(str));
	}

}
