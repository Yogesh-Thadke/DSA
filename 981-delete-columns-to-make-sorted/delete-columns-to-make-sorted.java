class Solution {
    public int minDeletionSize(String[] strs) {
        int cols=strs[0].length();
        int rows = strs.length;
        int deletColl = 0;

        for(int col=0; col<cols; col++){
            for(int row=1; row<rows; row++){
                if(strs[row].charAt(col)<strs[row-1].charAt(col)){
                    deletColl++;
                    break;
                }
            }
        }
        return deletColl;
    }
}