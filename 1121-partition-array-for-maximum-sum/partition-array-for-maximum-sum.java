class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maxVal = 0;

            for (int len = 1; len <= k && len <= i; len++) {
                maxVal = Math.max(maxVal, arr[i - len]);

                int sum = dp[i - len] + len * maxVal;

                dp[i] = Math.max(dp[i], sum);
            }
        }

        return dp[n];
    }
}