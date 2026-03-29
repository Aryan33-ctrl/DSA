class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int arr[]=new int[52];
        for(int range[]:ranges){
            int le=range[0];
            int rig=range[1];
            arr[le]++;
            arr[rig+1]--;
        }
        int curr=0;
        for(int i=1;i<=50;i++){
            curr+=arr[i];
            if(i>=left&&i<=right){
                if(curr<=0){
                    return false;
                }
                
            }
        }
        return true;
        
    }
}