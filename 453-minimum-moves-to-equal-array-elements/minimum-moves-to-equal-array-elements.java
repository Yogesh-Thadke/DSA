class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }

        return sum - nums.length * nums[0]; 
    }
}