class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int i=0,l=0,r=0,maxCount=0;
        while(r<s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),r);
                maxCount = Math.max(maxCount, r-l+1);
                r++;
            }else{
                map.remove(s.charAt(l));
                l++;
            }
        }
        return maxCount;

    }
}