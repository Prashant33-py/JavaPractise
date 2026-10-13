package org.problems.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputUtil {

    public static int[] processInputAndReturnArray(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputStrArr = input.split(" ");
        int[] inputArr = new int[inputStrArr.length];
        for (int i= 0; i < inputArr.length; i++){
            inputArr[i] = Integer.parseInt(inputStrArr[i]);
        }
        return inputArr;
    }

    public static int[] createRandomIntArray(){
        Random random = new Random();
        int randomArrLen = random.nextInt(12);
        int[] randIntArr = new int[randomArrLen];
        for (int i = 0; i < randomArrLen; i++) {
            randIntArr[i] = random.nextInt(100);
        }
        return randIntArr;
    }

    public static int[] createSortedArray(){
        int[] sortedArr = createRandomIntArray();
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}
