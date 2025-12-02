package org.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> chacterCountMap = new HashMap<>();
        for (char c : str.toCharArray()){
            chacterCountMap.put(c, chacterCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()){
            if (chacterCountMap.get(c) == 1){
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "firstNonRepeatingCharacter";
        char result = firstNonRepeatingCharacter(str);
        System.out.println("First non-repeating character in the string \"" + str + "\" is" + " : " + result);
    }

}
