class Solution {
    public long maxPairStrength(int[] nums) {
        long max = Long.MIN_VALUE;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                long g = gcd(nums[i], nums[j]);
                long num = ((long)nums[i] * nums[j]) / (g*g);
                max = Math.max(num,max);
            }
        }
        return max;
    }
    private long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}