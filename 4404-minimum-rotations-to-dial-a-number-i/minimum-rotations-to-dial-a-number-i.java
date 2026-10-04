class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int d = 0;
        int prev = 0;

        for(int i=0; i<s.length(); i++){
            d = Math.abs(prev-(s.charAt(i)-'0'));
            ans += Math.min(d,10-d);
            prev = s.charAt(i)-'0';
        }
        return ans;
    }
}