class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer>current=new ArrayList<>();
        List<List<Integer>>answer=new ArrayList<>();

        backtrack(nums,0,current,answer);
        return answer;
        
    }
    public void backtrack(int[]nums,int index,List<Integer>current,List<List<Integer>>answer){

        if(index==nums.length){
            answer.add(new ArrayList<>(current));

            return;
        }

        current.add(nums[index]);

        backtrack(nums,index+1,current,answer);

        current.remove(current.size()-1);

        backtrack(nums,index+1,current,answer);
    }
}