class Solution {
    public int minMoves(int[] nums) {
        int max = 0;

        for(int i : nums){
            max = Math.max(i,max);
        }
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += Math.abs(max-nums[i]);
        }
        return sum;
    }
}