/*
167. Two Sum II - Input Array Is Sorted
        https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/

package Searching;

import java.util.Arrays;

public class Two_Sum_II {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int[] result = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {

            //int mid = start + (end - start) / 2;
            if (arr[start] + arr[end] > target) {
                end --;
            } else if (arr[start] + arr[end] < target) {
                start ++;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            }
        }
        return result;
    }
}
