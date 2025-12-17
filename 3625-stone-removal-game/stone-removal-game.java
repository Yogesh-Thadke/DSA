class Solution {
    public boolean canAliceWin(int n) {
        int count = 0;
        int num = 10;
        while(n>=num){
            n-=num;
            num--;
            count++;
        }
        if(count%2!=0)return true;
        return false;
    }
}