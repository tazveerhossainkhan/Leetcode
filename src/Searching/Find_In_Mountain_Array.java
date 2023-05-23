/*1095. Find in Mountain Array
        https://leetcode.com/problems/find-in-mountain-array/*/

package Searching;

public class Find_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        int peak = findPeak(arr);
        int ans ;
        ans = ascendingBinarySearch(arr,target,0,peak);
        if(ans == -1)
        {
            ans = desendingBinarySearch(arr,target,peak,arr.length-1);
        }
        System.out.println(ans);
    }

    static int desendingBinarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid- 1;
            }
            return mid;
        }
        return -1;
    }

    static int ascendingBinarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2 ;
            if(arr[mid] >= target)
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
            return mid;
        }
        return -1;
    }
    static int findPeak(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<end)
        {
            int mid = start + (end - start) / 2 ;
            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
