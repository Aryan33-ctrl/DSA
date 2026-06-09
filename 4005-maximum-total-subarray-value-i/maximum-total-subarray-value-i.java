class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mx=0;
        long min=Integer.MAX_VALUE;

        for(int x:nums){
            mx=Math.max(mx,x);
            min=Math.min(min,x);
        }

        return (mx-min)*k;
    }
}