class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int x=nums.length;

        for(int i=0;i<x;i++){
            // beacause it is the first element of the sorted array and if the first element is positive then the sum cannot be zero
            if(nums[i]>0){
                break;
            }
            // hamne ye similar triplets ko avoid krne ke liye use kiya hai
            if(i>0 && nums[i]==nums[i-1]){
                continue;

            }
            int left=i+1;
            int right=x-1;
            // now use two pointers
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0){
                    //right-- beacuse we have reduce the value as right has higest value
                    right--;
                    
                }
                else if(sum<0){
                    //to increase value
                    left++;
                }
                else{
                    //in this case the value is equal to zero
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    //then also remove duplicates for the upcoming value
                    while(left<right&& nums[left]==nums[left-1]){
                        left++;
                    }
                }
            }
            

        }
        return result;




        
    }
}