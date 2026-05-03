class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];

        for(int i=0;i<n;i++){
            int count=0;

            for(int j=i+1;j<n;j++){
                if(nums[i]%2!=nums[j]%2){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}