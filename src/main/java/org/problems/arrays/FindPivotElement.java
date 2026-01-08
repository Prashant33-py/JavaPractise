package org.problems.arrays;

import java.util.Arrays;

/**
 * This class contains a method to find the pivot element index in an array.
 * A pivot element is an index such that the sum of elements to its left is equal to
 * the sum of elements to its right. <br/>
 * We have used 2 pointer approach here. One pointer starts from the left and another from the right.
 * We keep moving the pointers towards each other while maintaining the sum of elements on both sides.
 * When both sums are equal, we have found our pivot index.
 * If no such index exists, we return -1.
 * <br/>
 * Example:<br/>
 * Consider the integer array, {@code arr = [1,7,3,6,5,6]}<br/>
 * Output: 3<br/>
 * Explanation:<br/>
 * Initially: left = 0, right = 28 (sum of all elements)<br/>
 * 1st iteration (elem = 1): left = 0 -> 1, right = 28 -> 27<br/>
 * 2nd iteration (elem = 7): left = 1 -> 8, right = 27 -> 20<br/>
 * 3rd iteration (elem = 3): left = 8 -> 11, right = 20 -> 17<br/>
 * 4th iteration (elem = 6): left = 11, right = 17 -> 11<br/>
 * Now left == right, so we return the current index 3 as the pivot index.
 */
public class FindPivotElement {

    public int findPivotElementIdx(int[] arr){
        int left = 0;
        int right = Arrays.stream(arr).sum();
        int i = 0;
        while (left != right){
            right -= arr[i];
            if (left == right){
                return i;
            }
            else {
                left += arr[i];
                i++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        FindPivotElement finder = new FindPivotElement();
        System.out.println(finder.findPivotElementIdx(arr));
    }
}
