//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
package Array;
import java.util.ArrayList;
public class EvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr= {12, 345, 2, 6, 7896};
        int count = findNumbers(arr);
        System.out.println(count);
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int digit = digit(num);
        if(digit%2 == 0)
        {
            return true;
        }
        return false;
    }

    static int digit(int num) {
        int digit=0;
        while(num>0)
        {
            digit++;
            num=num/10;
        }
        return digit;
    }
}
