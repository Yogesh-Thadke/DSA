class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum+=grid[i][j];
            }
        }
        if(sum%2!=0) return false;

        long rSum = 0;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n; j++){
                rSum+=grid[i][j];
            }
            if(rSum==sum/2) return true;
            if(rSum>sum/2) break;
        }

        long cSum = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<m; j++){
                cSum+=grid[j][i];
            }
            if(cSum==sum/2) return true;
            if(cSum>sum/2) break;
        }
        return false;
    }
}