package org.problems.arrays;

import org.App;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = InputUtil.createRandomIntArray(0, 100);

        CountOccurrences co = new CountOccurrences();
        App.printArray(arr);
        int target = arr[InputUtil.pickRandomNumber(0, arr.length)];
        System.out.println("Target element " +target+ " occurred " +co.countTargetOccurrences(arr, target)+ " times");
    }

    public int countTargetOccurrences(int[] arr, int target){
        if (InputUtil.checkIfArrayIsEmpty(arr)){
            return -1;
        }
        int targetOccurrenceCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                targetOccurrenceCount++;
            }
        }
        return targetOccurrenceCount;
    }
}
