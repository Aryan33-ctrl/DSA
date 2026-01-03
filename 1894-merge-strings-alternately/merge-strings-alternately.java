class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word3=new StringBuilder();

        int size1=word1.length();
        int size2=word2.length();
        int i=0;//this is initial index for first string
        int j=0;// this is initial index for second string
        // here in while loop we take two conditions so the loop still runs even if any one of them is true and any string dtill have a word
        while(i<size1||j<size2){
            if(i<size1){
                word3.append(word1.charAt(i));
                i++;
            }
            if(j<size2){
                word3.append(word2.charAt(j));
                j++;
            }
        }
        return word3.toString();// here we use to srting because stringbuilder used a character array not a string 

        
    }
}