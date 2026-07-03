class Solution {
    public int findMinArrowShots(int[][] points) {

        if(points.length==0){
            return 0;
        }
        Arrays.sort(points,(a,b)->Long.compare((long)a[1],(long)b[1]));
        int arrow=1;
        long LastEnd=points[0][1];

        for(int i=1;i<points.length;i++){

            if(points[i][0]>LastEnd){
                arrow++;
                LastEnd=points[i][1];
            }

        }
        return arrow;



    }
}