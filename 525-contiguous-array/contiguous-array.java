class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,-1);

        int prefixsum=0;
        int maxLen=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefixsum--;
            }else{
                prefixsum++;
            }

            if(map.containsKey(prefixsum)){
                int length=i-map.get(prefixsum);
                maxLen=Math.max(maxLen,length);
            }
            else{
                map.put(prefixsum,i);
            }
        }
        return maxLen;
    }
}