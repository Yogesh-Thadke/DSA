class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = -1;

        for(int num : nums){
             max = Math.max(max,num);
        }
        int[] freq = new int[max+1];

        for(int num : nums){
            freq[num]++;
        }
        int ans = -1;
        for(int i=0; i<freq.length; i++){
            if(freq[i]==1){
                ans = Math.max(ans,i);
            } 
        }
        if(k==1 ){
            return ans;
        }
        if(k==nums.length){
            return max;
        }
        if(freq[nums[0]]==1 && freq[nums[nums.length-1]]==1){
            return Math.max(nums[0],nums[nums.length-1]);
        }else{
            if(freq[nums[0]]==1){
                return nums[0];
            }else if(freq[nums[nums.length-1]]==1){
                return nums[nums.length-1];
            }
        }
        return -1;
    }
}