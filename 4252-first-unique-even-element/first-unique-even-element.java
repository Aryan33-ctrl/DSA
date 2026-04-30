class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(map.get(num)==1&&num%2==0){
                return num ;
            }
        }
        return -1;
    }
}