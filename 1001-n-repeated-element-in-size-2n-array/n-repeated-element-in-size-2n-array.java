class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            if(val.getValue()>1){
                ans = val.getKey();
                break;
            }
        }
        return ans;
    }
}