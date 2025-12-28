
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        //we required so (target-any index will return a the other one) 
        for(int i=0;i<=nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                return new int []{map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }
}