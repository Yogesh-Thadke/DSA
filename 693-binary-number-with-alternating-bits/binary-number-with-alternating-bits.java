class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            int n1 = n&1;
            n>>=1;
            if(n1==(n&1)) return false;
        }
        return true;
    }
}