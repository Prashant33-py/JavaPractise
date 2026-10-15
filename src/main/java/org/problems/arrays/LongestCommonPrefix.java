package org.problems.arrays;

import java.util.Arrays;

/**
 * Return the longest common prefix from a given string array.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArr = {"flower", "flow", "float", "flight"};
//        String[] strArr = {"ab","a"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println("Longest common prefix is: "+lcp.longestCommonPrefix(strArr));


    }

    public String longestCommonPrefix(String[] strArr){
        StringBuilder commonPrefix = new StringBuilder();
        Arrays.sort(strArr);
        String start = strArr[0];
        String end = strArr[strArr.length - 1];

        if (start.isEmpty()){
            return commonPrefix.toString();
        }
        for (int i = 0; i < start.length(); i++){
            if (start.charAt(i) == end.charAt(i)){
                commonPrefix.append(start.charAt(i));
            }
            else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}
