class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            int left = 0, right = row.length - 1;
            int firstNeg = row.length; 
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (row[mid] < 0) {
                    firstNeg = mid;
                    right = mid - 1; 
                } else {
                    left = mid + 1;  
                }
            }
            count += (row.length - firstNeg);
        }
        return count;
    }
}
