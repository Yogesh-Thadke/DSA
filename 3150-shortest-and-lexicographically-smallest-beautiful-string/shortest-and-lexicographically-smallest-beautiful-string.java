class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0;
        int oneCount = 0;

        int minlen = Integer.MAX_VALUE;
        String ans = "";

        for(int r=0; r<s.length(); r++){
            if(s.charAt(r) == '1'){
                oneCount++;
            }
            if(oneCount == k){
                while(s.charAt(l) == '0'){
                    l++;
                }
                String str = s.substring(l,r+1);
                int len = r - l + 1;
                if(len < minlen || (len == minlen && str.compareTo(ans) < 0)){
                    ans = str;
                    minlen = len;
                }
                l++;
                oneCount--;
            }
        }
        return ans;
    }
}