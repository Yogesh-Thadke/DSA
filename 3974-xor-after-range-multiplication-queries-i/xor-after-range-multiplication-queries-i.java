class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];

            for(int j=l; j<=r; j=j+k){
                nums[j] =(int)((long)nums[j]*v % 1000000007);
            }
        }
        int ans = 0;
        for(int num : nums){
            ans^=num;
        }
        return ans;
    }
}