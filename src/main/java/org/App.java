package org;

public class App
{
    public static void main(String []args){
    }

    public static void printArray(int[] arr, String message){
        System.out.println(message);
        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
