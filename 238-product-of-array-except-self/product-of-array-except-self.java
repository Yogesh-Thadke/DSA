class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=nums[0];
        left[1]=nums[0];
        for(int i=2; i<nums.length; i++){
            left[i]=nums[i-1]*left[i-1]; 
        }
        right[nums.length-1]=nums[nums.length-1];
        right[nums.length-2]=nums[nums.length-1];
        for(int i=nums.length-3; i>=0; i--){
            right[i] = nums[i+1]*right[i+1];
        }
        left[0]=right[0];
        for(int i=1; i<nums.length-1; i++){
            left[i] = left[i]*right[i];
        }
        return left;
    }
    
}