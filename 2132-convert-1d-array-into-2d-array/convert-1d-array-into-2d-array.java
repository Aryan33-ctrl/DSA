class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int size=original.length;
        int result[][]=new int [m][n];

        if(size!=m*n){
            return new int[0][0];
        }

        for(int i=0;i<size;i++){
            result[i/n][i%n]=original[i];
        }

        return result;
    }
}