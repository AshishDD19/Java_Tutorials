package problems;

public class ContainerWithMaxWater {

	public static int MaxWater(int arr[]) {
		int res = 0;
		int n = arr.length;
		
		int l=0;
		int r = n-1;
		
		while(l<r) {
			int area = Math.min(arr[l],arr[r]) * (r - l);
			res = Math.max(area, res);
			
			if(arr[l] < arr[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(MaxWater(arr));
	}

}
