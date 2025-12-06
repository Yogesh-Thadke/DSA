class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==0) return nums.length;
        int upperBound = nums[nums.length-k], ans=0;
        for(int num : nums){
            if(num < upperBound) ans++;
        }
        return ans;
    }
}