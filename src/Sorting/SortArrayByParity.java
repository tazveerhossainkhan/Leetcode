/*905. Sort Array By Parity
        https://leetcode.com/problems/sort-array-by-parity/*/
package Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    static int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]%2!=0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]%2==0){
                        swap(nums,i,j);
                        break;
                    }
                }
            }
        }
        return nums;
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}



