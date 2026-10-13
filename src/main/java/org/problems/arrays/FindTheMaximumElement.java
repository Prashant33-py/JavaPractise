package org.problems.arrays;

import java.util.Scanner;

/**
 * Find the maximum element in an array
 */
public class FindTheMaximumElement {

    public static void main(String[] args) {
        int[] inputArr = InputUtil.processInputAndReturnArray();
        FindTheMaximumElement findMaxElem = new FindTheMaximumElement();
        System.out.println("Max element is: "+findMaxElem.findMaxElement(inputArr));

    }

    public int findMaxElement(int[] inputArr){
        int max = inputArr[0];
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] > max){
                max = inputArr[i];
            }
        }
        return max;
    }

}
