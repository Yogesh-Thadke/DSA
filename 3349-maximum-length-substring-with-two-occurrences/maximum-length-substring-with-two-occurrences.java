class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int l=0;
        int ans=0;

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;

            while(count[s.charAt(i)-'a']>2){
                count[s.charAt(l)-'a']--;
                l++;
            }

            ans = Math.max(ans,i-l+1);
        }
        return ans;
    }
}