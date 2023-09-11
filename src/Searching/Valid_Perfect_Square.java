/*367. Valid Perfect Square
        https://leetcode.com/problems/valid-perfect-square/*/
package Searching;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num)
    {
        long start = 0;
        long end = num;
        while (start<=end)
        {
            long mid = start+(end-start)/2;
            if(mid*mid>num)
            {
                end = mid-1;
            } else if (mid*mid<num) {
                start=mid+1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
