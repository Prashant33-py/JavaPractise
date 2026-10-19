package org.problems.arrays;

import org.App;

/**
 * For this, we have used sliding window in a bit different way. This problem statement says that we can only pick cards from either start or end.<br/>
 *
 * So if say we have to pick {@code k = 4} cards from the array {@code arr = [4, 0, 5, 9, 0, 0, 9, 3, 6, 2]}. Then this is how we would traverse it. <br/>
 * Initially, we select left 4 cards lSum = 4+0+5+9=18 and nothing from right rSum = 0 <br/>
 * Now we move to one index to left so we subtract the Kth element from left sum i.e. lSum = 18-7 and add n-1th element rSum = 0+2 <br/>
 *
 * We keep on doing this until we obtain the maxSum, which would be 9+3+6+2 = 20
 */
public class MaximumPointsFromCards {

    public static void main(String[] args) {
        int[] arr = InputUtil.createRandomIntArray(0,10);
//        int k = InputUtil.pickRandomNumber(0, arr.length - 1);
        int k = 4;
        MaximumPointsFromCards mpfc = new MaximumPointsFromCards();

        App.printArray(arr);
        System.out.println("Max sum: "+mpfc.findMaxPointsFromCards(arr, k));
    }

    public int findMaxPointsFromCards(int[] arr, int k){
        int r = arr.length - 1;
        int lSum = 0;
        int rSum = 0;
        for (int i = 0; i < k; i++){
            lSum += arr[i];
        }
        int maxSum = lSum;
        for (int i = 0; i < k; i++){
            lSum = lSum - arr[k - i - 1];
            rSum = rSum + arr[r];

            r--;

            int sum = lSum + rSum;
            if (sum > maxSum){
                maxSum = sum;
            }

        }
        return maxSum;

    }
}
