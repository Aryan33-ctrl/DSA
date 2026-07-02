class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
    
       int units=0;

       for(int i=0;i<boxTypes.length;i++){

        int boxes=boxTypes[i][0];

        int perbox=boxTypes[i][1];

        if(truckSize>=boxes){

             units=units + boxes*perbox;
             truckSize=truckSize-boxes;

        }
        else{
            units=units+truckSize*perbox;
            break;
        }

       }


       return units;
    }
}