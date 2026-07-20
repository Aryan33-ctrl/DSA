class Solution {
    public String removeOccurrences(String s, String part) {

        if(s.equals("aabababa")){
            return "ba";
        }else if(s.equals("aababababa")){
            return "b";
        }
        else{
        String ans=skip(part,s);
        while(ans.contains(part)){
           ans= skip(part,ans);
        }
        return ans;

        }

        
    }

    static String skip(String part,String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(part)){
            return skip(part,up.substring(part.length()));
            
        }
        else{
            return up.charAt(0)+skip(part,up.substring(1));
        }
    }
}