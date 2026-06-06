class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] LeftSum = new int[nums.length];
        LeftSum[0] = 0;
        for(int i = 1; i<nums.length; i++){
            LeftSum[i] = LeftSum[i-1]+nums[i-1];
        }

        int[] RightSum = new int[nums.length];
        RightSum[nums.length-1] = 0;
        for(int i = nums.length-2; i>=0; i--){
            RightSum[i] = RightSum[i+1]+nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = Math.abs(LeftSum[i]-RightSum[i]);
        }
        return ans;
    }
}