package org.algorithms.sorting;

import org.App;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 2, 4};
//        App.printArray(arr, "Merge Sort: Array before sorting");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println();
//        App.printArray(arr, "Merge Sort: Array after sorting");
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftArrSize = mid - left + 1;
        int rightArrSize = right - mid;
        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];

        for (int x = 0; x<leftArrSize; x++){
            leftArr[x] = arr[left+x];
        }
        for (int x = 0; x<rightArrSize; x++){
            rightArr[x] = arr[mid+1+x];
        }

        App.printArray(leftArr, "Left array: ");
        App.printArray(rightArr, "Right array: ");
        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArrSize && j < rightArrSize){
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<leftArrSize){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrSize){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
