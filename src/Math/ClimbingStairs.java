/*70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/*/
package Math;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    static int climbStairs(int n){
        int one =1;
        int two = 1;
        int temp=0;
        for (int i = 0; i < n-1; i++) {
            temp = one;
            one = one+two;
            two = temp;
        }
        return one;
    }
}
