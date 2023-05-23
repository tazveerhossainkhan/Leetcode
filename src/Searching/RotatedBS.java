/*33. Search in Rotated Sorted Array
        https://leetcode.com/problems/search-in-rotated-sorted-array/*/

package Searching;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,6));
    }
    static int search(int[] arr,int target)
    {
        int pivot = findPivot(arr);
        if(pivot==-1)
        {
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if(pivot == target)
        {
            return pivot;
        }
        if(target>=arr[0])
        {
            return binarySearch(arr,target,0,pivot-1);

        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while (start <= end)
        {
            int mid = start + (end-start)/2 ;  //mid = start+end /2 not used because if I have a very large array than it can be overflow the range of int.
            if(arr[mid] > target)
            {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end = mid -1 ;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}
