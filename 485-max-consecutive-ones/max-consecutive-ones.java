class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int size=nums.length;
        int currentcount=0;
        int maxcount=0;

        for(int i=0;i<size;i++){
            if(nums[i]==1){
                currentcount+=1;
                maxcount=Math.max(currentcount,maxcount);
                
            }
            else{
                currentcount=0;
            }
        }
        return maxcount;
        
    }
}