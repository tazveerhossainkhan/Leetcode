/*1608. Special Array With X Elements Greater Than or Equal X
https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/*/

package Searching;

import java.util.Arrays;

public class Special_Array {
    public static void main(String[] args) {
        int[] arr = {3,5};
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums) {
        Arrays.sort(nums); // Sort the array in non-decreasing order
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            int count = n - binarySearch(nums, i);

            if (count == i) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
    /*static int specialArray(int[] arr)
    {
 *//*       Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        *//**//*while (start<=end)
        {
            int mid = start + (end-start)/2;
            int temp = end - (mid-1);
            if(temp>=arr[mid]  )
            {
                return arr[mid];
            }else {
                end = mid - 1;
            }
        }*//**//*

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = arr.length - mid;

            if (count == arr[mid]) {
                return count;
            } else if (count > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;*//*

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= count + 1) {
                count++;
            }
        }
        if (count == 0 || count == arr.length) {
            return -1;
        }
        return count;
    }*/
}


/*Arrays.sort(nums);
        int count = 0;
        for (int num : nums) {
            if (num >= count + 1) {
                count++;
            }
        }
        if (count == 0 || count == nums.length) {
            return -1;
        }
        return count;*/