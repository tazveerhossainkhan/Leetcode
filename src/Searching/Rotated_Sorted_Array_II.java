/*154. Find Minimum in Rotated Sorted Array II
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/*/

package Searching;

import java.util.Arrays;

public class Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        return arr[0];
    }
}
