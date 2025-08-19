class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length,maxsum=Integer.MIN_VALUE,currSum = 0;;
        for(int i=0; i<n; i++){
            currSum += nums[i];
            maxsum = Math.max(maxsum,currSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxsum;
    }
}