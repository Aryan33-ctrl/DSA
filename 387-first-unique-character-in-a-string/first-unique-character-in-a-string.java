class Solution {
    public int firstUniqChar(String s) {


        int []freq=new int[26];
        char[]chars=s.toCharArray();
        int x=chars.length;
        for(char c:chars){
            freq[c-'a']++;
        }
        for(int i=0;i<x;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}