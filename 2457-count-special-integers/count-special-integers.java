class Solution {
    int[][] dp;

   public int countSpecialNumbers(int n) {
        String s = String.valueOf(n);
        dp = new int[s.length()][1 << 10];

        for (int i = 0; i < s.length(); i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, true, false, s);
    }

    int solve(int pos, int mask, boolean tight, boolean started, String s) {
        if (pos == s.length()) {
            return started ? 1 : 0;
        }

        if (!tight && started && dp[pos][mask] != -1) {
            return dp[pos][mask];
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;
        int ans = 0;

        for (int d = 0; d <= limit; d++) {
            boolean newTight = tight && (d == limit);

            if (!started && d == 0) {
                ans += solve(pos + 1, mask, newTight, false, s);
            } else {
                if ((mask & (1 << d)) != 0) {
                    continue;
                }

                ans += solve(
                    pos + 1,
                    mask | (1 << d),
                    newTight,
                    true,
                    s
                );
            }
        }

        if (!tight && started) {
            dp[pos][mask] = ans;
        }

        return ans;
    }
}