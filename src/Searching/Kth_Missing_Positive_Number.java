/*1539. Kth Missing Positive Number
        https://leetcode.com/problems/kth-missing-positive-number/*/

package Searching;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {4,6,8,15,20,25,28};
        int kth = 12;
        System.out.println(findKthPositive(arr, kth));
    }
    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int missing = arr[end] - (end + 1);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int numMissing = arr[mid] - (mid + 1);
            if (numMissing >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start + k;
    }
}

