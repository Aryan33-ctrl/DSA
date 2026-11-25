

class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(n - 1, amount, coins, dp);

        if (ans >= 1000000000) {
            return -1;
        }

        return ans;
    }

    int solve(int index, int amount, int[] coins, int[][] dp) {

        if (index == 0) {
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            }
            return 1000000000;
        }

        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        int notTake = solve(index - 1, amount, coins, dp);

        int take = 1000000000;

        if (coins[index] <= amount) {
            take = 1 + solve(index, amount - coins[index], coins, dp);
        }

        return dp[index][amount] = Math.min(take, notTake);
    }
}