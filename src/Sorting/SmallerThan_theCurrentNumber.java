/*1365. How Many Numbers Are Smaller Than the Current Number
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/*/
package Sorting;

import java.util.Arrays;

public class SmallerThan_theCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i =0;i<ans.length;i++){
            int temp=0;
            for (int j=0;j < ans.length;j++){
                if(nums[j]<nums[i]){
                    temp++;
                }
            }
            ans[i] = temp;
        }
        return ans;
    }

}
