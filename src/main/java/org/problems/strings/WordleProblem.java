package org.problems.strings;

import java.util.Scanner;

public class WordleProblem {

    public String resultWordle(String actualWord, String enteredWord){
        String result="";
        for (int i = 0; i < actualWord.length(); i++){
            if (actualWord.charAt(i)==enteredWord.charAt(i)){
                result = result.concat("G");
            } else {
                result = result.concat("B");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordleProblem wp = new WordleProblem();
        int t =  sc.nextInt();
        for (int i = 0; i < t; i++) {
            String actualWord = sc.next();
            String enteredWord = sc.next();
            System.out.println(wp.resultWordle(actualWord, enteredWord));
        }
    }
}
