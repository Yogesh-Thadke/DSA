class Solution {
    public int countPartitions(int[] nums) {
        int sum=0, count=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)return 0;
        int lSum=0;
        for(int i=0; i<nums.length-1; i++){
            lSum+=nums[i];
            int rSum=sum-lSum;
            if((lSum%2) == (rSum%2)){
                count++;
            }
        }
        return count;
    }
}