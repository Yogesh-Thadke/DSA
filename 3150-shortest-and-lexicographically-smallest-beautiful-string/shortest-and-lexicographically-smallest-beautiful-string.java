class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int minlen = Integer.MAX_VALUE;
        String ans = "";
        for(int i=0; i<s.length(); i++){
            String str = "";
            int oneCount = 0;
            int len = 0;
            for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(c == '1'){
                    oneCount++;
                }
                if(oneCount == k){
                    str = s.substring(i,j+1);
                    len = (j+1)-i;
                    break;
                }
            }
            if(len > 0){
                if(len < minlen){
                    ans = str;
                    minlen = len;
                }else if(len == minlen && str.compareTo(ans) < 0){
                    ans = str;
                }
            }
        }
        return ans;
    }
}