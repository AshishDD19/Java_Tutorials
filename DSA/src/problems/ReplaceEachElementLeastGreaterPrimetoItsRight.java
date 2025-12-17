package problems;

import java.util.Arrays;

public class ReplaceEachElementLeastGreaterPrimetoItsRight {

	
	public static int[] replaceWithLeastGreaterPrime(int[] arr) {
		
		PrimeCheckDiffMethod prime = new PrimeCheckDiffMethod();
		int n = arr.length;
		int[] res = new  int[n];
		
		for(int i=0;i<n;i++) {
			int minPrime = Integer.MAX_VALUE;
			
			for(int j=i+1 ;j<n;j++) {
				if(arr[j] > arr[i]  && prime.primeCheck(arr[j]) ) {
					minPrime = Math.min(minPrime, arr[j]);
				}
			}
			
			res[i] = (minPrime == Integer.MAX_VALUE) ? -1 : minPrime;
		}
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {4,6,8,7,11,10};
		int[] arr = {5,8,3,2,7};
		int[] res = replaceWithLeastGreaterPrime(arr);
		System.out.println(Arrays.toString(res));
	}

}
