class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1)return 0;

        int i=0, j=0, Max = Integer.MIN_VALUE;
        while(j<n){
            while(i<=j && nums[j] > (long)k*nums[i]){
                i++;
            }
            if(i<=j){
                Max = Math.max(Max, j-i+1);
            }
            j++;
        }
        return n-Max;
    }
}