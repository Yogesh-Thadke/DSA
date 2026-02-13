class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int[] Freq = new int[26];
            for(int j=i; j<s.length(); j++){
                int length = j-i+1;
                int index = s.charAt(j)-'a';
                Freq[index]++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for(int k=0; k<26; k++){
                    if(Freq[k]>0){
                        maxFreq=Math.max(maxFreq,Freq[k]);
                        minFreq=Math.min(minFreq,Freq[k]);
                    }
                }
                if(maxFreq==minFreq){
                    ans=Math.max(ans,length);
                }
            }
        }
        return ans;
    }
}