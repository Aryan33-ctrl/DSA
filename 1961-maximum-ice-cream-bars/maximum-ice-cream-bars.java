class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int res=0;
        int sum=0;


        for(int cost :costs){
            if(sum+cost<=coins){
                sum+=cost;
                res+=1;
            }
            else{
                break;
            }
        }
        return res;
    }
}