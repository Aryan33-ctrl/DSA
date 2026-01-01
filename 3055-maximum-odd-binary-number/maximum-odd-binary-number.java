class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[]arr=s.toCharArray();
        int one=0;
        int x=s.length();
        for(int i=0;i<x;i++){
            if(arr[i]=='1'){
                one++;
            }
        }
        // we will subtract a one in this case beacuse we want a one at last to make the given digit odd 
        one--;
        // for zeo we have to subtract 1 from the total length-1
        int zero=x-(one+1);
         StringBuilder newstring = new StringBuilder();
        //  from here we start appending values 
         for(int i=0;i<one;i++){
            newstring.append('1');
         }
         for(int i=0;i<zero;i++){
            newstring.append('0');
         }
         //at last we append the remaining one to make the given number odd
         newstring.append('1');
         return newstring.toString();
    }
}