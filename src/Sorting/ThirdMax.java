/*414. Third Maximum Number
https://leetcode.com/problems/third-maximum-number/*/
package Sorting;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(thirdMax(arr));
    }

    static int thirdMax(int[] nums) {
        selection(nums);
        int count = 1;
        int max = nums[nums.length - 1];
        while (count <= 3) {
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < max) {
                    max = nums[i];
                    count++;
                }
            }
        }
        //System.out.println(count);
        return max;
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int selected_max = max(arr, 0, arr.length - i - 1);
            swap(arr, selected_max, arr.length - i - 1);
        }
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max_value, int last_value) {
        int temp = arr[max_value];
        arr[max_value] = arr[last_value];
        arr[last_value] = temp;
    }
}
