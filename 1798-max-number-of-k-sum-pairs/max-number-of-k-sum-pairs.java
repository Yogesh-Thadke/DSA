class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0,l=0,r=nums.length-1;
        Arrays.sort(nums);
        
        while(l<r){
            if(nums[l]+nums[r]==k){
                count++;
                l++;
                r--;
            }
            else if(nums[l]+nums[r]>k){
                r--;
            }
            else{
                l++;
            }
        }
        return count;
    }
}