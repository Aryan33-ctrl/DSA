class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int[] costEven = new int[k];
        int[] costOdd = new int[k];
        
        for (int i = 0; i < n; i++) {
            int rem = nums[i] % k;
            for (int target = 0; target < k; target++) {
                int diff = Math.abs(rem - target);
                int cost = Math.min(diff, k - diff);
                if (i % 2 == 0) {
                    costEven[target] += cost;
                } else {
                    costOdd[target] += cost;
                }
            }
        }
        
        int minOps = Integer.MAX_VALUE;
        for (int x = 0; x < k; x++) {
            for (int y = 0; y < k; y++) {
                if (x != y) {
                    minOps = Math.min(minOps, costEven[x] + costOdd[y]);
                }
            }
        }
        
        return minOps;
    }
}
