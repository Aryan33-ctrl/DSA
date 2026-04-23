class Solution {
    public boolean isValid(String word) {
     
     if(word.length()<3)return false;

     boolean hasVowel=false;
     boolean hasconsonent=false;

     for(char ch:word.toCharArray()){
        if(!Character.isLetterOrDigit(ch)){
            return false;
        }
        if(Character.isLetter(ch)){
            char lower=Character.toLowerCase(ch);
            if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u'){
            hasVowel=true;
        }
        else{
            hasconsonent=true;
        }
        }

        
     }
     return hasVowel && hasconsonent;

        
    }
}