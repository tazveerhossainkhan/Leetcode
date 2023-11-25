/*1492. The kth Factor of n
https://leetcode.com/problems/the-kth-factor-of-n/*/
package Math;

import java.util.ArrayList;

public class kthFactor_of_n {
    public static void main(String[] args) {
        System.out.println(kthFactor(4,4));
    }
    static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if( n%i == 0){
                if(list.size()==k)
                    break;
                list.add(i);
            }
        }
        if(list.size() < k){
            return -1;
        }
        return list.get(k-1);
    }
}
