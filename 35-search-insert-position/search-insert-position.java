class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l=0,r=nums.length-1;
        int mid = l+(r-l)/2;
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        else if(target<nums[0]){
            return 0;
        }
        while(l<=r){
            //int mid = l+(r-l)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            mid = l+(r-l)/2;
        }
        return mid;
    }
}