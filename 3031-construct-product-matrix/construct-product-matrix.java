class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        int size = m*n;

        int[][] result = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j] = 1;
            }
        }
        
        long prefix = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j] = (int)prefix;
                prefix = (prefix*grid[i][j])%mod;
            }
        }
        
        long sufix = 1;
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                result[i][j] = (int)(result[i][j]*sufix)%mod;
                sufix = (sufix*grid[i][j])%mod;
            }
        }
        
        return result;
    }
}