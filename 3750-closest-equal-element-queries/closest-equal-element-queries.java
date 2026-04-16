import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (List<Integer> list : map.values()) {
            int size = list.size();
            if (size == 1) continue;

            for (int i = 0; i < size; i++) {
                int curr = list.get(i);

                int left = list.get((i - 1 + size) % size);
                int right = list.get((i + 1) % size);

                int d1 = Math.abs(curr - left);
                d1 = Math.min(d1, n - d1);

                int d2 = Math.abs(curr - right);
                d2 = Math.min(d2, n - d2);

                ans[curr] = Math.min(d1, d2);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int q : queries) res.add(ans[q]);
        return res;
    }
}