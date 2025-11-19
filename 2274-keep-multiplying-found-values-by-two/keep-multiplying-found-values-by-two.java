import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean present = true;

        for(int i=0;i<nums.length; i++){
            map.put(nums[i],i);
        }
        while(map.containsKey(original)){
            original*=2;
        }
        return original;
    }
}