class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==1)return 0;
        int i=0, j=0, MaxWindow = Integer.MIN_VALUE;
        while(j<n){
            Long min = (long)k*nums[i];
            if(nums[j] <= min){
                j++;
                MaxWindow = Math.max(MaxWindow, j-i+1);
            }else{
                i++;
            }
        }
        return n-MaxWindow+1;
    }
}