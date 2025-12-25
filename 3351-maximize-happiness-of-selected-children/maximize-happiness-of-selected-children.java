class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=happiness.length-1;
        long ans=0;
        int count=0;
        while(i>=0 && k>0){
            happiness[i]-=count;
            if(happiness[i]<0){
                happiness[i]=0;
            }
            ans = ans+happiness[i];
            k--;
            count++;
            i--;
        }
        return ans;
    }
}