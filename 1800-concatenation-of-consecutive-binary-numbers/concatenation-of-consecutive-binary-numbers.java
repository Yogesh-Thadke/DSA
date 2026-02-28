class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int bi = 0;
        for(int i=1; i<=n; i++){
            if((i&(i-1))==0) bi++;
            result = ((result<<bi)|i) % 1000000007;
        }
        return (int)result;
    }
}