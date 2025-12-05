package problems;

public class TrappingRainWater {
	
	public static int trappinWater(int arr[]) {
		int tot = 0;
		int n = arr.length;
		
		int []leftMax = new  int[n];
		int [] rightMax = new int[n];
		
		//leftMax
		leftMax[0] = arr[0];
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}
		
		//rightMax
		rightMax[n-1] = arr[n-1];
		for(int i=n-2 ;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			tot += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
		}
		return tot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,1,2,4,0,1,3,2};
		int[] arr = {	0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappinWater(arr));
	}

}
