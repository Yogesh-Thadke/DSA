class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> table = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(table.containsKey(nums[i])){
                return true;
            }else{
                table.put(nums[i],table.getOrDefault(nums[i],0)+1);
            }
        }
        return false;
    }
}