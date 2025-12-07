class Solution {
    public int countOdds(int low, int high) {
        if(low%2!=0 && high%2!=0){
            int ans = high-low+1;
            return (ans/2)+1;
        }
        else if(high%2==0 && low%2==0){
            return (high-low)/2;
        }
        return (high-low+1)/2;
    }
}