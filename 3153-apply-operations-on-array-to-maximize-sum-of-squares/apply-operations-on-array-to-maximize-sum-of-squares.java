class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int MOD = 1_000_000_007;

        int[] bit = new int[31];

        for(int num : nums){
            for(int i=0; i<31; i++){
                if((num & (1<<i))!=0){
                    bit[i]++;
                }
            }
        }
        
        long ans = 0;

        for(int j=0; j<k; j++){
            long num = 0;

            for(int i=0; i<31; i++){
                if(bit[i]>0){
                    num |= (1<<i);
                    bit[i]--;
                }
            }
            ans = (ans + num * num) % MOD;
        }
        return (int)ans;
    }
}