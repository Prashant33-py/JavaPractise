package org.problems.strings;

import java.util.Scanner;

public class HappyStringProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aaabbb";
        int continuousVowelStringLen = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continuousVowelStringLen++;
            }
            else if (continuousVowelStringLen > 2){
                break;
            }
            else {
                continuousVowelStringLen = 0;
            }
        }

        if (continuousVowelStringLen > 2){
            System.out.println("Happy String");
        } else {
            System.out.println("Not Happy String");
        }

    }

}
