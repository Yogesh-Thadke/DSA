import java.util.*;
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num,0)+1);
            if(!first.containsKey(num)){
                first.put(num,i);
            }
            
            last.put(num, i);
        }
        int degree = Collections.max(map.values());
        int minLen = nums.length;

        for(int num: map.keySet()){
            if(map.get(num)==degree){
                int len = last.get(num)-first.get(num) + 1;
                minLen = Math.min(minLen, len);
            }
        }
        return minLen;

    }
}