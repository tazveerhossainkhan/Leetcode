/*268. Missing Number
https://leetcode.com/problems/missing-number*/

package Sorting;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 4};//array size is 6 and missing number is 5
        int missingNumber = missingNumber(arr);
        System.out.println(missingNumber);
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i]<arr.length && arr[i]!=i) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        int j;
        //search for missing number
        for (j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return j;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
