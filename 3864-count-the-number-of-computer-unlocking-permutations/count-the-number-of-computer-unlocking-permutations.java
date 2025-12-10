class Solution {
    static final int mod = 1000000007;
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        for(int i=1; i<n; i++){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
        }
        
        long ans = 1;
        for(int k=1; k<n; k++){
            ans = (ans*k)%mod;
        }
        return (int)ans;
    }
}