class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int numberOfdays=findDays(weights,mid);
            if(numberOfdays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public int findDays(int[]weights,int capacity){
        int days=1;
        int load=0;
        for(int weight:weights){
            if(load+weight>capacity){
                days++;
                load=weight;
            }else{
                load+=weight;
            }
        }
        return days;
    }
}