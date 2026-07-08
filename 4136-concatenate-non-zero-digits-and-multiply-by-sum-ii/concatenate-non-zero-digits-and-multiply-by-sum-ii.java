class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        long MOD = 1_000_000_007L;
        int n = s.length();
        
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }
        
        long[] prefVal = new long[n + 1];
        int[] prefSum = new int[n + 1];
        int[] prefCnt = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0) {
                prefVal[i + 1] = (prefVal[i] * 10 + digit) % MOD;
                prefSum[i + 1] = prefSum[i] + digit;
                prefCnt[i + 1] = prefCnt[i] + 1;
            } else {
                prefVal[i + 1] = prefVal[i];
                prefSum[i + 1] = prefSum[i];
                prefCnt[i + 1] = prefCnt[i];
            }
        }
        
        int numQueries = queries.length;
        int[] ans = new int[numQueries];
        
        for (int q = 0; q < numQueries; q++) {
            int L = queries[q][0];
            int R = queries[q][1];
            
            int cntSub = prefCnt[R + 1] - prefCnt[L];
            
            if (cntSub == 0) {
                ans[q] = 0;
                continue;
            }
            
            long x = (prefVal[R + 1] - (prefVal[L] * pow10[cntSub]) % MOD + MOD) % MOD;
            long digitSum = prefSum[R + 1] - prefSum[L];
            
            ans[q] = (int) ((x * digitSum) % MOD);
        }
        
        return ans;
    }
}
