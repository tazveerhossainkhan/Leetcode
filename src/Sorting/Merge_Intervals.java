/*56.Merge Intervals
https://leetcode.com/problems/merge-intervals/*/
package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.toString(merge(intervals)));
        //System.out.println(intervals[1][0]);
    }
    /*static int[][] merge(int[][] intervals) {
        int[][] inti = new int[intervals.length][];
        for (int i = 0; i < intervals.length-1; i++) {
                if(intervals[i][1]>intervals[i+1][0]){
                    inti[i][0] = intervals[i][0];
                    inti[i][1] = intervals[i+1][1];
                }else {
                    inti[i][0] = intervals[i][0];
                    inti[i][1] = intervals[i][1];
                }
        }
        return inti;
    }*/
    static int[][] merge(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // List to store merged intervals
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                // Merge overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Add non-overlapping interval to result
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        // Add the last interval
        result.add(currentInterval);

        // Convert List to array
        return result.toArray(new int[result.size()][]);
    }
}
