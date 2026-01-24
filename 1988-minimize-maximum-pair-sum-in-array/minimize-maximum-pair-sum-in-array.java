class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int l=0,r=nums.length-1;
        while(l<r){
            max=Math.max(nums[l]+nums[r],max);
            l++;
            r--;
        }
        return max;
    }
}