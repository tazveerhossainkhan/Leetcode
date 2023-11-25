/*179.Largest Number
https://leetcode.com/problems/largest-number/*/
package Sorting;

import java.math.BigInteger;
import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000};
        System.out.println(largestNumber(nums));
    }

    static String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long a = nums[i]; //3
                long b = nums[j]; //30
                String str1 = String.valueOf(a) + String.valueOf(b); // 330
                String str2 = String.valueOf(b) + String.valueOf(a); // 303
                if(str1.equals("10000000001000000000")){
                    return "10000000001000000000";
                }
                    a = Long.parseLong(str1);
                    b = Long.parseLong(str2);
                    if (b > a) {
                        swap(nums, i, j);
                    }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
            sb.append(i);
        }
        String str = sb.toString();
        boolean allZeros = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                allZeros = false;
                break;
            }
        }
        if (allZeros) {
            return "0";
        } else {
            return str;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
