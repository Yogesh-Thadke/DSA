class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length; 
        int n=grid[0].length;
        int count=0;
        if(m<3 || n<3) return 0;
        for(int i=0; i<=m-3; i++){
            for(int j=0; j<=n-3; j++){
                if(isMagicSquare(grid, i, j)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isMagicSquare(int[][] grid, int i, int j){
        boolean seen[] = new boolean[9];
        for(int row=i; row<i+3; row++){
            for(int col=j; col<j+3; col++){
                int num = grid[row][col];
                if(num<1 || num>9 || seen[num-1]) return false;
                seen[num-1]=true;
            }
        }
        if(grid[i+1][j+1]!=5) return false;

        int row0 = grid[i][j] + grid[i][j+1] + grid[i][j+2];
        int row1 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
        int row2 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
        int col0 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
        int col1 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
        int col2 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
        int diag1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
        int diag2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

        if(row0==15 && row0==row1 && row1==row2 && 
        row2==col0 && col0==col1 && col1==col2 &&
        col2==diag1 && diag1==diag2 && diag2==15){
            return true;
        }
        return false;
    }
}