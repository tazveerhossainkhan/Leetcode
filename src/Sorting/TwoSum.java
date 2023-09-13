/*1. Two Sum
https://leetcode.com/problems/two-sum/*//*

package Sorting;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] a = {i,j};
                    return a;
                }
            }
        }
        return null;
    }
}
*/

package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(Map.containsKey(rem)){
                return new int[]{Map.get(rem),i};
            }else {
                Map.put(nums[i],i);
            }
        }
        return null;
    }
}
  /*  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    }*/
