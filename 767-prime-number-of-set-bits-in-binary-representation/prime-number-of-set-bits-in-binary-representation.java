class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left; i<=right; i++){
            int count=0;
            int num = i;
            while(num!=0){
                count+=(num&1);
                num>>=1;
            }
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    public boolean isPrime(int count){
        if(count<=1) return false;
        if(count==2) return true;
        if(count%2==0) return false;

        for(int i=3; i*i<=count; i+=2){
            if(count%i==0){
                return false;
            }
        }
        return true;
    }
}