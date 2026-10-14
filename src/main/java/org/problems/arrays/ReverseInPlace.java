package org.problems.arrays;

import org.App;

public class ReverseInPlace {
    public static void main(String[] args) {
        int[] arr = InputUtil.createRandomIntArray();
        System.out.print("Initial array is: ");
        App.printArray(arr);

        ReverseInPlace reverseInPlace = new ReverseInPlace();

        System.out.print("Array after reversing: ");
        App.printArray(reverseInPlace.reversedArray(arr));
    }

    public int[] reversedArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
