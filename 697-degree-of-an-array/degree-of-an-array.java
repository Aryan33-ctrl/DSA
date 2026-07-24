class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            first.putIfAbsent(x, i);
            last.put(x, i);

            count.put(x, count.getOrDefault(x, 0) + 1);
            degree = Math.max(degree, count.get(x));
        }

        int ans = nums.length;

        for (int key : count.keySet()) {
            if (count.get(key) == degree) {
                ans = Math.min(ans, last.get(key) - first.get(key) + 1);
            }
        }

        return ans;
    }
}