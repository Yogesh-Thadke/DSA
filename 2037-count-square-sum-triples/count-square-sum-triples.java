class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1; i<=n-1; i++){
            for(int j=i+1; j<=n; j++){
                int ans = (int)Math.sqrt(i*i+j*j);
                if(ans<=n && (ans*ans) == (i*i+j*j)) count+=2;
            }
        }
        return count;
    }
}