/*733. Flood Fill
https://leetcode.com/problems/flood-fill/*//*

package Stack_Queue;

public class Flood_Fill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] ans = floodFill(image, 1, 1, 2);
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                System.out.println(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int actual_pixel = image[sr][sc];
        if (image[sr][sc + 1] == actual_pixel) {
            image[sr][sc + 1] = color;
        }
        if (image[sr][sc - 1] == actual_pixel) {
            image[sr][sc - 1] = color;
        }
        if (image[sr + 1][sc] == actual_pixel) {
            image[sr + 1][sc] = color;
        }
        if (image[sr - 1][sc] == actual_pixel) {
            image[sr - 1][sc] = color;
        }
        int numRows = image.length;       // Number of rows
        int numCols = image[0].length;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (image[sr][j + 1] == actual_pixel) {
                    image[sr][j + 1] = color;
                }
                if (image[sr][j - 1] == actual_pixel) {
                    image[sr][j - 1] = color;
                }
                if (image[i + 1][sc] == actual_pixel) {
                    image[i + 1][sc] = color;
                }
                if (image[i - 1][sc] == actual_pixel) {
                    image[i - 1][sc] = color;
                }
            }
        }
        return image;
    }
}
*/

package Stack_Queue;

public class Flood_Fill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] ans = floodFill(image, 1, 1, 2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    static void dfs(int[][] image, int row, int col, int oldColor, int color) {
        int numRows = image.length;
        int numCols = image[0].length;

        // Check boundaries and color match
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || image[row][col] != oldColor) {
            return;
        }

        // Perform flood fill
        image[row][col] = color;

        // Recursively fill neighboring pixels
        dfs(image, row + 1, col, oldColor, color); // Down
        dfs(image, row - 1, col, oldColor, color); // Up
        dfs(image, row, col + 1, oldColor, color); // Right
        dfs(image, row, col - 1, oldColor, color); // Left
    }
}

