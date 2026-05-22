package org.problems.arrays;

import org.App;

import java.util.*;

/**
 * Given an array of integers, return whether target is achievable by adding 2 numbers from the array.
 */
public class TwoSumType1 {

    public boolean twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int currentSum = nums[left]+nums[right];
            if (currentSum < target){
                left++;
            } else if (currentSum > target){
                right--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        TwoSumType1 ts = new TwoSumType1();
		boolean result = ts.twoSum(nums, target);
        App.printValue("Can the target be achieved",result);
    }
}
