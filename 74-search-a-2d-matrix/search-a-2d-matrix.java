class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n=matrix[0].length;

        int left=0;
        int right=m*n-1;

        while(left<=right){
            int mid=(left+right)/2;


            int row=mid/n;
            int column=mid%n;

            if(matrix[row][column]==target){
                return true;
            }
            else if(matrix[row][column]>target){
                right--;
            }
            else{
                left++;
            }

        }
        return false;
        
    }
}