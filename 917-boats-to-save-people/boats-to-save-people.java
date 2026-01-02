class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        //here we use two pointers 
        int left=0;
        int right=people.length-1;
        int boats=0;
        //the condition here we use is <= beacuse even if one person remains will also take a boat 
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
        
    }
    
}