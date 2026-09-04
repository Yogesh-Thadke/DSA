class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] sufixmin = new int[nums.length];
        sufixmin[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0; i--){
            sufixmin[i] = Math.min(nums[i], sufixmin[i+1]);
        }

        int prefixmax = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            prefixmax = Math.max(prefixmax, nums[i]);
            if(prefixmax - sufixmin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}