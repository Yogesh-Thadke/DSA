class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int i=0; i<k; i++){
            sum = sum+nums[i];
        }
        
        
        int l=0, r=k-1;
        double maxAverage = sum/k;

        while(r<nums.length-1){
            //double average = sum/k;
            sum = sum-nums[l];
            l++;
            r++;
            sum = sum+nums[r];
            maxAverage = Math.max(maxAverage,sum/k);
        }
        return maxAverage;
    }
}