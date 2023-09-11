/*628. Maximum Product of Three Numbers
https://leetcode.com/problems/maximum-product-of-three-numbers/*/
package Sorting;

public class MaximumProduct_ofThreeNumbers {
    public static void main(String[] args) {
        int[] arr={-100,-2,-3,1};
        selection(arr);
        System.out.println(maximumProduct(arr));
    }
    static int maximumProduct(int[] nums) {
        int len = nums.length;
        int count1 = 0;
        int count2 = 0;
        int product1 = 1;
        int product2 = 1;
        product1 = nums[0]*nums[1]*nums[len-1];
        product2 = nums[len-1] * nums[len-2] * nums[len-3];

        return Math.max(product1,product2);

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int selected_max = max(arr, 0, arr.length - i - 1);
            swap(arr,selected_max, arr.length - i - 1);
        }
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int max_value, int last_value) {
        int temp = arr[max_value];
        arr[max_value] = arr[last_value];
        arr[last_value] = temp;
    }
}
