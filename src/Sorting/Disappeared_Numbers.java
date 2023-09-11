/*448. Find All Numbers Disappeared in an Array
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/*/
package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappeared_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // 1 2 2 3 3 4 - - 7 8
        //int[] arr = {4,3,2,1};
        List<Integer> myList = findDisappearedNumbers(arr);
        for(Integer num: myList){
            System.out.print (num+" ");
        }
        //System.out.println(Arrays.toString(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] ;
            if(correct!=nums[correct-1])
            {
                swap(nums,i,correct-1);
            }else {
                i++;
            }
        }
        //finding the disappeared values
        List<Integer> li = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                li.add(j+1);
            }
        }
        return li;
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
