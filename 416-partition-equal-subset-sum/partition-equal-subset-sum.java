class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;

        
       
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;

        }
        int[][]dp=new int[sum/2+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
            
        }
        
        return subset(nums,sum/2,0,dp);
        
        
    }
    public boolean subset(int[]nums,int sum ,int index,int[][]dp ){

        if(sum==0){
            return true;
        }

        if(index==nums.length||sum<0){
            return false;
        }

        if(dp[sum][index]!=-1){
            return dp[sum][index]==1;
        }

        boolean take=subset(nums,sum-nums[index],index+1,dp);

        boolean  nottake=subset(nums,sum,index+1,dp);

        dp[sum][index]=(take||nottake)? 1:0;

        return take||nottake;
    }
}