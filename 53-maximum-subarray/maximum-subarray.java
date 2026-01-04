class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            currentsum+=nums[i];
            
            maxsum=Math.max(currentsum,maxsum);
            if(currentsum<0){
                currentsum=0;

            }
        }
        return maxsum;
        
    }
}