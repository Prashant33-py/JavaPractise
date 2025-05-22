package org.algorithms.sorting;

/**
 * Insertion sort algorithm:<br/>
 * 1. Start checking from second element in the array.<br/>
 * 2. Check the selected element with the previous element.<br/>
 * 3. If the previous element is bigger than the current element, copy the current element to the temp variable.<br/>
 * 4. Shift the bigger element to the current element's position and repeat steps 2 and 3.<br/>
 * 5. Once the shifting is done, move the new current element to the next one.<br/>
 */
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
        System.out.println("Insertion sort: Array after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /*
     * Approach with cleaner code
     */
    private static int[] insertionSort(int[] nums) {
        int arrSize = nums.length;
        for (int i = 1; i < arrSize; i++) {
            int key = nums[i];
            int j = i - 1;
            while ( j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }

    /*private static int[] insertionSort(int[] nums) {
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

    }*/
}
