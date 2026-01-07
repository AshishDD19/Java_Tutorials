package problems;

public class BuyAndSellStocksOptimized {

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		
		for(int p : prices) {
			
			if(p < minPrice) {
				minPrice = p;
			}
			else {
				maxProfit = Math.max(maxProfit, p - minPrice);
			}
		}
		
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {7, 1, 5, 3, 6, 4};
		 
		 System.out.println(maxProfit(arr));
	}

}
