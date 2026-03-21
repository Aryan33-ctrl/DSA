class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        for (int i = 0; i < k / 2; i++) {

            int topRow = x + i;
            int bottomRow = x + k - i - 1;

            for (int j = 0; j < k; j++) {

                int col = y + j;

                int temp = grid[topRow][col];
                grid[topRow][col] = grid[bottomRow][col];
                grid[bottomRow][col] = temp;
            }
        }

        return grid;
    }
}