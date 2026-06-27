class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int low=0;
        int high=0;
        int max_wind=0;
        int zero=0;


        for(high=0;high<nums.length;high++){
            
            if(nums[high]==0){
                zero++;

            }
            while(zero>k){
                if(nums[low]==0){
                    zero--;
                    
                }
                low++;
               
                
            }
             max_wind=Math.max(max_wind,high-low+1);
            

        }
        return max_wind;
    }
}