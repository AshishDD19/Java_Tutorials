package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,12,-1,3};
		int large = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > large) {
                second = large;
                large = num;
            } else if (num > second && num != large) {
                second = num;
            }
        }
		
		System.out.println(second);

	}

}
