package org.problems.arrays;

import org.App;

/**
 * Here, we are using sliding window pattern and are sliding using to the right for finding maximum sum of the consecutive elements in an array.
 */
public class MaximumSum {

    public static void main(String[] args) {
        MaximumSum maxSum = new MaximumSum();
        int[] arr = InputUtil.createRandomIntArray(-10, 10);
        App.printArray(arr);
        int k = InputUtil.pickRandomNumber(2, arr.length);
        System.out.println("K is: " +k);
        System.out.println(maxSum.findMaxSumOfConsecutiveElements(arr, k));
    }

    public int findMaxSumOfConsecutiveElements(int[] arr, int k){
        int left = 0;
        int right = k - 1;
        int sum = 0;
        int maxSum = 0;
        for (int i = left; i <= right; i++){
            sum += arr[i];
        }

        while (right < arr.length-1){
            maxSum = Math.max(sum, maxSum);
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
        }
        return maxSum;
    }

}
