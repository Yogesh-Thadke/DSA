class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int sub=Math.abs(i-start);

                if(sub<ans){
                ans = sub;
            }
            }
        }
        return ans;
    }
}