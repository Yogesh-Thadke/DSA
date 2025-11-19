import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean present = true;

        for(int i=0;i<nums.length; i++){
            map.put(nums[i],i);
        }
        while(present){
            if(map.containsKey(original)){
                original*=2;
            }else{
                present=false;
            }
        }
        return original;
    }
}