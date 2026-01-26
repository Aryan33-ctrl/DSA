class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=cardPoints[i];
        }
        int maxsum=currentsum;
        int right=n-1;

        for(int i=k-1;i>=0;i--){
            currentsum-=cardPoints[i];
            currentsum+=cardPoints[right];
            right--;
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;

        
    }
}