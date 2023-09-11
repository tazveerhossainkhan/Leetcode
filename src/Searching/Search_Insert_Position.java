/*
35. Search Insert Position
        https://leetcode.com/problems/search-insert-position/
*/
package Searching;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }

    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return start ;
    }
}

