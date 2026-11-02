class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        return Math.max(solve(nums, 0, n - 2), solve(nums, 1, n - 1));
    }

    public int solve(int[] nums, int st, int end) {
        int rob = 0, noRob = 0;
        for (int i = st; i <= end; i++) {
            int newRob = noRob + nums[i];
            int newNoRob = Math.max(noRob, rob);
            rob = newRob;
            noRob = newNoRob;
        }
        return Math.max(rob, noRob);
    }
}