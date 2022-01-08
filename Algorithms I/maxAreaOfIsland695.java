/*public class maxAreaOfIsland695 {
    
}
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
*/
class Solution {
    boolean seen[][];

    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int ar = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        seen = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                max_area = Math.max(max_area, area(i, j, grid));
            }
        }
        return max_area;
    }

    public int area(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || seen[i][j] || (grid[i][j] == 0)) {
            return 0;
        }
        seen[i][j] = true;
        return (1 + area(i + 1, j, grid) + area(i - 1, j, grid) + area(i, j + 1, grid) + area(i, j - 1, grid));
    }
}