/*1331. Rank Transform of an Array
https://leetcode.com/problems/rank-transform-of-an-array/*/
package Sorting;

import java.util.Arrays;

public class RankTransform_of_anArray {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {

        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        int[] out = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            out[i] = arr[i]/min;
        }
        return out;
    }
}

