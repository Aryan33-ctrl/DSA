class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

    
            if (words[i].equals(target)) {

                int diff = Math.abs(i - startIndex);
                int dist;


                if (diff < (n - diff)) {
                    dist = diff;
                } else {
                    dist = n - diff;
                }

               
                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }

        
        if (minDist == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minDist;
        }
    }
}