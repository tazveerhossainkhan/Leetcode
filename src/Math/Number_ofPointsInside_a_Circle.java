/*1828. Queries on Number of Points Inside a Circle
https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/*/
package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_ofPointsInside_a_Circle {
    public static void main(String[] args) {
        int[][] points = {{99, 113},{150, 165},{23, 65},{175, 154},{84, 83},{24, 59},{124, 29},
                {19, 97},{117, 182},{105, 191},{83, 117},{114, 35},{0, 111},{22, 53}};
        int[][] queries = {{105,191,155},{114,35,94},{84,83,68},{175,154,28},{99,113,80},{175,154,177},
                {175,154,181},{114,35,134},{22,53,105},{124,29,164},{6,99,39},{84,83,35}};
        System.out.println(Arrays.toString(countPoints(points, queries)));
    }

    static int[] countPoints(int[][] points, int[][] queries) {
        int[] array = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int rSquared = queries[i][2] * queries[i][2]; // Radius squared

            for (int j = 0; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                int distSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1); // Corrected line
                if (distSquared <= rSquared) {
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}



/*for (int i = 0; i < queries.length; i++) {
                System.out.println(queries[i][queries[i].length-1]+ " ");
        }*/