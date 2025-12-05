class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=1; i<nums.length; i++){
            int temp=0;
            for(int j=0; j<i; j++){
                temp+=nums[j];
            }
            for(int k=i;k<nums.length; k++){
                temp-=nums[k];
            }
            if(temp%2==0){
                count++;
            }
        }
        return count;
    }
}