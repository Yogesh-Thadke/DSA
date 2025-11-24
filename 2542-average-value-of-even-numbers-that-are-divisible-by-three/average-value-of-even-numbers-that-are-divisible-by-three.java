class Solution {
    public int averageValue(int[] nums) {
        int average = 0, count = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]%2==0){
                if(nums[i]%3==0){
                    average = average+nums[i];
                    count++;
                }
            }
        }
        if(count==0){
            return 0;
        }else{
            return average/count;
        }
    }
}