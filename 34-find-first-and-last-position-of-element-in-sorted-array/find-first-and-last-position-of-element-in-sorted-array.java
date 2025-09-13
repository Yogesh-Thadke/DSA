class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int l=0,r=nums.length-1;
        int mid = 0, index = -1;

        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target){
                index = mid;
                r=mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        ans[0]=index;

        l=0;
        r=nums.length-1;
        mid = 0;
        index = -1;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target){
                index = mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        ans[1]=index;

        return ans;
    }
}