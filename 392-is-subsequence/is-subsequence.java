class Solution {
    public boolean isSubsequence(String s, String t) {
        int str1=0;
        int str2=0;

        while(str1<s.length()&&str2<t.length()){
            if(s.charAt(str1)==t.charAt(str2)){
                str1++;
            }
            str2++;
        }
        return str1==s.length();
        
    }
}