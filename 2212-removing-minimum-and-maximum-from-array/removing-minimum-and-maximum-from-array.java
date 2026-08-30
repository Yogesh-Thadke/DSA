class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIndex = 0, max = Integer.MIN_VALUE;
        int minIndex = 0, min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        int amax = Math.max(minIndex, maxIndex) + 1;
        int bmin = Math.min(minIndex, maxIndex) + 1;
        int c = nums.length - (bmin - 1);
        int d = bmin + (nums.length- (amax-1));
        return Math.min(amax,Math.min(c,d));
    }
}