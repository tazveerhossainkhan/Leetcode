/*
https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
*/

package Searching;

public class Find_Element_From_Infinite_Array {
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,6,8,9,12,15,18,20,22,24,25,26,29};
        int target= 30;
        int position = findPosition(arr,target);
        System.out.println(position);

    }
    static int findPosition(int[] arr,int target)
    {
        int start = 0;
        int end = 1;

        /*if(arr[end] > target)
        {
            ans = binarySearch(arr,target,start,end);
        }*/
        while(arr[end]<target)
        {
            int temp = end + 1;
            end = end + (end-start +1) * 2;
            start = temp;
        }
        int ans=  binarySearch(arr,target,start,end);
        return ans;
    }
    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid]< target)
            {
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
}
