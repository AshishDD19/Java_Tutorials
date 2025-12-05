package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int optimizeInventory(int[] inventoryAdjustments) {
        List<Integer> positiveAdjustments = new ArrayList<>();
        List<Integer> negativeAdjustments = new ArrayList<>();

        for (int adjustment : inventoryAdjustments) {
            if (adjustment >= 0) {
                positiveAdjustments.add(adjustment);
            } else {
                negativeAdjustments.add(adjustment);
            }
        }

        int currentInventory = 0;
        int shipmentsProcessed = 0;

        for (int positiveAdj : positiveAdjustments) {
            currentInventory += positiveAdj;
            shipmentsProcessed++;
        }

        Collections.sort(negativeAdjustments, Collections.reverseOrder());

        for (int negativeAdj : negativeAdjustments) {
            if (currentInventory + negativeAdj >= 0) {
                currentInventory += negativeAdj;
                shipmentsProcessed++;
            } else {
                break;
            }
        }

        return shipmentsProcessed;
    }
    
    
    public static void main(String[] args) {
    	int arr[] = {3,-5,8,-9,-7};
    	int res = optimizeInventory(arr);
    	System.out.println(res);
	}
}