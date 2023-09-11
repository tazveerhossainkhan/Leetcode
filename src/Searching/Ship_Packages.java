/*1011. Capacity To Ship Packages Within D Days
        https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/*/

package Searching;

import java.util.Arrays;

public class Ship_Packages {
    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
    static int shipWithinDays(int[] weights, int days) {
        int minWeight = 0;
        int maxWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            minWeight = Math.max(minWeight, weights[i]);
            maxWeight += weights[i];
        }
        int start = minWeight;
        int end = maxWeight;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canShipWithinDays(weights, days, mid)) {
                // Try to minimize the weight capacity
                end = mid - 1;
            } else {
                // Need a higher weight capacity
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean canShipWithinDays(int[] weights, int days, int capacity) {
        int currentWeight = 0;
        int requiredDays = 1;

        for (int i = 0; i < weights.length; i++) {
            currentWeight += weights[i];

            if (currentWeight > capacity) {
                requiredDays++;
                currentWeight = weights[i];
            }

            if (requiredDays > days) {
                return false;
            }
        }
        return true;
    }
}
