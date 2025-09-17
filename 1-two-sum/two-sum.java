import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Hashtable<Integer, Integer> sb = new Hashtable<>();

        for(int i=0; i<nums.length; i++){
            if(sb.containsKey(target-nums[i])){
                arr[0] = sb.get(target-nums[i]);
                arr[1] = i;
                return arr;
            }
            sb.put(nums[i],i);
        }
        return arr;    
    }
}