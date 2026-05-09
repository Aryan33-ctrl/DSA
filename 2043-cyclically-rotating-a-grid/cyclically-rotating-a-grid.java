class Solution {

    public int[][] rotateGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> arr = new ArrayList<>();

            int top = layer;
            int bottom = m - layer - 1;
            int left = layer;
            int right = n - layer - 1;

            for (int j = left; j <= right; j++) {
                arr.add(grid[top][j]);
            }

            for (int i = top + 1; i < bottom; i++) {
                arr.add(grid[i][right]);
            }

            for (int j = right; j >= left; j--) {
                arr.add(grid[bottom][j]);
            }

            for (int i = bottom - 1; i > top; i--) {
                arr.add(grid[i][left]);
            }

            int size = arr.size();

            int rotate = k % size;

            ArrayList<Integer> rotated = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                rotated.add(arr.get((i + rotate) % size));
            }

            int idx = 0;

            for (int j = left; j <= right; j++) {
                grid[top][j] = rotated.get(idx++);
            }

            for (int i = top + 1; i < bottom; i++) {
                grid[i][right] = rotated.get(idx++);
            }

            for (int j = right; j >= left; j--) {
                grid[bottom][j] = rotated.get(idx++);
            }

            for (int i = bottom - 1; i > top; i--) {
                grid[i][left] = rotated.get(idx++);
            }
        }

        return grid;
    }
}