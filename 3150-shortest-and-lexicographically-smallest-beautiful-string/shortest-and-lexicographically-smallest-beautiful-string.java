class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int minlen = Integer.MAX_VALUE;
        String ans = "";
        for(int i=0; i<s.length(); i++){
            int oneCount = 0;
            for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(c == '1'){
                    oneCount++;
                }
                if(oneCount == k){
                    String str = s.substring(i,j+1);
                    int len = (j+1)-i;

                    if(len < minlen || (len == minlen && str.compareTo(ans) < 0)){
                        ans = str;
                        minlen = len;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}