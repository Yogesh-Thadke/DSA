class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int num : nums){
            ans ^= num;
            sum += num;
        }
        if(ans == 0){
            if(sum == 0){
                return 0;
            }else{
                return nums.length-1;
            }
        }
        return nums.length;
    }
}