class Solution {
    public String[] createGrid(int m, int n) {
        char[][] a = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(a[i], '#');
        }

        Arrays.fill(a[0], '.');

        for (int i = 0; i < m; i++) {
            a[i][n - 1] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(a[i]);
        }

        return ans;
    }
}