class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            mx = Math.max(mx,nums[i]);
            prefixGcd[i] = gcd(nums[i],mx);
        }
        long sum = 0;
        Arrays.sort(prefixGcd);
        int j = prefixGcd.length-1;
        for(int i=0; i<prefixGcd.length/2; i++){
            sum += gcd(prefixGcd[i],prefixGcd[j]);
            j--; 
        }
        return sum;
    }
    int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}