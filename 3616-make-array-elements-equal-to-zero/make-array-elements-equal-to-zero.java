class Solution {
    public int countValidSelections(int[] nums) {
        int totall_sum = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            totall_sum += nums[i]; 
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                int pref_sum = 0;
                for(int j=0; j<i; j++){
                    pref_sum+=nums[j];
                }
                if(2*pref_sum == totall_sum){
                    ans+=2;
                }
                else if(Math.abs(totall_sum-2*pref_sum)==1){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}