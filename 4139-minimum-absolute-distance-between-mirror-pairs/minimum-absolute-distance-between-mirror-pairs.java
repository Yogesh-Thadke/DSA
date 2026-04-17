class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int minAns = Integer.MAX_VALUE;
       for(int i=0; i<nums.length; i++){

        if(map.containsKey(nums[i])){

            minAns = Math.min(minAns,i-map.get(nums[i]));
        }
        int rev = reversed(nums[i]);
        map.put(rev,i);
       }
       return minAns == Integer.MAX_VALUE ? -1 : minAns;
    }
    public int reversed(int num){
        int ans = 0;
        while(num!=0){
            int rem = num%10;
            ans = rem +(10*ans);
            num /=10;
        } 
        return ans;
    }
}