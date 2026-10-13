package org.problems.arrays;

import org.App;

/**
 * Find the second-largest element in a given array. The solution uses 2 step approach i.e.
 * finding max value, then finding the second max value using the same.
 */
public class SecondLargestDistinctElement {
    public static void main(String[] args) {
        SecondLargestDistinctElement slde = new SecondLargestDistinctElement();
        int[] randomArr = InputUtil.createRandomIntArray();
        System.out.print("In the given array: ");
        App.printArray(randomArr);
        System.out.println("The second largest element is: " +slde.findSecondLargestDistinctElementInArray(randomArr));
    }

    public int findSecondLargestDistinctElementInArray(int[] intArr){
        FindTheMaximumElement ftme = new FindTheMaximumElement();
        int max = ftme.findMaxElement(intArr);
        int secMax = 0;
        for (int i = 0; i < intArr.length; i++){
            if (intArr[i] < max && intArr[i] > secMax){
                secMax = intArr[i];
            }
        }
        return secMax;
    }
}
