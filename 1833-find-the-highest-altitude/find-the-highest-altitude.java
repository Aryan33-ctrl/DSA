class Solution {
    public int largestAltitude(int[] gain) {
        int size=gain.length;
        int current=0;
        int highest=0;

        for(int i=0;i<size;i++){
            current+=gain[i];
            highest=Math.max(highest,current);
        }
        return highest;
    }
}