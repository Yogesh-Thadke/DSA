class Solution {
    public int totalMoney(int n) {
        int k = n/7;
        int r = n%7;
        int next = k+1;
        
        int ans = (k*(56+7*(k-1))/2)+(r*(2*next+(r-1))/2);
        return ans;
    }
}