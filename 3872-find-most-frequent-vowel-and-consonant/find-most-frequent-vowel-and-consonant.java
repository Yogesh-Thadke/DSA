import java.util.*;
class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }

    public int maxFreqSum(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
     for(int i=0; i<s.length();i++){
        map.put(s.charAt(i),(map.getOrDefault(s.charAt(i),0)+1));
     }
     int vowelfreq = 0, consfreq = 0; 
     for(Map.Entry<Character, Integer> entry : map.entrySet()){
        char ch = entry.getKey();
        int frequency = entry.getValue();

        if(isVowel(ch) && frequency>vowelfreq){
            vowelfreq = frequency;
        }
        if(!isVowel(ch) && frequency>consfreq){
            consfreq = frequency;
        }
     }
     return consfreq+vowelfreq;

    }
}