class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i=n; i<=100; i++){
            if(digit(i)%t == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    private int digit(int a){
        int sum = 1;
        while(a>0){
            sum*=(a%10);
            a/=10;
        }
        return sum;
    }
}