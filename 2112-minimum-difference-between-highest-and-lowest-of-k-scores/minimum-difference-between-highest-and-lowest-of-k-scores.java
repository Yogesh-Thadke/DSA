class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, r=k-1;
        int min = Integer.MAX_VALUE;
        while(r<nums.length){
            min = Math.min(min,(nums[r]-nums[l]));
            l++;
            r++;
        }
        return min;
    }
}