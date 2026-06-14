import java.util.Arrays;

class Solution {
    public long maxRatings(int[][] units) {
        int m = units.length;
        
        
        if (m <= 1) {
            if (m == 0 || units[0].length == 0) return 0;
            int min = units[0][0];
            for (int val : units[0]) {
                min = Math.min(min, val);
            }
            return min;
        }

        long baseRatingSum = 0;
        int globalMinUnit = Integer.MAX_VALUE;
        int[] secondMinValues = new int[m];
        int[] firstMinValues = new int[m];

    
        for (int i = 0; i < m; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int val : units[i]) {
                if (val < min1) {
                    min2 = min1;
                    min1 = val;
                } else if (val < min2) {
                    min2 = val;
                }
                if (val < globalMinUnit) {
                    globalMinUnit = val;
                }
            }

            firstMinValues[i] = min1;
            
            secondMinValues[i] = (min2 == Integer.MAX_VALUE) ? min1 : min2;
            baseRatingSum += min1;
        }

        long totalRemovedMinSum = 0;
        for (int i = 0; i < m; i++) {
            totalRemovedMinSum += secondMinValues[i];
        }

        
        long maxTotalRating = baseRatingSum; 

        for (int k = 0; k < m; k++) {
  
            long currentSum = totalRemovedMinSum - secondMinValues[k] + Math.min(firstMinValues[k], globalMinUnit);
            
            if (currentSum > maxTotalRating) {
                maxTotalRating = currentSum;
            }
        }

        return maxTotalRating;
    }
}
