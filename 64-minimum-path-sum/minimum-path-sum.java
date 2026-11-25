class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return solve(m - 1, n - 1, grid, dp);
    }

    int solve(int i, int j, int[][] grid, int[][] dp) {

        if(i == 0 && j == 0)
            return grid[0][0];

        if(i < 0 || j < 0)
            return Integer.MAX_VALUE;

        if(dp[i][j] != -1)
            return dp[i][j];

        int up = solve(i - 1, j, grid, dp);
        int left = solve(i, j - 1, grid, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);

        return dp[i][j];
    }
}