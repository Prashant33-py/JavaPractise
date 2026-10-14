package org.problems.arrays;

import org.App;

/**
 * Check if an array is sorted or not.<br/>
 *
 * TODO: This fix is not full proof as these changes may fail if the input is [1,5,3]
 */
public class CheckSorted{

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int[] arr1 = InputUtil.createRandomIntArray();
        int[] arr2 = InputUtil.createSortedArray();
        int[] arr3 = InputUtil.createSortedArray();
        int[] arr4 = InputUtil.createSortedArray();

        CheckSorted cs = new CheckSorted();
        App.printArray(arr);
        System.out.println(cs.checkIfArrayIsSorted(arr) ? "Sorted" : "Not sorted");
        App.printArray(arr1);
        System.out.println(cs.checkIfArrayIsSorted(arr1) ? "Sorted" : "Not sorted");
        App.printArray(arr2);
        System.out.println(cs.checkIfArrayIsSorted(arr2) ? "Sorted" : "Not sorted");
        App.printArray(arr3);
        System.out.println(cs.checkIfArrayIsSorted(arr3) ? "Sorted" : "Not sorted");
        App.printArray(arr4);
        System.out.println(cs.checkIfArrayIsSorted(arr4) ? "Sorted" : "Not sorted");
    }

    public boolean checkIfArrayIsSorted(int[] arr){
        int start = arr[0];
        if (arr.length == 1){
            return true;
        }
        for (int i = 1; i < arr.length; i++){
            if (start > arr[i]){
                return false;
            }
            start = arr[i];
        }
        return true;
    }

}
