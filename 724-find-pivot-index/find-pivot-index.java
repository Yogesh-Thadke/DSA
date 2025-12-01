class Solution {
    public int pivotIndex(int[] nums) {
        int sumRight = 0;
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        int sumLeft = 0;
        for(int i=0; i<nums.length; i++){
            sumRight = sum-sumLeft-nums[i];
            if(sumRight == sumLeft){
                return i;
            }
            sumLeft += nums[i]; 
        }
        return -1;
    }
}