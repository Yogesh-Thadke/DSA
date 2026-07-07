class Solution {
    public long sumAndMultiply(int n) {
        long rem = 0, ans = 0, sum = 0, num = 0; 
        while(n>0){
            rem = n%10;
            if(rem!=0){
                sum+=rem;
                ans = ans*10+rem;
            }
            n/=10;
        }
        rem = 0;
        while(ans>0){
            rem = ans%10;
            num = num*10+rem;
            ans/=10;
        }
        return num*sum;
    }
}