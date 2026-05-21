class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        int n=nums.length;

        for(int num:nums){
            total+=num;
        }

        int left=0;
        int[]ans=new int[n];

        for(int i=0;i<n;i++){
            int right=total-left-nums[i];

            ans[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return ans;
    }
}