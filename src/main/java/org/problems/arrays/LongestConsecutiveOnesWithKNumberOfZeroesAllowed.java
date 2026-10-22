package org.problems.arrays;

/**
 * This uses the Sliding window approach with 2 pointers (l and r). These are the steps that the code goes through <br/>
 * 1. Initialize l and r to 0, along with {@code zeros} (count of zeroes in the current window), {@code len} and {@code maxLen}. <br/>
 * 2. Since we have to go till the end of the array, we use while till r < array's length <br/>
 * 3. If {@code arr[r] == 0} then we increment {@code zeros} since the window now contains one more zero. <br/>
 * 4. Now we check {@code zeros > k}, which means the window has more zeroes than allowed. While that is true, we shrink the window from the left. <br/>
 * 5. For every step, if {@code arr[l] == 0} then we decrement {@code zeros} (the zero is leaving the window) and then move l to the next position. <br/>
 * 6. Now we calculate the window length as {@code r - l + 1} and see if it is greater than maxLen. If yes, then we update maxLen. <br/>
 *    Note that in the current code this is done only when {@code zeros < k}. <br/>
 * 7. Now finally, we move r forward and once the loop is executed, we return the max length.
 *
 */
public class LongestConsecutiveOnesWithKNumberOfZeroesAllowed {

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 1;
        LongestConsecutiveOnesWithKNumberOfZeroesAllowed lcowknoza = new LongestConsecutiveOnesWithKNumberOfZeroesAllowed();
        System.out.println(lcowknoza.findMaxLengthWithConsecutiveOnesAndKZeroes(arr,k));
    }

    public int findMaxLengthWithConsecutiveOnesAndKZeroes(int[] arr, int k){
        int l = 0;
        int r = 0;
        int len = 0;
        int maxLen = 0;
        int zeros = 0;

        while (r < arr.length){
            if (arr[r] == 0){
                zeros++;
                while (zeros > k){
                    if (arr[l] == 0){
                        zeros--;
                    }
                    l++;
                }
            }
            if (zeros < k) {
                len = r - l + 1;
                maxLen = Math.max(len, maxLen);
            }
            r++;
        }
        return maxLen;

    }
}
