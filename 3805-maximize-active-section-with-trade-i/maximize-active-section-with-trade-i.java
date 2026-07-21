class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one = 0;
        for(char c : s.toCharArray()){
            if(c == '1') one++;
        }

        List<Character> type = new ArrayList<>();
        List<Integer> len = new ArrayList<>();

        int i = 0;
        while(i<s.length()){
            int j = i;
            while(j < s.length() && s.charAt(j)==s.charAt(i)){
                j++;
            }
            type.add(s.charAt(i));
            len.add(j-i);
            i=j;
        }
        int maxGain = 0;
        for(int k=1; k < type.size()-1; k++){
            if(type.get(k)=='1' &&
            type.get(k-1)=='0' &&
            type.get(k+1)=='0'){
                int gain = len.get(k-1)+len.get(k+1);
                maxGain = Math.max(gain,maxGain);
            }
        }
        return maxGain+one;
    }
}