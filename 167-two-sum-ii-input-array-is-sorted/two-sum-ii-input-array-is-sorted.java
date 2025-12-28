class Solution {
    public int[] twoSum(int[] nums, int target) {
        // here we will use 2 pointer method//
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int current_sum=nums[left]+nums[right];
            if(current_sum==target){
                return new  int[]{left+1,right+1};
                
            }
            else if(current_sum<target){
                left++;
            }
            else{
                right--;
            }
        }

return new int[]{-1,-1};
        
    }
}