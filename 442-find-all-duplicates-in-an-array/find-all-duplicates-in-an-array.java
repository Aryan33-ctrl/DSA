class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();

        for(int num: map.keySet()){
            if(map.get(num)==2){
                ans.add(num);
            }
        }
        return ans;
    }
}