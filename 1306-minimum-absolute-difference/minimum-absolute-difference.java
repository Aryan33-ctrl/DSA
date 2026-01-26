class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> ans=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];

            if(mindiff>diff){
                mindiff=diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(diff==mindiff){
                ans.add(Arrays.asList(arr[i-1],arr[i]));

            }
        
            
        }
        return ans;
    }
}