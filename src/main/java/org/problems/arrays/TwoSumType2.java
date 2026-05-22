package org.problems.arrays;

import org.App;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return the indices of the two elements whose sum is equal to the target
 */
public class TwoSumType2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!numsMap.containsKey(target - nums[i])){
                numsMap.put(nums[i],i);
            }
            else {
                return new int[]{numsMap.get(target-nums[i]),i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        TwoSumType2 ts = new TwoSumType2();
        int[] result = ts.twoSum(nums, target);
        App.printArray(result);
    }
}
