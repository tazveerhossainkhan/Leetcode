/*442. Find All Duplicates in an Array
https://leetcode.com/problems/find-all-duplicates-in-an-array/*/
package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_Duplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer>li = AllDuplicate(arr);
        for(Integer list : li){
            System.out.print(list + " ");
        }
    }

    /*static int AllDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct != arr[correct - 1]) {
                swap(arr,correct,i);
            } else {
                i++;
            }
        }
        return -1;
    }*/

    static List<Integer> AllDuplicate(int[] arr){
        int i=0;
        List<Integer> li = new ArrayList<>();
        while (i < arr.length) {
            int correct = arr[i] - 1; //get correct index for arr[i]
            if (arr[i] != arr[correct]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1)
            {
                li.add(arr[j]);
            }
        }
        return li;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
