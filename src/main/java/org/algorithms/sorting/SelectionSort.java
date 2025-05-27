package org.algorithms.sorting;

import org.App;

/**
 * Selection sort algorithm:<br/>
 * 1. Assume the first element as max.<br/>
 * 2. Compare the max element with every other element in the array.<br/>
 * 3. If the new element is greater than current max, change the max and continue with step 2.<br/>
 * 4. If the new max element is not found till the end of array, then swap the current max with the last element(not exactly the last element, but the last unsorted element).<br/>
 * 5. Back to step 1 until all the elements are sorted in the array.<br/>
 *<br/>
 * E.g. Consider the array {6,5,2,8,3,7}<br/>
 * Array after each iteration<br/>
 * 1st iteration: {6,5,2,7,3,8}<br/>
 * 2nd iteration: {6,5,2,3,7,8}<br/>
 * 3rd iteration: {3,5,2,6,7,8}<br/>
 * 4th iteration: {3,2,5,6,7,8}<br/>
 * 5th iteration: {2,3,5,6,7,8}<br/>
 * 6th iteration: {2,3,5,6,7,8}<br/>
 *
 * Array after sorting: {2,3,5,6,7,8}
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 3, 7};
//        int[] nums = {8,7,6,5,4,3,2,1};

        App.printArray(nums, "Selection sort: Array before sorting");
        nums = selectionSort(nums);

        System.out.println();
        App.printArray(nums, "Selection sort: Array after sorting");
    }

    private static int[] selectionSort(int[] nums) {
        int arrSize = nums.length;
        int temp = 0;
        for (int i = 0; i < arrSize-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j <= arrSize-i-1; j++){
                if (nums[j] > nums[maxIndex]){
                    maxIndex = j;
                }
            }
            temp = nums[arrSize-i-1];
            nums[arrSize-i-1] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
        return nums;
    }
}
