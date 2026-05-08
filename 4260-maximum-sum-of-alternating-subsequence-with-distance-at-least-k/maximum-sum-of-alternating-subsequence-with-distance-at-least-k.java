import java.util.*;

class Solution {

    static class SegTree {
        long[] tree;
        int n;

        SegTree(int n) {
            this.n = n;
            tree = new long[4 * n];
        }

        void update(int idx, long val) {
            update(1, 0, n - 1, idx, val);
        }

        private void update(int node, int l, int r, int idx, long val) {

            if (l == r) {
                tree[node] = Math.max(tree[node], val);
                return;
            }

            int mid = (l + r) / 2;

            if (idx <= mid) {
                update(node * 2, l, mid, idx, val);
            } else {
                update(node * 2 + 1, mid + 1, r, idx, val);
            }

            tree[node] =
                Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        long query(int ql, int qr) {

            if (ql > qr) return 0;

            return query(1, 0, n - 1, ql, qr);
        }

        private long query(int node,
                           int l,
                           int r,
                           int ql,
                           int qr) {

            if (ql <= l && r <= qr) {
                return tree[node];
            }

            if (r < ql || l > qr) {
                return 0;
            }

            int mid = (l + r) / 2;

            return Math.max(
                query(node * 2, l, mid, ql, qr),
                query(node * 2 + 1, mid + 1, r, ql, qr)
            );
        }
    }

    public long maxAlternatingSum(int[] nums, int k) {

        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int id = 0;

        for (int x : sorted) {
            if (!map.containsKey(x)) {
                map.put(x, id++);
            }
        }

        int size = id;

        long[] up = new long[n];
        long[] down = new long[n];

        SegTree upTree = new SegTree(size);
        SegTree downTree = new SegTree(size);

        long ans = 0;

        for (int i = 0; i < n; i++) {

            if (i - k >= 0) {

                int j = i - k;

                int pos = map.get(nums[j]);

                upTree.update(pos, up[j]);
                downTree.update(pos, down[j]);
            }

            int pos = map.get(nums[i]);

            long bestDown =
                downTree.query(0, pos - 1);

            long bestUp =
                upTree.query(pos + 1, size - 1);

            up[i] = bestDown + nums[i];
            down[i] = bestUp + nums[i];

            up[i] = Math.max(up[i], nums[i]);
            down[i] = Math.max(down[i], nums[i]);

            ans = Math.max(ans,
                    Math.max(up[i], down[i]));
        }

        return ans;
    }
}