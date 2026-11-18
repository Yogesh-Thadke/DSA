class Solution {
    public int minChanges(String s) {
        int l=0;
        int r=1;
        int ans = 0;
        while(l<s.length()){
            if(s.charAt(l) != s.charAt(r)){
                ans++;
            }
            l = r+1;
            r = l+1; 
        }
        return ans;
    }
}