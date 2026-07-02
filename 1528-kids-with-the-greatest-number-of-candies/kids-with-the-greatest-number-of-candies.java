class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int n=candies.length;

        for(int candy:candies){
            max=Math.max(candy,max);
        }
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}