/*217. Contains Duplicate
https://leetcode.com/problems/contains-duplicate/*/
package Sorting;

public class ContainsDuplicate {
    public static void main(String[] args) {
        //int[] arr = {3, 1};
        int[] arr={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (correct >= 0 && correct < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == nums[j + 1]) {
                return true;
            }
        }
        return false;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
/*if(nums.length ==1){
            return false;
        }
        else if(nums.length ==2){
            if(nums[0]!=nums[1]){
                return false;
            }else {
                return true;
            }
        }*/
        /*for (int j = 0; j < nums.length; j++) {
            if (nums[j] <= j && nums[j] != j + 1) {
                return true;
            }
        }*/