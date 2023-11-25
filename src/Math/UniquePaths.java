/*62. Unique Paths
https://leetcode.com/problems/unique-paths/*/
package Math;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    static int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < n; i++) {
            matrix[m-1][i] = 1;
        }
        for (int i = 0; i < m-1; i++) {
            matrix[i][n-1] = 1;
        }
        for(int row = m-2;row >= 0; row--){
            for(int col = n-2 ; col>= 0; col--){
                matrix[row][col] = matrix[row][col+1] + matrix[row+1][col];
            }
        }
        /*for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }*/
        return matrix[0][0];
    }
}
