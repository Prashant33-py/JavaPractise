package org.problems.strings;

/**
 * This is a mix of both Sliding window and 2 pointer approach. These are the steps that the code goes through <br/>
 * 1. Initialize hash arr with 256 size (for 256 ASCII chars) and fill it with -1 which denotes that the character hasn't been discovered yet. <br/>
 * 2. Since we have to go till the end of the string, we use while till r < string's length <br/>
 * 3. If {@code hash[str[r]] != -1} then this means that the character already exists in our array. <br/>
 * 4. Now we check {@code hash[str[r]] >= l} this means that we are checking whether the current index of letter in array is less that current l. <br/>
 * 5. If that is true, then we update l to whatever value is stored in hash array for that letter + 1 since we want to move l to the next position of the repeating character <br/>
 * 6. Now we calculate length from right to left and see if it greater than maxLength. If yes, then we update maxLength <br/>
 * 7. We also have to update the new appearance of the repeated character to the array so we do that in the next step <br/>
 * 8. Now finally, we update r and once the loop is executed, we return the max length.
 *
 */
public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "dhananjay";
        LongestSubStringWithoutRepeatingChars lsswrc = new LongestSubStringWithoutRepeatingChars();
        System.out.println(lsswrc.longestSubStringLengthWithoutRepeatingChars(s));
    }

    public int longestSubStringLengthWithoutRepeatingChars(String str){
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int len = 0;
        int[] hash = new int[256];
        for (int i = 0; i < hash.length; i++){
            hash[i] = -1;
        }
        while (r < str.length()) {
            if (hash[str.charAt(r)] != -1){ // This means that the character exist in the hash array
                if (hash[str.charAt(r)] >= l){
                    l = hash[str.charAt(r)] + 1;
                }
            }
            len = r - l + 1;
            maxLen = Math.max(len, maxLen);
            hash[str.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

}
