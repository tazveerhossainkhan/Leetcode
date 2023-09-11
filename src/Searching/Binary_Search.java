package Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target = 9;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
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
}