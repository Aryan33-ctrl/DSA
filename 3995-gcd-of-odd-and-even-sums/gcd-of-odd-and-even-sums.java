class Solution {
    public int gcdOfOddEvenSums(int n) {
        

        int evensum=n*(n+1);
        int oddsum=n*n;
            
    
        return gcd(oddsum,evensum);
    }

    static int gcd(int a,int b){

        if(b==0){
            return a;
        }

        return gcd(b,a%b);

    
    }

    
}
