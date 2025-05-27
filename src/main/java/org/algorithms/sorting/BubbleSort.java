package org.algorithms.sorting;

import org.App;

/**
 * Bubble sort algorithm:<br/>
 * Simplest sorting algorithm<br/>
 *
 * Given an array with n number of elements, we have to run 2 loops<br/>
 * a. Outer loop for iterating over elements<br/>
 * b. Inner loop for comparing and swapping the elements<br/>
 *
 * Consider an array from the given example - {6,5,2,8,9,4}
 * Array after each iteration:<br/>
 * 1st iteration: {5,2,6,8,4,9}<br/>
 * 2nd iteration: {2,5,6,4,8,9}<br/>
 * 3rd iteration: {2,5,4,6,8,9}<br/>
 * 4th iteration: {2,4,5,6,8,9}<br/>
 * 5th iteration: {2,4,5,6,8,9}<br/>
 * 6th iteration: {2,4,5,6,8,9}<br/>
 *
 */

public class BubbleSort {
    public static void main(String[] args) {
//        int[] nums = {6, 5, 2, 8, 9, 4};
        int[] nums = {8,7,6,5,4,3,2,1};
        int arrSize = nums.length;
        int temp = 0;

        App.printArray(nums, "Bubble sort: Array before sorting");
        nums = bubbleSort(nums);

        System.out.println();
        App.printArray(nums, "Bubble sort: Array after sorting");
    }

    private static int[] bubbleSort(int[] nums) {
        int arrSize = nums.length;
        int temp = 0;
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
