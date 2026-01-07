class Solution {
    public int largestAltitude(int[] gain) {
        int size=gain.length;
        int currentalt=0;
        int maxalt=0;

        for(int i=0;i<size;i++){
            currentalt+=gain[i];
            maxalt=Math.max(currentalt,maxalt);
        }
        return maxalt;
        
    }
}