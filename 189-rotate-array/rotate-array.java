class Solution {
    public void rotate(int[] nums, int k) {
    // here we use the basic approach first we rotate the array completely theen reverse the k elemnts then reverse the remaining k to end elements 
    int n=nums.length;
    k=k%n; //to manage k>n

    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);

        
    }
    // create a function to reverse by two pointers approach
    public void reverse(int []nums,int left,int right){
     while(left<right){
        int temp=nums[right];
        nums[right]=nums[left];
        nums[left]=temp;
        left++;
        right--;
    }
  
}}