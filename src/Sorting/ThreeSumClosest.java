/*3Sum Closest
 https://leetcode.com/problems/3sum-closest/description/*/
package Sorting;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr,target));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0]+nums[1]+nums[2];
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum==target)
                    return sum;
                if(sum<target){
                    left++;
                }else {
                    right--;
                }
                int diffTarget = Math.abs(sum-target);
                if(diffTarget<diff){
                    resultSum=sum;
                    diff = diffTarget;
                }
            }
        }
        return resultSum;

    }
}
