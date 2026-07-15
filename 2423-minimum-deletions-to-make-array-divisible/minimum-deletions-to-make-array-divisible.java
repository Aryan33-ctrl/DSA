class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd=findGcd(numsDivide);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }

    private int findGcd(int[]arr){
        int gcd=arr[0];

        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            while(num>0){
                int temp=gcd%num;
                 gcd=num;
                num=temp;
            }

            
        }
        return gcd;
    }
}