/*852. Peak Index in a Mountain Array
        https://leetcode.com/problems/peak-index-in-a-mountain-array/*/

        package Searching;

public class PeakIndexInA_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,13,15,19,17,16,12,11,9,7};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<end)
        {
            int mid = start + (end-start) / 2 ;
            if(arr[mid] > arr[mid+1])
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
