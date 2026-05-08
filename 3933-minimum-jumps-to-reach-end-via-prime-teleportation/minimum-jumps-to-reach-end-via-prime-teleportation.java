import java.util.*;

class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

      
        int[] spf = new int[max + 1];

        for (int i = 0; i <= max; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= max; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= max; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        
        Map<Integer, List<Integer>> factorMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            Set<Integer> used = new HashSet<>();

            while (x > 1) {
                int p = spf[x];

                if (!used.contains(p)) {
                    factorMap
                        .computeIfAbsent(p, k -> new ArrayList<>())
                        .add(i);

                    used.add(p);
                }

                while (x % p == 0) {
                    x /= p;
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {

                int i = q.poll();

                if (i == n - 1) {
                    return steps;
                }


                if (i - 1 >= 0 && !visited[i - 1]) {
                    visited[i - 1] = true;
                    q.offer(i - 1);
                }

    
                if (i + 1 < n && !visited[i + 1]) {
                    visited[i + 1] = true;
                    q.offer(i + 1);
                }

                int val = nums[i];

                
                if (val >= 2 && spf[val] == val) {

                    List<Integer> nextIndices =
                        factorMap.getOrDefault(val, new ArrayList<>());

                    for (int ni : nextIndices) {

                        if (!visited[ni]) {
                            visited[ni] = true;
                            q.offer(ni);
                        }
                    }

                
                    nextIndices.clear();
                }
            }

            steps++;
        }

        return -1;
    }
}