class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        int size = m*n;

        int[] result = new int[size];
        
        int prefix = 1;
        for(int i=0; i<size; i++){
            result[i] = prefix;
            prefix = (prefix*(grid[i/m][i%m]%mod))%mod;
        }
        
        int sufix = 1;
        for(int i=size-1; i>=0; i--){
            result[i] = (result[i]*sufix)%mod;
            sufix = (sufix*(grid[i/m][i%m]%mod))%mod;
        }
        int[][] p = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                p[i][j] = result[i*m+j];
            }
        }

        return p;
    }
}