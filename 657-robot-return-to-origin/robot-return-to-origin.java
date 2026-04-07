class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0;
        int u = 0;
        for(char move : moves.toCharArray()){
            if(move=='L') l++;
            if(move=='R') l--;
            if(move=='U') u++;
            if(move=='D') u--;
        }
        

        return u==0 && l==0;
    }
}