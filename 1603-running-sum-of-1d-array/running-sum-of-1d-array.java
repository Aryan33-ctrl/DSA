class Solution {
    public int[] runningSum(int[] nums) {
        int size=nums.length;

        int []result=new int[size];

        result[0]=nums[0];
        for(int i=1;i<size;i++){
            result[i]=result[i-1]+nums[i];
        }
        return result;
    }
}