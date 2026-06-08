class Solution {
    public void nextPermutation(int[] nums) {

        int n= nums.length;
        int pivot=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[pivot]){
                    swap(nums,pivot,i);
                    break;
                }
            }
            reverse(nums,pivot+1,n-1);
        }
        else{
            reverse(nums,0,n-1);
        }
        
    }

    private void swap(int[]nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }

    private void reverse(int[]nums,int left,int right){
        while(left<right){
            swap(nums,left,right);

            left++;
            right--;

        }
    }
}