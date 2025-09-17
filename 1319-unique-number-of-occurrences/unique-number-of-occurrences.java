import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Hashtable<Integer, Integer> ans = new Hashtable<>();

        for(int num : arr){
            if(ans.containsKey(num)){
                ans.put(num, ans.get(num)+1);
            }
            else{
                ans.put(num, 1);
            }
        }

        HashSet<Integer> sc = new HashSet<>(ans.values());

        if(ans.size()==sc.size()){
            return true;
        }
        else{
            return false;
        }

    }
}