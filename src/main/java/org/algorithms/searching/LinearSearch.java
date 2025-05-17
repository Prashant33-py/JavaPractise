package org.algorithms.searching;

/**
 * Linear Search algorithm:<br/>
 * Simplest algorithm of all.<br/>
 * 1. Given an array, check each and every element with the target element.<br/>
 * 2. If the current element matches with the target element, then return that element.<br/>
 * 3. Else return -1 for no element found.
 *
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 6, 8, 9, 10, 12, 14};
        int target = 8;
        int result = linearSearch(numbers, target);
        System.out.println(result > 0 ? "Element found at index: " + result : "Element not found");
    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken to find the number: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken to find the number: " + steps);
        return -1;
    }
}
