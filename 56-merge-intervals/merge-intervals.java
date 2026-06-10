class Solution {
    public int[][] merge(int[][] Intervals) {


       Arrays.sort(Intervals,(a,b)-> a[0]-b[0]) ;

       List<int[]> ans=new ArrayList<>();

       int start=Intervals[0][0];
       int end= Intervals[0][1];


       for(int i=1;i<Intervals.length;i++){
           
           int currStart=Intervals[i][0];
           int currEnd= Intervals[i][1];

           if(currStart<=end){
            end=Math.max(end,currEnd);
           }else{

            ans.add(new int[]{start,end});

            start=currStart;
            end=currEnd;

           }
          

       }
        ans.add(new int[]{start,end});

        return ans.toArray(new int [ans.size()][]);
    }
}