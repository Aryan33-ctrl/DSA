class Solution {
    public void moveZeroes(int[] nums) {

        int position=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] !=0){
                nums[position]=nums[i];
                position++;
            }
        }
        while(position<n){
            nums[position]=0;
            position++;
        }

      
        
    }
   
}