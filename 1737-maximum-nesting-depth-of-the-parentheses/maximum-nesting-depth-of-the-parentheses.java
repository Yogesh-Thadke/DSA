class Solution {
    public int maxDepth(String s) {
        int ans = -1;
        int lcount = 0;
        int rcount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                lcount++;
            }
            if(s.charAt(i)==')'){
                rcount++;
            }
            ans = Math.max(ans,(lcount-rcount));
        }
        return ans;
    }
}