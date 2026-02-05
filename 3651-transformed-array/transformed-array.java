class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                int index = (nums[i] + i) % n;
                result[i] = nums[index];
            }
            else if(nums[i]<0){
                int step = Math.abs(nums[i])%n;
                int index = (i - step + n) % n;
                result[i] = nums[index];
            }else{
                result[i]=nums[i];
            }
        }
        return result;
    }
}