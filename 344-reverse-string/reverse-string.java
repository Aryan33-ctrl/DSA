class Solution {
    public void reverseString(char[] s) {
        //we will solve it by two pointers aaproach and swap the characters of both left ad right side while updating their values 
        int left=0;
        int right=s.length-1;
        //move until left meets right
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        
    }
}