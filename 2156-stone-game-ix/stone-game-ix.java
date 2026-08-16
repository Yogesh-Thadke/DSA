class Solution {
    public boolean stoneGameIX(int[] stones) {
        int c0 = 0, c1 = 0, c2 = 0;

        for(int num : stones){
            if(num%3 == 0)c0++;
            if(num%3 == 1)c1++;
            if(num%3 == 2)c2++;
        }

        if(c0%2==0){
            return c1>0 && c2>0;
        }
        return Math.abs(c1-c2)>2;
    }
}