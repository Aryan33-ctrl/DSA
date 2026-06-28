class Solution {
    public int longestPalindrome(String s) {
        int []freq=new int[128];

        for(char c: s.toCharArray()){
            freq[c]++;
        }
        int ans=0;

        for(int f:freq){
            ans+=(f/2)*2;
        }

        if(ans<s.length()){
            ans++;


        }
        return ans;
    }
}