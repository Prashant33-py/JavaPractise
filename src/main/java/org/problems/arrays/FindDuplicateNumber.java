package org.problems.arrays;

import org.App;

/**
 * Question: Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra space.<br/>
 * Example 1:<br/>
 *
 * Input: {@code nums = [1,3,4,2,2]}<br/>
 * Output: 2<br/>
 * Example 2:<br/>
 *
 * Input: {@code nums = [3,1,3,4,2]}<br/>
 * Output: 3<br/>
 * Example 3:<br/>
 *
 * Input: {@code nums = [3,3,3,3,3]}<br/>
 * Output: 3<br/>
 *
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {7,3,4,2,7};
        FindDuplicateNumber fdn = new FindDuplicateNumber();
        int result = fdn.bruteForce(nums);
        if (result < 0){
            System.out.println("No duplicate found");
        } else {
            App.printValue("Duplicate element is: ",result);
        }
    }

    public int bruteForce(int[] nums){
        int start = 0;
        int end = 1;
        while (start < end && start < nums.length-1){
            if (nums[start] == nums[end]){
                return nums[start];
            } else if (end < nums.length - 1) {
                end++;
            } else {
                start++;
                end = start + 1;
            }
        }
        return -1;
    }
}
