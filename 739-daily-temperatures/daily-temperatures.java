class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int result[]=new int[n];

        Stack <Integer> s1=new Stack<>();

        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && temperatures[i]>temperatures[s1.peek()]){
            int ind=s1.pop();
            result[ind]=i-ind;
        }
        s1.push(i);
        }
        
        
    
    return result;
    }
}