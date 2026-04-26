class Solution {
    public boolean validDigit(int n, int x) {
        int count = 0;
        if(x==n)return false;
        int temp=n;

        while (temp != 0) {
            if (temp% 10 == x) {
                count++;
            }
            temp/= 10;
        }
        int n2=Math.abs(n);
        while(n2>=10){
            n2=n2/10;
        }

        if(count>=1&&n2!=x){
            return true;
        }else{
            return false;
        }
    }
}