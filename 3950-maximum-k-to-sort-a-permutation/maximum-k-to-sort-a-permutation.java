class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        Integer result = null;
        for(int i=0; i<n; i++){
            if(nums[i]!=i){
                if(result == null){
                    result = nums[i];
                }else{
                    result &= nums[i];
                }
            }
        }
        return (result != null) ? result.intValue() : 0;
    }
}