/*    1672. Richest Customer Wealth
    https://leetcode.com/problems/richest-customer-wealth*/
//[[1,5],[7,3],[3,5]]

package Array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] account = {
                {1,5},
                {7,3},
                {3,5}
        };
        int max = maximumWealth(account);
        System.out.println(max);
    }
    static int maximumWealth(int[][] acc)
    {
        int sum=0;
        int max_ammount = Integer.MIN_VALUE;
        for (int[] ints : acc) {
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > max_ammount) {
                max_ammount = sum;
            }
            sum = 0;
        }
        return max_ammount;
    }
}
