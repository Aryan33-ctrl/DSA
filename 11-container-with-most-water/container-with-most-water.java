class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int wid=right-left;
            int hei=Math.min(height[left],height[right]);
            int currentwater=wid*hei;
            maxwater=Math.max(maxwater,currentwater);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
        
    }
}