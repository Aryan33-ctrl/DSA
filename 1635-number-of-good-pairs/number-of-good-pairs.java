class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;

        for(int num:nums){
            int freq=map.getOrDefault(num,0);

            count+=freq;

            map.put(num,freq+1);
        }
        return count;
    }
}