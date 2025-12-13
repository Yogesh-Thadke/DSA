class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            max = Math.max(max,n);
        }
        int ans = 0;
        for(int num : nums){
            ans+=(max-num);
        }
        return ans;
    }
}