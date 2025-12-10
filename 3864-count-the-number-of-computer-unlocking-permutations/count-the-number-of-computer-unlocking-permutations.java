class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        //if(complexity[0]==complexity[1]) return 0;
        int i=1;
        while(i<n){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
            i++;
        }
        int mod = 1000000007;
        long ans = 1;
        for(int k=1; k<n; k++){
            ans = (ans*k)%mod;
        }
        return (int)ans;
    }
}