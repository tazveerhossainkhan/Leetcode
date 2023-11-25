/*342. Power of Four
https://leetcode.com/problems/power-of-four/description/*/
package Math;
public class PowerofFour {
    public static void main(String[] args) {
        int n=-2147483648;
        System.out.println(isPowerOfFour(n));
    }
    static boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        int a = (int) Math.sqrt(n);
        return a % 4 == 0;
    }
}
/*if(n==1){
            return true;
        }
        if(n%4==0){
            return true;
        }
        return false;*/