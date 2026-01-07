class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalcount=0;
        int size=word.length();

        for(int i=0;i<size;i++){
            if(Character.isUpperCase(word.charAt(i))){
                capitalcount+=1;

            }
        }
        if(capitalcount==size){
            return true;
        }
        if(capitalcount==0){
            return true;
        }
        if(capitalcount==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }

        return false;
        
    }
}