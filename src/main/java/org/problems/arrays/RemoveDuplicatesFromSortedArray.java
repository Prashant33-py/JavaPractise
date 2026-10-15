package org.problems.arrays;

/**
 * Remove duplicate elements from the array.<br/>
 * TODO: We need to remove the elements from the existing array instead of just counting the unique elements.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4,5,5,6,6};
        int[] nums = {1,1,2};

        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        System.out.println(rdfsa.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums){
        int prev = 0;
        int uniqueCount = 1;
        if (nums.length == 1){
            return uniqueCount;
        }
        for (int i = 1; i < nums.length; i++){
            if (nums[prev] != nums[i]){
                uniqueCount++;
            }
            prev++;
        }

        return uniqueCount;
    }
}
