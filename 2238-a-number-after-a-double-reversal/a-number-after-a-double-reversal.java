class Solution {
    public boolean isSameAfterReversals(int num) {
        int first =reverse(num);
        int second=reverse(first);
        if(second==num){
            return true;
        }
        else{
            return false;
        }
        
    }

    private int reverse(int n){
        int rev=0;
        while(n>0){
             rev=rev*10 +(n%10);
            n=n/10;
        }
        return rev;
    }
}