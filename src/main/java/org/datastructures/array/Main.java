package org.datastructures.array;

/**
 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
 * Once initialized, the size of an array cannot be changed. The elements of an array are stored in contiguous memory locations and can be accessed using their index.
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        String[] basicArray = {"Volvo", "BMW", "Ford", "Mazda"};
        basicArray[1] = "Ferrari";

        for (int i = 0; i < basicArray.length; i++) {
            System.out.println(basicArray[i]);
        }
    }
}

