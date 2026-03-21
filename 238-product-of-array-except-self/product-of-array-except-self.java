class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 0;
        left[1] = nums[0];
        for(int i=2; i<n; i++){
            left[i]=left[i-1]*nums[i-1];
        }

        int[] right = new int[n];
        right[n-1] = 0;
        right[n-2] = nums[n-1];

        for(int i=n-3; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int[] result = new int[n];
        result[0] = right[0];
        result[n-1] = left[n-1];

        for(int i=1; i<n-1; i++){
            result[i] = left[i]*right[i];
        }

        return result;
    }
}