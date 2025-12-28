class Solution {
    public int countNegatives(int[][] grid) {
        int cols = grid[0].length;
        int count = 0;

        for(int i=0; i<grid.length; i++){
            int l=0, r=grid[i].length-1;
            int firstNeg = cols;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(grid[i][mid]<0){
                    firstNeg = mid;
                    r = mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            count+=cols-firstNeg; 
        }
        return count;
    }
}