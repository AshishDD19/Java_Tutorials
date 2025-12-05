package java_8;


interface Lamda3{
	int func(int a[], int b);
}
public class LamdaPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5};
		Lamda3 l = (a, b) -> {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b) {
					return i; 
				}
			
			}
			return -1;
		};
		
		System.out.println(l.func(arr, 4));
	}

}
