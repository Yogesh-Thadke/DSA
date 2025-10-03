import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        Hashtable<Character, Integer> table = new Hashtable<>();

        for(char c : s.toCharArray()){
            table.put(c,table.getOrDefault(c,0)+1);
        }
        int count=0;
        boolean oddFound = false;
        for(Integer value: table.values()){
            if(value%2==0){
                count+=value;
            }
            else{
                count+=value-1;
                oddFound = true;
            }
        }
        if(oddFound){
            return count+1;
        }
        return count;
    }
}