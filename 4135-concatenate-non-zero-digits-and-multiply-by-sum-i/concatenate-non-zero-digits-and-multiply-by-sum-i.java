class Solution {
    public long sumAndMultiply(int n) {
        long nonZero = 0;
        long rem = 0;
        long ans = 0;
        long sum = 0, num = 0;
        while(n!=0){
            rem = n % 10;
            if(rem!=0){
                sum += rem;
                ans = ans * 10 + rem;
            }
            n = n/10;
        }
        while(ans!=0){
            rem = ans % 10;
            num = num * 10 + rem;
            ans /= 10;
        }
        return num*sum;
    }
}