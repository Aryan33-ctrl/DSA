class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int high=0;
        int low=0;
        int minlength=Integer.MAX_VALUE;
        int currentsum=0;

        for( high=0;high<nums.length;high++){
            currentsum+=nums[high];
            while(currentsum>=target){
                int currentwindow=high-low+1;
                minlength=Math.min(currentwindow,minlength);
                currentsum=currentsum-nums[low];
                low++;
            }

        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}