class Solution {
    public String toLowerCase(String s) {
        StringBuilder result=new StringBuilder();
        int size=s.length();

        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
        
        if(ch>='A'&& ch <='Z'){
            ch=(char)(ch + 32);
        }

        result.append(ch);
        }
        return result.toString();
        
    }
   
    
}
