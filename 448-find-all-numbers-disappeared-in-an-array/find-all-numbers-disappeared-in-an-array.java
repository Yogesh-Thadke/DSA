import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Arrays.sort(nums);
        Hashtable<Integer, Integer> table = new Hashtable<>();
        List<Integer> num = new ArrayList<>();
        
        for(int n : nums){
            table.put(n, table.getOrDefault(n,0)+1);
        }
        for(int i=1; i<=nums.length; i++){
            if(!table.containsKey(i)){
                num.add(i);
            }
        }
        return num;
    }
}