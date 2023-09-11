/*977. Squares of a Sorted Array
https://leetcode.com/problems/squares-of-a-sorted-array/*/
package Sorting;

import java.util.Arrays;

public class Squares_of_aSorted_Array {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
