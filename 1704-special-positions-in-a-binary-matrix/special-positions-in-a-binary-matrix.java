class Solution {
    public int numSpecial(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;

        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                rowSums[i] += mat[i][j];
                colSums[j] += mat[i][j];
            }
        }
/*
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                colSums[j] += mat[i][j];
            }
        }
*/
        int count=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j]==1 && rowSums[i]==1 && colSums[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}