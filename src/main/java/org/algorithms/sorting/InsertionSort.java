package org.algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] nums = {19, 5, 15, 4, 1};
//        int[] nums = {9,8,7,6,5,4,3,2,1};
        int[] nums = {6, 5, 2, 8, 3, 7};
        System.out.println("Insertion sort: Array before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        nums = insertionSort(nums);

        System.out.println();
        System.out.println("Selection sort: Array after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static int[] insertionSort(int[] nums) {
        int arrSize = nums.length;
        int temp = 0;
        for (int i = 1; i < arrSize; i++) {
            int currElement = nums[i];
            int key = 0;
            for (int j = i; j >= 0; j--) {
                if (nums[j] > currElement) {
                    temp = currElement;
                    nums[j + 1] = nums[j];
                    key = j;
                }
            }
            nums[key] = temp;
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        return nums;

    }
}
