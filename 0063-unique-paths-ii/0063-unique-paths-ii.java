class Solution {
    Map<Pair<Integer, Integer>, Integer> memo = new HashMap<>();
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return unique(obstacleGrid, 0, 0, m, n);
    }
    public int unique(int[][] obstacleGrid, int row, int col, int m, int n) {
        if (row >= m || col >= n || obstacleGrid[row][col] == 1) {
            return 0;
        }
        if (row == m - 1 && col == n - 1) {
            return 1;
        }
        Pair<Integer, Integer> cell = new Pair<>(row, col);
        if (memo.containsKey(cell)) {
            return memo.get(cell);
        }
        int downPaths = unique(obstacleGrid, row + 1, col, m, n);
        int rightPaths = unique(obstacleGrid, row, col + 1, m, n);
        int totalPaths = downPaths + rightPaths;
        memo.put(cell, totalPaths);
        return totalPaths;
    }
}
