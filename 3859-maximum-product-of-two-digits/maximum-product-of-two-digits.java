class Solution {
    public int maxProduct(int n) {
        int mx=-1;
        int sex=-1;
        
        while(n>0){
            int digit=n%10;
            if(digit>mx){
                sex=mx;
                mx=digit;
            }else if(digit>sex){
                sex=digit;
            }
            n/=10;
        }
        return mx*sex;
    }
}