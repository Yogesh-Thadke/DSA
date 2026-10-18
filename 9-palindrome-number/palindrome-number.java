class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = x;
        int ans = 0;
        while(x!=0){
            int rem = x % 10;
            ans = rem + (ans*10);
            x = x/10;
        }
        if(ans == num){
            return true;
        }
        return false;
    }
}