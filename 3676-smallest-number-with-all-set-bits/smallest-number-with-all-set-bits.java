class Solution {
    public int smallestNumber(int n) {
        int np=1;
        while(np<=n){
            np*=2;
        }
        return np-1;
    }
}