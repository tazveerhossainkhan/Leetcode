/*1539. Kth Missing Positive Number
        https://leetcode.com/problems/kth-missing-positive-number/*/

package Searching;

public class square_root {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        //if (x == 0) return 0;
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}



