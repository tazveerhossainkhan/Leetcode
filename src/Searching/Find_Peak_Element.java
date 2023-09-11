/*162. Find Peak Element
        https://leetcode.com/problems/find-peak-element/*/

package Searching;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<(arr.length - 1) && arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else if (mid>0 &&arr[mid]<arr[mid-1])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
