import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> temp = new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            if(temp.containsKey(nums[i])){
                if(i-temp.get(nums[i])<=k){
                    return true;
                }
            }
            temp.put(nums[i],i);
        }
        return false;
    }
}