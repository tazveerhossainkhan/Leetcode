/*754. Reach a Number
https://leetcode.com/problems/reach-a-number/*/
package Searching;

import static java.lang.Math.min;

public class Reach_A_Number {
    public static void main(String[] args) {
        int target = 4;
        System.out.println(reachNumber(target));
    }

    static int reachNumber(int target) {
        target = Math.abs(target);

        long start = 1, end = target;
        long minPos = Long.MAX_VALUE;
        long minSteps = Long.MAX_VALUE;

        while (start <= end) {
            long mid = start + ((end - start) / 2);
            long dist = (mid * (mid + 1)) / 2;
            long finPos = dist;
            if (finPos >= target) {
                minSteps = min(minSteps, mid);
                minPos = min(minPos, finPos);
                end = mid - 1;
            } else
                start = mid + 1;
        }
        long diff = target - minPos;
        if ((diff & 1) != 0)
            return (minSteps & 1) != 0 ? (int) (minSteps + 2) : (int) (minSteps + 1);

        return (int) minSteps;
    }
}


    /*static int reachNumber(int target) {
        target = Math.abs(target);
        int start = 0, move = 0;
        int current_position = 0;
        for (int i = 1; i <= target; i++)
            while (current_position <= target) {
                if (current_position == target) {
                    return move;
                }
                if (current_position + i <= target) {
                    current_position = current_position + i;
                    move++;
                    i++;
                } else if (current_position + i > target) {
                    current_position = current_position - i;
                    move++;
                    i++;
                }
            }
        return move;
    }*/