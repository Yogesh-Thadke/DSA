import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Hashtable<Integer, Integer> ans = new Hashtable<>();

        for(int i=0; i<nums.length; i++){
            if(ans.containsKey(target-nums[i])){
                 ret[0] = ans.get(target-nums[i]);
                 ret[1] = i;
                return ret;
            }
            ans.put(nums[i],i);
        }
        return ret;
    }
}