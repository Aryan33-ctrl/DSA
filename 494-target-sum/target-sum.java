class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n=nums.length;

        int total=0;
        for(int num:nums){
            total+=num;
        }

        if(total+target<0){
            return 0;
        }
        if((total+target)%2!=0){
            return 0;
        }

        int newtarget=(total+target)/2;

        int[][]dp=new int[n][newtarget+1];

        for(int d[]:dp){
            Arrays.fill(d,-1);
        }

        return solve(nums,newtarget,dp,n-1);
        
        
    }
    public int solve(int[]arr,int target,int[][]dp,int idx){

        if(idx==0){
            if(target==0&& arr[0]==target){
                return 2;
            }
            else if(target==0||arr[0]==target){
                return 1;
            }else{
                return 0;
            }
        }

        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }

        int not=solve(arr,target,dp,idx-1);

        int take=0;
        if(arr[idx]<=target){
            take=solve(arr,target-arr[idx],dp,idx-1);
        }

        dp[idx][target]=take+not;

        return dp[idx][target];
    }
}