class Solution {
    public int sumFourDivisors(int[] nums) {
        int result=0;
        for(int num:nums){
            result+=findsumdivisor(num);
        }
        return result;
    }

    public int findsumdivisor(int num){
        int divisor=0;
        int sum=0;

        for(int fact=1;fact*fact<=num;fact++){
            if(num%fact==0){
                int other=num/fact;
                if(other==fact){
                    divisor+=1;
                    sum+=fact;
                }
                else{
                    divisor+=2;
                    sum+=(fact+other);
                }
                if(divisor>4){
                    return 0;
                }
                
            }
        }
        if(divisor==4){
            return sum;
        }
        else{
            return 0;
        }
    }
}