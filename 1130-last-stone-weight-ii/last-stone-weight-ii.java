class Solution {
    public int lastStoneWeightII(int[] stones) {

        int n = stones.length;
        int total = 0;

        for (int x : stones) {
            total += x;
        }

        int target = total / 2;

        int[][] dp = new int[n][target + 1];

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        int best = 0;

        for (int s = target; s >= 0; s--) {
            if (solve(stones, n - 1, s, dp) == 1) {
                best = s;
                break;
            }
        }

        return total - 2 * best;
    }

    public int solve(int[] stones, int i, int target, int[][] dp) {

        if (target == 0) {
            return 1;
        }

        if (i < 0) {
            return 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int take = 0;

        if (stones[i] <= target) {
            take = solve(stones, i - 1, target - stones[i], dp);
        }

        int skip = solve(stones, i - 1, target, dp);

        return dp[i][target] = (take == 1 || skip == 1) ? 1 : 0;
    }
}