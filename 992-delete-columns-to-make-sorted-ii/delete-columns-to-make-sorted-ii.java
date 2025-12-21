class Solution {
    public int minDeletionSize(String[] strs) {
        int cols=strs[0].length();
        int rows = strs.length;
        int deletCol = 0;
        boolean[] isCorrect = new boolean[rows-1];

        for(int col=0; col<cols; col++){
            boolean bad = false;
            for(int row=0; row<rows-1; row++){
                if(!isCorrect[row] && strs[row].charAt(col)>strs[row+1].charAt(col)){
                    bad = true;
                    break;
                }
            }
            if(bad){
                deletCol++;
                continue;
            }
            for(int row=0; row<rows-1; row++){
            if(!isCorrect[row] && strs[row].charAt(col)<strs[row+1].charAt(col)){
                isCorrect[row] = true;
            }
        }
        }
        return deletCol;    
    }
}