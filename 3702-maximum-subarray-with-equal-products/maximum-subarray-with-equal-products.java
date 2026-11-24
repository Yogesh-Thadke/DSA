class Solution {
    public int maxLength(int[] nums) {
        int ans = -1;
        for(int i=0; i<nums.length-1; i++){
            long arrGcd = nums[i];
            long arrLcm = nums[i];
            long arrProd = nums[i]; 
            for(int j=i; j<nums.length; j++){

                if(j>i){
                    arrGcd = gcd(arrGcd, nums[j]);
                    arrLcm = lcm(arrLcm, nums[j]);
                    arrProd *= nums[j];
                }
                if(arrProd == arrGcd * arrLcm){
                    ans = Math.max(ans, (j - i + 1));
                }
            }
        }
        return ans;
    }
    public long gcd(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long lcm(long a, long b){
        if(a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a,b)*b);
    }
}