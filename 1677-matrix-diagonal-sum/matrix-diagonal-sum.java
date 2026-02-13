class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int size=mat.length;

        for(int i=0;i<size;i++){
            int j=size-i-1;
            sum+=mat[i][i];

            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;

    }
}