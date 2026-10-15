package org.problems.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputUtil {

    public static Random random = new Random();

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

    public static int[] createRandomIntArray(int origin, int limit){
        int randomArrLen = random.nextInt(5, 12);
        int[] randIntArr = new int[randomArrLen];
        for (int i = 0; i < randomArrLen; i++) {
            randIntArr[i] = random.nextInt(origin, limit);
        }
        return randIntArr;
    }

    public static int[] createSortedArray(){
        int[] sortedArr = createRandomIntArray(0, 100);
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    public static boolean checkIfArrayIsEmpty(int[] arr){
        return arr.length < 1;
    }

    public static int pickRandomNumber(int origin, int limit){
        return random.nextInt(origin, limit);
    }
}
