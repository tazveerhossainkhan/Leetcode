/*1051. Height Checker
https://leetcode.com/problems/height-checker/*/
package Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int misMatch = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!= expected[i]){
                misMatch++;
            }
        }
        return misMatch;
    }
}
