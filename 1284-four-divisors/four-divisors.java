class Solution {
    public int sumFourDivisors(int[] nums) {
        //List<Integer> list = new ArrayList<>();
        int result=0;
        for(int n : nums){
            int count=0;
            int ans=0;
            for(int i=1; i*i<=n; i++){
                if(n%i==0){
                    ans+=i;
                    count++;
                    if(i!=n/i){
                        ans+=(n/i);
                        count++;
                    }
                    if(count>4) break;
                }
            }
            if(count==4){
                result+=ans;
            }
        }
        return result;
    }
}