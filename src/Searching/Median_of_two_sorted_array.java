/*4. Median of Two Sorted Arrays
https://leetcode.com/problems/median-of-two-sorted-arrays/*/

package Searching;

import java.util.Arrays;

public class Median_of_two_sorted_array {
    public static void main(String[] args) {
        /*int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        System.out.println(Arrays.toString(mergedArray));*/

        int[] arr1 = {1};
        int[] arr2 = {3,4,2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr2.length < arr1.length) {
            return findMedianSortedArrays(arr2, arr1);
        }

        int n1 = arr1.length;
        int n2 = arr2.length;
        int start = 0;
        int end = n1;

        while (start <= end) {
            int mid1 = (start + end) / 2;
            int mid2 = (n1 + n2 + 1) / 2 - mid1;

            //int left1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            //int left2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
            //int right1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1[mid1];
            //int right2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2[mid2];

            int left1;
            if (mid1 == 0) {
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = arr1[mid1 - 1];
            }
            int left2;
            if (mid2 == 0) {
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = arr2[mid2 - 1];
            }
            int right1;
            if (mid1 == n1) {
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = arr1[mid1];
            }
            int right2;
            if (mid2 == n2) {
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = arr2[mid2];
            }

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                end = mid1 - 1;
            } else {
                start = mid1 + 1;
            }
        }

        return 0.0;
    }
}


/*static double findMedianSortedArrays(int[] arr1, int[] arr2)
    {
        if(arr2.length<arr1.length)
        {
            findMedianSortedArrays(arr2,arr1);
        }
        int n1 = arr1.length;
        int n2 = arr2.length;
        int start = 0;
        int end = n1;
        while (start<=end)
        {
            int mid1 = start+end/2;
            int mid2 = (n1+n2+1)/2 - mid1;
            int left1;
            if (mid1 == 0) {
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = arr1[mid1 - 1];
            }
            int left2;
            if (mid2 == 0) {
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = arr2[mid2 - 1];
            }
            int right1;
            if (mid1 == n1) {
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = arr1[mid1 - 1];
            }
            int right2;
            if (mid2 == n2) {
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = arr2[mid2 - 1];
            }
            if(left1<=right2 && left2 <= right1)
            {
                if((n1+n2)%2==0)
                {
                    return (Math.max(left1,left2) + Math.min(right1,right2)/2.0);
                }
                else
                {
                    return (Math.max(left1,left2));
                }
            } else if (left1>right2) {
                end = mid1-1;
            }
            else {
                start = mid1+1;
            }
        }
        return 0.0;
    }
*/






/*int left1;
if (cut1 == 0) {
    left1 = Integer.MIN_VALUE;
} else {
    left1 = nums1[cut1 - 1];
}
*/
/* static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] marged_array = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,marged_array,0,arr1.length);
        System.arraycopy(arr2,0,marged_array,arr1.length,arr2.length);
        Arrays.sort(marged_array);
        double mid = 0;
        if(marged_array.length % 2 == 1)
        {
            mid = (double) (marged_array.length - 1) / 2;
        }
        else
        {
            mid = (double) (marged_array.length - 1) / 2;
            mid = (mid + (mid+1));
            mid = mid/2;
        }
        System.out.println( marged_array[mid]);
        return marged_array[ mid];
    }*/
//int left11 = cut1 ==0? INT_MIN : nums1[cut1-1];
