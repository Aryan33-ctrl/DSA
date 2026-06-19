class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map=new HashMap<>();

        int maxEdges=0;

        for(List<Integer>row:wall){
            int sum=0;

            for(int i=0;i<row.size()-1;i++){
                sum+=row.get(i);

                map.put(sum,map.getOrDefault(sum,0)+1);

                maxEdges=Math.max(maxEdges,map.get(sum));
            }
        }

        return wall.size()-maxEdges;


    }
}