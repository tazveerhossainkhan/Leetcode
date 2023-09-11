//1818. Minimum Absolute Sum Difference
// https://leetcode.com/problems/minimum-absolute-sum-difference/

package Searching;

import java.util.Arrays;

public class Sum_Difference {
    public static void main(String[] args) {
        int[] arr1 = {10,13,9};
        int[] arr2 = {2,7,3};
        System.out.println(minAbsoluteSumDiff(arr1,arr2));
    }
    static int minAbsoluteSumDiff(int[] arr1, int[] arr2) {
        int mod = (int)1e9 + 7;
        int n = arr1.length;
        int[] sortedArr1 = arr1.clone();
        Arrays.sort(sortedArr1);

        long sum = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr1[i] - arr2[i]);
            sum = (sum + diff) % mod;

            int j = binarySearch(sortedArr1, arr2[i]);
            if (j < n) {
                maxDiff = Math.max(maxDiff, diff - Math.abs(sortedArr1[j] - arr2[i]));
            }
            if (j > 0) {
                maxDiff = Math.max(maxDiff, diff - Math.abs(sortedArr1[j - 1] - arr2[i]));
            }
        }

        return (int)((sum - maxDiff + mod) % mod);
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    /*static int minAbsoluteSumDiff(int[] arr1, int[] arr2)
    {
        if(Arrays.equals(arr1,arr2))
        {
            return 0;
        }
        int i=0;
        int max_diff = Integer.MIN_VALUE;
        int max_diff_index = -1;
        for(i=0;i<arr1.length;i++)
        {
            //max_diff=Math.max(max_diff,Math.abs(arr1[i]-arr2[i]));
            int diff = Math.abs(arr1[i] - arr2[i]);
            if (diff > max_diff) {
                max_diff = diff;
                max_diff_index = i;
            }
        }
        long sum=0;
        int M = (int)1e9+7;
        arr1[max_diff_index] = arr1[max(arr1,arr2[max_diff_index])];
        for (int k = 0; k < arr1.length; k++) {
            sum=(sum+Math.abs(arr1[k]-arr2[k]))% M;
        }
        return (int)sum;
    }
    static int max(int[] arr1,int arr2_value)
    {
        int diff = Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            int value = Math.abs(arr1[i]-arr2_value);
            if(value<diff)
            {
                diff=value;
                index = i;
            }
        }
        return index;
    }*/
}


/*static int minAbsoluteSumDiff(int[] arr1, int[] arr2) {
    int mod = (int)1e9 + 7;
    int n = arr1.length;
    int[] sortedArr1 = arr1.clone();
    Arrays.sort(sortedArr1);

    long sum = 0;
    int maxDiff = 0;
    for (int i = 0; i < n; i++) {
        int diff = Math.abs(arr1[i] - arr2[i]);
        sum = (sum + diff) % mod;

        int j = binarySearch(sortedArr1, arr2[i]);
        if (j < n) {
            maxDiff = Math.max(maxDiff, diff - Math.abs(sortedArr1[j] - arr2[i]));
        }
        if (j > 0) {
            maxDiff = Math.max(maxDiff, diff - Math.abs(sortedArr1[j - 1] - arr2[i]));
        }
    }

    return (int)((sum - maxDiff + mod) % mod);
}

static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;
}
*/