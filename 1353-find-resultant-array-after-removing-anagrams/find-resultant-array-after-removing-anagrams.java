import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(!is_anagaram(words[i],words[i-1])){
                ans.add(words[i]);
            }
        }
        return ans;
            
    }
    public boolean is_anagaram(String ana1, String ana2){
        if(ana1.length()!=ana2.length()) return false;
/*      
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ana1.length(); i++){
            map.put(ana1.charAt(i),map.getOrDefault(ana1.charAt(i),0)+1);
        }
        for(char c : ana2.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
        }
        return map.isEmpty();
*/      int[] count = new int[26];
        for(int i=0; i<ana1.length(); i++){
            count[ana1.charAt(i)-'a']++;
            count[ana2.charAt(i)-'a']--;
        }
        for(int c : count){
            if(c!=0) return false;
        }
        return true;
    }
}