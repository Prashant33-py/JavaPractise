package org.problems.arrays;

public class MoveZerosToRight {

    public void moveZeros(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        MoveZerosToRight mover = new MoveZerosToRight();
        mover.moveZeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
