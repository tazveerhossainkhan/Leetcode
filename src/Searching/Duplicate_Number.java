/*287. Find the Duplicate Number
https://leetcode.com/problems/find-the-duplicate-number/*/

package Searching;

import java.util.Arrays;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr={2,5,9,6,9,3,8,9,7,1 };
        //2,5,9,6,9,3,8,9,7,1                                                                                                                                                                                                                                                                                                ,7,1
        //1 2 3 5
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        int start =0;
        int end = arr.length;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == arr[mid-1] || arr[mid] == arr[mid+1])
            {
                return arr[mid];
            }
            else
            {
                if(arr[mid] < mid+1)
                {
                    end = mid;
                }
                else
                {
                    start=mid;
                }
            }
        }
        return 1;
    }
}
