class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0;
        int right = 0;
        int total = 0;
        for(int i : nums){
            total+=i;
        }
        int target = total-x;
        if(target<0){
            return -1;
        }
        if(target==0){
            return nums.length;
        }
        int sum = nums[0];
        int maxLength = 0;
        while(right<nums.length){
            if(sum < target){
                right++;
                if(right<nums.length){
                    sum+=nums[right];
                }
            }else if(sum > target){
                sum-=nums[left];
                left++;
            }else{
                int length = right-left+1;
                maxLength = Math.max(maxLength,length);
                right++;
                if(right<nums.length){
                    sum+=nums[right];
                }
            }
        }
        if(maxLength == 0){
            return -1;
        }
        return nums.length-maxLength;
    }
}