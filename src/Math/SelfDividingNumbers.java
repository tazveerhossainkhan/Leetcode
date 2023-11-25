/*728. Self Dividing Numbers
https://leetcode.com/problems/self-dividing-numbers/*/
package Math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
    static boolean selfDivide(int originalNum) {
        int num = originalNum;
        while(num>0) {
            int rem = num % 10;
            if(rem==0) {
                return false;
            }
            if(originalNum % rem !=0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(selfDivide(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
