package strings;

public class SortingStringValues {
	
	public static void bubbleSort(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pentagon";
		String res = "";
		char arr[] = str.toCharArray();
		
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			res = res + arr[i];
		}
		System.out.println(res);
	}

}
