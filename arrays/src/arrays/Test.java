package arrays;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 101;
		int b= 010;// octal number
		System.out.println(a+b);
		System.out.println();
		
		int c = 10;
		System.out.println(++c);
		System.out.println(--c);
		System.out.println(c++);
		System.out.println(c--);
		
		System.out.println();
		
		int n = 40;
		int m = 229;
		
		int val = (n>m) ? n : m;
		System.out.println(val);
	}
}
