class Solution {
    public int countElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:nums){
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        int count=0;
        for(int num:nums){
            if(num> min && num < max){
                count++;
            }
        }
        return count;
    }
}