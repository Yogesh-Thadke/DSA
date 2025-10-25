class Solution {
    public int totalMoney(int n) {
        int k = n/7;
        int r = n%7;
        int next = k+1;
        int fullSum = k*(56+7*(k-1))/2;
        int remSum = r*(2*next+(r-1))/2;
        int ans = fullSum+remSum;
        return ans;
    }
}