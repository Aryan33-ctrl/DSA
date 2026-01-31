class Solution {
    public int[] sortArrayByParity(int[] nums) {
     
     int m = nums.length;
     int v [] = new int[m];
     int start = 0;
     int end= nums.length -1;
    for(int i=0; i<nums.length; i++){
        if(nums[i] % 2 == 0){ 
            v[start] = nums[i];
            start++;
        }else {
            v[end] = nums[i];
            end--;
        }
    }
    return v;

        
    }
}