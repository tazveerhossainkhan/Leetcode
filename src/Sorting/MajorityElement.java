/*169. Majority Element
https://leetcode.com/problems/majority-element/*/
package Sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        Arrays.sort(arr);
        System.out.println(majorityElement(arr));

    }

    static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i < nums.length - (double) (nums.length / 2) && a == nums[(int) (i + (double) (nums.length / 2))]) {
                return a;
            }
        }
        return -1;
    }
}
