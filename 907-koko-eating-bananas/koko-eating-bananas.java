class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            long hours=findHours(piles,mid);

            if(hours<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)low;


        
    }

    private long findHours(int[]piles,long speed){
        long totalHours=0;

        for(int pile:piles){
            totalHours+=(pile+speed-1)/speed;
        }
        return totalHours;

    }
}