class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;

        for(int sal:salary){
            max=Math.max(max,sal);
            min=Math.min(min,sal);
            sum+=sal;
        }        
        return (double)(sum-max-min)/(salary.length-2);
    }
}