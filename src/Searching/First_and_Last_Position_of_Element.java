/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    34. Find First and Last Position of Element in Sorted Array
*/

package Searching;

import java.util.Arrays;

public class First_and_Last_Position_of_Element {
public static void main(String[] args) {
    int[] arr={2,3,6,7,7,7,8,9};
    int target = 7;
    int[] ans = searchRange(arr,target);
    System.out.println(Arrays.toString(ans));
}
static int[] searchRange(int[] arr, int target)
{
    int[] ans = {-1,-1};
    int start = search(arr,target,true);
    int end = search(arr,target,false);
    ans[0] = start;
    ans[1] = end;
    return ans;

}

static int search(int[] arr, int target, boolean isStart)
{
    int ans=-1;
    int s =0;
    int e = arr.length-1;
    int[] values= {-1,-1};
    while(s<=e)
    {
        int mid = s + (e-s)/2 ;
        if(target > arr[mid])
        {
            s = mid +1;
        }
        else if(target < arr[mid])
        {
            e = mid - 1;
        }
        else
        {
        ans = mid;
        if(isStart==true)
        {
                e = mid -1;
            } else if (isStart==false) {

                s = mid+ 1;
            }
        }
    }
    return ans;
    }
}
