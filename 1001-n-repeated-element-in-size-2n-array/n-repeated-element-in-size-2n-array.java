class Solution {
    public int repeatedNTimes(int[] nums) {
        // here we create  a hashset than insert values in it then check if it contains the value already ifit then return the value
        HashSet<Integer> exist=new HashSet<>();

        for(int value:nums){
            if(exist.contains(value)){
                return value;
            }
            exist.add(value);
        }
        return -1;

        
    }

}