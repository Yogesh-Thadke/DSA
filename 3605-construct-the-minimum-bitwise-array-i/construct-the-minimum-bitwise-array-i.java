class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            int num = nums.get(i);
            if(num==2){
                ans[i]=-1;
                continue;
            }else{
                int temp=num;
                int bit=0;
                while((temp & 1) != 0){
                    bit++;
                    temp = temp >> 1; 
                }
                ans[i]=num ^ (1 << bit-1);
            }
        }
        return ans;
    }
}