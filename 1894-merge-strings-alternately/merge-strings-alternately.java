class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder ans = new StringBuilder();

        int i=0,j=0;

        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        if(i<word1.length()){
            ans.append(word1.substring(i));
        }
        if(j<word2.length()){
            ans.append(word2.substring(j));
        }
        return ans.toString(); 
    }
}