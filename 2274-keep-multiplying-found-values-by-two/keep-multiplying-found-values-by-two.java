import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        //Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> num = new HashSet<>();

        for(int i : nums){
            num.add(i);
        }
        while(num.contains(original)){
            original*=2;
        }
        return original;
    }
}