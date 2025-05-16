package org.algorithms;

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
