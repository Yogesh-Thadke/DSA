class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if(Arrays.deepEquals(mat,target)) return true;
        for(int k=0; k<3; k++){
            int[][] newmat = new int[mat[0].length][mat.length];
            for(int i=0; i<n; i++){
                for(int j=0; j<mat[i].length; j++){
                    newmat[j][n-1-i] = mat[i][j];
                }
            }
            if(Arrays.deepEquals(newmat,target)){
                return true;
            }else{
                mat = newmat;
            }
        }
        return false;
    }
}