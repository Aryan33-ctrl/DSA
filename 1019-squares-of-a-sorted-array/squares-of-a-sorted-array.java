class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int x=nums.length;
        int left=0;
        int right=x-1;
        int index=x-1;
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];

            if(leftsq>rightsq){
                result[index]=leftsq;
                left++;
            }
            else{
                result[index]=rightsq;
                right--;
            }
            index--;


        }
        
return result;
      
    }
}