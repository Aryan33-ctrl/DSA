class Solution {
    public boolean isPalindrome(String s) {
        //will use two pointer method here but first we clean the string for thatwe have to use stringbuilder 
        
        StringBuilder clean=new StringBuilder();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (Character.isLetterOrDigit(ch)) {
        clean.append(Character.toLowerCase(ch));
    }
}
      int left=0;
      int right=clean.length()-1;
      while(left<right){
        if(clean.charAt(left)!=clean.charAt(right)){
            return false;
        }
        left++;
        right--;
      }
      return true;


        
    }
}