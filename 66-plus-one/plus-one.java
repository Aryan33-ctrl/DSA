class Solution {
    public int[] plusOne(int[] digits) {
        int x=digits.length;
        for(int i=x-1;i>=0;i--){
            //if the last digit is less then 9 we simily add 1 in that
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //otherwise we will make it zero and the carry forward to the second last
            else{
                digits[i]=0;
            }
           
        }
        //this is the worst case if all the numbers will be 9 so we have to increase the size of array by 1 for storing the carry bit 
         int newnumber[]=new int[x+1];
            newnumber[0]=1;
            return newnumber;
        
    }
}