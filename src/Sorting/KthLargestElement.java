/*215. Kth Largest Element in an Array
https://leetcode.com/problems/kth-largest-element-in-an-array/description/*/
package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int k = 1;
        System.out.println(findKthLargest(nums,k));
    }
    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= max) {
                max = nums[i];
                count++;
            }
            if (count == k) {
                return max;
            }
        }
        return -1;
    }
}
/*import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int count = 1;
        int max = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < max) {
                max = nums[i];
                count++;
            }

            if (count == k) {
                return max;
            }
        }

        if (count < k) {
            Arrays.sort(nums);
            return nums[n - k];
        }

        return max;
    }
}
*/