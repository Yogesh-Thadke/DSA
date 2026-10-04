class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int d = 0;
        int prev = 0;

        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i)-'0';
            d = Math.abs(prev-curr);
            ans += Math.min(d,10-d);
            prev = curr;
        }
        return ans;
    }
}