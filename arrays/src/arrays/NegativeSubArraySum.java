package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubArraySum {
	
    public static int subArray(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum < 0){
                    count++;
                }
              
            }
            

        }
        return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,-2,4,-5,1};

        System.out.println(Arrays.toString(arr));
        int count = subArray(arr);
        System.out.println(count);

	}

}
