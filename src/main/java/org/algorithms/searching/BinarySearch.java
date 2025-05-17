package org.algorithms.searching;

/**
 * Binary search algorithm steps:<br/>
 * 1. Given a sorted array with n number of elements, let the left and right be the start and end index of the array<br/>
 * 2. Find the middle element of the array using this left and right<br/>
 * 2. If the target element matches the middle element, return the element.<br/>
 * 3. If the target element is less than the middle element, change the value of right to middle - 1<br/>
 * 4. Else if the target element is greater than the middle element, change the value of left to middle + 1<br/>
 * 5. Repeat these steps until left is less than right.
 *
 */

public class BinarySearch {
    public static void main(String[] args) {
        //Array in sorted format
        int[] arr = {1, 3, 4, 6, 8, 9, 10, 12, 14};
        //Target element
        int target = 8;
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;
        //Loop until we have traversed throughout the array
        while (left <= right) {
            steps++;
            //Calculate middle
            int middle = (left + right) / 2;
            // If the middle element is equal to target element, break the loop and print it
            if (arr[middle] == target) {
                System.out.println("Steps taken: " + steps);
                System.out.println("Element found at index " + middle);
                break;
            }
            // If the element is less than the target, then shift the value of left to middle + 1
            else if (arr[middle] < target) {
                left = middle + 1;
            }
            //If the element is greater than the target, then shift the value of right to middle - 1
            else {
                right = middle - 1;
            }
        }
        System.out.println("Steps taken: " + steps);
    }
}
